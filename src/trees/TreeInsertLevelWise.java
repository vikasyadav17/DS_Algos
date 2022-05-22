package trees;

import java.util.ArrayList;
import java.util.Scanner;

public class TreeInsertLevelWise {

	private static TreeNode<Integer> takeInputLevelWise() {

		Scanner s = new Scanner(System.in);

		System.out.println(" Root btao ");
		int value = s.nextInt();
		QueueUsingLL<TreeNode<Integer>> pendingNodes = new QueueUsingLL<TreeNode<Integer>>();
		TreeNode<Integer> node = new TreeNode<Integer>(value);
		pendingNodes.enqueue(node);
		while (!pendingNodes.isEmpty()) {
			try {
				TreeNode<Integer> frontNode = pendingNodes.dequeue();
				System.out.println(" Enter numbers of children of the node with  " + frontNode.data);
				int kids = s.nextInt();
				for (int i = 0; i < kids; i++) {
					System.out.println("enter child number " + (i + 1));
					TreeNode<Integer> child = new TreeNode<Integer>(s.nextInt());
					frontNode.children.add(child);
					pendingNodes.enqueue(child);
				}

			} catch (QueueEmptyException e) {
				// TODO Auto-generated catch block
				System.out.println(" Something went wrong !!!! ");
			}
		}

		return node;
	}

	public static void print(TreeNode<Integer> root) {

		String rootNode = root.data + " : ";
		for (int i = 0; i < root.children.size(); i++) {
			if (i == root.children.size() - 1)
				rootNode = rootNode + root.children.get(i).data;
			else
				rootNode = rootNode + root.children.get(i).data + ",";
		}
		System.out.println(rootNode);
		for (int i = 0; i < root.children.size(); i++) {
			print(root.children.get(i));
		}
	}

	
	public static void main(String[] args) {

		TreeNode<Integer> root = takeInputLevelWise();
		print(root);
		
	}

}
