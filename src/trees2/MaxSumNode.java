package trees2;

import java.util.Scanner;

public class MaxSumNode {

	static Scanner s = new Scanner(System.in);

	public static TreeNode<Integer> takeInputLevelWise() {
		QueueUsingLL<TreeNode<Integer>> pendingNodes = new QueueUsingLL<TreeNode<Integer>>(); // Queue of node that are
																								// entered themselves
																								// but their children
																								// aren't added yet
//	System.out.println("Enter root Data");
		int rootData = s.nextInt();
		TreeNode<Integer> root = new TreeNode<Integer>(rootData);
		pendingNodes.enqueue(root);
		while (!pendingNodes.isEmpty()) {
			TreeNode<Integer> currentNode;
			try {
				currentNode = pendingNodes.dequeue();
//			System.out.println("Enter number of children of "+currentNode.data);
				int numChild = s.nextInt();
				for (int i = 0; i < numChild; i++) {
//				System.out.println("Enter "+ i + "th child of " + currentNode.data);
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
		TreeNode<Integer> root = takeInputLevelWise();
		Object maxSumNodeUse;
		TreeNode<Integer> ans = MaxSumNodeUse.maxSumNode(root);
		if (ans == null) {
			System.out.println(Integer.MIN_VALUE);
		} else {
			System.out.println(ans.data);
		}

	}

}
