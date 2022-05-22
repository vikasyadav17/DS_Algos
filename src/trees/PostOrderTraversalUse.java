package trees;

public class PostOrderTraversalUse {

	public static void printPostOrder(TreeNode<Integer> root){
		if(root == null) {
			return ;
		}
		
		if(root.children.size() == 0) {
			System.out.print(root.data + " ");
		}
		else for(int i=0;i<root.children.size();i++) {
		    printPostOrder(root.children.get(i));
		}
		
		if(root.children.size()!=0) {
			System.out.print(root.data + " ");
		}
		
	}
	
	
}
