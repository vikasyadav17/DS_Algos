package trees2;

public class NextLargerElementUse {

	static int nextLargestElement = Integer.MAX_VALUE;
	static TreeNode<Integer> nextLargestElementContainingNode = null;
	
	public static TreeNode<Integer> findNextLargerNode(TreeNode<Integer> root, int n) {
		
		if(root == null) {
			return root;
		}
		
		if(root.data > n && nextLargestElement > root.data) {
			nextLargestElement = root.data;	
			nextLargestElementContainingNode = root;
		}
		
		
		for(int i=0;i<root.children.size();i++) {
			findNextLargerNode(root.children.get(i), n);
		}
		
		return nextLargestElementContainingNode;
	}
}
