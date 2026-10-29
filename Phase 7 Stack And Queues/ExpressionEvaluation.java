//Evaluate Reverse Polish Notation

import java.util.*;
import java.util.Scanner;
import java.util.Stack;


public class ExpressionEvaluation {


	public static  void main(String[] args) {
		
		Stack<Integer> st=new Stack<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers and operators");
		String str=sc.next();

		for(char ch:str.toCharArray()){

			if(Character.isDigit(ch)){

				int convert=Character.getNumericValue(ch);
				st.push(convert);
			}else{

				int p1=st.pop();
				int p2=st.pop();
				switch(ch){

				case '*':st.push(p2*p1);
					break;

				case '+':st.push(p2+p1);
					break;
				case '-':st.push(p2-p1);
					break;
				case '/':st.push(p2/p1);
					break;
				default:System.out.println("Can't Proceed");
				}
				
			}
		}

		System.out.println("Result is: "+st.peek());
		}

}

