package cn.com.dhcc.rp.machineroom.test;

import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.digester3.Digester;
import org.apache.commons.digester3.binder.DigesterLoader;
import org.apache.commons.digester3.xmlrules.FromXmlRulesModule;
import org.xml.sax.SAXException;

import cn.com.dhcc.rp.machineroom.MachineRoom;
import cn.com.dhcc.rp.machineroom.factory.MachineRoomFactory;


public class Test {
	public static void main(String[] args) {
		InputStream input = null;
		DigesterLoader  digesterLoader = DigesterLoader.newLoader(new XmlRules("rebuild/machineroom/machineroom-rules.xml"));
		Digester digester = digesterLoader.newDigester();
		input = Test.class.getClassLoader()
				.getResourceAsStream("rebuild/machineroom/lk/caiwu-machineroom.xml");
		try {
			MachineRoom room = digester.parse(input);
			System.out.println(room.getLocation() + room.getLocation());
		} catch (IOException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
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
		InputStream input = MachineRoomFactory.class.getClassLoader().getResourceAsStream(xmlPath);
        this.loadXMLRules(input);
	}
	
}
