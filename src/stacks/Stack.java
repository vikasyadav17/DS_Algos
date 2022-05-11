package stacks;

import linkedList.LinkedListNode;

public class Stack {

	LinkedListNode<Integer> top=null;
	int size=-1;
	
	// Implement the Constructor

	/*----------------- Public Functions of Stack -----------------*/

	public int getSize() {
		// Implement the getSize() function
		int sizeCounter=0;
		while(top!=null) {
			sizeCounter++;
		}
		return sizeCounter;
	}

	public boolean isEmpty() {
		// Implement the isEmpty() function
		if(top==null) {
			return true;
		}
		else return false;
	}

	public void push(int element) {
		// Implement the push(element) function
		
		LinkedListNode<Integer> node = null;
		node.data=element;
		node.next=top;
		top=node;
	}

	public int pop() {
		// Implement the pop() function
		
		LinkedListNode<Integer> removingNode = top;
		top=top.next;
		removingNode=null;
	
		
		
	}

	public int top() throws StackEmptyException {
		// Implement the top() function
		if(isEmpty()) {
			throw new StackEmptyException();
		}
		
		return top.data;
	}
}
