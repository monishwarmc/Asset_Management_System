package systemAdministration.employee;

import java.util.List;

import systemAdministration.admin;
import systemAdministration.device.Device;

public class EmployeeHandle {

	public void add(String name, List<Device> deviceList) {
		admin.EmployeeList.add(new Employee(
				admin.refEmployeeId,
				name,
				deviceList
				));
		admin.refEmployeeId++;
	}
	
}
