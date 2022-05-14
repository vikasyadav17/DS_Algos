package test2;

import java.util.LinkedList;
import java.util.Queue;

import linkedList.Node;

public class Dequeue {

	private Queue<Integer> q;
    private int size;
    
    Dequeue(int size){
       q = new LinkedList<Integer>();
       this.size=size;
    }
    
	public int insertFront(int element) {
		
		int currentSize = q.size();
		if(size<currentSize) {
			return -1;
		}
		return element;
	}
	public int insertRear(int element) {
		
		if(size<q.size()) {
			return -1;
		}
		q.offer(element);
		return element;
	}
	
	public int deleteFront() {
		if(q.size()==0) {
			return -1;
		}
		int value = q.remove();
		return value;
	}
	
	public int deleteRear() {
		if(q.size()==0) {
			return -1;
		}
	 int q1 = q.poll();
	 
	}
	
	public int getFront() {
		return q.peek();
	}
	
	public int getRear() {
		return 1;
	}
	
}
