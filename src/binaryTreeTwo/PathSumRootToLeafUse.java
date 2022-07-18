package binaryTreeTwo;

import java.util.ArrayList;
import java.util.List;

public class PathSumRootToLeafUse {

	static List<Integer> result = new ArrayList<Integer>();

	public static void rootToLeafPathsSumToK(BinaryTreeNode<Integer> root, int k) {
		// Your code goes here

		if (root == null) {
			return;
		}

		k = k - root.data;


		if (k == 0 && root.left == null && root.right == null) {
			for (int i = 0; i < result.size(); i++) {
				System.out.print(result.get(i) + " ");
			}
			System.out.print(root.data + "\n");
			return ;
		}
		result.add(root.data);
		rootToLeafPathsSumToK(root.left,k);
		rootToLeafPathsSumToK(root.right,k);
		
	}
}