package trees;

public class TreeNodeQueueUsingLL<T> {

		private TreeNode<T> front;
		private TreeNode<T> rear;
		
		private int size;

		public TreeNodeQueueUsingLL() {
			front = null;
			rear = null;
			size = 0;
		}
		int size(){
			return size;
		}

		boolean isEmpty(){
			return size == 0;
		}

		T front() throws QueueEmptyException{
			if(size == 0){
				throw new QueueEmptyException();
			}	
			return front.data;
		}
		
		TreeNode frontNode() throws QueueEmptyException{
			if(size == 0){
				throw new QueueEmptyException();
			}	
			return front;
		}

		void enqueue(T element){
			TreeNode<T> newNode = new TreeNode<T>(element);
			if(rear == null){
				front = newNode;
				rear = newNode;
			}else{
				rear.next = newNode;
				rear = newNode;
			}
			size++;

		}

		T dequeue() throws QueueEmptyException{
			if(size == 0){
				throw new QueueEmptyException();
			}	
			
			T temp = front.data;
			front = front.next;
			if(size == 1){
				rear = null;
			}
			size--;
			
			return temp;
		}


	}
