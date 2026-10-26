//Search Element in Rotated Sorted Array

import java.util.Arrays;
import java.util.Scanner;

public class RotatedSortedArray {
	
	public static void main(String args[]){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size: ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the array elements: ");

		for(int i=0;i<n;i++) arr[i]=sc.nextInt();
		int target=1;
	
		int result=sortArray(arr,n,target);

		System.out.println("The Single element is: "+result);
	}

	public static int sortArray(int[] arr,int n,int target){

		

		int low=0,high=n-1;

		while(low<=high){

			int mid=low+(high-low)/2;

			if(arr[mid]==target) {

				return mid;
				
			}
			 if(arr[low]<=arr[mid]){
			   if(arr[low]<=target&&target<=arr[mid]){

			   	high=mid-1;
			 }else {

			 	low=mid+1;
			 }

			}else{

				if(arr[mid]<=target&&target<=arr[high]){

					low=mid+1;
				}else{

					high=mid-1;
				}
			}
		}
		return -1;

    }	

    
	
}