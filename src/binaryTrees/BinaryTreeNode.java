package binaryTrees;

public class BinaryTreeNode<T> {

	public T value;
	public BinaryTreeNode<T> left;
	public	BinaryTreeNode<T> right;
	
	
	public BinaryTreeNode(T  input){
		
		this.value = input;
		this.left= null;
		this.right=null;
	}
	
}
