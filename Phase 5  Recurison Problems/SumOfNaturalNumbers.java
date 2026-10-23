//SumOfNaturalNumbers

import java.util.*;

public class SumOfNaturalNumbers{
	
	public static void main(String args[]){

	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number : ");
	int num=sc.nextInt();
	int i=0;
	sum(i,num);
	



	}

	public static void sum(int i,int num){

		if(num==0) {
			System.out.println(" Sum = "+i);
			return;
		}
		


		sum(i+num,num-1);


	}
}