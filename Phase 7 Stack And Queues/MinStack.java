//Min Stack


import java.util.*;

public class MinStack {

	 public static void main(String[] args) {
		
	 	Scanner sc=new Scanner(System.in);
	 	System.out.println("Enter the Array Size: ");
	 	int n=sc.nextInt();

	 	System.out.println("Enter the Array Elements: ");
	 	int arr[]=new int[n];

		Stack<Integer> st=new Stack<>();
     	Stack<Integer> min=new Stack<>();
	 	for(int i=0;i<n;i++) arr[i]=sc.nextInt();

	 	for(int i=0;i<n;i++){
	 	ppush(arr,i,st,min);
	 }
	 	
	 	ppop(st,min);
	 	ppop(st,min);
	 	
	 	if(!min.isEmpty()) int result=getMin(min);
	 	

	 	System.out.println("Min stack is : "+result);

	}

	public static void ppush(int arr[],int i,Stack<Integer> st,Stack<Integer> min){

			if(st.isEmpty()){

	 				st.push(arr[i]);
	 				min.push(arr[i]);

	 			}else{
	 					st.push(arr[i]);
	 					if(arr[i]<min.peek()){

	 					min.push(arr[i]);
	 				
	 					}else{

	 			        min.push(min.peek());
	 			    }
	 		   }

	}
	public static void ppop(Stack<Integer> st,Stack<Integer> min){

		if(!st.isEmpty()){

			st.pop();
			
		}
		if(!min.isEmpty()){

			min.pop();
		}
	}

	public static int getMin(Stack<Integer> min){


		
		return min.peek();
	}

}

