//Bottom Order Traversals

import java.util.*;



public class BottomOrderTree {

	int data;
	
	BottomOrderTree left;
	BottomOrderTree right;

	BottomOrderTree(int data){

		this.data=data;
		left=null;
		right=null;
	}

	  static class Pair {
        BottomOrderTree temp;
        int hd;

        Pair(BottomOrderTree temp, int hd) {
            this.temp = temp;
            this.hd = hd;
        }
    }

	public static void bottomOrder(BottomOrderTree root){
		if(root == null) return;
		Map<Integer, Integer> map = new TreeMap<>();
		Queue<Pair> q=new LinkedList<>();
		ArrayList<Integer> ls=new ArrayList<>();
		q.offer(new Pair(root,0));

		while(!q.isEmpty()){

			Pair it=q.remove();
			int hd=it.hd;
			BottomOrderTree temp=it.temp;
			 map.put(hd,temp.data);
			if(temp.left!=null) q.offer(new Pair(temp.left,hd-1));
			if(temp.right!=null) q.offer(new Pair(temp.right,hd+1));

		}
		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
   		 ls.add(entry.getValue());
		}

		System.out.println(" "+ls);

	}

	
	public static  void main(String[] args) {
		
		BottomOrderTree root=new BottomOrderTree(10);

		root.left = new BottomOrderTree(20);
		root.right = new BottomOrderTree(30);

		root.left.left = new BottomOrderTree(40);
		root.left.right = new BottomOrderTree(50);
		bottomOrder(root);
		}
}


