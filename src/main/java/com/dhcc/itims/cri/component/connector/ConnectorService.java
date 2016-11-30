package com.dhcc.itims.cri.component.connector;

import com.dhcc.itims.cri.component.bo.DBService;
import com.dhcc.itims.cri.component.machineroom.MachineRoom;
import com.dhcc.itims.cri.component.machineroom.MachineRoomBuilder;
import com.dhcc.itims.cri.component.machineroom.MachineRoomMetaData;
import org.apache.ibatis.javassist.bytecode.Descriptor;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.log4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Scope;
import org.springframework.http.converter.xml.MarshallingHttpMessageConverter;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Component;

import java.util.*;

/**
 * Created by Administrator on 2016/11/27.
 * 维护与接口的连接
 * 与 SHZDTService,SHZDTCRICollectJob 在同一概念层级上
 */
public class ConnectorService implements ApplicationContextAware{
    static protected final Logger log = Logger.getLogger(ConnectorService.class.getClass());
    protected Set<CRIConnector> connectors = new HashSet<CRIConnector>();
    protected ThreadPoolTaskExecutor threadPoolTaskExecutor;
    private MachineRoomBuilder machineRoomBuilder;
    private ApplicationContext applicationContext;

    public void setApplicationContext(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    public void setMachineRoomBuilder(MachineRoomBuilder machineRoomBuilder) {
        this.machineRoomBuilder = machineRoomBuilder;
    }

    protected Map<CRIConnector, Thread> mapCT = new HashMap<CRIConnector, Thread>();

    public void setThreadPoolTaskExecutor(ThreadPoolTaskExecutor threadPoolTaskExecutor) {
        this.threadPoolTaskExecutor = threadPoolTaskExecutor;
    }


    private void init(){
        //connectors.addAll(connectorList);
        Set<MachineRoom> machineRooms = machineRoomBuilder.getMachineRooms();
        Iterator<MachineRoom> machineRoomIterator = machineRooms.iterator();
        while (machineRoomIterator.hasNext()){
            MachineRoom machineRoom = machineRoomIterator.next();
            MachineRoomMetaData machineRoomMetaData = machineRoom.getMachineRoomMetaData();
            String connectorClass = machineRoom.getMachineRoomMetaData().getConnectorClass();

            CRIConnector criConnector = (CRIConnector) applicationContext.getBean(connectorClass);//(CRIConnector) this.getClass().getClassLoader().loadClass(connectorClass).newInstance();

            criConnector.setIp(machineRoomMetaData.getIp());
            criConnector.setPort(Integer.parseInt(machineRoomMetaData.getPort()));
            criConnector.setMachineRoomId(machineRoom.getId());
            this.connectors.add(criConnector);

        }
        for (CRIConnector connector :
                connectors) {
            Thread t = new Thread(connector);
            t.setName(connector.getMachineRoomId());
            mapCT.put(connector, t);
        }
        connect();
    }
    private void connect(){
        Iterator<CRIConnector> connector = mapCT.keySet().iterator();
        while(connector.hasNext()){
            CRIConnector criConnector = connector.next();
            try {
                log.info("新建立连接: " + criConnector.toString());
                Thread.sleep(1000);
                Thread connThread = mapCT.get(criConnector);
                if(connThread!=null){
                    threadPoolTaskExecutor.execute(connThread);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public boolean reConnect(){
        Iterator<CRIConnector> connector = mapCT.keySet().iterator();
        while(connector.hasNext()){
            CRIConnector criConnector = connector.next();
            if(!criConnector.valid()) {
                criConnector.stop();
                try {
                    log.info("4S后重新建立连接");
                    Thread.sleep(4000);
                    threadPoolTaskExecutor.execute(mapCT.get(criConnector));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }else {continue;}
        }
        return false;
    }

    public boolean checkConnectorState(){
        log.info("检查端口连接状态");
        int activeCount = threadPoolTaskExecutor.getActiveCount();
        int connectorsTotal = mapCT.size();
        if(activeCount==connectorsTotal){
            log.info("当前接口连接数: " +  activeCount);
            return true;
        }else if(activeCount<connectorsTotal){
            log.warn("接口发生断开。。。准备检查并重新连接");
            reConnect();
            return false;
        }else{
            log.error("接口数量大于应有的数量(" + connectorsTotal + ")，出现错误.\n当前数量："  + activeCount);
            return false;

        }
    }

    public void setConnectors(Set<CRIConnector> connectors) {
        this.connectors = connectors;
    }


}
