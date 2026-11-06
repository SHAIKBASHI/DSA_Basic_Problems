//Vertical Order Traversals

import java.util.*;



public class VerticalOrderTree {

	int data;
	
	VerticalOrderTree left;
	VerticalOrderTree right;

	VerticalOrderTree(int data){

		this.data=data;
		left=null;
		right=null;
	}

	  static class Pair {
        VerticalOrderTree temp;
        int hd;

        Pair(VerticalOrderTree temp, int hd) {
            this.temp = temp;
            this.hd = hd;
        }
    }

	public static void verticalOrder(VerticalOrderTree root){
		if(root == null) return;
		Map<Integer, ArrayList<Integer>> map = new TreeMap<>();
		Queue<Pair> q=new LinkedList<>();
		ArrayList<Integer> ls=new ArrayList<>();
		q.offer(new Pair(root,0));

		while(!q.isEmpty()){

			Pair it=q.remove();
			int hd=it.hd;
			VerticalOrderTree temp=it.temp;
			map.putIfAbsent(hd, new ArrayList<>());
            map.get(hd).add(temp.data);
			if(temp.left!=null) q.offer(new Pair(temp.left,hd-1));
			if(temp.right!=null) q.offer(new Pair(temp.right,hd+1));

		}
		for(Map.Entry<Integer, ArrayList<Integer>> entry : map.entrySet()) {
   		 ls.addAll(entry.getValue());
		}

		System.out.println(" "+ls);

	}

	
	public static  void main(String[] args) {
		
		VerticalOrderTree root=new VerticalOrderTree(10);

		root.left = new VerticalOrderTree(20);
		root.right = new VerticalOrderTree(30);

		root.left.left = new VerticalOrderTree(40);
		root.left.left.left = new VerticalOrderTree(50);
		verticalOrder(root);
		}
}


