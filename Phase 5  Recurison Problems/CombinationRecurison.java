//CombinationRecurison


import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
public class CombinationRecurison{
	
	public static void main(String args[]){

	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the array size: ");
	int n=sc.nextInt();
	System.out.println("Enter the array elements :");
	int arr[]=new int[n];

	for(int i=0;i<n;i++) arr[i]=sc.nextInt();

	List<List<Integer>> ans=new ArrayList<>();
	int target=7,indx=0;
	findCombination(arr,indx,target,ans,new ArrayList<>());
	System.out.println(" "+ans);

}

public static  void findCombination(int[] arr,int indx,int target,List<List<Integer>> ans,List<Integer> ds){
		if(target==0){

		ans.add(new ArrayList<>(ds));
		return;

		} 
		
		if(indx==arr.length||target<0) return;
		
		if(arr[indx]<=target){
		ds.add(arr[indx]);
		findCombination(arr,indx,target-arr[indx],ans,ds);
		ds.remove(ds.size()-1);
	}
		findCombination(arr,indx+1,target,ans,ds);
		
			return ;
}




}
