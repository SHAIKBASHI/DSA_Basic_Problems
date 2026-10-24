//Binary Search

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch{
	
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

		boolean flag=false;

		while(low<=high){

			int mid=low+(high-low)/2;

			if(target==arr[mid]) {
				flag=true;
				break;
			}
			else if(target<arr[mid]){

			 high=mid-1;
			}
			else{

				low=mid+1;
			}
		}

		if(flag){

			System.out.println("Target Element Found ");

		}else{

			System.out.println("Target Element Not Found ");

		}

		


    }	
	
}