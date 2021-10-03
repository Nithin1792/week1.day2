package week1.day2;

public class OutSideAccess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Trying to access components of another class in the same package
		// to access components of another class we need to create an obj and call
		MyMobile access = new MyMobile();
		String nameAccess = access.name;
		long mNumAccess = access.mobileNumber;
		access.employeeName();

		System.out.println("Name from another class is accessible: " + nameAccess);
		System.out.println("Mobile No. from another class is accessible: " + mNumAccess);

		// When the access specifier is set to private we wont be able to access the
		// method from another class

		// access.employeeID();
	}

}
