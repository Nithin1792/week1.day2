package week1.day2;

public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=12345;
int q=0, r=0, sum=0;
while (num!=0) {
	q=num/10;
	System.out.println("Quotient= "+q);
	r=num%10;
	System.out.println("reminder= "+r);
	sum=sum+r;   
	num=q;
}
System.out.println(sum);
	}

}
