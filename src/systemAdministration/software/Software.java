package systemAdministration.software;

import systemAdministration.vendor.Vendor;

public class Software {

	private int id;
	private Vendor vendor;
	private String name;
	private double price;
	public Vendor getVendor() {
		return vendor;
	}
	public void setVendor(Vendor vendor) {
		this.vendor = vendor;
	}
	private int noOfInstallation;
	public Software(int id, Vendor vendor, String name, double price, int noOfInstallation) {
		super();
		this.id = id;
		this.vendor = vendor;
		this.name = name;
		this.price = price;
		this.noOfInstallation = noOfInstallation;
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
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getNoOfInstallation() {
		return noOfInstallation;
	}
	public void setNoOfInstallation(int noOfInstallation) {
		this.noOfInstallation = noOfInstallation;
	}
	@Override
	public String toString() {
		return "Software [id=" + id + ", name=" + name + ", price=" + price + ", noOfInstallation=" + noOfInstallation
				+ "]";
	}
	
}
