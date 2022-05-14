package test2;

public class NextNumberUse {

	public static LinkedListNode<Integer> nextLargeNumber(LinkedListNode<Integer> head) {
		
		if(head==null) {
			return head;
		}
		
		LinkedListNode<Integer> pointer = head;
		
		while(pointer.next!=null) {
			pointer = pointer.next;
		}
		
		pointer.data=++pointer.data;
		return head;
	
	}
	
	
}
