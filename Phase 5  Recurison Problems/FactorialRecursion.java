//FactorialRecursion

import java.util.*;

public class FactorialRecursion{
	
	public static void main(String args[]){

	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number : ");
	int num=sc.nextInt();
	
	int result=fact(num);
	System.out.println(" Factorial of N is :"+result);
	



	}

	public static int  fact(int num){

		if(num==0) return 1;
		
	

		return num*fact(num-1);


	}
}