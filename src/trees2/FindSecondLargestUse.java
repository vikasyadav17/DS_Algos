package trees2;

public class FindSecondLargestUse {

	static int largest = 0;
	static int secondLargest = 0;
	static TreeNode<Integer> largestNode = null;
	static TreeNode<Integer> secondLargestNode = null;

	public static TreeNode<Integer> findSecondLargest(TreeNode<Integer> root) {

		if (root == null) {
			return root;
		}

		else if (largest == 0 && secondLargest == 0) {
			largest = root.data;
			largestNode = root;
		}

		else if(root.data > largest ) {
			
			if(largest > secondLargest) {
				secondLargest = largest;
				secondLargestNode =  largestNode ; 
			}
			largest = root.data;
			largestNode = root;
		}
		
		else if(root.data < largest && root.data > secondLargest) {
			secondLargest = root.data;
			secondLargestNode = root;
		}
		
		
		for (int i = 0; i < root.children.size(); i++) {
			findSecondLargest(root.children.get(i));
		}
		
		
		
		return secondLargestNode;
		
	}

}
