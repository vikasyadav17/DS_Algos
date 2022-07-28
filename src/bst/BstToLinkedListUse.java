package bst;

import linkedList.LinkedListNode;
import trees.QueueEmptyException;

public class BstToLinkedListUse {

	public static LinkedListNode<Integer> constructLinkedList(BinaryTreeNode<Integer> root) {

		if (root == null) {
			return null;
		}

		LinkedListNode<Integer> head = new LinkedListNode<Integer>(root.data);
		LinkedListNode<Integer> tail = head;

		QueueUsingLL<BinaryTreeNode<Integer>> qll = new QueueUsingLL<BinaryTreeNode<Integer>>();
		qll.enqueue(root);

		while (!qll.isEmpty()) {

			try {
				if (qll.front().left != null) {
					LinkedListNode<Integer> node = new LinkedListNode<Integer>(qll.front().left.data);
					qll.enqueue(qll.front().left);
					if (node.data < head.data) {

						node.next = head;
						head = node;
					} else {
						if (tail.data < qll.front().left.data) {

							tail.next = node;
							tail = node;
						} else {
							LinkedListNode<Integer> temp = head;
							while (temp != null && temp.next.data < node.data) {
								temp = temp.next;
							}
							LinkedListNode<Integer> ref = temp.next;
							temp.next = node;
							node.next = ref;

						}
					}

				}
				if (qll.front().right != null) {
					LinkedListNode<Integer> node = new LinkedListNode<Integer>(qll.front().right.data);
					qll.enqueue(qll.front().right);
					if (qll.front().right.data < head.data) {

						node.next = head;
						head = node;
					} else {
						if (tail.data < node.data) {

							tail.next = node;
							tail = node;
						} else {
							LinkedListNode<Integer> temp = head;
							while (temp != null && temp.next.data < node.data) {
								temp = temp.next;
							}
							LinkedListNode<Integer> ref = temp.next;
							temp.next = node;
							node.next = ref;

						}
					}
				}

			} catch (

			QueueEmptyException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				qll.dequeue();
			} catch (QueueEmptyException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return head;
	}

}