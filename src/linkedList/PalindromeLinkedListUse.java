package linkedList;

import java.util.ArrayList;
import java.util.List;

public class PalindromeLinkedListUse {

	public static boolean isPalindrome(LinkedListNode<Integer> head) {
		// Your code goes here
		
		LinkedListNode<Integer> node = head;
		List<Integer> list = new ArrayList<Integer>();
		while(node!=null) {
			list.add(node.data);
			node = node.next;
		}
		
		Object[] arr = list.toArray();
		boolean b = true;
		 int mid = (arr.length)/2;
		for(int i=0;i<mid;i++) {
			 if(arr[i] != arr[arr.length-1-i]) b =  false;
		}
		
		return b;
	}

}
