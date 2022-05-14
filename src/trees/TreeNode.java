package trees;

import java.util.ArrayList;
import java.util.List;

public class TreeNode<T> {
	 
	T data;
	List<TreeNode<T>> children;
	
	public TreeNode(T element) {
		data = element;
		children = new ArrayList<>();
			
	}
	

}
