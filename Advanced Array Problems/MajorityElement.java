//MajorityElement

import java.util.*;

public class MajorityElement{
	
	public static void main(String args[]){

	Scanner sc=new Scanner(System.in);

	int n=7;

	System.out.println("Enter the Array Elements: ");
	
	int[] arr=new int[n];

	for(int i=0;i<n;i++) arr[i]=sc.nextInt();

	int candidate=0;

	int count=0;

	for(int i=0;i<n;i++){

		if(count==0) candidate=arr[i];

		if(arr[i]==canditate) count++;

		else count--;
	}
	
	System.out.println("Majority Element: "+candidate);

	}
}