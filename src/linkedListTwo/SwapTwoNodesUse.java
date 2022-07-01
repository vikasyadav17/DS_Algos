package linkedListTwo;

public class SwapTwoNodesUse {

	public static LinkedListNode<Integer> swapNodes(LinkedListNode<Integer> head, int i, int j) {
		// Your code goes here

		LinkedListNode<Integer> nodeOne ;
		LinkedListNode<Integer> nodeTwo ;
		int firstPointer = 0, secondPointer = 0;

		nodeOne = head;
		nodeTwo = head;
		while (firstPointer != (i - 1) && i!=0) {
			firstPointer++;
			nodeOne = nodeOne.next;
		}
		while (secondPointer != (j - 1)) {
			secondPointer++;
			nodeTwo = nodeTwo.next;
		}
		if (i == 0) {
			int temp = head.data;
			head.data = nodeTwo.next.data;
			nodeTwo.next.data = temp;
		} else {
			int temp = nodeOne.next.data;
			nodeOne.next.data = nodeTwo.next.data;
			nodeTwo.next.data = temp;
		}
		return head;
	}

}
