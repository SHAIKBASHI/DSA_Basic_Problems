//Combination2Recurison


import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
public class Combination2Recurison{
	
	public static void main(String args[]){

	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the array size: ");
	int n=sc.nextInt();
	System.out.println("Enter the array elements :");
	int arr[]=new int[n];

	for(int i=0;i<n;i++) arr[i]=sc.nextInt();

	List<List<Integer>> ans=new ArrayList<>();
	int target=7,indx=0;
	Arrays.sort(arr);
	findCombination(arr,indx,target,ans,new ArrayList<>());
	System.out.println(" "+ans);

}

public static  void findCombination(int[] arr,int indx,int target,List<List<Integer>> ans,List<Integer> ds){
		if(target==0){

		ans.add(new ArrayList<>(ds));
		return;

		} 
		
		if(indx==arr.length||target<0) return;

		for(int i=indx;i<arr.length;i++){
			if(i>indx&&arr[i]==arr[i-1]){
				continue;
			}
			if(arr[i]>target) break;
		
		
		
		ds.add(arr[i]);
		findCombination(arr,i+1,target-arr[i],ans,ds);
		ds.remove(ds.size()-1);
	
	}	
}
}
