// LongestSubarrayWithSum

import java.util.*;

public class  LongestSubarrayWithSum{

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int n = 5;

        System.out.println("Enter the Array Elements:");

        int[] arr = new int[n];

        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int sum=0,left=0,maxLength=0;
        int target=12;

        for(int i=0;i<n;i++){
            sum+=arr[i];

            while(sum>target){
                sum=sum-arr[left];
                left++;
            }

            if(sum==target){
                int length = i - left + 1;
                maxLength = Math.max(maxLength, length);
               
            }
        }

         System.out.print("Longest length "+maxLength);

        
        
    }
}