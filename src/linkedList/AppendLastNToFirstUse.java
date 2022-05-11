package linkedList;


public class AppendLastNToFirstUse {

	public static LinkedListNode<Integer> appendLastNToFirst(LinkedListNode<Integer> head, int n) {
		// Your code goes here
		int size = 0;
		LinkedListNode<Integer> node = head;
		while(node!=null){
			node = node.next;
			size++;			
		}	
		if(size<n) {
			return null;
		}
        if(n==0){
            return head;
        }
		
		node=head;
		size=size-n;
		
		int counter=1;
		LinkedListNode<Integer> front=null;
		while(counter != size ) {
			
			
			node=node.next;
			counter++;
		}
		front=node.next;
		node.next=null;
		node = front;
		while(node.next!=null) {
		node=node.next;
		}
		node.next=head;
		head=front;
		
		return head;
	
	}
}