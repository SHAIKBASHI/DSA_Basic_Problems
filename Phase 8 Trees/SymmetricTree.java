//Symmetric Tree

import java.util.*;



public class SymmetricTree {

	int data;
	
	SymmetricTree left;
	SymmetricTree right;

	SymmetricTree(int data){

		this.data=data;
		left=null;
		right=null;
	}

	public static boolean isSame(SymmetricTree leftt,SymmetricTree rightt){

		if(leftt == null && rightt == null) return true;
		if(leftt == null || rightt == null) return false;

		return leftt.data==rightt.data && isSame(leftt.left,rightt.right)&& isSame(leftt.right, rightt.left);
	}

	
	public static  void main(String[] args) {
		
		SymmetricTree root=new SymmetricTree(1);

		root.left = new SymmetricTree(2);
		root.right = new SymmetricTree(2);

		root.left.left = new SymmetricTree(4);
		root.left.right = new SymmetricTree(5);
		root.right.left = new SymmetricTree(5);
		root.right.right = new SymmetricTree(4);
		
		
		

		System.out.println(" "+isSame(root.left,root.right));
		}
}


