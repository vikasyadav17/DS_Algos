package trees;

public class NodeWithLargestValueUse {
	
	static int counter = 0;
	
	public static int numNodeGreater(TreeNode<Integer> root,int x){

		if(root == null) {
			return 0;
		}
		
		if(root.data > x) {
			counter++;
		}
		
//		for(int i=0;i<root.children.size();i++) {
//			if(root.children.get(i).data > x) counter++;			
//		}
//		
		for(int i=0;i<root.children.size();i++) {
			numNodeGreater(root.children.get(i),x);
		}
		
		return counter;
		
	}
}
