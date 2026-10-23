//PalindromeRecurison


import java.util.Scanner;

public class PalindromeRecurison{
	
	public static void main(String args[]){

	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String : ");
	String str=sc.next();
	int l=0,r=str.length()-1;
	if(palindrome(str,l,r)) System.out.println("String is palindrome");

	else System.out.println("String is not palindrome");
	
	sc.close();
	}

	public static boolean palindrome(String str,int l,int r){

		if(str.isEmpty()|| l>=r) return false;

		if(str.charAt(l)==str.charAt(r)) palindrome(str,l+1,r-1);

		else return false;

		return true;
	}


}
