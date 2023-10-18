package systemAdministration.software;

import java.util.ArrayList;
import java.util.List;

import systemAdministration.admin;
import systemAdministration.vendor.Vendor;

public class SoftwareHandle {

	public void add(Vendor vendor, String name, double price) {
		admin.SoftwareList.add(new Software(admin.refSoftwareId,vendor, name, price, 0));
		List<Software> list = new ArrayList<Software>();
		list.addAll(vendor.getSoftwareList());
		list.add(admin.SoftwareList.get(admin.refSoftwareId));
		vendor.setSoftwareList(list);
		admin.refSoftwareId++;
	}
	
}
