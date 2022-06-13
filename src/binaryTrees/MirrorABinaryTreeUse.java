package binaryTrees;

public class MirrorABinaryTreeUse {

	public static BinaryTreeNode mirror(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return null;
		}

		BinaryTreeNode<Integer> left = mirror(root.left);
		BinaryTreeNode<Integer> right = mirror(root.right);

		root.left = right;
		root.right = left;

		return root;
	}

	public static void mirrorBinaryTree(BinaryTreeNode<Integer> root) {
		// Your code goes here

		mirror(root);

	}

}
