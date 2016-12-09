package com.dhcc.itims.cri.shzdt.extapi.util;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Iterator;

/**
 * Created by Administrator on 2016/12/9.
 * 模拟接口服务器发送‘死’数据
 */
public class VirtualServer {

    public static void main(String[] args){
        Thread st = new Thread(new ServerThread());
        st.start();
        try {
            st.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

class ServerThread implements Runnable{

    private volatile boolean stop = false;
    private ServerSocket serverSokcet;
    @Override
    public void run() {
        BufferedReader br=null;
        PrintWriter wr=null;
        try {
            ServerSocket serverSokcet = new ServerSocket(8002);
            while(!stop) {
                Socket soc = serverSokcet.accept();

                br = new BufferedReader(new InputStreamReader(soc.getInputStream()));
                wr = new PrintWriter(new OutputStreamWriter(soc.getOutputStream()));
                String lin;
                while (!stop && ((lin = br.readLine()) != null)) {
                    lin = lin.trim();
                    System.out.println("接受到的数据： " + lin);
                    //eg.  [ZDTConnector.java:212] : send:{"flg":1,"val":{"eqid":"U5801"},"rst":1,"ver":1,"cmd":6004,"seq":4}
                    try {
                        JSONObject jsnObj = new JSONObject(lin);
                        JSONObject eqInfo = (JSONObject) jsnObj.get("val");
                        int cmd = jsnObj.getInt("cmd");
                        if (6004 == cmd) {
                            String eqid = eqInfo.getString("eqid");
                            String ans = "{\"cmd\":6004,\"flg\":0,\"rst\":1,\"seq\":143,\"val\":[{\"date\":\"2016-12-08 21:58:46.000\",\"paid\":\"W1101001\",\"state\":0,\"value\":20.89999961853027},{\"date\":\"2016-12-08 21:58:46.000\",\"paid\":\"W1101002\",\"state\":0,\"value\":37.79999923706055}],\"ver\":1}";
                            String ans2 = "{\"cmd\":6004,\"flg\":0,\"rst\":1,\"seq\":144,\"val\":[{\"date\":\"2016-12-08 21:58:49.000\",\"paid\":\"W1102001\",\"state\":0,\"value\":22.29999923706055},{\"date\":\"2016-12-08 21:58:49.000\",\"paid\":\"W1102002\",\"state\":0,\"value\":33.79999923706055}],\"ver\":1}";
                            String anl = "{\"cmd\":6004,\"flg\":0,\"rst\":1,\"seq\":145,\"val\":[{\"date\":\"2016-12-08 21:58:53.000\",\"paid\":\"L1101001\",\"state\":0,\"value\":1024.0},{\"date\":\"2016-12-08 21:58:53.000\",\"paid\":\"L1101002\",\"state\":0,\"value\":61439.0},{\"date\":\"2016-12-08 21:58:53.000\",\"paid\":\"L1101003\",\"state\":0,\"value\":61439.0},{\"date\":\"2016-12-08 21:58:53.000\",\"paid\":\"L1101004\",\"state\":0,\"value\":0.0},{\"date\":\"2016-12-08 21:58:53.000\",\"paid\":\"L1101005\",\"state\":0,\"value\":201.0},{\"date\":\"2016-12-08 21:58:53.000\",\"paid\":\"L1101006\",\"state\":0,\"value\":201.0},{\"date\":\"2016-12-08 21:58:53.000\",\"paid\":\"L1101007\",\"state\":0,\"value\":0.0},{\"date\":\"2016-12-08 21:58:53.000\",\"paid\":\"L1101008\",\"state\":0,\"value\":0.0},{\"date\":\"2016-12-08 21:58:53.000\",\"paid\":\"L1101009\",\"state\":0,\"value\":0.0},{\"date\":\"2016-12-08 21:58:53.000\",\"paid\":\"L1101010\",\"state\":0,\"value\":0.0},{\"date\":\"2016-12-08 21:58:53.000\",\"paid\":\"L1101011\",\"state\":0,\"value\":0.0}],\"ver\":1}";

                            String anu = "{\"cmd\":6004,\"flg\":0,\"rst\":1,\"seq\":146,\"val\":[{\"date\":\"2016-12-08 21:58:56.000\",\"paid\":\"U5801001\",\"state\":0,\"value\":1.0},{\"date\":\"2016-12-08 21:58:56.000\",\"paid\":\"U5801002\",\"state\":0,\"value\":0.0},{\"date\":\"2016-12-08 21:58:56.000\",\"paid\":\"U5801003\",\"state\":0,\"value\":1.0},{\"date\":\"2016-12-08 21:58:56.000\",\"paid\":\"U5801004\",\"state\":0,\"value\":0.0},{\"date\":\"2016-12-08 21:58:56.000\",\"paid\":\"U5801005\",\"state\":0,\"value\":1.0},{\"date\":\"2016-12-08 21:58:56.000\",\"paid\":\"U5801006\",\"state\":0,\"value\":0.0},{\"date\":\"2016-12-08 21:58:56.000\",\"paid\":\"U5801007\",\"state\":0,\"value\":0.0},{\"date\":\"2016-12-08 21:58:56.000\",\"paid\":\"U5801008\",\"state\":0,\"value\":0.0},{\"date\":\"2016-12-08 21:58:56.000\",\"paid\":\"U5801009\",\"state\":0,\"value\":0.0},{\"date\":\"2016-12-08 21:58:56.000\",\"paid\":\"U5801010\",\"state\":0,\"value\":0.0},{\"date\":\"2016-12-08 21:58:56.000\",\"paid\":\"U5801011\",\"state\":0,\"value\":0.0},{\"date\":\"2016-12-08 21:58:56.000\",\"paid\":\"U5801012\",\"state\":0,\"value\":0.0},{\"date\":\"2016-12-08 21:58:56.000\",\"paid\":\"U5801013\",\"state\":0,\"value\":0.0},{\"date\":\"2016-12-08 21:58:56.000\",\"paid\":\"U5801014\",\"state\":0,\"value\":0.0},{\"date\":\"2016-12-08 21:58:56.000\",\"paid\":\"U5801015\",\"state\":0,\"value\":100.0},{\"date\":\"2016-12-08 21:58:56.000\",\"paid\":\"U5801016\",\"state\":0,\"value\":0.0},{\"date\":\"2016-12-08 21:58:56.000\",\"paid\":\"U5801017\",\"state\":0,\"value\":0.0},{\"date\":\"2016-12-08 21:58:56.000\",\"paid\":\"U5801018\",\"state\":0,\"value\":14.0},{\"date\":\"2016-12-08 21:58:56.000\",\"paid\":\"U5801019\",\"state\":0,\"value\":298.0},{\"date\":\"2016-12-08 21:58:56.000\",\"paid\":\"U5801020\",\"state\":0,\"value\":419.0},{\"date\":\"2016-12-08 21:58:56.000\",\"paid\":\"U5801021\",\"state\":0,\"value\":2900.0},{\"date\":\"2016-12-08 21:58:56.000\",\"paid\":\"U5801022\",\"state\":0,\"value\":2700.0},{\"date\":\"2016-12-08 21:58:56.000\",\"paid\":\"U5801023\",\"state\":0,\"value\":11.0},{\"date\":\"2016-12-08 21:58:56.000\",\"paid\":\"U5801024\",\"state\":0,\"value\":50.0},{\"date\":\"2016-12-08 21:58:56.000\",\"paid\":\"U5801025\",\"state\":0,\"value\":100.0},{\"date\":\"2016-12-08 21:58:56.000\",\"paid\":\"U5801026\",\"state\":0,\"value\":224.0},{\"date\":\"2016-12-08 21:58:56.000\",\"paid\":\"U5801027\",\"state\":0,\"value\":3.0},{\"date\":\"2016-12-08 21:58:56.000\",\"paid\":\"U5801028\",\"state\":0,\"value\":224.0},{\"date\":\"2016-12-08 21:58:56.000\",\"paid\":\"U5801029\",\"state\":0,\"value\":389.0},{\"date\":\"2016-12-08 21:58:56.000\",\"paid\":\"U5801030\",\"state\":0,\"value\":4.0},{\"date\":\"2016-12-08 21:58:56.000\",\"paid\":\"U5801031\",\"state\":0,\"value\":225.0},{\"date\":\"2016-12-08 21:58:56.000\",\"paid\":\"U5801032\",\"state\":0,\"value\":390.0},{\"date\":\"2016-12-08 21:58:56.000\",\"paid\":\"U5801033\",\"state\":0,\"value\":3.0},{\"date\":\"2016-12-08 21:58:56.000\",\"paid\":\"U5801034\",\"state\":0,\"value\":224.0},{\"date\":\"2016-12-08 21:58:56.000\",\"paid\":\"U5801035\",\"state\":0,\"value\":389.0},{\"date\":\"2016-12-08 21:58:56.000\",\"paid\":\"U5801036\",\"state\":0,\"value\":0.0},{\"date\":\"2016-12-08 21:58:56.000\",\"paid\":\"U5801037\",\"state\":0,\"value\":225.0},{\"date\":\"2016-12-08 21:58:56.000\",\"paid\":\"U5801038\",\"state\":0,\"value\":389.0},{\"date\":\"2016-12-08 21:58:56.000\",\"paid\":\"U5801039\",\"state\":0,\"value\":0.0},{\"date\":\"2016-12-08 21:58:56.000\",\"paid\":\"U5801040\",\"state\":0,\"value\":226.0},{\"date\":\"2016-12-08 21:58:56.000\",\"paid\":\"U5801041\",\"state\":0,\"value\":391.0},{\"date\":\"2016-12-08 21:58:56.000\",\"paid\":\"U5801042\",\"state\":0,\"value\":0.0},{\"date\":\"2016-12-08 21:58:56.000\",\"paid\":\"U5801043\",\"state\":0,\"value\":226.0},{\"date\":\"2016-12-08 21:58:56.000\",\"paid\":\"U5801044\",\"state\":0,\"value\":392.0},{\"date\":\"2016-12-08 21:58:56.000\",\"paid\":\"U5801045\",\"state\":0,\"value\":0.0},{\"date\":\"2016-12-08 21:58:56.000\",\"paid\":\"U5801046\",\"state\":0,\"value\":6.0},{\"date\":\"2016-12-08 21:58:56.000\",\"paid\":\"U5801047\",\"state\":0,\"value\":16.0},{\"date\":\"2016-12-08 21:58:56.000\",\"paid\":\"U5801048\",\"state\":0,\"value\":222.0},{\"date\":\"2016-12-08 21:58:56.000\",\"paid\":\"U5801049\",\"state\":0,\"value\":384.0},{\"date\":\"2016-12-08 21:58:56.000\",\"paid\":\"U5801050\",\"state\":0,\"value\":5.0},{\"date\":\"2016-12-08 21:58:56.000\",\"paid\":\"U5801051\",\"state\":0,\"value\":12.0},{\"date\":\"2016-12-08 21:58:56.000\",\"paid\":\"U5801052\",\"state\":0,\"value\":220.0},{\"date\":\"2016-12-08 21:58:56.000\",\"paid\":\"U5801053\",\"state\":0,\"value\":382.0},{\"date\":\"2016-12-08 21:58:56.000\",\"paid\":\"U5801054\",\"state\":0,\"value\":3.0},{\"date\":\"2016-12-08 21:58:56.000\",\"paid\":\"U5801055\",\"state\":0,\"value\":6.0},{\"date\":\"2016-12-08 21:58:56.000\",\"paid\":\"U5801056\",\"state\":0,\"value\":220.0},{\"date\":\"2016-12-08 21:58:56.000\",\"paid\":\"U5801057\",\"state\":0,\"value\":382.0}],\"ver\":1}";

                            String anStr = null;
                            if ("W1101".equals(eqid)) {
                                anStr = ans;
                            } else if ("W1102".equals(eqid)) {
                                anStr = ans2;
                            } else if ("L1101".equals(eqid)) {
                                anStr = anl;
                            } else if ("U5801".equals(eqid)) {
                                anStr = anu;
                            }
                            if(anStr!=null) {
                                JSONObject jsnAns = new JSONObject(anStr);
                                wr.println(jsnAns.toString());
                                wr.flush();
                                System.out.println("发送数据: " + jsnAns.toString());
                            }
                        }
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(serverSokcet!=null){
                    serverSokcet.close();
                }
                if(br!=null) {
                    br.close();
                }
                if(br!=null) {
                    wr.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

    public void stopThread(){
        stop = true;
    }
}