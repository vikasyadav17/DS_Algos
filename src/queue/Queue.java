package queue;

import java.util.LinkedList;

import linkedList.LinkedListNode;

public class Queue {

	// Define the data members
	private Node front, rear;
	private int size;

	public Queue() {
		// Implement the Constructor
		front = null;
		rear = null;
		size = 0;
	}

	/*----------------- Public Functions of Stack -----------------*/

	public int getSize() {
		// Implement the getSize() function
		return size;

	}

	public boolean isEmpty() {
		// Implement the isEmpty() function
		return (size == 0 ? true : false);
	}

	public void enqueue(int data) {
		// Implement the enqueue(element) function
		if (size == 0) {
			front = new Node(data);
			rear = front;
			size++;
		} else {
			Node newNode = new Node(data);
			rear.next = newNode;
			rear = newNode;
			size++;

		}
	}

	public int dequeue() {
		// Implement the dequeue() function
		if (size < 1) {
			return -1;
		} else if(size == 1) {
			int result = front.data;
			front = null;
			rear = null;
			size--;
			return result;
		} else {
			int result = front.data;
			Node newNode = front;
			front = front.next;
			newNode = null;
			size--;
			return result;
		}

	}

	public int front() {
		// Implement the front() function
		if(size==0) {
			return -1;
		}
		return front.data;
	}
}
