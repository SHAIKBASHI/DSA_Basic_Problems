//FibonacciRecursion

import java.util.*;

public class FibonacciRecursion{
	
	public static void main(String args[]){

	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number : ");
	int num=sc.nextInt();
	
	int result=Fibonacci(num);
	System.out.println("Fibonacci of number : "+result);
	}

	public static int Fibonacci(int num){

		if(num==0) return 0;
		if(num==1) return 1;
		
		 
		return Fibonacci(num-1)+Fibonacci(num-2);


	}
}