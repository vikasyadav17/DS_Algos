package linkedList;

public class findElementInLinkedListUse {
	
	public static void printIthNode(LinkedListNode<Integer> head, int i){
		//Your code goes here
		int count=0;
		while(head != null)
		{
			if(count == i) {
				System.out.println(head.data);
				return ;
			}
			count++;
			head=head.next;
		}
	
	}
}


