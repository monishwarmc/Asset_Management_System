package systemAdministration.device;

import java.util.Date;

import systemAdministration.admin;
import systemAdministration.software.Software;

public class LicenseHandle {

	public void add(Software software, Date dateOfInstallation, Date expiryDate) {
		admin.LicenseList.add(new License(
				admin.refLicenseId,
				software,
				dateOfInstallation,
				expiryDate
				));
		software.setNoOfInstallation(software.getNoOfInstallation()+1);
		admin.refLicenseId++;
	}
	
}
