package binaryTreeTwo;

public class DiameterOfTreeUse {

	public static int heightOfBinaryTree(BinaryTreeNode<Integer> root) {
		// Your code goes here

		if (root == null) {
			return 0;
		}

	
		return (1 + Math.max(heightOfBinaryTree(root.left), heightOfBinaryTree(root.right)));

	}
	
	public static int diameterOfBinaryTree(BinaryTreeNode<Integer> root) {
		
		if(root == null) {
			return 0;
		}
		
		int lheight = heightOfBinaryTree(root.left);
		int rheight = heightOfBinaryTree(root.right);
		
		return lheight + rheight + 1;
		
		
	}
	
}
