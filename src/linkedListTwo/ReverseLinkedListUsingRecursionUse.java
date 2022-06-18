package linkedListTwo;



public class ReverseLinkedListUsingRecursionUse {

	public static linkedListTwo.LinkedListNode<Integer> reverseLinkedListRec(linkedListTwo.LinkedListNode<Integer> head) {
		//Your code goes here
		
		if(head.next == null) {
			return head;
		}
		
		LinkedListNode<Integer> lastNode = reverseLinkedListRec(head.next);
		LinkedListNode<Integer> counterNode = lastNode;
		head.next=null;
		while(counterNode.next!=null) {
			counterNode = counterNode.next; 
		}
		counterNode.next = head;
		return lastNode;
	}
	
}
