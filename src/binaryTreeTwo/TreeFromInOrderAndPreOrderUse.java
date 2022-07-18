package binaryTreeTwo;

public class TreeFromInOrderAndPreOrderUse {

//	7
//	1 2 4 5 3 6 7 
//	4 2 5 1 6 3 7 
//	
	public static BinaryTreeNode<Integer> buildTree(int[] preOrder, int[] inOrder) {
		// Your code goes here
		boolean b = true;
		
		BinaryTreeNode<Integer> root=new BinaryTreeNode<Integer>(preOrder[0]);
		BinaryTreeNode<Integer> node = root;
		BinaryTreeNode<Integer> tree = null;
		int i=1;
		while(inOrder[0]!=preOrder[i]) {
			node.left=new BinaryTreeNode<Integer>(preOrder[i]);
			tree=node;
			i++;
		}
	
	}

}
