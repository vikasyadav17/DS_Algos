package linkedListTwo;

import linkedList.LinkedListNode;

public class DeleteNodeRecursivelyUse {

	static int count=0;
	static LinkedListNode<Integer> node ;
	
	public static LinkedListNode<Integer> deleteNodeRec(LinkedListNode<Integer> head, int pos) {
    	//Your code goes here
	   if(count==1) node = head;
		
		if(head.next==null) {
			if(count<pos) {
				return node;
			}
		}
		
		if(pos==0) {
			head = head.next;
			return head;
		}
		
		if(pos==(count-1)) {
			head.next=head.next.next;
			return node;
		}
		
		 count++;
		 deleteNodeRec(head.next, pos);
		 return node;
	
	}
	
	
}
