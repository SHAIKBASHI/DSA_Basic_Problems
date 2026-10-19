//  TwoSumHashMap
import java.util.*;

public class TwoSumHashMap {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array size:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        HashMap<Integer,Integer> map=new HashMap<>();

        int target=9;

        for(int i=0;i<n;i++){

            int need=target-arr[i];

            if(map.containsKey(need)){
                System.out.println("Indices are "+i+" "+map.get(need));
                break;
            }
            map.put(arr[i],i);
        }

        
    }
}
