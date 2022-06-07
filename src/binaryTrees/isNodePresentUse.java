package binaryTrees;

public class isNodePresentUse {

	public static boolean isNodePresent(BinaryTreeNode<Integer> root, int x) {
	    //Your code goes here
		if(root==null) {
			return false;
		}
		if(root.value==x) {
			return true;
		}
		
		boolean leftResult  = isNodePresent(root.left,x);
		boolean rightResult = isNodePresent(root.right,x);
	
		if(leftResult==true || rightResult == true) {
			return true;
		}
	
		return false;
	}

	
	
	
}
