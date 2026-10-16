// LongestSubarrayWithSumK

import java.util.*;

public class  LongestSubarrayWithSumK {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the  array size:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the  array elements:");
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int k=3;

        int l=0,sum=0,max=0;

        for(int i=0;i<n;i++){

            sum+=arr[i];

            while(sum>k){
                sum-=arr[l];
                l++;
            }

            if(sum==k) {

                int oldmax=i-l+1;
                max=Math.max(max,oldmax);
            }
            
        }

        System.out.println("Longest length is : "+max);



        

        sc.close();
    }
}