//Stock Span Problem


import java.util.Scanner;
import java.util.Stack;

public class StockSpan {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Array size: ");
        int n = sc.nextInt();

        System.out.println("Enter the Elements: ");
        int[] arr = new int[n];
        int result[]=new int[n];
        int[] span=new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Stack<Integer> st = new Stack<>();

        for(int i=0;i<arr.length;i++){

            while(!st.isEmpty()&&arr[st.peek()]<=arr[i]){

                st.pop();
            }
            result[i]=st.isEmpty()?(i+1):(i-st.peek());

            st.push(i);

        }
        for(int i=0;i<n;i++) System.out.print(" "+result[i]);

        sc.close();
    }
}


