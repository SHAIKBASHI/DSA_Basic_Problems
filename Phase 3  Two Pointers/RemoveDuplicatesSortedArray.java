// RemoveDuplicatesSortedArray

import java.util.*;

public class  RemoveDuplicatesSortedArray {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array size:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the array elements:");
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int j=1,i=0;

        while(j<n){


            if(arr[i]!=arr[j]){
                i++;
                arr[i]=arr[j];
                
            }
                j++; 
        }
       
       for(int k=0;k<i;k++){

        System.out.println(" "+arr[k]);

       }
        sc.close();
    }
}