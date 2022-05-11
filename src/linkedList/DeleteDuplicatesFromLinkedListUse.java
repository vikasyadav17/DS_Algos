package linkedList;

public class DeleteDuplicatesFromLinkedListUse {

	public static LinkedListNode<Integer> removeDuplicates(LinkedListNode<Integer> head) {
		
		if(head==null) return null;
	
		LinkedListNode<Integer> node = head;
		//using equals for 
		
		while(node.next!=null) {
			if(node.data.equals(node.next.data)) {
				node.next=node.next.next;
			}
			else node=node.next;
		}
		
		return head;
	}
	
}
