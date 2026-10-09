//CheckSortedArray

import java.util.*;

public class CheckSortedArray{
	
	public static void main(String args[]){

	Scanner sc=new Scanner(System.in);
	int n=5;
	System.out.println("Enter the Array Elements: ");
	int[] arr=new int[n];
	for(int i=0;i<n;i++){
	   arr[i]=sc.nextInt();
	}
	boolean flag=true;
	for(int i=0;i<n-1;i++){

	if(arr[i]>arr[i+1]){
		flag=false;
		break;
	}

	}

	if(flag) System.out.print("Array is Sorted");
	else System.out.print("Array is Not Sorted");


	}
}