package trees;

import java.util.Scanner;

public class TreeInsertionByRecursion {

	public static TreeNode<Integer> takeInput(){
	
		Scanner s = new Scanner(System.in);
		System.out.println(" Enter the root value ");
		int rootValue = s.nextInt();
		TreeNode<Integer> root = new TreeNode<Integer>(rootValue);
		System.out.println(" Enter the number of the children for that node ");
		int child = s.nextInt();
		
		for(int i=0;i<child;i++) {
			TreeNode<Integer> childs = takeInput();
			root.children.add(childs);
		}
		
		return root;
		
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
		
		TreeNode<Integer> root= takeInput();
 		print(root);
	}
}
