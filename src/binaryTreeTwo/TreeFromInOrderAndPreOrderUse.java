package binaryTreeTwo;

public class TreeFromInOrderAndPreOrderUse {

//	7
//	1 2 4 5 3 6 7 
//	4 2 5 1 6 3 7 
//	
	private static void BuildingLeftSide(Integer data, int[] inOrder) {
		int i;
		while(data != inOrder[i]) {
			
			
			
			
		}
		
	}

	public static BinaryTreeNode<Integer> buildTree(int[] preOrder, int[] inOrder) {
		// Your code goes here

		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(preOrder[0]);

		BuildingLeftSide(root.data, inOrder);

	}

}
