package com.dhcc.itims.cri.shzdt.extapi;

import com.dhcc.itims.cri.shzdt.extapi.po.Pkg;
import org.apache.log4j.Logger;
import org.json.JSONObject;

/**
 * Created by cedo on 2016/11/29.
 */
public class CmdFactory {
    static protected final Logger log = Logger.getLogger(CmdFactory.class.getClass());

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
        log.info(rtCmd);
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
        log.info(rtCmd);
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
        log.info(rtCmd);
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
        log.info(rtCmd);
        return rtCmd;
    }

    public static String alarmInfoRequest(){
        String strCmd = "{\"cmd\":6006,\"flg\":1,\"rst\":1,\"seq\":6,\"val\":null,\"ver\":1}";
        JSONObject jsonObject = new JSONObject(strCmd);
        String rtCmd = jsonObject.toString();
        log.info(rtCmd);
        return rtCmd;
    }
}
