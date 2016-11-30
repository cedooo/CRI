package com.dhcc.itims.cri.component.machineroom;

import com.dhcc.itims.cri.component.machineroom.element.NetworkElement;
import org.apache.commons.digester3.Digester;
import org.apache.commons.digester3.binder.DigesterLoader;
import org.apache.commons.digester3.xmlrules.FromXmlRulesModule;
import org.junit.Test;
import org.xml.sax.SAXException;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Administrator on 2016/11/26.
 */
public class MachineRoomTest {
    /**
     * 测试 Digester 创建machineRoom对象
     */
    @Test
    public void digesterBuild(){
        String rulesPath = "com/dhcc/itims/cri/component/machineroom/machineroom-rules.xml";
        String defPath = "com/dhcc/itims/cri/shzdt/bo/machineroom/machineroom.xml";
        InputStream input = null;
        DigesterLoader  digesterLoader =
                DigesterLoader.newLoader(
                        new XmlRules(rulesPath));
        Digester digester = digesterLoader.newDigester();
        input = MachineRoomTest.class.getClassLoader()
                .getResourceAsStream(defPath);
        try {
            MachineRoom modDef = digester.parse(input);
            System.out.println(modDef);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        }
    }


    @Test
    public void equipmentBuildTest(){
        String rulesPath = "com/dhcc/itims/cri/component/machineroom/element/equipment/equipment-def-rules.xml";
        String[] defPath = {
                "com/dhcc/itims/cri/shzdt/bo/machineroom/def/temp-humi1-def.xml",
                "com/dhcc/itims/cri/shzdt/bo/machineroom/def/temp-humi2-def.xml",
                "com/dhcc/itims/cri/shzdt/bo/machineroom/def/leak-water-def.xml",
                "com/dhcc/itims/cri/shzdt/bo/machineroom/def/ups-def.xml"
        };
        InputStream input = null;
        DigesterLoader  digesterLoader =
                DigesterLoader.newLoader(
                        new XmlRules(rulesPath));
        Digester digester = digesterLoader.newDigester();
        for (int i = 0; i < defPath.length; i++) {
            input = MachineRoomTest.class.getClassLoader()
                    .getResourceAsStream(defPath[i]);
            try {
                NetworkElement modDef = digester.parse(input);
                System.out.println(modDef);
            } catch (IOException e) {
                e.printStackTrace();
            } catch (SAXException e) {
                e.printStackTrace();
            }
            System.out.println("==================================");
        }

    }
}
class XmlRules extends FromXmlRulesModule{
    private String xmlPath = null;
    public XmlRules(String xmlPath){
        this.xmlPath = xmlPath.trim();
    }
    @Override
    protected void loadRules() {
        InputStream input = XmlRules.class.getClassLoader().getResourceAsStream(xmlPath);
        this.loadXMLRules(input);
    }

}