package linkedListTwo;

class DoubleNode {
	LinkedListNode<Integer> head;
	LinkedListNode<Integer> tail;
}

public class KReverseUse {

	private static DoubleNode reversePart(LinkedListNode<Integer> head) {
		if (head == null || head.next == null) {
			DoubleNode ans = new DoubleNode();
			ans.head = head;
			ans.tail = head;
			return ans;
		}

		DoubleNode ans = reversePart(head.next);
		ans.tail.next = head;
		head.next = null;
		ans.tail = ans.tail.next;
		return ans;
	}

	public static LinkedListNode<Integer> kReverse(LinkedListNode<Integer> head, int k) {

		if (head == null || head.next == null) {
			return head;
		}
		if (k == 0) {
			return head;
		}

		int count = 1;
		LinkedListNode<Integer> tempHead = head, nextHead = head , headPointer;
		while (count == k && nextHead.next != null) {
			nextHead = nextHead.next;
			count++;
		}
		headPointer= nextHead.next;
		nextHead.next=null;
		
		DoubleNode reversedLinkedList = reversePart(tempHead);
		LinkedListNode<Integer> node = kReverse(headPointer,k);
		reversedLinkedList.tail.next=node;
		return reversedLinkedList.head;
	}

}
