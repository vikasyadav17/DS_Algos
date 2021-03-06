package trees2;

public class ReplaceEachNodeWithDepthUse {

//	in - 10 3 20 30 40 2 40 50 0 0 0 0 
//	out - 0 
//	1 1 1 
//	2 2 
	

	private static void replaceWithDepthValue(TreeNode<Integer> root, int depth) {
		// TODO Auto-generated method stub

		if (root == null) {
			return;
		}

		if (root != null) {
			root.data = depth;
			depth++;
		}

		for (int i = 0; i < root.children.size(); i++) {
			
			replaceWithDepthValue(root.children.get(i),depth);
		}

	}

	public static void replaceWithDepthValue(TreeNode<Integer> root) {

		replaceWithDepthValue(root, 0);

	}

}
