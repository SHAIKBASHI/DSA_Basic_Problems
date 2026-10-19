// MaximumSumSubarrayOfSizeK

import java.util.*;

public class  MaximumSumSubarrayOfSizeK {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the  array size:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the  array elements:");
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int k=3,sum=0,max=0;

        for(int num:arr) sum+=arr[num];

        for(int i=k;i<n;i++){

            max=Math.max(max,max+arr[i]-arr[k-1]);
        }

        System.out.println("Maximum sum is : "+max);
        

         
        sc.close();
    }
}