//Peak Element

import java.util.Arrays;
import java.util.Scanner;

public class PeakElement {
	
	public static void main(String args[]){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size: ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the array elements: ");

		for(int i=0;i<n;i++) arr[i]=sc.nextInt();
	
		int result=peak(arr,n);

		System.out.println("The peak element is: "+result);
	}

	public static int peak(int[] arr,int n){

		if(n==1) return 0;
		if(arr[0]>arr[1]) return arr[1];
		if(arr[n-1]>arr[n-2]) return arr[n-1];

		int low=1,high=n-2;

		while(low<=high){

			int mid=low+(high-low)/2;

			if(arr[mid]>arr[mid-1]&&arr[mid]>arr[mid+1]) {

				return arr[mid];
				
			}
			else if(arr[mid]>arr[mid-1]){

			 low=mid+1;
			}
			else{

				high=mid-1;
			}
		}
		return -1;

    }	

    
	
}