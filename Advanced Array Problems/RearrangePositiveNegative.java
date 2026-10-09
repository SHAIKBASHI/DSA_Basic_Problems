// RearrangePositiveNegative

import java.util.*;

public class  RearrangePositiveNegative{

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int n = 6;

        System.out.println("Enter the Array Elements:");

        int[] arr = new int[n];

        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int p[]=new int[n];
        int ne[]=new int[n];
        int pi=0,ni=0;

        for(int i=0;i<n;i++){

            if(arr[i]>0){
                p[pi]=arr[i];
                pi++;
            }else{
                ne[ni]=arr[i];
                ni++;
            }
        }

        ArrayList<Integer> re=new ArrayList<>();
        int x=0,y=0;
        while(x<pi&&y<ni){

            re.add(p[x]);
            re.add(ne[y]);
            x++;
            y++;

        }
        while(x<pi){
            re.add(p[x]);
            x++;
        }

        while(y<ni){
            re.add(ne[y]);
            y++;
        }
        System.out.print(" "+re);


       

       

        
    }
}