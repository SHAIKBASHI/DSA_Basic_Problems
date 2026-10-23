//Quick sort

import java.util.Arrays;
import java.util.Scanner;

public class QuickSort{
	
	public static void main(String args[]){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size: ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the array elements: ");

		for(int i=0;i<n;i++) arr[i]=sc.nextInt();
		System.out.println("Before Sorting:");
		System.out.print(" "+Arrays.toString(arr));
		System.out.println();
		quickSort(arr,0,n-1);
		System.out.println("After Sorting:");
		System.out.print(" "+Arrays.toString(arr));

	}

	public static void quickSort(int[] arr,int low,int high){

		if(low>=high) return;
		
		int partition=quick(arr,low,high);
		quickSort(arr,low,partition-1);
		quickSort(arr,partition+1,high);
	}

	public static int quick(int[] arr,int low,int high){

		int i=low;
		int j=high;
		int pivot=arr[low];

		while(i<j){

			while(arr[i]<=pivot&&i<high){
				i++;
			}while(arr[j]>pivot&&i>low){
				j--;
			}
			if(i<j){
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
		}
		int temp=arr[j];
		arr[j]=arr[low];
		arr[low]=temp;

		return j;

	}

	
	
}