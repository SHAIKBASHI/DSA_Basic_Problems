// FirstNegativeInEveryWindow

import java.util.*;

public class  FirstNegativeInEveryWindow {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the  array size:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the  array elements:");
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int k=3,sum=0;

        Queue<Integer> queue=new ArrayDeque<>();

        for(int i=0;i<n;i++) {
            if(arr[i]<0) queue.add(i);


            if(i>=k-1){

                while(!queue.isEmpty()&& queue.peek()<i-k+1){
                    queue.poll();
                }

                if(!queue.isEmpty())System.out.print(arr[queue.peek()]+" ");
                else System.out.print("0 ");
            }
        }
        

        

        sc.close();
    }
}