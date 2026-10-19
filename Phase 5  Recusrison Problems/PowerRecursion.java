//PowerRecursion

import java.util.*;

public class PowerRecursion{
	
	public static void main(String args[]){

	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number and power : ");
	int num=sc.nextInt();
	int pow=sc.nextInt();
	
	int result=power(num,pow);
	System.out.println("Power of a number is : "+result);
	}

	public static int  power(int num,int pow){

		if(pow==0) return 1;
		
	

		return num*power(num,pow-1);


	}
}