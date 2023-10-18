package systemAdministration.device;

import java.util.List;

import systemAdministration.admin;
import systemAdministration.employee.Employee;

public class DeviceHandle {

	public void add(Employee employee, String name, List<License> licenseList) {
		admin.DeviceList.add(new Device(
				admin.refDeviceId,
				employee,
				name,
				licenseList
				));
		admin.refDeviceId++;
	}
	
}
