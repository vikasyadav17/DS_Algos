package trees;

import java.util.ArrayList;

public class printTreeLevelWiseUse {

	static void printLevelWise(TreeNode<Integer> root) {
		if (root == null) {
			return;
		}
		TreeNode<Integer> node2=root;
		
		QueueUsingLL<TreeNode<Integer>> pendingNodes = new QueueUsingLL<TreeNode<Integer>>();
		pendingNodes.enqueue(node2);
		System.out.println(node2.data);
		while (!pendingNodes.isEmpty()) {
			TreeNode<Integer> node;
			try {
				node = pendingNodes.front();
				for (int i = 0; i < node.children.size(); i++) {
					 System.out.print(node.children.get(i).data + " ");
					 pendingNodes.enqueue(node.children.get(i));
				}
				System.out.println();
				pendingNodes.dequeue();
			} catch (QueueEmptyException e) {
				e.printStackTrace();
			}

		}

	}
}
