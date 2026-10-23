//PrintNTo1

import java.util.*;

public class PrintNTo1{
	
	public static void main(String args[]){

	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number : ");
	int num=sc.nextInt();
	int i=num;
	NTo1(i,num);



	}

	public static void NTo1(int i,int num){

		if(i==0) return;

		System.out.println(" "+i);

		NTo1(i-1,num);


	}
}