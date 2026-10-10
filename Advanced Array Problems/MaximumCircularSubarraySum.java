//  MaximumCircularSubarraySum
import java.util.*;

public class MaximumCircularSubarraySum {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array size:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int currSum=0;
        int max=Integer.MIN_VALUE,sum=0;

        for(int i=0;i<n;i++) sum+=arr[i];

        for(int i=0;i<n;i++){

            currSum=Math.max(arr[i],currSum+arr[i]);
            max=Math.max(currSum,max);
        }

        int minSum=0,min=Integer.MAX_VALUE;
         for(int i=0;i<n;i++){

            minSum=Math.min(arr[i],minSum+arr[i]);
            min=Math.min(minSum,min);
        }
        int result=0;

        if(max<0){
            result=max;

             System.out.println("Result :"+result);

        } else{
             result=Math.max(max,sum-min);
              System.out.println("Result :"+result);
        }

        

       


    }
}
