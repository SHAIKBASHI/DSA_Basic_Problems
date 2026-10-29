//Valid Parentheses

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;


public class ValidParentheses {


	public static  void main(String[] args) {
		
		Stack<Character> st=new Stack<>();
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the String: ");
		String str=sc.next();

		System.out.println(" "+valid(str,st));

	}

	public static boolean valid(String str,Stack<Character> st){

		

		for(char ch:str.toCharArray()){

			if(ch=='('||ch=='{'||ch=='['){
				st.push(ch);
			}else{
 					if (st.isEmpty()) return false;
					 char top = st.peek();
                
                   if( (ch == '}' && top == '{') || (ch == ']' && top == '[')|| (ch == ')' && top == '(')) {
                   
                    st.pop();

                } else {
                    return false; 
                }
				}

				
			}
			
			return st.isEmpty();
		}

}

