//Right/Left Side View

import java.util.*;



public class LeftSideTree {

	int data;
	
	LeftSideTree left;
	LeftSideTree right;

	LeftSideTree(int data){

		this.data=data;
		left=null;
		right=null;
	}

	public static void leftSideTree(LeftSideTree root,ArrayList<Integer> ls,int level){

		if(root==null) return;
		if(level==ls.size()){
			ls.add(root.data);
		}
		

		leftSideTree(root.left,ls,level+1);
		leftSideTree(root.right,ls,level+1);
	}


	
	public static  void main(String[] args) {
		
		LeftSideTree root=new LeftSideTree(10);

		root.left = new LeftSideTree(20);
		root.right = new LeftSideTree(30);

		root.left.left = new LeftSideTree(40);
		root.left.right = new LeftSideTree(50);
		ArrayList<Integer> ls=new ArrayList<>();
		int level=0;
		leftSideTree(root,ls,level);

		System.out.println(" "+ls);
		}
}


