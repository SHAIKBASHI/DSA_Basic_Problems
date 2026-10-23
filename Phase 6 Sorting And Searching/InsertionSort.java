//Insertion sort

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort{
	
	public static void main(String args[]){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size: ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the array elements: ");

		for(int i=0;i<n;i++) arr[i]=sc.nextInt();

		for(int i=0;i<=n-1;i++){

			 int j=i;

			 	while(j>0&& arr[j-1]>arr[j]){

			 		int temp=arr[j-1];
			 		arr[j-1]=arr[j];
			 		arr[j]=temp;
			 		j--;
			 	
			 }
		}

		System.out.print(" "+Arrays.toString(arr));

	}
}