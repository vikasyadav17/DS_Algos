package binaryTrees;

public class PreorderBinaryTreeUse {

	public static void preOrder(BinaryTreeNode<Integer> root) {

		// Your code goes here
	
		if(root==null) {
			return ;
		}
		System.out.print(root.value + " ");
		
		preOrder(root.left);
		preOrder(root.right);
			
		
		
	
	}

}
