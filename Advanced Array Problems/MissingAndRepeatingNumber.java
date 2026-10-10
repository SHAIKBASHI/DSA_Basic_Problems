// MissingAndRepeatingNumber
import java.util.*;

public class MissingAndRepeatingNumber {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array size:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        

        HashSet<Integer> seen=new HashSet<>();
        HashSet<Integer> duplicate=new HashSet<>();

        for(int num:arr){
            if(seen.contains(num)){
                duplicate.add(num);
                

            }
            seen.add(num);
        }

        int actualSum=n*(n+1)/2,currSum=0;

        for(int num:seen){

            currSum+=num;


        }

        int result=actualSum-currSum;
         System.out.println("Missing number is : "+result);
          System.out.println("Repeating number is : "+duplicate);

    }
}
