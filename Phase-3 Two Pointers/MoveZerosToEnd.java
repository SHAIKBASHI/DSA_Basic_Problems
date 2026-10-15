// MoveZerosToEnd

import java.util.*;

public class  MoveZerosToEnd {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array size:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the array elements:");
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int j=0;

        for(int i=0;i<n;i++){

            if(arr[i]!=0){
                arr[j]=arr[i];
                j++;
            }
        }

        
       
       for(int k=0;k<j;k++){

        System.out.println(" "+arr[k]);

       }
       for(int k=j;k<n;k++){

        System.out.println("0");

       }
        sc.close();
    }
}