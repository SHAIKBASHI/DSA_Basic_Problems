// CountSubarraysWithSumK

import java.util.*;

public class  CountSubarraysWithSumK {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the  array size:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the  array elements:");
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int k=3;

        int sum=0,count=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(sum,1);

        for(int i=0;i<n;i++){

            sum+=arr[i];

            int need=sum-k;

            if(map.containsKey(need)){

               count+=map.get(need);  
                
            } 
              map.put(sum,map.getOrDefault(sum,0)+1); 
                
        }

        System.out.println("Count is: "+count);



        

        sc.close();
    }
}