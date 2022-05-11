package stacks;

public class StacksUsingArrays {

	private int[] data;
	private int top;
	
	public StacksUsingArrays(int capacity) {
		data = new int[capacity];
		top=-1;
	}
	
	public boolean isEmpty() {
		return (top == -1);
	}
	
	public int size() {
		return top+1;
	}
	
	public int top() throws StackEmptyException {
		if(size()==0) {
			throw new StackEmptyException();
		}
		return data[top];
	}
	
	public void push(int element) throws StackFullException {
		
		if(top==data.length) {
			throw new StackFullException();
		}
		
		
		++top;
		data[top]=element;
	}
	
	public int pop() throws StackEmptyException{
		
		if(size()==0) {
			throw new StackEmptyException();
		}
		
		int temp = data[top];
		top--;
		return temp;
	}
	
	
}
