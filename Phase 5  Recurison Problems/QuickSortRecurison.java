//QuickSortRecurison


import java.util.Scanner;
import java.util.Arrays;

public class QuickSortRecurison{
	
	public static void main(String args[]){

	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the array size: ");
	int n=sc.nextInt();
	System.out.println("Enter the array elements :");
	int arr[]=new int[n];

	for(int i=0;i<n;i++) arr[i]=sc.nextInt();

	quickSort(arr,0,n-1);
	System.out.print(" "+Arrays.toString(arr));

	}
	public static void quickSort(int arr[],int low,int high){
//if (low >= high) return;
		if(low>=high) return;
		int partition=quick(arr,low,high);
		quickSort(arr,low,partition-1);
		quickSort(arr,partition+1,high);


	}

	public static int quick(int[] arr,int low,int high){

		int pivot=arr[low];
		int i=low;
		int j=high;

		while(i<j){

			while(arr[i]<=pivot&&i<high){
					i++;
			} 
			while(arr[j]>pivot&&j>low){
				j--;
			}

			if(i<j){
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}

		}
		int temp=arr[low];
		arr[low]=arr[j];
		arr[j]=temp;
		
		return j;

	}

}
