// TopKFrequentElements

import java.util.*;

public class TopKFrequentElements {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array size:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the array elements:");
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the k value");
        int k=sc.nextInt();

        HashMap<Integer,Integer> map=new HashMap<>();

       for(int i=0;i<n;i++){

         map.put(arr[i],map.getOrDefault(arr[i],0)+1);
       }

       // Convert map entries into a list
        List<Map.Entry<Integer, Integer>> list =
                new ArrayList<>(map.entrySet());

        // Sort by frequency in descending order
        list.sort((a, b) ->
                Integer.compare(b.getValue(), a.getValue()));

        // Print the top k elements
        System.out.println("Top frequent elements:");

        for (int i = 0; i < Math.min(k, list.size()); i++) {
            System.out.print(list.get(i).getKey() + " ");
        }

        
        
        sc.close();
    }
}