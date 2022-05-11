package linkedList;

public class DeleteNodeInLinkedListUse {
	
	public static LinkedListNode<Integer> deleteNode(LinkedListNode<Integer> head, int pos) {
	
		int count=0;
		
		LinkedListNode<Integer> node = head;
		while(node!=null ) {
			
			if(count == pos && count==0) {
				LinkedListNode<Integer> temp = node.next;
				node.next = null;
				head = temp;
				return head;
			}
			else if(count == (pos-1)) {
				node.next = node.next.next;
				return head;				
			}
			else {
				node = node.next;
				count++;
				if(node.next == null && count<pos) {
					return head;
				}
			}
			
		}
		
		return head;
		
	}
}
