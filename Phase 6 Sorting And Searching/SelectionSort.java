//Selection sort

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort{
	
	public static void main(String args[]){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size: ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the array elements: ");

		for(int i=0;i<n;i++) arr[i]=sc.nextInt();

		for(int i=0;i<=n-1;i++){
			int min=i;

			 for(int j=i+1;j<n;j++){

			 	if(arr[j]<arr[min]){

			 		min=j;
			 	}
			 }

			 		int temp=arr[min];
			 		arr[min]=arr[i];
			 		arr[i]=temp;		
			 	}

		System.out.print(" "+Arrays.toString(arr));

	}
}