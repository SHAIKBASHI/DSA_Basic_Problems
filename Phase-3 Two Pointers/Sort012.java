// Sort012

import java.util.*;

public class  Sort012 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array size:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the array elements:");
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int l=0,h=n-1,mid=0;
        while(mid<=h){
            

            if(arr[mid]==0){
                int temp=arr[mid];
                arr[mid]=arr[l];
                arr[l]=temp;
                mid++;
                l++;
            }else if(arr[mid]==1){

                mid++;
            }else if(arr[mid]==2){
                int tem=arr[h];
                arr[h]=arr[mid];
                arr[mid]=tem;
                h--;
            }
        }

        System.out.println(Arrays.toString(arr));
       
       
        sc.close();
    }
}