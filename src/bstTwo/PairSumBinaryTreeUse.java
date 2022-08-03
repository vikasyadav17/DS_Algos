package bstTwo;

import java.util.HashMap;
import java.util.Map.Entry;

// did by my own
public class PairSumBinaryTreeUse {
	
	static HashMap<Integer,Integer> set = new HashMap<Integer,Integer>();

	static void pairSum(BinaryTreeNode<Integer> root, int sum) {

		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
        */
	
		addAllElements(root);
		
		for(Entry<Integer, Integer> map : set.entrySet()) {
			int ele = sum - map.getKey();
			 if(set.containsKey(ele) && set.get(map.getKey())!=-1 && ele!=map.getKey()) {
				 if(ele > map.getKey()) System.out.println(map.getKey() + " " +  ele);
				 else System.out.println(ele + " " +  map.getKey());
				 set.put(ele, -1);
			 }
		}
	
	
	}

	private static void addAllElements(BinaryTreeNode<Integer> root) {
		// TODO Auto-generated method stub
		if(root== null) {
			return ;
		}
		
		set.put(root.data,1);
		
		addAllElements(root.left);
		addAllElements(root.right);
		
	}
	
	
}
