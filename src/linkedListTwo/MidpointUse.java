package linkedListTwo;

import linkedList.LinkedListNode;

public class MidpointUse {

	 public static LinkedListNode<Integer> midPoint(LinkedListNode<Integer> head) {
	        //Your code goes here
		 
		 if(head == null || head.next==null) {
			 return head;
		 }
	
		 
		 LinkedListNode<Integer> fast=head.next,slow=head;
	 
		 while(fast!=null && fast.next!=null) {
			 
			 fast=fast.next.next;
//			 if(fast == null) {
//				 
//				 return slow;
//			 }
			 slow=slow.next;
			 
		 }
		 slow.next=null;
		return slow; 
		 
	 }
	
}
