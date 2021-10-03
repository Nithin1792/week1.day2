package week1.day2;

public class LearnReturnType {

	public int sum() {

		int a = 10;
		int b = 20;
		int sum = a + b;
		return sum;
		// System.out.println(sum);
	}

//	private String multiply() {
//		String multiplication = "Multiplcation to show return type";
//
//		return multiplication;
//	}
public int  printSum(int result) {
//		// TODO Auto-generated method stub
	System.out.println("result: " + result);
//
	return result;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LearnReturnType obj = new LearnReturnType();
		int objValue = obj.sum();//objValue is 30 
		//obj.printSum(objValue);
		System.out.println("return type is: "+ objValue);
//		String newvalue = obj.multiply();
//		System.out.println("Print newvalue: " + newvalue);
		
	}

}
