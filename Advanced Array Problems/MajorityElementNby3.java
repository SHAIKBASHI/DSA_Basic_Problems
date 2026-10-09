// MajorityElementNby3

import java.util.*;

public class MajorityElementNby3 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int n = 7;

        System.out.println("Enter the Array Elements:");

        int[] arr = new int[n];

        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int candidate1 = 0;
        int candidate2 = 0;

        int count1 = 0;
        int count2 = 0;

        // Find possible candidates
        for(int i = 0; i < n; i++) {

            if(arr[i] == candidate1) {
                count1++;
            }
            else if(arr[i] == candidate2) {
                count2++;
            }
            else if(count1 == 0) {
                candidate1 = arr[i];
                count1 = 1;
            }
            else if(count2 == 0) {
                candidate2 = arr[i];
                count2 = 1;
            }
            else {
                count1--;
                count2--;
            }
        }

        // Verify candidates
        count1 = 0;
        count2 = 0;

        for(int i = 0; i < n; i++) {

            if(arr[i] == candidate1)
                count1++;

            else if(arr[i] == candidate2)
                count2++;
        }

        System.out.println("Elements Occurring More Than n/3 Times:");

        if(count1 > n / 3)
            System.out.println(candidate1);

        if(count2 > n / 3)
            System.out.println(candidate2);
    }
}