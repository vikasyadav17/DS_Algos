package linkedListTwo;

import java.util.Queue;

public class EvenAfterOddListUse {

	static LinkedListNode<Integer> evenHead = null;
	static LinkedListNode<Integer> evenTail = null;
	static LinkedListNode<Integer> oddHead = null;
	static LinkedListNode<Integer> oddTail = null;

	public static LinkedListNode<Integer> evenAfterOdd(LinkedListNode<Integer> head) {

		if (head == null) {
			return null;
		}

		if (head.data % 2 == 0) {
			if (evenHead == null) {
				evenHead = new LinkedListNode(head.data);
				evenTail = evenHead;
			} else {
				evenTail.next = new LinkedListNode<Integer>(head.data);
				evenTail = evenTail.next;
			}

		} else {
			if (oddHead == null) {
				oddHead = new LinkedListNode(head.data);
				oddTail = oddHead;
			} else {
				oddTail.next = new LinkedListNode<Integer>(head.data);
				oddTail = oddTail.next;
			}
		}

		LinkedListNode<Integer> node = evenAfterOdd(head.next);

		if(node==null) {
			if(oddHead!=null) {
				if(evenHead!=null)
				oddTail.next = evenHead;
			}
		}
		
		
		return (oddHead == null ? evenHead : oddHead);
	}

}
