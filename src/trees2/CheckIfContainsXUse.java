package trees2;

public class CheckIfContainsXUse {
	
	public static boolean checkIfContainsX(TreeNode<Integer> root, int x){
		
		if(root == null) {
			return false;
		}
		
		if(root.data == x) {
			return true;
		}
		
		
		for(int i=0;i<root.children.size();i++) {
			boolean result =  checkIfContainsX(root.children.get(i), x);
			
			if(result ==  true) {
				return true;
			
			}
		}
		
		
		
		return false;
	}

}
