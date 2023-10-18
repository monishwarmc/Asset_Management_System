package systemAdministration.device;

import java.util.List;

import systemAdministration.employee.Employee;

public class Device {
	
	private int id;
	private Employee employee;
	private String name;
	private List<License> licenseList;
	public Device(int id, Employee employee, String name, List<License> licenseList) {
		super();
		this.id = id;
		this.employee = employee;
		this.name = name;
		this.licenseList = licenseList;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
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
	public List<License> getLicenseList() {
		return licenseList;
	}
	public void setLicenseList(List<License> licenseList) {
		this.licenseList = licenseList;
	}
	@Override
	public String toString() {
		return "Device [id=" + id + ", name=" + name + ", licenseList=" + licenseList + "]";
	}

}
