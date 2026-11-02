//Maximum Depth of Binary Tree

import java.util.*;

public class TreeMax {

	int data;
	
	TreeMax left;
	TreeMax right;

	TreeMax(int data){

		this.data=data;
		left=null;
		right=null;
	}

public static int MaximumDepth(TreeMax root) {

	if(root==null) return 0;

	return 1+Math.max(MaximumDepth(root.left),MaximumDepth(root.right));

}
	


	public static  void main(String[] args) {
		
		TreeMax root=new TreeMax(10);

		root.left = new TreeMax(20);
		root.right = new TreeMax(30);

		root.left.left = new TreeMax(40);
		root.left.right = new TreeMax(50);
		root.left.left.left = new TreeMax(50);

		System.out.println("Maximum Depth of Binary Tree is: "+MaximumDepth(root));
		
		}
}


