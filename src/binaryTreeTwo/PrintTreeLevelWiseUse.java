package binaryTreeTwo;

import java.util.LinkedList;
import java.util.Queue;

public class PrintTreeLevelWiseUse {

	static BinaryTreeNode<Integer> node;
	static int count = 0;

	public static void printLevelWise(BinaryTreeNode<Integer> root) {
		// Your code goes here

		if (root == null) {
			return;
		}

		if (count == 0) {
			node = root;
			count++;
		}

		Queue<BinaryTreeNode<Integer>> q = new LinkedList<BinaryTreeNode<Integer>>();
		q.add(root);

		while (q.size() > 0) {

			System.out.println(q.peek().data);

			if (q.peek().left != null) {
				q.add(root.left);
			}
			if( q.peek().right!=null) {
				q.add(root.right);
			}
			
			q.remove();
			
		}
		
	}

}
