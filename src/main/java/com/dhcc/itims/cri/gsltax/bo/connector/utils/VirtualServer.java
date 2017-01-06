package com.dhcc.itims.cri.gsltax.bo.connector.utils;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by cedo on 2017/1/6.
 * 接口模拟器
 */
public class VirtualServer implements  Runnable{

    public static void main(String[] args){
        new Thread(new VirtualServer()).start();
    }

    private String file = "gsltax/docs/原始数据/地税灾备机房负一层_182.txt";

    @Override
    public void run() {
        try {
            ServerSocket serverSocket = new ServerSocket(8002);
            Socket socket = serverSocket.accept();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
