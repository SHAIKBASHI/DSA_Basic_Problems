//Boundary Traversal

import java.util.*;



public class BoundaryTree {

	int data;
	
	BoundaryTree left;
	BoundaryTree right;

	BoundaryTree(int data){

		this.data=data;
		left=null;
		right=null;
	}

	public static void boundaryTree(BoundaryTree root,ArrayList<Integer> ls){

		if(root==null) return;
			if(root.left != null) {
         	ls.add(root.data);
       		boundaryTree(root.left, ls);
		}
		else if(root.right != null) {
    			ls.add(root.data);
   				 boundaryTree(root.right, ls);
				}
	}

	public static void leafNode(BoundaryTree root,ArrayList<Integer> ls){

		if(root==null) return;

		if(root.left == null && root.right == null) {
        ls.add(root.data);
        return;
    }

    leafNode(root.left, ls);
    leafNode(root.right, ls);
       	
	}

public static void right(BoundaryTree root,ArrayList<Integer> ls){

		if(root==null) return;

		 if(root.right != null){
   			 right(root.right, ls);
		 }

		else if(root.left != null){
    		right(root.left, ls);
    		
			
		}
     ls.add(root.data);

		}

	
	public static  void main(String[] args) {
		
		BoundaryTree root=new BoundaryTree(10);

		root.left = new BoundaryTree(20);
		root.right = new BoundaryTree(30);

		root.left.left = new BoundaryTree(40);
		root.left.right = new BoundaryTree(50);
		ArrayList<Integer> ls=new ArrayList<>();
		
		if(root != null) {
    ls.add(root.data);

    boundaryTree(root.left, ls);
    leafNode(root, ls);
    right(root.right, ls);
}


		System.out.println(" "+ls);
		}
}


