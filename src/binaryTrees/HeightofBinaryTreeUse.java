package binaryTrees;

public class HeightofBinaryTreeUse {

	public static int height(BinaryTreeNode<Integer> root) {
		//Your code goes here
		if(root==null) {
			return 0;
		}
		int height=1;
        int heightOne = height + height(root.left);
        int heightTwo = height + height(root.right);
        
        return ((heightOne > heightTwo) ? heightOne : heightTwo);
	}
	
	
}
