// RotateArrayByOne

import java.util.*;

public class  RotateArrayByOne{

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int n = 6;

        System.out.println("Enter the Array Elements:");

        int[] arr = new int[n];

        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int last=arr[n-1];

        for(int i=n-1;i>=1;i--){

            arr[i]=arr[i-1];
           
        }
        arr[0]=last;

        for(int num:arr){
            System.out.print(" "+num);
        }
        
    }
}