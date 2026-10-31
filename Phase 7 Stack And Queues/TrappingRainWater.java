//Trapping Rain Water

import java.util.*;
import java.util.Scanner;
import java.util.Stack;


public class TrappingRainWater {


	public static  void main(String[] args) {
		
		Stack<Integer> st=new Stack<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Array Size:");
		int n=sc.nextInt();
		System.out.println("Enter the Array Elements:");
		int[] arr=new int[n];
		int leftMax=0;
		for(int i=0;i<n;i++) arr[i]=sc.nextInt();
		int water=0,width=0,bounded=0;

		for(int i=0;i<n;i++){

		
			while(!st.isEmpty()&&arr[i]>arr[st.peek()]){
			
				int top=st.pop();
				if(st.isEmpty()) break;
				leftMax=arr[top];
				width=i-st.peek()-1;
				bounded=Math.min(arr[i],arr[st.peek()])-leftMax;
				water+=width*bounded;
			
		}
			st.push(i);
		}

		System.out.println("Trapped rain water: "+water);
	

		}

}

