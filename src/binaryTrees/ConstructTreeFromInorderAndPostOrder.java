package binaryTrees;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

class Pair {
	int[] preOrder;
	int[] inOrder;

	public Pair(int[] preOrder, int[] inOrder) {
		this.preOrder = preOrder;
		this.inOrder = inOrder;
	}

}

public class ConstructTreeFromInorderAndPostOrder {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	private static Pair takeInput() throws NumberFormatException, IOException {
		int n = Integer.parseInt(br.readLine().trim());

		int pre[] = new int[n];
		int in[] = new int[n];

		String[] preOrder = br.readLine().trim().split(" ");
		String[] inOrder = br.readLine().trim().split(" ");

		for (int i = 0; i < n; i++) {
			pre[i] = Integer.parseInt(preOrder[i].trim());
			in[i] = Integer.parseInt(inOrder[i].trim());
		}

		return new Pair(pre, in);

	}

	public static void printLevelWise(BinaryTreeNode<Integer> root) {

		Queue<BinaryTreeNode<Integer>> pendingNodes = new LinkedList<>();
		pendingNodes.add(root);
		pendingNodes.add(null);

		while (!pendingNodes.isEmpty()) {
			BinaryTreeNode<Integer> frontNode = pendingNodes.poll();

			if (frontNode == null) {
				System.out.println();

				if (!pendingNodes.isEmpty()) {
					pendingNodes.add(null);
				}

			} else {
				System.out.print(frontNode.value + " ");

				if (frontNode.left != null) {
					pendingNodes.add(frontNode.left);
				}

				if (frontNode.right != null) {
					pendingNodes.add(frontNode.right);
				}
			}

		}

	}

	public static void main(String[] args) throws NumberFormatException, IOException {

		Pair input = takeInput();

		int[] preOrder = input.preOrder;
		int[] inOrder = input.inOrder;

		BinaryTreeNode<Integer> root = ConstructTreeFromInorderAndPostOrderUse.buildTree(preOrder, inOrder);

		printLevelWise(root);

	}
}
