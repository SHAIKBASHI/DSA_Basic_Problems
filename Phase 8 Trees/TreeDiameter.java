//Diameter of Binary Tree

import java.util.*;

public class TreeDiameter {
    static int maxDiameter=0;
	int data;
	
	TreeDiameter left;
	TreeDiameter right;

	TreeDiameter(int data){

		this.data=data;
		left=null;
		right=null;
	}

public static int diameter(TreeDiameter root) {

	if(root==null) return 0;
	int lh=diameter(root.left);
	int rh=diameter(root.right);
	
	 maxDiameter=Math.max(maxDiameter ,lh+rh);
	return 1+Math.max(lh,rh);

}
	


	public static  void main(String[] args) {
		
		TreeDiameter root=new TreeDiameter(10);

		root.left = new TreeDiameter(20);
		root.right = new TreeDiameter(30);

		root.left.left = new TreeDiameter(40);
		root.left.right = new TreeDiameter(50);
		root.left.left.left = new TreeDiameter(50);
		int result=diameter(root);
		System.out.println("Diameter of Binary Tree is: "+maxDiameter);
		
		}
}


