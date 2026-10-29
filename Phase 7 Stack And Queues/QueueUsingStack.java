//Implement Queue Using Two Stacks


import java.util.Scanner;
import java.util.Stack;


public class QueueUsingStack {


	public static  void main(String[] args) {
	

		Stack<Integer> st=new Stack<>();
		Stack<Integer> st1=new Stack<>(); 

		Scanner sc=new Scanner(System.in);
		System.out.println("Entert the Array size: ");
		int n=sc.nextInt();
		System.out.println("Enter the Elements: ");
		int[] arr=new int[n];
		for(int i=0;i<n;i++) arr[i]=sc.nextInt();

		enqueue(arr,st);
		dequeue(arr,st1,st);
		dequeue(arr,st1,st);
		dequeue(arr,st1,st);


	}

	public static void enqueue(int[] arr,Stack<Integer> st){
		for(int i=0;i<arr.length;i++){
		
			st.push(arr[i]);

	}


	}
	public static void dequeue(int[] arr,Stack<Integer> st1,Stack<Integer> st){

		if (st1.isEmpty()) {

   			 while (!st.isEmpty()) {

      	      st1.push(st.pop());

   			 }
   			 
		}
	   
	}


}

