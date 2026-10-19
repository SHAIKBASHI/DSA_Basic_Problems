//SumOfDigitsRecursion

import java.util.*;

public class SumOfDigitsRecursion{
	
	public static void main(String args[]){

	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number : ");
	int num=sc.nextInt();
	
	int result=DigitsRecursion(num);
	System.out.println("Sum Of Digits is : "+result);
	}

	public static int DigitsRecursion(int num){

		if(num==0) return 0;
		
		 
		return (num%10)+DigitsRecursion(num/10);


	}
}