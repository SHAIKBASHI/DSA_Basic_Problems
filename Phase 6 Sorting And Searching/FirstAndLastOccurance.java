//First and Last Occurance

import java.util.Arrays;
import java.util.Scanner;

public class FirstAndLastOccurance {
	
	public static void main(String args[]){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size: ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the array elements: ");

		for(int i=0;i<n;i++) arr[i]=sc.nextInt();
		System.out.println("Enter the target element:");
		int target=sc.nextInt();

		int low=0,high=n-1;

		int first=firstHalf(0,n-1,-1,arr,target);
		int last=lastHalf(0,n-1,-1,arr,target);

		System.out.println("First Occurrance: "+first);
		System.out.println("Last Occurrance: "+last);
	}

	public static int firstHalf(int low,int high,int first,int[] arr,int target){

		while(low<=high){

			int mid=low+(high-low)/2;

			if(target==arr[mid]) {
				first=mid;
				high=mid-1;
				continue;
			}
			else if(target<arr[mid]){

			 high=mid-1;
			}
			else{

				low=mid+1;
			}
		}
		return first;

    }	

    public static int lastHalf(int low,int high,int last,int[] arr,int target){

		while(low<=high){

			int mid=low+(high-low)/2;
 
			if(target==arr[mid]) {
				last=mid;
				low=mid+1;
				continue;
			}
			else if(target<arr[mid]){

			 high=mid-1;
			}
			else{

				low=mid+1;
			}
		}
		return last;

    }
	
}