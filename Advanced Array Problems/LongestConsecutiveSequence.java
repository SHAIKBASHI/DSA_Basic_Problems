// LongestConsecutiveSequence

import java.util.*;

public class  LongestConsecutiveSequence{

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int n = 5;

        System.out.println("Enter the Array Elements:");

        int[] arr = new int[n];

        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        HashSet<Integer> set=new HashSet<>();
        int len=0;

        for(int num:arr){
            
            set.add(num);
        }

        for(int num:set){
            if(!set.contains(num-1)){
                int cur=num;
                int count=1;
                while (set.contains(cur + 1)) {
                    cur++;
                    count++;
                }
                len=Math.max(len,count);
            }
        }
        System.out.println("Longest Consecutive Sequence: "+len);
        
    }
}