// EquilibriumIndex

import java.util.*;

public class  EquilibriumIndex{

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int n = 6;

        System.out.println("Enter the Array Elements:");

        int[] arr = new int[n];

        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int sum=0,left=0,right=0,mid=0;

        for(int i=0;i<n;i++){

            sum+=arr[i];
            
        }

        for(int i=0;i<n;i++){

            right=sum-arr[i]-left;

            if(left==right){
                mid=i;
                break;
            }

            left+=arr[i];
            

        }
        System.out.println("Equilibrium Index is:"+mid);

       

        
    }
}