//  PairWithGivenDifference
import java.util.*;

public class PairWithGivenDifference {

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

        int k=78;

        for(int i=0;i<n;i++){

            if(set.contains(arr[i]+k)||set.contains(arr[i]-k)) {
                
                if (set.contains(arr[i] + k)) {
        System.out.println("Pairs are: " + arr[i] + " " + (arr[i] + k));
    } else {
        System.out.println("Pairs are: " + arr[i] + " " + (arr[i] - k));
    }

    break;
       }
       set.add(arr[i]);
        }

        

        
    }
}
