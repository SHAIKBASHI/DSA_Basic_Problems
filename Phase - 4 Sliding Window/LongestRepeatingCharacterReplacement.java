// LongestRepeatingCharacterReplacement

import java.util.*;

public class  LongestRepeatingCharacterReplacement {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String:");
        String str  = sc.next();


        int k=1,replace=0,l=0,maxfreq=0,maxlen=0;
        str=str.toUpperCase();

        HashMap<Character,Integer> map=new HashMap<>();

        for(int i=0;i<str.length();i++){

            char ch=str.charAt(i);

            

               map.put(ch,map.getOrDefault(ch,0)+1);
               maxfreq=Math.max(maxfreq,map.get(ch));

               replace=(i-l+1)-maxfreq;

               if(replace>k){
                char leftchar=str.charAt(i);
                map.put(leftchar,map.get(leftchar)-1);
                l++;
               }
               maxlen=Math.max(maxlen,i-l+1);
             

           
        }
        System.out.println("Longest length is: " + maxlen);
        

        sc.close();
    }
}