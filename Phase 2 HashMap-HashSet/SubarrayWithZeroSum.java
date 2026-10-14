// SubarrayWithZeroSum

import java.util.*;

public class SubarrayWithZeroSum {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array size:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        HashSet<Integer> set=new HashSet<>();
        int sum=0;

        boolean found=false;

        set.add(sum);
        for(int i=0;i<n;i++){

            sum+=arr[i];

             if(sum==0) {
                found=true;
                break;
            }


            if(set.contains(sum)){

                found=true;
                break;
            }

            set.add(sum);

        }

        if(found) System.out.println("true");
        else System.out.println("false");


        sc.close();
    }
}