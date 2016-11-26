package com.dhcc.itims.cri.component.machineroom.element.subsystem;

import com.dhcc.itims.cri.component.machineroom.element.NetworkElement;
import com.dhcc.itims.cri.component.machineroom.element.equipment.Equipment;
import org.apache.commons.digester3.Digester;
import org.apache.commons.digester3.binder.DigesterLoader;
import org.apache.commons.digester3.xmlrules.FromXmlRulesModule;
import org.xml.sax.SAXException;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by CeDo on 14-4-26.
 */
public class SubSystem extends NetworkElement {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1995638645180915335L;

	private List<Equipment> listEquip = new ArrayList<Equipment>();
	private List<Equipment> listEquipDef = new ArrayList<Equipment>();
	public void add(Equipment e){
		listEquip.add(e);
	}
	public void addDef(Equipment e){
		listEquipDef.add(e);
	}
	public List<Equipment> getListEquip() {
		return listEquip;
	}
	public List<Equipment> getListEquipDef() {
		return listEquipDef;
	}
	
	
}


