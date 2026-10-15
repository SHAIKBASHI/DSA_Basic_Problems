// SquaresOfSortedArray

import java.util.*;

public class  SquaresOfSortedArray {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the  array size:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the  array elements:");
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
         int[] result=new int[n];
         for(int i=0;i<n;i++){
            result[i]=arr[i]*arr[i];

         }
         Arrays.sort(result);
         System.out.println(Arrays.toString(result));
         
        sc.close();
    }
}