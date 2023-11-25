package Mirror;

public class Mirror2 {

	public static Mirror1 createMirror(Mirror1 root) {
		if(root == null) {
		return null;
		}
		Mirror1 temp=root.left;
		root.left=root.right;
		root.right=temp;
		if(root.left != null) {
			createMirror(root.left);
		}
		if(root.right != null) {
			createMirror(root.right);
		}
		return root;
	}
	public static void InOrderTraversal(Mirror1 root) {
		if(root != null) {
			InOrderTraversal(root.left);
			System.out.println(root.data +" ");
			InOrderTraversal(root.right);
		}
	}
	public static void preOrderTraversal(Mirror1 root) {
		if(root != null) {
			System.out.println(root.data +" ");
		preOrderTraversal(root.left);
			preOrderTraversal(root.right);
		}
	}
	 public static void main(String[] args) {
		 Mirror1 root=new Mirror1(3);
		 root.left=new Mirror1(7);
		 root.right=new Mirror1(8);
		 root.left.left=new Mirror1(1);
		 root.left.right=new Mirror1(9);
		 root.left.right.right=new Mirror1(2);
		 
		 System.out.println("Original Tree");
		 InOrderTraversal(root);
		 System.out.println();
		 
		 Mirror1 Mirroredroot = createMirror(root);
		 
		 System.out.println("Mirror Tree");
		 InOrderTraversal(Mirroredroot);
		 
		 System.out.println("PreOrder Tree");
		 preOrderTraversal(Mirroredroot);
	 }
}