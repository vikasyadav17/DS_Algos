package bst;

public class SortedArrayToBSTUse {

	public static BinaryTreeNode<Integer> SortedArrayToBST(int[] arr, int n) {

		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(arr[0]);
		BinaryTreeNode<Integer> node = root;

		int i = 1;
		while (i < arr.length) {
			if (arr[i] > node.data) {
				if (node.right == null) {
					node.right = new BinaryTreeNode<Integer>(arr[i]);
				}
				else {
					BinaryTreeNode<Integer> temp = node.right;
					while(temp!=null) {
						if(node.left!=null && node.left.data > arr[i]) {
							
						}
						
					}
				}
			}

		}

	}

}
