//Top Order Traversals

import java.util.*;



public class TopOrderTree {

	int data;
	
	TopOrderTree left;
	TopOrderTree right;

	TopOrderTree(int data){

		this.data=data;
		left=null;
		right=null;
	}

	  static class Pair {
        TopOrderTree temp;
        int hd;

        Pair(TopOrderTree temp, int hd) {
            this.temp = temp;
            this.hd = hd;
        }
    }

	public static void topOrder(TopOrderTree root){
		if(root == null) return;
		Map<Integer, Integer> map = new TreeMap<>();
		Queue<Pair> q=new LinkedList<>();
		ArrayList<Integer> ls=new ArrayList<>();
		q.offer(new Pair(root,0));

		while(!q.isEmpty()){

			Pair it=q.remove();
			int hd=it.hd;
			TopOrderTree temp=it.temp;
			if(map.get(hd)==null) map.put(hd,temp.data);
			if(temp.left!=null) q.offer(new Pair(temp.left,hd-1));
			if(temp.right!=null) q.offer(new Pair(temp.right,hd+1));

		}
		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
   		 ls.add(entry.getValue());
		}

		System.out.println(" "+ls);

	}

	
	public static  void main(String[] args) {
		
		TopOrderTree root=new TopOrderTree(10);

		root.left = new TopOrderTree(20);
		root.right = new TopOrderTree(30);

		root.left.left = new TopOrderTree(40);
		root.left.right = new TopOrderTree(50);
		topOrder(root);
		}
}


