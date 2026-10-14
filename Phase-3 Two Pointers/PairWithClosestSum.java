// PairWithClosestSum

import java.util.*;

public class PairWithClosestSum {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array size:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the array elements:");
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the target value ");

        int target=sc.nextInt();

        int l=0,r=n-1,minDiff=Integer.MAX_VALUE;
        int bestleft=0,bestright=0;

        while(l<r){

            int sum=arr[l]+arr[r];

            int diff=Math.abs(sum-target);

            if(diff<minDiff){
                minDiff=diff;
                bestleft=arr[l];
                bestright=arr[r];
               
            }
            if(sum<target){
                l++;
            }
            else{
                r--;
            }

             
        }
        System.out.println(bestleft+" and "+bestright );
        sc.close();
    }
}