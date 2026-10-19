//Print1ToN

import java.util.*;

public class Print1ToN{
	
	public static void main(String args[]){

	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number : ");
	int num=sc.nextInt();
	int i=1;
	OneToN(i,num);



	}

	public static void OneToN(int i,int num){

		if(i>num) return;

		System.out.println(" "+i);

		OneToN(i+1,num);


	}
}