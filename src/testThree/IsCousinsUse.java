package testThree;

public class IsCousinsUse {

	public static boolean isCousin(BinaryTreeNode<Integer> root, int p, int q) {
		// Write your code here
		if (root == null) {
			return false;
		}

		if (root.data == p || root.data == q) {
			return false;
		}

		QueueUsingLL<BinaryTreeNode<Integer>> qll = new QueueUsingLL();
		qll.enqueue(root);
		while (!qll.isEmpty()) {
			if (root.left != null) {
				qll.enqueue(root.left);
			}
			if (root.right != null) {
				qll.enqueue(root.right);
			}

			if (root.left != null && root.right != null) {
				boolean b = isCousins(root.left, root.right, p, q);
				if (b == true) {
					return true;
				}

			}
			try {
				qll.dequeue();
			} catch (QueueEmptyException e) {
				// TODO Auto-generated catch block
				System.out.println("queue is empty");
			}
		}
		return false;
	}

	private static boolean isCousins(BinaryTreeNode<Integer> left, BinaryTreeNode<Integer> right, int p, int q) {
		// TODO Auto-generated method stub

		if (left.left != null) {
			if (left.left.data == p) {
				if (right.left != null && right.left.data == q) {
					return true;
				} else if (right.right != null && right.right.data == q) {
					return true;
				}
			} else if (left.left.data == q) {
				if (right.left.data == p) {
					return false;
				} else if (right.right.data == p) {
					return true;
				}
			}
		}

		if (left.right != null) {
			if (left.right.data == p) {
				if (right.left!=null && right.left.data == q) {
					return true;
				} else if (right.right!=null && right.right.data == q) {
					return true;
				}
			} else if (left.right.data == q) {
				if (right.left!=null && right.left.data == p) {
					return false;
				} else if (right.right!=null && right.right.data == p) {
					return true;
				}
			}
		}

		if (right.left != null) {
			if (right.left.data == p) {
				if (left.left != null && left.left.data == q) {
					return true;
				} else if (left.right != null && left.right.data == q) {
					return true;
				}
			} else if (right.left.data == q) {
				if (left.left != null && left.left.data == p) {
					return true;
				} else if (left.right != null && left.right.data == p) {
					return true;
				}
			}
		}
		if (right.right != null) {
			if (right.right.data == p) {
				if (left.left != null && left.left.data == q) {
					return true;
				} else if (left.right != null && left.right.data == q) {
					return true;
				}
			} else if (right.right.data == q) {
				if (left.left != null && left.left.data == p) {
					return true;
				} else if (left.right != null && left.right.data == p) {
					return true;
				}
			}
		}

		return false;
	}

}
