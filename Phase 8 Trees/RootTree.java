//Root to Node

import java.util.*;



public class RootTree {

	int data;
	
	RootTree left;
	RootTree right;

	RootTree(int data){

		this.data=data;
		left=null;
		right=null;
	}
public static boolean path(RootTree root,ArrayList<Integer> ls,Integer target){

	if(root==null) return false;

	ls.add(root.data);

	if(root.data==target) return true;

	if(path(root.left,ls,target)|| path(root.right,ls,target)){

		return true;
	}
	ls.remove(ls.size()-1);
	return false;
}
	

	
	public static  void main(String[] args) {
		
		RootTree root=new RootTree(1);

		root.left = new RootTree(2);
		root.right = new RootTree(3);

		root.left.left = new RootTree(4);
		root.left.right = new RootTree(5);
		root.right.left = new RootTree(6);
		root.right.right = new RootTree(7);
		
		ArrayList<Integer> ls=new ArrayList<>();
		int target=7;
		path(root,ls,target);
		System.out.println(" "+ls);
		
		}
}


