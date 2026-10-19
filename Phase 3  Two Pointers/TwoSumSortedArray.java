// TwoSumSortedArray

import java.util.*;

public class TwoSumSortedArray {

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

        int l=0,r=n-1;

        while(l<r){

            int sum=arr[l]+arr[r];

            if(sum==target){

                System.out.println(arr[l]+" and "+arr[r] );
            }else if(sum<target){
                l++;
            }
            else{
                r--;
            }


        }
        sc.close();
    }
}