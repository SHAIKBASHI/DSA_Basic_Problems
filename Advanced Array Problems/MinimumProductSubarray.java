// MinimumProductSubarray

import java.util.*;

public class MinimumProductSubarray {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int n = 4;

        System.out.println("Enter the Array Elements:");

        int[] arr = new int[n];

        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        

        int cpro = arr[0], mpro = arr[0], cpromin = arr[0];

        for(int i = 1; i < n; i++) {

            int oldMax = cpro;
            int oldMin = cpromin;

            cpro = Math.max(arr[i],
                 Math.max(oldMax * arr[i], oldMin * arr[i]));

            cpromin = Math.min(arr[i],
                Math.min(oldMax * arr[i], oldMin * arr[i]));

            mpro = Math.min(cpromin, mpro);
        }

        System.out.println("Minimum Product Subarray is: "+mpro);
        
    }
}