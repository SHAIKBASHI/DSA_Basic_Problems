//Right/Left Side View

import java.util.*;



public class RightSideTree {

	int data;
	
	RightSideTree left;
	RightSideTree right;

	RightSideTree(int data){

		this.data=data;
		left=null;
		right=null;
	}

	public static void rightSideTree(RightSideTree root,ArrayList<Integer> ls,int level){

		if(root==null) return;
		if(level==ls.size()){
			ls.add(root.data);
		}
		

		rightSideTree(root.right,ls,level+1);
		rightSideTree(root.left,ls,level+1);
	}


	
	public static  void main(String[] args) {
		
		RightSideTree root=new RightSideTree(10);

		root.left = new RightSideTree(20);
		root.right = new RightSideTree(30);

		root.left.left = new RightSideTree(40);
		root.left.right = new RightSideTree(50);
		ArrayList<Integer> ls=new ArrayList<>();
		int level=0;
		rightSideTree(root,ls,level);

		System.out.println(" "+ls);
		}
}


