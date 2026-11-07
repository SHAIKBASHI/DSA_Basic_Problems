//Serialize and Deserialize

import java.util.*;



public class TreeNodee {

	int data;
	
	TreeNodee left;
	TreeNodee right;

	TreeNodee(int data){

		this.data=data;
		left=null;
		right=null;
	}
	public static String serialize(TreeNodee root){

		if(root==null) return "";

		Queue<TreeNodee> q=new LinkedList<>();

		StringBuilder res=new StringBuilder();

		q.add(root);
		while(!q.isEmpty()){

			TreeNodee cur=q.poll();
			if(cur==null){

				res.append("n ");
				continue;
			}
			res.append(cur.data+" ");
			q.offer(cur.left);
			q.offer(cur.right);
		}
		return res.toString();
	}

	public static TreeNodee deserialize(String data){

		if(data=="") return null;

		Queue<TreeNodee> q=new LinkedList<>();

		String[] values=data.split(" ");

		TreeNodee cur=new TreeNodee(Integer.parseInt(values[0]));
		q.add(cur);
		for(int i=1;i<values.length;i++){

			TreeNodee root=q.poll();

			if(!values[i].equals("n")){

				TreeNodee left=new TreeNodee(Integer.parseInt(values[i]));
				root.left=left;
				q.add(left);
			}
			if(!values[++i].equals("n")){

				TreeNodee right=new TreeNodee(Integer.parseInt(values[i]));
					root.right=right;
					q.add(right);
			}
		}

		return cur;

	}

	public static void inorder(TreeNodee root){

		if(root==null) return;

		inorder(root.left);
		System.out.print(" "+root.data);
		inorder(root.right);
	}
	

	
	public static  void main(String[] args) {
		
		TreeNodee root=new TreeNodee(1);

		root.left = new TreeNodee(2);
		root.right = new TreeNodee(2);

		root.left.left = new TreeNodee(4);
		root.left.right = new TreeNodee(5);
		root.right.left = new TreeNodee(5);
		root.right.right = new TreeNodee(4);
		
		 String result = serialize(root);

        System.out.println("Serialized: " + result);

        TreeNodee newRoot = deserialize(result);

        System.out.print("Original Tree Inorder: ");
        inorder(root);

        System.out.print("\nDeserialized Tree Inorder: ");
        inorder(newRoot);

		
		}
}


