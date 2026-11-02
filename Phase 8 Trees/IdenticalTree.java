// Check it two trees are Identical or Not

import java.util.*;

public class IdenticalTree {
    
	int data;
	
	IdenticalTree left;
	IdenticalTree right;

	IdenticalTree(int data){

		this.data=data;
		left=null;
		right=null;
	}

public static boolean isIdentical(IdenticalTree root,IdenticalTree root1) {

	if(root==null || root1==null ) return root==root1;

	return (root.data==root1.data)&&isIdentical(root.left,root1.left)&&isIdentical(root.right,root1.right);
	

}
	


	public static  void main(String[] args) {
		
		IdenticalTree root=new IdenticalTree(10);

		root.left = new IdenticalTree(20);
		root.right = new IdenticalTree(30);

		IdenticalTree root1=new IdenticalTree(10);

		root1.left = new IdenticalTree(20);
		root1.right = new IdenticalTree(30);

		
		if(isIdentical(root,root1)) System.out.println("Trees are Identical");
		else System.out.println("Not Identical");
		
		
		}
}


