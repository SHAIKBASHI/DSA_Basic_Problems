// TrappingRainWater

import java.util.*;

public class  TrappingRainWater{

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int n = 6;

        System.out.println("Enter the Array Elements:");

        int[] arr = new int[n];

        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int max=0,water=0;

        for(int i=0;i<n;i++){
            int l=0,r=0;
            for(int j=0;j<=i;j++){

                l=Math.max(l,arr[j]);
                
            }
            for(int k=i;k<n;k++){
                    r=Math.max(r,arr[k]);
                }
                water=Math.min(l,r)-arr[i];
                max+=water;


        }

        System.out.print("Maximum rain water is: "+max);
        
    }
}