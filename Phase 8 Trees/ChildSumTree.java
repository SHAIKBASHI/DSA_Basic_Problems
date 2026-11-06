//Children Sum Properties

import java.util.*;



public class ChildSumTree {

	int data;
	
	ChildSumTree left;
	ChildSumTree right;

	ChildSumTree(int data){

		this.data=data;
		left=null;
		right=null;
	}

	
public static void childSum(ChildSumTree root) {

    if(root == null) return;

    int child = 0;

    if(root.left != null)
        child += root.left.data;

    if(root.right != null)
        child += root.right.data;

    // First pass: Push values down
    if(child >= root.data) {
        root.data = child;
    }
    else {
        if(root.left != null)
            root.left.data = root.data;

        if(root.right != null)
            root.right.data = root.data;
    }

    childSum(root.left);
    childSum(root.right);

    // Second pass: Update parent from children
    int total = 0;

    if(root.left != null)
        total += root.left.data;

    if(root.right != null)
        total += root.right.data;

    if(root.left != null || root.right != null)
        root.data = total;
}

	public static void inorder(ChildSumTree root){

		if(root==null) return;

		inorder(root.left);
		System.out.print
		(" "+root.data);
		inorder(root.right);
	}


	
	public static  void main(String[] args) {
		
		ChildSumTree root=new ChildSumTree(1);

		root.left = new ChildSumTree(2);
		root.right = new ChildSumTree(3);

		root.left.left = new ChildSumTree(4);
		root.left.right = new ChildSumTree(5);
		root.right.left = new ChildSumTree(6);
		root.right.right = new ChildSumTree(7);
		
		childSum(root);
		inorder(root);
		
		
		}
}


