// MoveZerosToEnd

import java.util.*;

public class  MoveZerosToEnd{

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int n = 6;

        System.out.println("Enter the Array Elements:");

        int[] arr = new int[n];

        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int j=0;

        for(int i=0;i<n;i++){

            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
           
        }

        for(int num:arr){
            System.out.print(" "+num);
        }
        
    }
}