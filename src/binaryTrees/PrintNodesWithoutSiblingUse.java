package binaryTrees;

public class PrintNodesWithoutSiblingUse {

	public static void printNodesWithoutSibling(BinaryTreeNode<Integer> root) {
		//Your code goes here
	
		if(root==null) {
			return ;
		}
		
		if(root.left == null && root.right!=null) {
			System.out.print(root.right.value + " ");
			
		}
		if(root.right == null && root.left!=null) {
			System.out.print(root.left.value + " ");
			
		}
		printNodesWithoutSibling(root.left);
		printNodesWithoutSibling(root.right);
		
		
    }
	
}
