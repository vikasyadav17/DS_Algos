package binaryTrees;

public class MirrorABinaryTreeUse {

	public static void mirrorBinaryTree(BinaryTreeNode<Integer> root){
		//Your code goes here
		if(root==null) {
			return ;
		}
		
		mirrorBinaryTree(root.right);
		mirrorBinaryTree(root.left);
		//System.out.println();
	}
	
	
}
