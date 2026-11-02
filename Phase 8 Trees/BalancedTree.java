//Balanced Binary Tree

import java.util.*;

public class BalancedTree {

	int data;
	
	BalancedTree left;
	BalancedTree right;

	BalancedTree(int data){

		this.data=data;
		left=null;
		right=null;
	}

public static int MaximumDepth(BalancedTree root) {

	if(root==null) return 0;

	int lh=MaximumDepth(root.left);
	if(lh==-1) return -1;
	int rh=MaximumDepth(root.right);
    if(rh==-1) return -1;

    if(Math.abs(lh - rh)>1) return -1;
	return 1+Math.max(lh,rh);

}

 public static boolean isBalanced(BalancedTree root){

 	return MaximumDepth(root)!=-1;
 }
	


	public static  void main(String[] args) {
		
		BalancedTree root=new BalancedTree(10);

		root.left = new BalancedTree(20);
		root.right = new BalancedTree(30);

		root.left.left = new BalancedTree(40);
		root.left.right = new BalancedTree(50);
		
		if(isBalanced(root)) System.out.println("Tree is Balanced");
		else System.out.println("Not Balanced");
		
		}
}


