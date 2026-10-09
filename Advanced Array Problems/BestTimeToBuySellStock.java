// BestTimeToBuySellStock

import java.util.*;

public class  BestTimeToBuySellStock{

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int n = 6;

        System.out.println("Enter the Array Elements:");

        int[] arr = new int[n];

        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int buy=arr[0],profit=0;

        for(int i=0;i<n;i++){

            buy=Math.min(buy,arr[i]);

            profit=Math.max(profit,arr[i]-buy);

            
        }


       

        System.out.println("Profit is :"+profit);

        
    }
}