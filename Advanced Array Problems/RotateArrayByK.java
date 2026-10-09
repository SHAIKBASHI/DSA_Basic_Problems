
import java.util.*;

public class RotateArrayByK {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array size:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter k:");
        int k = sc.nextInt();

        if (n > 0) {
            k = k % n;

            // Reverse the entire array
            reverse(arr, 0, n - 1);

            // Reverse the first k elements
            reverse(arr, 0, k - 1);

            // Reverse the remaining elements
            reverse(arr, k, n - 1);
        }

        System.out.println("Rotated array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        sc.close();
    }

    public static void reverse(int[] arr, int left, int right) {

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }
}
