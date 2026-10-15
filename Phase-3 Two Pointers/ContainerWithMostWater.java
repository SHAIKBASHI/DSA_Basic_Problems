// ContainerWithMostWater

import java.util.*;

public class  ContainerWithMostWater {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array size:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the array elements:");
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int l=0,r=n-1;
         
            int maxArea=0;
        while(l<r){

            int width=r-l;
            int height=Math.min(arr[l],arr[r]);
            int area=width*height;
             maxArea=Math.max(maxArea,area);
            if (arr[l] < arr[r])l++;
            else r--;
        }

        System.out.println("Containter holds the most water is: "+maxArea);
        sc.close();
    }
}