package linkedList;

public class LengthOfLinkedListUse {
	
	public static int length(LinkedListNode<Integer> head){
		//Your code goes here
		int count=0;
		while(head != null) {
			head = head.next;
			count++;
			
		}
	
		return count;
	}


}
