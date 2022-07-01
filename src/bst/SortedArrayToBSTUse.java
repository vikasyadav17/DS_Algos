package bst;

public class SortedArrayToBSTUse {

	static BinaryTreeNode<Integer> root;
	static int count = 0;

	public static BinaryTreeNode<Integer> SortedArrayToBST(int[] arr, int n) {

		int mid = (arr.length - 1) / 2;

		root = new BinaryTreeNode<Integer>(arr[mid]);

		int i = 0;

		while (i != (arr.length - 1)) {
			BinaryTreeNode<Integer> node = root;
			if (i == mid) {
				continue;
			} else if (arr[i] > node.data) {
				BinaryTreeNode<Integer> rightNode = new BinaryTreeNode<Integer>(arr[i]);
				node.right = rightNode;
			}
		}

	}

}
