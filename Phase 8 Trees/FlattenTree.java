//Flatten a Binary tree to Linked List

import java.util.*;



public class FlattenTree {

	int data;
	
	FlattenTree left;
	FlattenTree right;

	FlattenTree(int data){

		this.data=data;
		left=null;
		right=null;
	}
	public static void binaryTree(FlattenTree root){

		if(root==null) return;
		Stack<FlattenTree> st=new Stack<>(); 
		st.push(root);

		while(!st.isEmpty()){

			FlattenTree cur=st.peek();
			st.pop();

			if(cur.right!=null) st.push(cur.right);
			if(cur.left!=null) st.push(cur.left);
			if(!st.isEmpty()) cur.right=st.peek();

			cur.left=null;

		}


		
	}
	public static void inorder(FlattenTree root){

		if(root==null) return;

		inorder(root.left);
		System.out.print(" "+root.data);
		inorder(root.right);
	}
	

	
	public static  void main(String[] args) {
		
		FlattenTree root=new FlattenTree(1);

		root.left = new FlattenTree(2);
		root.right = new FlattenTree(2);

		root.left.left = new FlattenTree(4);
		root.left.right = new FlattenTree(5);
		root.right.left = new FlattenTree(5);
		root.right.right = new FlattenTree(4);
		
		binaryTree(root);
		inorder(root);
		
		}
}


