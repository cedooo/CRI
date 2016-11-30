package com.dhcc.itims.cri.component.machineroom;

import com.dhcc.itims.cri.component.machineroom.element.NetworkElement;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public abstract class MachineRoom {
	protected String name = null;    //名称
	protected String location = null;    //地点
	protected String id = null;    //id
	protected String type = null;    //类型
	protected List<NetworkElement> networkElementList = new ArrayList<NetworkElement>();
	protected MachineRoomMetaData machineRoomMetaData = null;
    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
    public List<NetworkElement> getNetworkElementList() {
		return networkElementList;
	}
	public void addNetworkElement(NetworkElement ne){
    	this.networkElementList.add(ne);
    }
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public MachineRoomMetaData getMachineRoomMetaData() {
		return machineRoomMetaData;
	}

	public void setMachineRoomMetaData(MachineRoomMetaData machineRoomMetaData) {
		this.machineRoomMetaData = machineRoomMetaData;
	}

	@Override
	public String toString() {
		return "MachineRoom{" +
				"name='" + name + '\'' +
				", location='" + location + '\'' +
				", id='" + id + '\'' +
				", type='" + type + '\'' +
				", networkElementList=" + networkElementList +
				", machineRoomMetaData=" + machineRoomMetaData +
				'}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		MachineRoom that = (MachineRoom) o;

		if (name != null ? !name.equals(that.name) : that.name != null) return false;
		if (location != null ? !location.equals(that.location) : that.location != null) return false;
		if (id != null ? !id.equals(that.id) : that.id != null) return false;
		if (!type.equals(that.type)) return false;
		if (networkElementList != null ? !networkElementList.equals(that.networkElementList) : that.networkElementList != null)
			return false;
		return machineRoomMetaData != null ? machineRoomMetaData.equals(that.machineRoomMetaData) : that.machineRoomMetaData == null;

	}

	@Override
	public int hashCode() {
		int result = name != null ? name.hashCode() : 0;
		result = 31 * result + (location != null ? location.hashCode() : 0);
		result = 31 * result + (id != null ? id.hashCode() : 0);
		result = 31 * result + type.hashCode();
		result = 31 * result + (networkElementList != null ? networkElementList.hashCode() : 0);
		result = 31 * result + (machineRoomMetaData != null ? machineRoomMetaData.hashCode() : 0);
		return result;
	}
}
