// ThreeSum

import java.util.*;

public class ThreeSum{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array size:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the array elements:");
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

       // System.out.println("Enter the target value ");

        int target=0;

        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(arr);

        int l=0,r=n-1;

        for(int i=0;i<n-2;i++){

            if (i > 0 && arr[i] == arr[i - 1]) {
             continue;
            }

            l=i+1;
            r=n-1;

            while(l<r){
            int sum=arr[i]+arr[l]+arr[r];

            if(sum==target){

                list.add(Arrays.asList(arr[i],arr[l],arr[r]));
                l++;
                r--;

                 // Skip duplicate left elements
                    while (l < r && arr[l] == arr[l - 1]) {
                        l++;
                    }

                    // Skip duplicate right elements
                    while (l < r && arr[r] == arr[r + 1]) {
                        r--;
                    }

            } else if(sum<target){

                l++;

            } else{

                r--;

            }
        }
        
        }

        System.out.println(" "+list);
        sc.close();
    }
}