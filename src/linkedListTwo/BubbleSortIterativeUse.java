package linkedListTwo;

public class BubbleSortIterativeUse {

	public static LinkedListNode<Integer> bubbleSort(LinkedListNode<Integer> head) {
		// Your code goes here
		if (head == null || head.next == null) {
			return head;
		}

		LinkedListNode<Integer> helperNode = head;
		while (helperNode.next != null) {
			LinkedListNode<Integer> nodeHelper = helperNode.next;
			while (nodeHelper != null) {
				if (nodeHelper.data < helperNode.data) {
					int temp = helperNode.data;
					helperNode.data = nodeHelper.data;
					nodeHelper.data = temp;
				}
				nodeHelper=nodeHelper.next;
			}
			helperNode= helperNode.next;

		}

		return head;
	}

}
