package binaryTreeTwo;

public class MinAndMinInBinaryTreeUse {

	static int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

	public static PairTwo<Integer, Integer> getMinAndMax(BinaryTreeNode<Integer> root) {

		// Your code goes here

		if (root == null) {
			return null;
		}

		if (root.data > max) {
			max = root.data;
		}
		if (root.data < min) {
			min = root.data;
		}

		getMinAndMax(root.left);
		getMinAndMax(root.right);

		return new PairTwo(min, max);

	}

}
