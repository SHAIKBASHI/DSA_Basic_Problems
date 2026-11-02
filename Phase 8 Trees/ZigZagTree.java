//Zig-Zag Traversals

import java.util.*;



public class ZigZagTree {

	int data;
	
	ZigZagTree left;
	ZigZagTree right;

	ZigZagTree(int data){

		this.data=data;
		left=null;
		right=null;
	}

	public static void zigzag(ZigZagTree root){

		if(root==null) return;

		Queue<ZigZagTree> q=new ArrayDeque<>();

		List<List<Integer>> ls=new ArrayList<>();

		q.offer(root);

		boolean flag=true;

		while(!q.isEmpty()){

			List<Integer> l=new ArrayList<>();
			int size=q.size();

			for(int i=0;i<size;i++){

				ZigZagTree curr=q.poll();

				if (flag)  l.add(curr.data); 
				else l.add(0, curr.data);

				if(curr.left!=null) q.offer(curr.left);
				if(curr.right!=null) q.offer(curr.right);
			}
			ls.add(l);

			flag=!flag;
		}

		System.out.println(" "+ls);

	}





	public static  void main(String[] args) {
		
		ZigZagTree root=new ZigZagTree(10);

		root.left = new ZigZagTree(20);
		root.right = new ZigZagTree(30);

		root.left.left = new ZigZagTree(40);
		root.left.right = new ZigZagTree(50);
		zigzag(root);
		}
}


