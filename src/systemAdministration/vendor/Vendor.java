package systemAdministration.vendor;

import java.util.List;

import systemAdministration.software.Software;

public class Vendor {

	private int id;
	private String name;
	private List<Software> softwareList;
	public Vendor(int id, String name, List<Software> softwareList) {
		super();
		this.id = id;
		this.name = name;
		this.softwareList = softwareList;
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
	public List<Software> getSoftwareList() {
		return softwareList;
	}
	public void setSoftwareList(List<Software> softwareList) {
		this.softwareList = softwareList;
	}
	@Override
	public String toString() {
		return "Vendor [id=" + id + ", name=" + name + ", softwareList=" + softwareList + "]";
	}
	
}
