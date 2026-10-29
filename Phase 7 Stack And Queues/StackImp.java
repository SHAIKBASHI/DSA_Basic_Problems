//Stack Implementation Using Arrays

import java.util.Arrays;
import java.util.Scanner;
import java.util.*;

public class StackImp {

	int top=-1;
	int  st[]=new int[10];

	void push(int n){
		 if (top >= st.length - 1) {
            System.out.println("Array size Exceeded (Stack Overflow)");
        } else {
            top = top + 1;
            st[top] = n;
            System.out.println("Element is Pushed: " + n);
        }
	}

	int top(){

		if(top==-1){

		 System.out.println("Stack is empty");
		 return -1;
		}
		
		System.out.println("Top element is : "+st[top]);
		return st[top];

	}

	void pop(){

		if(top==-1) return;
		
		System.out.println("Popped element is :"+st[top]);
		top=top-1;
		

		
	}
	int size(){

		return top+1;
	}

	public static  void main(String[] args) {
		
		StackImp obj=new StackImp();

		for(int i=1;i<=9;i++){
			obj.push(i);
		}
		obj.top();
		System.out.println("Size is : "+obj.size());
		obj.push(10);
		obj.top();
		//obj.push(11);
		obj.pop();
		obj.top();
		obj.pop();
		obj.pop();
		System.out.println("Size is : "+obj.size());


	}


}

