package trees;

public class FindHeightUse {

	public static int getHeight(TreeNode<Integer> root) {

		if (root == null) {
			return 0;
		}

		QueueUsingLL<TreeNode<Integer>> qll = new QueueUsingLL<>();
		qll.enqueue(root);
		int height=0;
		int count = qll.size();
		try {
			while (!qll.isEmpty()) {

				for (int i = 0; i < qll.front().children.size(); i++) {
					qll.enqueue(qll.front().children.get(i));

				}
				count--;
				qll.dequeue();
				if (count == 0) {
					count = qll.size();
					height++;
				}
				
			}
			
		} catch (Exception e) {
			System.out.println("error");
		}
		return height;
	}

}
