//Count total Node in Complete Binary Tree

import java.util.*;



public class CompleteTree {

	int data;
	
	CompleteTree left;
	CompleteTree right;

	CompleteTree(int data){

		this.data=data;
		left=null;
		right=null;
	}
	public static int nodes(CompleteTree root){

		if(root==null) return 0;

		int lh=getLeftHeight(root.left);
		int rh=getRightHeight(root.right);

		if(lh==rh) return (int)Math.pow(2, lh + 1) - 1;
		else return nodes(root.left)+nodes(root.right)+1;


	}

	public static int getLeftHeight(CompleteTree root){

		int count=0;
		
		while(root!=null){

			count++;
			root=root.left;
		}
		return count;
	}

	public static int getRightHeight(CompleteTree root){

		int count=0;
		
		while(root!=null){

			count++;
			root=root.right;
		}
		return count;
	}

	

	
	public static  void main(String[] args) {
		
		CompleteTree root=new CompleteTree(1);

		root.left = new CompleteTree(2);
		root.right = new CompleteTree(2);

		root.left.left = new CompleteTree(4);
		root.left.right = new CompleteTree(5);
		root.right.left = new CompleteTree(5);
		root.right.right = new CompleteTree(4);
		
		int result=nodes(root);
		System.out.println("Height is : "+result);
		

		
		}
}


