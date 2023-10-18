package systemAdministration.device;

import java.util.Date;

import systemAdministration.software.Software;

public class License {
	private int id;
	private Software software;
	private Date dateOfInstallation;
	private Date expiryDate;
	public License(int id, Software software, Date dateOfInstallation, Date expiryDate) {
		super();
		this.id = id;
		this.software = software;
		this.dateOfInstallation = dateOfInstallation;
		this.expiryDate = expiryDate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Software getSoftware() {
		return software;
	}
	public void setSoftware(Software software) {
		this.software = software;
	}
	public Date getDateOfInstallation() {
		return dateOfInstallation;
	}
	public void setDateOfInstallation(Date dateOfInstallation) {
		this.dateOfInstallation = dateOfInstallation;
	}
	public Date getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}
	@Override
	public String toString() {
		return "License [id=" + id + ", software=" + software + ", dateOfInstallation=" + dateOfInstallation
				+ ", expiryDate=" + expiryDate + "]";
	}
	
}
