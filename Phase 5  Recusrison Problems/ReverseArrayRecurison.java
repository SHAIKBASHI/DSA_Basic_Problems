//ReverseArrayRecurison

import java.util.*;

public class ReverseArrayRecurison{
	
	public static void main(String args[]){

	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the array size : ");
	int num=sc.nextInt();
	System.out.println("Enter the array elements : ");
	int[] arr=new int[num];
	for(int i=0;i<num;i++) arr[i]=sc.nextInt();
	int l=0,r=num-1;
	arrayRecurison(arr,l,r);

	for(int n:arr) System.out.print(" "+n);

	sc.close();

	}

	public static void arrayRecurison(int arr[],int l,int r){

		if(l>=r) return;

		swap(arr,l,r);

		arrayRecurison(arr,l+1,r-1);

	}

	public static void swap(int arr[],int l,int r){

		int temp=arr[l];
		arr[l]=arr[r];
		arr[r]=temp;

	}

}
