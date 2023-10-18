package systemAdministration;

import java.util.Date;

public class main {

	public static void main(String[] args) {
		
		admin.initialize();
		System.out.println(admin.DeviceList);
		System.out.println("\n");
		System.out.println(admin.SoftwareList);
		System.out.println("\n");
		System.out.println(admin.LicenseList);
		System.out.println("\n");
		System.out.println(admin.vendorList);
		System.out.println("\n");
		System.out.println(admin.EmployeeList);
		
	}

}
