package bst;

public class BinarySearchTree {

	BinaryTreeNode<Integer> root = null;

	public void insert(int data) {
		
		insertHelper(data,root);
	}

	private void insertHelper(int data, BinaryTreeNode<Integer> node) {
		
		if(node == null) {
			BinaryTreeNode<Integer> newNode = new BinaryTreeNode<Integer>(data);
			
		}
		
		if(root.data < data) {
			insertHelper(data,node.right);
		}
		else insertHelper(data,node.left);
		
	}

	public void remove(int data) {
		if(root.data == data) {
			if(root.left!=null) {
				
			}
		}
		
	}

	public void printTree() {
		// Implement the printTree() function
	}

	public boolean search(int data) {
		return searchHelper(data, root);

	}

	private boolean searchHelper(int data, BinaryTreeNode<Integer> node) {
	
		if (node == null) {
			return false;
		} else if (root.data == data) {
			return true;
		} else if (data > root.data) {
			searchHelper(data, node.right);
		} else {
			searchHelper(data, node.left);
		}
		return false;
	}
}