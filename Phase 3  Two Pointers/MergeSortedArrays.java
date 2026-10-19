// MergeSortedArrays

import java.util.*;

public class  MergeSortedArrays {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the 1st array size:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the 1st  array elements:");
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the 2nd array size:");
        int n1 = sc.nextInt();

        int[] arr1 = new int[n1];

        System.out.println("Enter the 2nd array elements:");
        
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }


        int i=arr.length-1,j=0;

        while(i>=0&&j<arr1.length){

            if(arr[i]>arr1[j]){
                int temp=arr[i];
                arr[i]=arr1[j];
                arr1[j]=temp;
            }
            i--;
            j++;
        }

        Arrays.sort(arr);
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));

         
        sc.close();
    }
}