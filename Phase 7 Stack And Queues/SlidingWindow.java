//Sliding Window Maximum Using Queue/Deque

import java.util.*;
import java.util.Scanner;
import java.util.Queue;
import java.util.Deque;


public class SlidingWindow {


	public static  void main(String[] args) {
		
		Deque<Integer> dq=new ArrayDeque<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Array Size:");
		int n=sc.nextInt();
		System.out.println("Enter the Array Elements:");
		int[] arr=new int[n];
		
		for(int i=0;i<n;i++) arr[i]=sc.nextInt();
		
		int k=3;
		int max=0,totalMax=0;
		int[] result=new int[n-k+1];

	for(int i=0; i<k; i++){

    while(!dq.isEmpty() && arr[dq.peekLast()] <= arr[i]){
        dq.pollLast();
    }

    dq.offerLast(i);
}

result[0] = arr[dq.peekFirst()];

		for(int i=k;i<n;i++){

		if (!dq.isEmpty()&&dq.peekFirst() <= i - k) {
   				 dq.pollFirst();
			}
			

			while (!dq.isEmpty() && arr[dq.peekLast()] <= arr[i]) {
   					 dq.pollLast();
			}
			

			dq.offerLast(i);
			result[i - k + 1] = arr[dq.peekFirst()];

		}

		System.out.print(" "+Arrays.toString(result));

		}

}

