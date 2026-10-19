// PermutationInString

import java.util.*;

public class  PermutationInString {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the 1st String:");
        String str  = sc.next();

         System.out.println("Enter the 2nd String:");
        String str1 = sc.next();

        //int[] arr = new int[n];

       // System.out.println("Enter the  array elements:");
        
        //for (int i = 0; i < n; i++) {
           // arr[i] = sc.nextInt();
       // }

        int l=0;

        if(str.length()>str1.length()){

            System.out.println("false");
        }
        else{

            int arr[]=new int[26];
            int arr1[]=new int[26];

            for( int i=0;i<str.length();i++){

                char ch=str.charAt(i);

                arr[ch-'a']++;


            }

             for( int i=0;i<str.length();i++){

                char ch=str1.charAt(i);

                arr1[ch-'a']++;


            }
           if( Arrays.equals(arr,arr1)) System.out.println("true");

           for(int i=str.length();i<str1.length();i++){
            char out=str1.charAt(i-str.length());
            arr1[out-'a']--;

            char incoming = str1.charAt(i);
                arr1[incoming - 'a']++;

                // Compare frequencies
                if (Arrays.equals(arr, arr1)) {
                    System.out.println("true");
                    break;
                }
           }


        
        
        
    }
        sc.close();
    }
}