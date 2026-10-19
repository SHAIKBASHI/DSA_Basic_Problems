// FourSum

import java.util.*;

public class FourSum{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array size:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the array elements:");
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

       // System.out.println("Enter the target value ");

        int target=0;

        List<List<Integer>> list=new ArrayList<>();

        for(int i=0;i<n-3;i++){

            for(int j=i+1;j<n-2;j++){

                int l=j+1,r=n-1;

                if(i>0&&arr[i]==arr[i-1]){
                    continue;
                }

                if (j > i + 1 && arr[j] == arr[j - 1]) {
                     continue;
                }

                while(l<r){

                 int sum=arr[i]+arr[j]+arr[l]+arr[r];

                 if(sum==target){

                    list.add(Arrays.asList(arr[i],arr[j],arr[l],arr[r]));
                    l++;
                    r--;

                    while(l<r &&arr[l]==arr[l-1]){
                        l++;
                    }

                    while(l<r &&arr[r]==arr[r+1]){
                        r--;
                    }


                    }else if(sum<target){

                        l++;
                    }else{

                        r--;
                    }
                }
            }
        }

        System.out.println(" "+list);
        sc.close();
    }
}