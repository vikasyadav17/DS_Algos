package trees;

public class CountLeafNodeUse {

	static int count = 0;

	public static int countLeafNodes(TreeNode<Integer> root) {

		if (root == null) {
			return 0;
		}

		if (root.children.size() > 0)
			for (int i = 0; i < root.children.size(); i++) {
				countLeafNodes(root.children.get(i));
			}
		else
			count++;

		return count;

	}

}
