package trees;

public class printTreeLevelWiseUse {

	static int count=0;
	
	static void printLevelWise(TreeNode<Integer> root) {

		if (root == null) {
			return ;
		}
		
		QueueUsingLL<Integer> queue = new QueueUsingLL<Integer>();
		if(count==0) {
			System.out.println(root.data);
			count++;
		}
		
		for(int i=0;i<root.children.size();i++) {
			queue.enqueue(root.children.get(i).data);
			System.out.print(root.children.get(i).data + " ");
		}
		
		
		
	}
}
