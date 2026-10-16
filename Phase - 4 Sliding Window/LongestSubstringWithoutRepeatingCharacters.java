// LongestSubstringWithoutRepeatingCharacters

import java.util.*;

public class  LongestSubstringWithoutRepeatingCharacters {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String:");
        String str  = sc.next();

        HashSet<Character> set=new HashSet<>();

        int l=0,len=0,max=0;

        for(int i=0;i<str.length();i++){

            char ch=str.charAt(i);

            while(set.contains(ch)){

                set.remove(str.charAt(l));
                l++;
                
            }
           

            set.add(ch);
            len=i-l+1;
             max=Math.max(len,max);
      
        }

        System.out.println("Substring length is: "+max);
        

        sc.close();
    }
}