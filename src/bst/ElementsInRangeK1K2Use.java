package bst;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ElementsInRangeK1K2Use {
	static BinaryTreeNode<Integer> node;
	static int count = 1;
	static List<Integer> list = new ArrayList<>(); 

	public static void elementsInRangeK1K2(BinaryTreeNode<Integer> root, int k1, int k2) {

		if (root == null) {
			return;
		}

		if (count == 1) {
			node = root;
			count++;
		}

		if (root.data >= k1 && root.data <= k2) {
			
			list.add(root.data);
			if(root.data==k2) {
				Collections.sort(list);
				for(int i=0;i<list.size();i++) {
					System.out.print(list.get(i) + " ");
				}
			}
			elementsInRangeK1K2(root.left, k1, k2);
			elementsInRangeK1K2(root.right, k1, k2);
			

		}

		else {
			if (root.data > k1) {
				elementsInRangeK1K2(root.left, k1, k2);
			} else
				elementsInRangeK1K2(root.right, k1, k2);

		}
		
		
	}

}
