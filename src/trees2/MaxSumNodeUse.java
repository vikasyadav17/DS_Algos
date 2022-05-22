package trees2;

public class MaxSumNodeUse {
	
	static int maximum = 0;
	static TreeNode<Integer> currentNode;

	public static TreeNode<Integer> maxSumNode(TreeNode<Integer> root){
		// Write your code here
	
		if(root == null) {
			return root;
		}
		
		int max = root.data;
		for(int i=0;i<root.children.size();i++) {
			max = max + root.children.get(i).data;
		}
		maximum = (max>maximum) ? max : maximum;
		if(maximum == max) {
			currentNode =root;
		}
		
		for(int i=0;i<root.children.size();i++) {
			maxSumNode(root.children.get(i));
		}
		return currentNode;
	
	}
	

}
