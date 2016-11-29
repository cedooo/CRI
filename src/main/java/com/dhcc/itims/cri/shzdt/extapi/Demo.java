package com.dhcc.itims.cri.shzdt.extapi;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class Demo {

	public static void main(String args[]) {



	}
	public static void first(){
		try{
			Socket hSock = new Socket("172.16.102.39", 8001);
			PrintWriter outSock = new PrintWriter(new BufferedWriter(new OutputStreamWriter(hSock.getOutputStream())), true);
			BufferedReader inSock  = new BufferedReader(new InputStreamReader(hSock.getInputStream()));

			String strCmd = "{\"cmd\":6001,\"flg\":1,\"rst\":1,\"seq\":1,\"val\":null,\"ver\":1}";
			System.out.println("send:"+strCmd);
			outSock.println(strCmd);
			outSock.flush();

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

	public static void testSend(){
		try{
			Socket hSock = new Socket("172.16.102.39", 8001);
			PrintWriter outSock = new PrintWriter(new BufferedWriter(new OutputStreamWriter(hSock.getOutputStream())), true);
			BufferedReader inSock  = new BufferedReader(new InputStreamReader(hSock.getInputStream()));

			String strCmd = quipmentAllParametersRequest("L1101");
			System.out.println("send:"+strCmd);
			outSock.println(strCmd);
			outSock.flush();

			String strValue = inSock.readLine();
			System.out.println("recv:"+strValue);
			while(strValue!=null){
				System.out.println(strValue);
				strValue = inSock.readLine();
			}
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

	public static String quipmentAllParametersRequest(String equipmenetId){
		String strCmd = "{\"cmd\":6002,\"flg\":1,\"rst\":1,\"seq\":1,\"val\":null,\"ver\":1}";
		JSONObject jsonObject = new JSONObject(strCmd);

		String valJsonStr = "{\"eqid\":\"\"}";
		JSONObject valJosnObject = new JSONObject(valJsonStr);
		valJosnObject.put("eqid", equipmenetId);
		jsonObject.put("val", valJosnObject);
		String rtCmd = jsonObject.toString();
		return rtCmd;
	}
}
