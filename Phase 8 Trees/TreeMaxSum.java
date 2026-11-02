//Maximum Path Sum Binary Tree

import java.util.*;

public class TreeMaxSum {
    static int maxSum=Integer.MIN_VALUE;;
	int data;
	
	TreeMaxSum left;
	TreeMaxSum right;

	TreeMaxSum(int data){

		this.data=data;
		left=null;
		right=null;
	}

public static int maxSumPath(TreeMaxSum root) {

	if(root==null) return 0;
	int lh=Math.max(0,maxSumPath(root.left));
	int rh=Math.max(0,maxSumPath(root.right));
	
	maxSum=Math.max(maxSum ,root.data+lh+rh);
	return root.data+Math.max(lh,rh);

}
	


	public static  void main(String[] args) {
		
		TreeMaxSum root=new TreeMaxSum(10);

		root.left = new TreeMaxSum(20);
		root.right = new TreeMaxSum(30);

		root.left.left = new TreeMaxSum(40);
		root.left.right = new TreeMaxSum(50);
		root.left.left.left = new TreeMaxSum(50);
		maxSumPath(root);
		System.out.println("Maximum Path Sum of Binary Tree is: "+maxSum);
		
		}
}


