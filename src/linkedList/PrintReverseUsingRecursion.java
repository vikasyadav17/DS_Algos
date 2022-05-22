package linkedList;

public class PrintReverseUsingRecursion {
	 
	
	public static LinkedListNode<Integer> printReverse(LinkedListNode<Integer> root) {
		//Your code goes here

		if(root == null) {
		  return root;	
		}
		
		if( root.next == null ) {
			return root;
	
	    }

	    LinkedListNode<Integer> head = printReverse(root.next);
		head.next=root;
		head.next.next=null;
	
		head=head.next;
	    
	    
		return head;
	}
}
