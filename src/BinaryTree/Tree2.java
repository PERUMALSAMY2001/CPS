package BinaryTree;

public class Tree2 {
	public static int getHeight(Tree1 n) {
        
		if (n == null) {
            return -1; 
        }

        int leftHeight = getHeight(n.left);
        int rightHeight = getHeight(n.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }

	public static void main(String[] args) {
		Tree1 n=new Tree1 (19);
		 n.left=new Tree1 (17);
		 n.right=new Tree1(22);
		 n.left.left=new Tree1(7);
		 n.left.right=new Tree1(2);
		 n.right.left=new Tree1(8);
		 n.right.right=new Tree1(6);
		 
		 int height = getHeight(n);
	        System.out.println("Height of the binary tree: " + height);
		 
	}
}

