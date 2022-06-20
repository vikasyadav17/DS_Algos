package binaryTreeTwo;

public class InsertDuplicateNodeUse {

	public static void insertDuplicateNode(BinaryTreeNode<Integer> root) {
		// Your code goes here

		if(root==null) {
			return ;
		}
		
		BinaryTreeNode<Integer> temp = new BinaryTreeNode<Integer>(root.data);
		if(root.left!=null) {
			BinaryTreeNode<Integer> realNodeLeft = root.left;
			root.left=temp;
			temp.left=realNodeLeft;
		}
		else root.left=temp;

		
		insertDuplicateNode(root.left.left);
		insertDuplicateNode(root.right);
		
		
	}

}

// in 10 20 30 40 50 -1 60 -1 -1 -1 -1 -1 -1
// 10 
//10 30 
//20 30 60 
//20 50 60 
//40 50 
//40 

//in-2  8 5 10 2 6 -1 -1 -1 -1 -1 7 -1 -1
//8 
//8 10 
//5 10 
//5 6 
//2 6 7 
//2 7