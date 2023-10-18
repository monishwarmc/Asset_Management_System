package systemAdministration.vendor;

import java.util.List;

import systemAdministration.admin;
import systemAdministration.software.Software;

public class VendorHandle {

	public void add(String name, List<Software> softwareList) {
		admin.vendorList.add(new Vendor(
				admin.refVendorId,
				name,
				softwareList
				));
		admin.refVendorId++;
	}
	
}
