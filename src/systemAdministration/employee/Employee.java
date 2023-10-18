package systemAdministration.employee;

import java.util.List;

import systemAdministration.device.Device;

public class Employee {

	private int id;
	private String name;
	private List<Device> deviceList;
	public Employee(int id, String name, List<Device> deviceList) {
		super();
		this.id = id;
		this.name = name;
		this.deviceList = deviceList;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Device> getDeviceList() {
		return deviceList;
	}
	public void setDeviceList(List<Device> deviceList) {
		this.deviceList = deviceList;
	}
	@Override
	public String toString() {
		return "employee [id=" + id + ", name=" + name + ", deviceList=" + deviceList + "]";
	}
	
}
