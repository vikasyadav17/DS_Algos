package binaryTreeTwo;

public class TreeFromInOrderAndPreOrderUse {

//	7
//	1 2 4 5 3 6 7 
//	4 2 5 1 6 3 7 
//	
	private static void buildingLeftSide(BinaryTreeNode<Integer> root, int[] preOrder, int[] inOrder) {
		// TODO Auto-generated method stub
		int i = 1;
		BinaryTreeNode<Integer> node = root;
		while (preOrder[i] != inOrder[0]) {
			node.left = new BinaryTreeNode<Integer>(preOrder[i]);
			node = node.left;
			i++;
		}

	}

	public static BinaryTreeNode<Integer> buildTree(int[] preOrder, int[] inOrder) {
		// Your code goes here

		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(preOrder[0]);
		int i = 0;
		buildingLeftSide(root, preOrder, inOrder);

	}

}
