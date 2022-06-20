package trees;


public class printTreeLevelWiseUse {

	public static void printLevelWise(TreeNode<Integer> root) throws QueueEmptyException {

		if (root == null) {
			return;
		}
		TreeNodeQueueUsingLL<TreeNode<Integer>> pendingNodes = new TreeNodeQueueUsingLL<TreeNode<Integer>>();

		pendingNodes.enqueue(root);

		while (pendingNodes.size() > 0) {

			System.out.println(pendingNodes.front().data);
			for (int i = 0; i<pendingNodes.frontNode().children.size(); i++) {
				System.out.println("inside ");
				pendingNodes.enqueue(root.children.get(i));
			}
			pendingNodes.dequeue();
		}

	}
}
