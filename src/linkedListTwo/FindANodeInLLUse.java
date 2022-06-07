package linkedListTwo;

import linkedList.LinkedListNode;

public class FindANodeInLLUse {

	public static int findNodeRec(LinkedListNode<Integer> head, int n) {
		// Your code goes here

		if (head == null) {
			return -1;
		}
		int count = -1;
		while (head != null) {

			if (head.data == n) {
				count++;
				return count++;
			}
			count++;
			head = head.next;

		}

		return -1;
	}

}
