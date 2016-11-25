package com.dhcc.itims.cri.shzdt;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * Created by cedo on 2016/11/25.
 */
public class TESTAPI {
    //private static  String host = "172.16.102.39";
    private static  String host = "192.168.23.1";
    private static  int port = 8001;
    public static  void main(String[] args){
     
		//String ss="{\"authCodeType\":4,\"cmd\":\"getAuthCode\",\"userName\":\"13600136123\"}";  
		String ss = "{\"cmd\":6001,\"flg\":1,\"rst\":1,\"seq\":1,\"val\":null,\"ver\":1}";
          
        System.out.println(execute(host, port, ss));  

    }

    public static String execute(String host, int port, String request) {
        long begin = System.currentTimeMillis();
		DataInputStream input = null;
		DataOutputStream output = null;
		Socket socket = null;
        try {

            socket = new Socket(host, port);
            System.out.println("send+++++++++++>");
            System.out.println("REQUEST: "+request); 
            output = new DataOutputStream(socket.getOutputStream()); 
            output.writeInt(request.getBytes("utf-8").length); 
            output.write(request.getBytes("utf-8"));
            output.flush(); 
            input = new DataInputStream(socket.getInputStream());
            int length = input.readInt();
            byte[] bytes = new byte[length]; 
            input.readFully(bytes, 0, length);
            long end =System.currentTimeMillis();
            System.out.println("total time:" + (end - begin) + "ms");
            return new  String(bytes,"UTF-8");
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try {
                if(socket !=null || output !=null ){
                    input.close();
                    output.close();
                    socket.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

        return null;
    }
}

