package Stack;

public class Node2 {
	public static void main(String[] args) {
		Node n=new Node (8);
		 n.left=new Node(6);
		 n.right=new Node(5);
		 n.left.left=new Node(9);
		 n.left.right=new Node(2);
		 n.left.right.left=new Node(3);
		 n.left.right.right=new Node(16);
		 n.right.left=new Node(7);
		 n.left.left.left=new Node(21);
		 n.left.left.right=new Node(19);
		 n.right.left.left=new Node(12);
		 n.right.left.right=new Node(13);
		 n.right.right=new Node(1);
		
		 Node3 Root=new Node3(n);
		 Root.inOrder();
		 System.out.println( " In Order");
		 Root.preOrder();
		 System.out.println(" Pre Order");
		 Root.postOrder(); 
		 System.out.println(" Post Order");
	 }
	}


