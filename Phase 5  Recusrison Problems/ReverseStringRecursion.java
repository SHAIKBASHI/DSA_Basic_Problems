//ReverseStringRecursion

import java.util.*;

public class ReverseStringRecursion{
	
	public static void main(String args[]){

	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String : ");
	String str=sc.next();
	
	String result=stringRecursion(str);
	System.out.println("Reverse String : "+result);
	}

	public static String stringRecursion(String str){

		if(str.isEmpty()||str.length()<=0) return str;
		
		 
		return stringRecursion(str.substring(1))+str.charAt(0);


	}
}