package com.dhcc.itims.cri.component.machineroom.element;

import java.io.*;


/**
 * Created by CeDo on 14-4-26.
 * 网元抽象类
 */
public abstract class NetworkElement implements Serializable,Cloneable{

	private static final long serialVersionUID = 1L;
	private String id = null;    //id
	private String name = null;    //名称
	private String type = null;    //设备类型
    
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * 深度克隆
	 * @return
	 */
	public NetworkElement deepClone(){
		NetworkElement dc = null;
		ByteArrayOutputStream baos = null;
		ByteArrayInputStream bais = null;
		try {
	        baos = new ByteArrayOutputStream();
	        ObjectOutputStream oos = new ObjectOutputStream(baos);
	        oos.writeObject(this);
	        bais = new ByteArrayInputStream(baos.toByteArray());
	        ObjectInputStream bis = new ObjectInputStream(bais);
	        dc = (NetworkElement)bis.readObject();
        } catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally{
			try {
				if(baos!=null){
					baos.close();
				}
				if(bais!=null){
					bais.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return dc;
	}
	
	@Override
	public String toString() {
		return "NetworkElement [id=" + id + ", name=" + name + ", type=" + type
				+ "]\n";
	}
	
}
