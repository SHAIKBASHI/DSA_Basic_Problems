// LongestSubarrayEqualZerosOnes

import java.util.*;

public class LongestSubarrayEqualZerosOnes {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array size:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        int sum = 0;
        int maxLength = 0;

        // Initial prefix sum
        map.put(0, -1);

        for (int i = 0; i < n; i++) {

            // Treat 0 as -1 and 1 as +1
            if (arr[i] == 0) {
                sum -= 1;
            } else {
                sum += 1;
            }

            if (map.containsKey(sum)) {

                int length = i - map.get(sum);

                maxLength = Math.max(maxLength, length);

            } else {

                map.put(sum, i);
            }
        }

        System.out.println("Longest subarray length is " + maxLength);

        sc.close();
    }
}