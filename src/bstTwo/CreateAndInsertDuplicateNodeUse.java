package bstTwo;

public class CreateAndInsertDuplicateNodeUse {

	public static void insertDuplicateNode(BinaryTreeNode<Integer> root) {
		// Your code goes here
		if (root == null) {
			return;
		}

		BinaryTreeNode<Integer> duplicate = new BinaryTreeNode<Integer>(root.data);
		BinaryTreeNode<Integer> leftOfRoot = null;
		if (root.left != null) {
			leftOfRoot = root.left;
		}
		root.left = duplicate;
		duplicate.left = leftOfRoot;

		insertDuplicateNode(duplicate.left);

		insertDuplicateNode(root.right);

	}

}