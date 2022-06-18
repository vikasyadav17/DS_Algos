package binaryTreeTwo;

public class InsertDuplicateNodeUse {

	public static void insertDuplicateNode(BinaryTreeNode<Integer> root) {
		// Your code goes here

		if (root == null)
			return;

		if (root.left != null) {

			BinaryTreeNode<Integer> leftNode = null;
			if (root.left.left != null) {
				leftNode = root.left;
			}
			root.left = new BinaryTreeNode<Integer>(root.data);
			if (leftNode != null) {
				root.left.left = leftNode;
			}
		}
//		if (root.right != null) {
//			BinaryTreeNode<Integer> leftNode = null;
//			if (root.left.left != null) {
//				leftNode = root.left;
//			}
//
//			root.left = new BinaryTreeNode<Integer>(root.data);
//			if (leftNode != null) {
//				root.left.left = leftNode;
//			}
//		}

		insertDuplicateNode(root.left);
		insertDuplicateNode(root.right);

	}

}
