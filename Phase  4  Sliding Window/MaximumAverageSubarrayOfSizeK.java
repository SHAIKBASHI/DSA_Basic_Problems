// MaximumAverageSubarrayOfSizeK

import java.util.*;

public class  MaximumAverageSubarrayOfSizeK {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the  array size:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the  array elements:");
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int k=4,sum=0;
        double avg=0;


        for(int i=0;i<k;i++) sum+=arr[i];

        double max=(double)sum/k; 

        for(int i=k;i<n;i++){

            sum=sum+arr[i]-arr[i-k];
            avg=(double)sum/k;
            max=Math.max(avg,max);
        }

        System.out.println("Maximum Average Subarray Of Size K "+max);

        sc.close();
    }
}