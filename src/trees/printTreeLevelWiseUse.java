package trees;

public class printTreeLevelWiseUse {

	public static void printLevelWise(TreeNode<Integer> root) throws QueueEmptyException {

		if (root == null) {
			return;
		}

		QueueUsingLL<TreeNode<Integer>> qll = new QueueUsingLL<>();
		qll.enqueue(root);
		System.out.println(root.data);
		int count = qll.size();
		while (!qll.isEmpty()) {

			for (int i = 0; i < qll.front().children.size(); i++) {
				System.out.print(qll.front().children.get(i).data + " ");
				qll.enqueue(qll.front().children.get(i));
				
			}
			count--;
			qll.dequeue();
			if (count == 0) {
				System.out.println();
				count = qll.size();
			}
		}

	}
}