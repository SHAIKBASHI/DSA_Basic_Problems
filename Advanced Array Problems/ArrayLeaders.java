// ArrayLeaders

import java.util.*;

public class  ArrayLeaders{

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int n = 6;

        System.out.println("Enter the Array Elements:");

        int[] arr = new int[n];

        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int max=arr[n-1];

        ArrayList<Integer> leader=new ArrayList<>();

        leader.add(arr[n-1]);

        for(int i=n-2;i>=0;i--){

            if(arr[i]>max){

                leader.add(arr[i]);
                max=arr[i];
            }


        }

        System.out.println(" "+leader);

       

        
    }
}