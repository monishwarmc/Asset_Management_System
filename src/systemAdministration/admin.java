package systemAdministration;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import systemAdministration.device.Device;
import systemAdministration.device.DeviceHandle;
import systemAdministration.device.License;
import systemAdministration.device.LicenseHandle;
import systemAdministration.employee.Employee;
import systemAdministration.employee.EmployeeHandle;
import systemAdministration.software.Software;
import systemAdministration.software.SoftwareHandle;
import systemAdministration.vendor.Vendor;
import systemAdministration.vendor.VendorHandle;

public class admin {
	public static int refSoftwareId;
	public static int refVendorId;
	public static int refEmployeeId;
	public static int refDeviceId;
	public static int refLicenseId;
	
	public static List<Vendor> vendorList = new ArrayList<Vendor>();
	public static List<Employee> EmployeeList = new ArrayList<Employee>();
	public static List<Device> DeviceList = new ArrayList<Device>() ;
	public static List<Software> SoftwareList = new ArrayList<Software>();
	public static List<License> LicenseList = new ArrayList<License>();
	
	public static SoftwareHandle softwareHandle = new SoftwareHandle();
	public static VendorHandle vendorHandle = new VendorHandle();
	public static EmployeeHandle employeeHandle = new EmployeeHandle();
	public static DeviceHandle deviceHandle = new DeviceHandle();
	public static LicenseHandle licenseHandle = new LicenseHandle();
	
	public static void initialize() {
		refSoftwareId = 0;
		refVendorId = 0;
		refEmployeeId = 0;
		refDeviceId = 0;
		refLicenseId = 0;
		vendorHandle.add("mukesh", SoftwareList);
		softwareHandle.add(vendorList.get(0), "excel", 1000);
		softwareHandle.add(vendorList.get(0), "power", 500);
		licenseHandle.add(SoftwareList.get(0),new Date() , new Date(java.lang.System.currentTimeMillis()+1000000));
		licenseHandle.add(SoftwareList.get(1), new Date(), new Date(java.lang.System.currentTimeMillis()+5000));
		employeeHandle.add("kadhar", DeviceList);
		deviceHandle.add(EmployeeList.get(0),"hp", LicenseList);
	}
}
