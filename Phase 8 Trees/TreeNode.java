//Binary Tree Traversals

import java.util.*;



public class TreeNode {

	int data;
	
	TreeNode left;
	TreeNode right;

	TreeNode(int data){

		this.data=data;
		left=null;
		right=null;
	}

	public static void inOrder(TreeNode root){

		if(root==null) return;
		
		inOrder(root.left);
		System.out.print(" "+root.data);
		inOrder(root.right);
	}

	public static void preOrder(TreeNode root){

		if(root==null) return;
		
		
		System.out.print(" "+root.data);
		preOrder(root.left);
		preOrder(root.right);
	}

	public static void postOrder(TreeNode root){

		if(root==null) return;
		
		postOrder(root.left);
		
		postOrder(root.right);
		System.out.print(" "+root.data);
	}





	public static  void main(String[] args) {
		
		TreeNode root=new TreeNode(10);

		root.left = new TreeNode(20);
		root.right = new TreeNode(30);

		root.left.left = new TreeNode(40);
		root.left.right = new TreeNode(50);
		System.out.println("Inorder");
		
		inOrder(root);
		System.out.println();
		System.out.println("PreOrder");
		preOrder(root);
		System.out.println();
        System.out.println("PostOrder");
	
		postOrder(root);
		}
}


