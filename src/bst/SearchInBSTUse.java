package bst;


public class SearchInBSTUse {

	public static boolean searchInBST(BinaryTreeNode<Integer> root, int k) {

		if(root == null) {
			return false;
		}
		
		if(root.data==k) {
			return true;
		}
		boolean b;
		if( k > root.data) {
		  b =	searchInBST(root.right, k);
		}
		
		else b = searchInBST(root.left,k);
		
		return b;
	}

}
