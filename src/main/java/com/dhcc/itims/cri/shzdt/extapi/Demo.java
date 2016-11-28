package com.dhcc.itims.cri.shzdt.extapi;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class Demo {

	public static void main(String args[]) {

		try{
			Socket hSock = new Socket("172.16.102.39", 8001);
			//绑定输入、输出接口
			PrintWriter outSock = new PrintWriter(new BufferedWriter(new OutputStreamWriter(hSock.getOutputStream())), true);
			BufferedReader inSock  = new BufferedReader(new InputStreamReader(hSock.getInputStream()));

			//发送数据
			String strCmd = "{\"cmd\":6001,\"flg\":1,\"rst\":1,\"seq\":1,\"val\":null,\"ver\":1}";
			System.out.println("send:"+strCmd);
			outSock.println(strCmd);
			outSock.flush();

			//接收数据
			String strValue = inSock.readLine();
			System.out.println("recv:"+strValue);
			if((null != strValue) && (strValue.length() > 0))
			{

			}
			System.out.println("send:"+strCmd);
			outSock.println(strCmd);
			outSock.flush();
			strValue = inSock.readLine();

			outSock.close();
			inSock.close();
		}catch(Exception e){
			e.printStackTrace();
		}

	}
}
