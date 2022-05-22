package trees;

public class FindHeightUse {

static int height = 1;
    
	public static int getHeight(TreeNode<Integer> root){
		
		if(root == null) {
			return 0;
		}		

		for(int i=0;i<root.children.size();i++) {
			int heightOfThisChild = getHeight(root.children.get(i));
		}

		
			
			
		}
		
		
		return height;
	}

}
