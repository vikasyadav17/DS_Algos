package AdditionalTree;

import binaryTrees.BinaryTreeNode;

public class LargestBstUse {
	public static int heightOfBinaryTree(BinaryTreeNode<Integer> root) {

		if (root == null) {
			return 0;
		}

		return (1 + Math.max(heightOfBinaryTree(root.left), heightOfBinaryTree(root.right)));

	}

	public static int largestBSTSubtree(BinaryTreeNode<Integer> root) {
		// Write your code here

		if (root == null) {
			return 0;
		}

		int lHeight = heightOfBinaryTree(root.left);
		System.out.println("left Subtree height " +  lHeight);
		int rHeight = heightOfBinaryTree(root.right);
		System.out.println("right Subtree height " +  rHeight);
		return (Math.max(lHeight, rHeight) + 1);

	}

}