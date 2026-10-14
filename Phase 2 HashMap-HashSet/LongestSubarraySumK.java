//LongestSubarraySumK

import java.util.*;

public class LongestSubarraySumK {

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

        int sum=0;
        int maxlength=0;

        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<n;i++){

        	sum+=arr[i];

        	if(sum==k){

        		maxlength=i+1;
        	}

        	int need=sum-k;

        	if(map.containsKey(need)){

        		int length=i-map.get(need);
        		maxlength=Math.max(maxlength,length);

        	}
        	map.putIfAbsent(sum,i);

        }
        System.out.println(" Longest length "+maxlength);


        

        
    }
}
