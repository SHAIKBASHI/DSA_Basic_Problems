//Level Order Traversal

import java.util.*;



public class TreeNode1 {

	int data;
	
	TreeNode1 left;
	TreeNode1 right;

	TreeNode1(int data){

		this.data=data;
		left=null;
		right=null;
	}

public static void LevelOrderTraversal(TreeNode1 root) {

    if(root == null) return;

    Queue<TreeNode1> q = new ArrayDeque<>();
    q.offer(root);

    while(!q.isEmpty()) {

        int size = q.size();

        for(int i = 0; i < size; i++) {

            TreeNode1 curr = q.poll();

            System.out.print(curr.data + " ");

            if(curr.left != null) {
                q.offer(curr.left);
            }

            if(curr.right != null) {
                q.offer(curr.right);
            }
        }

        System.out.println();
    }
}
	


	public static  void main(String[] args) {
		
		TreeNode1 root=new TreeNode1(10);

		root.left = new TreeNode1(20);
		root.right = new TreeNode1(30);

		root.left.left = new TreeNode1(40);
		root.left.right = new TreeNode1(50);

		LevelOrderTraversal(root);
		
		}
}


