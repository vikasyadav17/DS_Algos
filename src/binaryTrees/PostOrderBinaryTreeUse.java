package binaryTrees;

public class PostOrderBinaryTreeUse {

	public static void postOrder(BinaryTreeNode<Integer> root) {
		//Your code goes here
	
		if(root==null) {
			return ;
		}
		postOrder(root.left);
		postOrder(root.right);
		System.out.println(root.value + " ");
	}
	
	
}
