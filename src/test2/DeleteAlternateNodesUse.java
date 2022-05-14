package test2;

public class DeleteAlternateNodesUse {
	
	 public static void deleteAlternateNodes(Node<Integer> head) {
	        //Your code goes here
	  while(head.next!=null && head.next.next!=null){
		  head.next=head.next.next;
		  head=head.next;
	  }
	 head.next=null;
	
	}
}
