package trees;

public class SumOfNodesUse {
	
	static int sum=0;
	
	public static int sumOfAllNode(TreeNode<Integer> root){
		if(sum==0) {
		sum = sum + root.data;
		}
		for(int i=0;i<root.children.size();i++) {
			sum  = sum + root.children.get(i).data;
		}
		
		for(int i=0;i<root.children.size();i++) {
			sumOfAllNode(root.children.get(i));
		}
	
		return sum;
	
	}

}
