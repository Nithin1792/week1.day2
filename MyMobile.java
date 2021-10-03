package week1.day2;

public class MyMobile {

	// Variables outside main
	String name = "Nithin";
	long mobileNumber = 6380105335l;
	String PAN = "AXCPN3908T";

	// method1 outside main
	public void employeeName() {
		// TODO Auto-generated method stub
		System.out.println("Name of the employee: " + name);
	}

	// Method 2 outside main
	public void employeeContact() {
		// TODO Auto-generated method stub
		System.out.println("Mobile Number: " + mobileNumber);
	}

//Method 3 outside main set as private
	private void employeeID() {
		// TODO Auto-generated method stub
		System.out.println("Employee PAN No: " + PAN);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Obj created to call components outside main
		MyMobile emp = new MyMobile();
		// now calling the components using obj createds
		emp.employeeName();
		emp.employeeContact();
		emp.employeeID();
		System.out.println(emp.name);
		String empName = emp.name;
		long empMob = emp.mobileNumber;
		String empPAN = emp.PAN;
		System.out.println(empName);
		System.out.println(empMob);
		System.out.println(empPAN);

	}

}
