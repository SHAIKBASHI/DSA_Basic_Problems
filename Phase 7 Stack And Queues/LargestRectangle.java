//Largest Rectangle in Histogram

import java.util.*;
import java.util.Scanner;
import java.util.Stack;


public class LargestRectangle {


	public static  void main(String[] args) {
		
		Stack<Integer> st=new Stack<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Array Size:");
		int n=sc.nextInt();
		System.out.println("Enter the Array Elements:");
		int[] arr=new int[n];
		for(int i=0;i<n;i++) arr[i]=sc.nextInt();

		int max=0;

		for(int i=0;i<=n;i++){

			int curHeight=(i==n)?0:arr[i];

			while(!st.isEmpty()&&curHeight<arr[st.peek()]){

				int top=st.pop();
				int height=arr[top];

				int width;

				if(st.isEmpty()) width=i;
				else width=i-st.peek()-1;

				int area=height*width;
				max=Math.max(max,area);

			}

			st.push(i);
		    }
		    System.out.println("Rectangle value is:"+max);

		}

}

