package trees2;

import java.util.Scanner;

public class NextLargerElement {
	static Scanner s = new Scanner(System.in);

	public static TreeNode<Integer> takeInputLevelWise() {
		QueueUsingLL<TreeNode<Integer>> pendingNodes = new QueueUsingLL<TreeNode<Integer>>(); // Queue of node that are
																								// entered themselves
																								// but their children
																								// aren't added yet
		int rootData = s.nextInt();
		TreeNode<Integer> root = new TreeNode<Integer>(rootData);
		pendingNodes.enqueue(root);
		while (!pendingNodes.isEmpty()) {
			TreeNode<Integer> currentNode;
			try {
				currentNode = pendingNodes.dequeue();
				int numChild = s.nextInt();
				for (int i = 0; i < numChild; i++) {
					int currentChild = s.nextInt();
					TreeNode<Integer> childNode = new TreeNode<Integer>(currentChild);
					pendingNodes.enqueue(childNode);
					currentNode.children.add(childNode);
				}
			} catch (QueueEmptyException e) {
			}
		}
		return root;
	}

	public static void main(String[] args) {
		int n = s.nextInt();
		TreeNode<Integer> root = takeInputLevelWise();

		TreeNode<Integer> ans = NextLargerElementUse.findNextLargerNode(root, n);
		if (ans == null) {
			System.out.println(Integer.MIN_VALUE);
		} else {
			System.out.println(ans.data);
		}

	}

}
