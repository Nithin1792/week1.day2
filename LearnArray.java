package week1.day2;

import java.util.Arrays;

public class LearnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] numArr= {7,9,100,87,90,98,78,56,34,2};

int numLength = numArr.length;
System.out.println("length of Array: " + numLength);
//System.out.println("Index value of numArr: "+numArr[7]);
	Arrays.sort(numArr);
	//System.out.println("Sorted new array is: "+ numArr[i]);
	for (int i = 0; i < numLength; i++) {
		System.out.println("Index value [" + i + "]: " + numArr[i]);
		
	}
	
	System.out.println("Largest value or the last element of the array: " + numArr[numLength-1]);
	System.out.println("First element of the array: "+numArr[0]);
	}

}
