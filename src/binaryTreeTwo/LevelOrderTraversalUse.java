package binaryTreeTwo;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversalUse {

	public static void printLevelWise(BinaryTreeNode<Integer> root) {
		// Your code goes here

		if (root == null) {
			return;
		}

		QueueUsingLL<BinaryTreeNode<Integer>> qll = new QueueUsingLL();
		qll.enqueue(root);
		int count=qll.size();
		System.out.println(root.data);
		try {
			while (!qll.isEmpty()) {

				if (qll.front().left != null) {
					qll.enqueue(qll.front().left);
					System.out.print(qll.front().left.data + " ");
				}
				if (qll.front().right != null) {
					qll.enqueue(qll.front().right);
					System.out.print(qll.front().right.data + " ");
				}
				count--;
				if(count==0) {
					count=qll.size();
					System.out.println();
				}
				qll.dequeue();
				
			}
		} catch (Exception exc) {
			System.out.println("Something went wrong");
		}

	}

}
