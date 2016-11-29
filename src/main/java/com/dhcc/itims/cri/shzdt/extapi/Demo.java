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

		 
		Demo.testSend();

	}
	public static void first(){
		try{
			Socket hSock = new Socket("172.16.102.39", 8002);
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
			Socket hSock = new Socket("172.16.102.39", 8002);
			PrintWriter outSock = new PrintWriter(new BufferedWriter(new OutputStreamWriter(hSock.getOutputStream())), true);
			final BufferedReader  inSock  = new BufferedReader(new InputStreamReader(hSock.getInputStream()));

			//String strCmd = equipmentAllParametersRequest("L1101");    //6002
			//String strCmd = equipmentStateRequest("L1101");    //6003
			//String strCmd = equipmentParametersValRequest("L1101");    //6004
			//String strCmd = parametersValRequest("L1101001");    //6005
			String strCmds[] = {equipmentListRequest(),equipmentAllParametersRequest("L1101"),equipmentStateRequest("L1101"),
				equipmentParametersValRequest("L1101"),parametersValRequest("L1101001")
			};
			
			new Thread(){
				public void run(){
					try{
					String strValue = inSock.readLine();
					while(strValue!=null){
						System.out.println("recv:");
						System.out.println(strValue);
						strValue = inSock.readLine();
					}
					System.out.println("**********************");
					}catch(Exception e){}
				}
			}.start();
			for(int i=0; i<strCmds.length; i++) {
				String strCmd = strCmds[i];
				System.out.println("send:"+strCmd);
				outSock.println(strCmd);
				outSock.flush();
				
				
				Thread.sleep(3200);
			}
			/*
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

			*/
			outSock.close();
			inSock.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	 public static String equipmentListRequest(){
        String strCmd = "{\"cmd\":6001,\"flg\":1,\"rst\":1,\"seq\":1,\"val\":null,\"ver\":1}"; 
        return strCmd;
    }

    public static String equipmentAllParametersRequest(String equipmenetId){
        String strCmd = "{\"cmd\":6002,\"flg\":1,\"rst\":1,\"seq\":2,\"val\":null,\"ver\":1}";
        JSONObject jsonObject = new JSONObject(strCmd);

        String valJsonStr = "{\"eqid\":\"\"}";
        JSONObject valJosnObject = new JSONObject(valJsonStr);
        valJosnObject.put("eqid", equipmenetId);
        jsonObject.put("val", valJosnObject);
        String rtCmd = jsonObject.toString(); 
        return rtCmd;
    }


    public static String  equipmentStateRequest(String equipmenetId){
        String strCmd = "{\"cmd\":6003,\"flg\":1,\"rst\":1,\"seq\":3,\"val\":null,\"ver\":1}";
        JSONObject jsonObject = new JSONObject(strCmd);

        String valJsonStr = "{\"eqid\":\"\"}";
        JSONObject valJosnObject = new JSONObject(valJsonStr);
        valJosnObject.put("eqid", equipmenetId);
        jsonObject.put("val", valJosnObject);
        String rtCmd = jsonObject.toString(); 
        return rtCmd;
    }

    public static String equipmentParametersValRequest(String equipmenetId){
        String strCmd = "{\"cmd\":6004,\"flg\":1,\"rst\":1,\"seq\":4,\"val\":null,\"ver\":1}";
        JSONObject jsonObject = new JSONObject(strCmd);

        String valJsonStr = "{\"eqid\":\"\"}";
        JSONObject valJosnObject = new JSONObject(valJsonStr);
        valJosnObject.put("eqid", equipmenetId);
        jsonObject.put("val", valJosnObject);
        String rtCmd = jsonObject.toString(); 
        return rtCmd;
    }

    public static String  parametersValRequest(String parameterId){
        String strCmd = "{\"cmd\":6005,\"flg\":1,\"rst\":1,\"seq\":5,\"val\":null,\"ver\":1}";
        JSONObject jsonObject = new JSONObject(strCmd);

        String valJsonStr = "{\"paid\":\"\"}";
        JSONObject valJosnObject = new JSONObject(valJsonStr);
        valJosnObject.put("paid", parameterId);
        jsonObject.put("val", valJosnObject);
        String rtCmd = jsonObject.toString(); 
        return rtCmd;
    }

    public static String alarmInfoRequest(){
        String strCmd = "{\"cmd\":6006,\"flg\":1,\"rst\":1,\"seq\":6,\"val\":null,\"ver\":1}";
        JSONObject jsonObject = new JSONObject(strCmd);

        String rtCmd = jsonObject.toString(); 
        return rtCmd;
    }
	
}
