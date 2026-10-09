// ProductOfArrayExceptSelf

import java.util.*;

public class  ProductOfArrayExceptSelf{

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int n = 4;

        System.out.println("Enter the Array Elements:");

        int[] arr = new int[n];

        int[] pr=new int[n];

        

        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        for(int i=0;i<n;i++){
             int k=1;

            for(int j=0;j<n;j++){
               
                if(j!=i){

                    k=k*arr[j];

                }
                
            }
            
            pr[i]=k;
        }

        for(int num:pr){
            System.out.print(" "+num);
        }

        
    }
}