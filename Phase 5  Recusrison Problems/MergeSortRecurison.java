//MergeSortRecurison


import java.util.Scanner;

public class MergeSortRecurison{
	
	public static void main(String args[]){

	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the array size: ");
	int n=sc.nextInt();
	System.out.println("Enter the array elements :");
	int arr[]=new int[n];

	for(int i=0;i<n;i++) arr[i]=sc.nextInt();

	mergeSort(arr,0,n-1);
	for(int num:arr) System.out.print(num+" ");

	}

	public static void mergeSort(int arr[],int low,int high){

		if(low>=high) return;
		int mid=(low+high)/2;
		mergeSort(arr,low,mid);
		mergeSort(arr,mid+1,high);
		merge(arr,low,mid,high);

	}

	public static void merge(int arr[],int low,int mid,int high){
		int temp[]=new int[high-low+1];
		int left=low;
		int right=mid+1;
		int k=0;

		while(left<=mid&&right<=high){

			if(arr[left]<=arr[right]){

				temp[k]=arr[left];
				left++;
			}else{

				temp[k]=arr[right];
				right++;
			}
			k++;

		}

		while(left<=mid){

			temp[k]=arr[left];
				left++;
				k++;
		}
		while(right<=high){

			temp[k]=arr[right];
				right++;
				k++;
		}
		for(int i=0;i<temp.length;i++){

			arr[low+i]=temp[i];
		}

	}


}
