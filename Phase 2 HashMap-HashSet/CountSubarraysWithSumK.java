
// CountSubarraysWithSumK

import java.util.*;

public class CountSubarraysWithSumK {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array size:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }


        System.out.println("Enter the target sum:");
        int k = sc.nextInt();

        HashMap<Integer,Integer> map=new HashMap<>();

        int sum=0,count=0;
        map.put(sum,1);

        for(int i=0;i<n;i++){

            sum+=arr[i];

            int need=sum-k;

            if(map.containsKey(need)){

                count+=map.get(need);
            }
           map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        System.out.println("Subarrays with sum count is "+count);

         
    }
}
