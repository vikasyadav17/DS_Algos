package binaryTrees;

import java.util.Scanner;

public class BinaryTreeUse {
	
	
	private static BinaryTreeNode<Integer> takeInput(Scanner s) {
		// TODO Auto-generated method stub
		int rootData;
		
		rootData = s.nextInt();
		if(rootData == -1) {
			return null;
		}
		
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		
		root.left = takeInput(s);
		root.right = takeInput(s);
		
		return root;
	}
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		BinaryTreeNode<Integer> node = takeInput(s);
		
		
		
	}

	

}
