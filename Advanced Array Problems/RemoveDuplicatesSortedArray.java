//RemoveDuplicatesSortedArray

import java.util.*;

public class RemoveDuplicatesSortedArray{
	
	public static void main(String args[]){

	Scanner sc=new Scanner(System.in);

	int n=7;

	System.out.println("Enter the Array Elements: ");
	
	int[] arr=new int[n];

	for(int i=0;i<n;i++) arr[i]=sc.nextInt();

	int r=0;

	for(int i=0;i<n-1;i++) {

		if(arr[i]!=arr[i+1]){
			arr[r]=arr[i];
			r++;

		}
	}

	if(arr[n-1]!=arr[n-2]){
	arr[r]=arr[n-1];
	r++;
}

		for(int i=0;i<r;i++){
			System.out.print(" "+arr[i]);
		}
	

	}
}