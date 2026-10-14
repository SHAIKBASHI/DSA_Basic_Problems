// GroupAnagrams

import java.util.*;

public class GroupAnagrams {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array size:");
        int n = sc.nextInt();

        String[] str = new String[n];

        System.out.println("Enter the array elements:");
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            str[i] = sc.nextLine();
        }

        HashMap<String,List<String>> map=new HashMap<>();

        for(String word:str){

            char[] chars=word.toCharArray();

            Arrays.sort(chars);

             String key = new String(chars);

            // Add word to the matching group
            map.computeIfAbsent(key, k -> new ArrayList<>())
               .add(word);
        }

        System.out.println("Grouped Anagrams:");
        System.out.println(map.values());
        
        sc.close();
    }
}