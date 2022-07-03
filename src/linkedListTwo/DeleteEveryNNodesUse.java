package linkedListTwo;

public class DeleteEveryNNodesUse {

	public static LinkedListNode<Integer> skipMdeleteN(LinkedListNode<Integer> head, int M, int N) {
		// Your code goes here

		if (M == 0) {
			return null;
		}
		if (N == 0) {
			return head;
		}
		int i = 1, j = 0;
		LinkedListNode<Integer> node = head;
		while (node != null) {
			if (i == M) {
				LinkedListNode<Integer> nodeForSkipping = node;
				while (j != N && nodeForSkipping.next != null) {
					++j;
					nodeForSkipping = nodeForSkipping.next;
				}
				node.next = nodeForSkipping.next;
				j = 0;
				i = 0;
			} else {
				i++;
				node = node.next;
			}

		}
		return head;

	}

}
