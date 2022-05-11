package linkedList;


public class PrintReverseUse {

	public static void printReverse(LinkedListNode<Integer> head) {

		if(head==null) {
			return ;
		}
		if(head.next == null) {
			return ;
		}
		
		LinkedListNode<Integer> next = null, prev = null,current=head;
	
		while(current!=null) {
		  next=current.next;
		  current.next=prev;
		  prev=current;
		  current=next;			
		}
		head=prev;
		PrintReverse.print(head);
	}
}
