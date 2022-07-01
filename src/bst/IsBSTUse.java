package bst;

public class IsBSTUse {

	public static boolean isBST(BinaryTreeNode<Integer> root) {
		// TODO Auto-generated method stub

		if (root == null) {
			return true;
		}

		if (root.right != null && (root.right.data < root.data || root.right.data!=root.data))
			return false;

		if (root.left != null && root.left.data >= root.data)
			return false;

		if (!isBST(root.left) || !isBST(root.right)) {
			return false;
		}

		return true;

	}
}
