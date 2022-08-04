package bstTwo;

public class PathSumRootToLeafUse {
	public static void rootToLeafPathsSumToK(BinaryTreeNode<Integer> root, int k) {
		// Your code goes here
		String s = "";
		int result = 0;
		rootToLeafPathSumToK(root, k, s, result);
	}

	private static void rootToLeafPathSumToK(BinaryTreeNode<Integer> root, int k, String s, int result) {
		// TODO Auto-generated method stub
		if (root == null) {
			return;
		}

		if (root.left == null && root.right == null) {
			if ((result + root.data) == k) {
				System.out.println(s + root.data + " ");
			}

		}

		rootToLeafPathSumToK(root.left, k , s + root.data + " " , result + root.data);
		rootToLeafPathSumToK(root.right, k, s + root.data + " ", result +  root.data);
		
	}

}