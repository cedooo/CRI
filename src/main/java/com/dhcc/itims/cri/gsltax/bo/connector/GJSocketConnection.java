package com.dhcc.itims.cri.gsltax.bo.connector;

import com.dhcc.itims.cri.component.connector.CRIConnector;
import com.dhcc.itims.cri.component.utils.ByteUtils;
import com.dhcc.itims.cri.gsltax.bo.connector.protocol.Body;
import com.dhcc.itims.cri.gsltax.bo.connector.protocol.Head;
import com.dhcc.itims.cri.gsltax.bo.connector.protocol.Package;
import com.dhcc.itims.cri.itims.ITIMSService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

/**
 * Created by cedo on 2017/1/5.
 * 共济接口连接
 */
@Component("com.dhcc.itims.cri.gsltax.bo.connector.GJSocketConnection")
public class GJSocketConnection extends CRIConnector {
    protected static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    static private Logger log = Logger.getLogger(GJSocketConnection.class.getClass());
    private SocketChannel socketChannel = null;
    private ByteBuffer[] headerBuffers = null;
    private ByteBuffer groupSizeBuffer = ByteBuffer.allocate(Body.GROUP_SIZE_LENGTH);

    private ITIMSService itimsService;

    @Autowired
    public void setItimsService(ITIMSService itimsService) {
        this.itimsService = itimsService;
    }

    protected volatile boolean keepRun = false;
    @Override
    protected boolean stop() {
        this.keepRun = false;
        return keepRun==false;
    }

    @Override
    protected boolean valid() {
        if(this.socketChannel.isConnected()){
            return true;
        }
        return false;
    }

    @Override
    public void run() {
        this.keepRun = true;
        try {
            Thread.sleep(30000);
            while(this.keepRun){
                try{
                    clearHeadBuffers();
                    long rc = socketChannel.read(headerBuffers);    //读入
                    if(rc==-1){
                        break;
                    }
                    /**
                     * 包头判断
                     */
                    ByteBuffer startBuffer = headerBuffers[0];
                    startBuffer.flip();
                    byte[] headTag = new byte[Head.HEAD_ELE_LENGTH];
                    startBuffer.get(headTag);
                    boolean  isHeadTag = Package.isHeadTag(headTag);
                    if(!isHeadTag){
                        log.debug(Arrays.toString(headTag));
                        log.debug("包头错了");
                        continue;
                    }else{
                        //log.debug("包头标记: " + Arrays.toString(headTag));
                    }

                    /**
                     * 协议版本
                     */
                    ByteBuffer versionBuffer = headerBuffers[1];
                    byte[] versionBytes = new byte[Head.HEAD_ELE_LENGTH];
                    versionBuffer.flip();
                    versionBuffer.get(versionBytes);
                    //log.debug("版本号：" + Arrays.toString(versionBytes));

                    /**
                     * 命令类型
                     */
                    ByteBuffer commandBuffer = headerBuffers[2];
                    byte[] commandBytes = new byte[Head.HEAD_ELE_LENGTH];
                    commandBuffer.flip();
                    commandBuffer.get(commandBytes);
                    int packageType = Package.dataType(commandBytes);
                    //log.debug(Arrays.toString(commandBytes) + ":" + (packageType==Package.TYPE_DATA?"数据包":"非数据包") );

                    /**
                     * 包体长度
                     */
                    int messageLength = 0;
                    ByteBuffer bodyLengthBuffer = headerBuffers[Head.BODY_LENGTH_POSITION-1];
                    byte[] bodyLengthBytes = new byte[Head.HEAD_ELE_LENGTH];
                    bodyLengthBuffer.flip();
                    bodyLengthBuffer.get(bodyLengthBytes);
                    messageLength = (int) ByteUtils.getLong4(bodyLengthBytes);
                    //log.debug("包体长度: " + messageLength + "(byte)");

                    //读取包体

                    int dealCount = 0;
                    short groupSize = -1;    //组数据长度

                    while(dealCount<messageLength){
                        groupSizeBuffer.clear();
                        int r = socketChannel.read(groupSizeBuffer);
                        if(r==-1){
                            break;
                        }
                        groupSizeBuffer.flip();
                        byte[] groupSizeBytes = new byte[Body.GROUP_SIZE_LENGTH];
                        groupSizeBuffer.get(groupSizeBytes);
                        groupSize = (short)ByteUtils.getShort(groupSizeBytes);
                        //System.out.print("组长度:" + groupSize);

                        ByteBuffer groupBodyBuffer = ByteBuffer.allocate(groupSize);
                        socketChannel.read(groupBodyBuffer);
                        byte[] groupBodyBytes = new byte[groupSize];
                        groupBodyBuffer.flip();
                        groupBodyBuffer.get(groupBodyBytes);

                        String packageBody = new String(groupBodyBytes, Package.ENCODE);
                        String[] dataArray = packageBody.split("\\|");
                        if(dataArray.length==2
                                && dataArray[0].endsWith(GJData.ATTR_VALUE_TAG)){
                            GJData data = new GJData(dataArray[0], dataArray[1]);
                            //this.putRealDataSet(extapi);
                            data.setCd(this.getMachineRoomId());
                            data.setCollectTime(sdf.format(new Date()));
                            //实时数据入库
                           /*
                           sess.update("cn.com.dhcc.rp.realtimedata.update_insert_gj_data", data);
                            sess.commit();
                            */

                        }else if(packageType!=Package.TYPE_DATA && dataArray[0].endsWith(GJData.EVENT_TAG)){
                            log.info("事件=>" + dataArray[0] + " : " + Arrays.toString(dataArray));
                            try{
                                GJEvent event = GJUtils.parseToGJEvent(this.getMachineRoomId(), packageBody);
                                if(event!=null){
                                    //事件入库
                                   /*
                                   int colum = sess.insert("cn.com.dhcc.rp.event.insert_gj_TxEvents", event);
                                    sess.commit();
                                    log.info("事件入库" + (colum==1?"成功":"失败"));
                                    */
                                }else {
                                    log.info("事件=>" + dataArray[0] + " : " + Arrays.toString(dataArray) +
                                            "===该事件无效===");
                                }
                            }catch(Exception e){
                                e.printStackTrace();
                                log.error("告警处理失败");
                            }
                        }
                        dealCount += Body.GROUP_SIZE_LENGTH + groupSize;
                    }
                } catch (IOException e1) {
                    log.error("共济接口[" +  this.getIp() + ":" + this.getPort() + "]读取过程IO错误");
                } catch(BufferUnderflowException be){
                    log.warn("共济接口[" +  this.getIp() + ":" + this.getPort() + "]出现异常断开");
                    log.debug(be.toString());
                }finally{

                }

            }
        } catch (InterruptedException e1) {
            e1.printStackTrace();
        } finally {
            try {
                if(socketChannel!=null){
                    socketChannel.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 清空缓冲区
     * @return
     */
    private boolean clearHeadBuffers(){
        for(int i = 0; i< Head.HEAD_ELE_COUNT; i++){
            headerBuffers[i].clear();
        }
        return true;
    }
}
