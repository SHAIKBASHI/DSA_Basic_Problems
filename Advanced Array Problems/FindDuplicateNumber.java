// FindDuplicateNumber
import java.util.*;

public class FindDuplicateNumber {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array size:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int slow=0,fast=0;

        do{
            slow=arr[slow];
            fast=arr[arr[fast]];

        }while(slow!=fast);

        slow=0;

        while(slow!=fast){
            slow=arr[slow];
            fast=arr[fast];
        }

        System.out.println("Duplicate number is : "+slow);

    }
}
