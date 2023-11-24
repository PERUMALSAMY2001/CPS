package Stack;


public class Node3 {
	Node n;
	public Node3(Node n) {
		this.n=n;
	}
	public void inOrder() {
		inOrder(n);
	}
	public void inOrder(Node currentn) {
		if(currentn !=null) {
			inOrder(currentn.left);
			System.out.print(" "+currentn.data);
			inOrder(currentn.right);
		}
	}
	public void preOrder() {
		preOrder(n);
	}
	public void preOrder(Node currentn) {
		if(currentn !=null) {
			//preOrder(currentn.left);
			System.out.print(" "+currentn.data);
			preOrder(currentn.left);
			preOrder(currentn.right);
		}
	}
	public void postOrder() {
		postOrder(n);
	}
	public void postOrder(Node currentn) {
		if(currentn !=null) {
			//preOrder(currentn.left);
			
			postOrder(currentn.left);
			postOrder(currentn.right);
			System.out.print(" "+currentn.data);
		}
	}
}
