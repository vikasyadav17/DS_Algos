package binaryTrees;

public class ConstructTreeFromInorderAndPostOrderUse {

	public static BinaryTreeNode<Integer> buildTree(int[] preOrder, int[] inOrder) {
		// Your code goes here

		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(preOrder[0]);
		
		BinaryTreeNode<Integer> leftNode = new BinaryTreeNode<Integer>(preOrder[1]);
		root.left=leftNode;
		for (int i = 1; i < inOrder.length && inOrder[i] != root.value; i++) {
			BinaryTreeNode<Integer> leftNodeinArray = null;
			leftNodeinArray = new BinaryTreeNode<Integer>(inOrder[i]);
			if(leftNode.value>inOrder[i]) {
				
				leftNode.right=leftNodeinArray;
			}
			else leftNode.left=leftNodeinArray;
		}

		return root;
	}

}
