package linkedList;

public class PalindromeLinkedListUse {

	public static LinkedListNode<Integer> printReverse(LinkedListNode<Integer> head) {
	if(head==null) {
		return head;
	}
	if(head.next == null) {
		return head;
	}
	
	LinkedListNode<Integer> next = null, prev = null,current=head;

	while(current!=null) {
	  next=current.next;
	  current.next=prev;
	  prev=current;
	  current=next;			
	}
	head=prev;
	return head;
	}

	public static boolean isPalindrome(LinkedListNode<Integer> head) {

		if (head == null) {
			return true;
		}
		LinkedListNode<Integer> node=head;
		LinkedListNode<Integer> reverseLinkedList = printReverse(node);
		
		while(head!=null && reverseLinkedList!=null) {
			System.out.println(head.data + " " + reverseLinkedList.data);
			if(head.data.equals(reverseLinkedList.data)) {
				head=head.next;
				reverseLinkedList=reverseLinkedList.next;
				
			}
			else return false;
			
		}
		return true;
	
	}

}
