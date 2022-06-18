package linkedListTwo;

import linkedList.LinkedListNode;

public class DeleteNodeRecursivelyUse {
	
//	1
//	3 4 5 2 6 1 9 -1
//	3

	static int count=-1;
	static LinkedListNode<Integer> node=null;
	
	public static LinkedListNode<Integer> deleteNodeRec(LinkedListNode<Integer> head, int pos) {
    	//Your code goes here
		
		if(count==-1) {
			node = head;
		}
		
	 
		if(head==null) {
			return null;
		}
		
		count++;
		
		if(count == (pos-1)) {
			head.next = head.next.next;
			deleteNodeRec(head, pos);
		}
		
		deleteNodeRec(head.next,pos);
		return node;
	
	}
	
	
}
