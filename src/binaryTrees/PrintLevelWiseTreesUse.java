package binaryTrees;

public class PrintLevelWiseTreesUse {

	public static void printLevelWise(BinaryTreeNode<Integer> root) {
		// Your code goes here
		if (root == null) {
			return;
		}

		QueueUsingLL<BinaryTreeNode<Integer>> qll = new QueueUsingLL();
		qll.enqueue(root);
		try {
			while (!qll.isEmpty()) {
				if (qll.front().left == null) {
					System.out.print(qll.front().value + ":L:-1,");
				}
				if (qll.front().left != null) {
					qll.enqueue(qll.front().left);
					System.out.print(qll.front().value + ":L:" + qll.front().left.value + ",");
				}
				if (qll.front().right == null) {
					System.out.print("R:-1");
				}
				if (qll.front().right != null) {
					qll.enqueue(qll.front().right);
					System.out.print("R:" + qll.front().right.value);
				}

				System.out.println();
				qll.dequeue();

			}
		} catch (QueueEmptyException e) {
			System.out.println("something went wrong");
		}

	}

}
