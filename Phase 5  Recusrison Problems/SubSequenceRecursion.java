//SubSequenceRecursion

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class SubSequenceRecursion{
	
	public static void main(String args[]){

	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the array size : ");
	int num=sc.nextInt();
	System.out.println("Enter the Array elements:");
	int[] arr=new int[num];

	for(int i=0;i<num;i++) arr[i]=sc.nextInt();

	List<Integer> list=new ArrayList<>();

	int indx=0,sum=2;

	sequenceRecursion(indx,arr,list,sum,num,0);
	
	}

	public static void sequenceRecursion(int indx,int[] arr,List<Integer> list,int sum,int num,int s){

		if(indx==num){
			if(s==sum) 
				for(int su:list)
				 System.out.print(" "+su);
			System.out.println("");

		return;
		}

		list.add(arr[indx]);
		s+=arr[indx];
		sequenceRecursion(indx+1,arr,list,sum,num,s);
		s-=arr[indx];
		list.remove(list.size()-1);
		sequenceRecursion(indx+1,arr,list,sum,num,s);
	}
}