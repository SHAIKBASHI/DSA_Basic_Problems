// SubarrayWithGivenSum

import java.util.*;

public class  SubarrayWithGivenSum{

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int n = 5;

        System.out.println("Enter the Array Elements:");

        int[] arr = new int[n];

        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int sum=0,left=0;
        int target=12;

        for(int i=0;i<n;i++){
            sum+=arr[i];

            while(sum>target){
                sum=sum-arr[left];
                left++;
            }

            if(sum==target){
                
                System.out.print(left+" "+i);
                break;
            }
        }

        
        
    }
}