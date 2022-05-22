package linkedList;


public class LinkedListUSe {

	public static void main(String[] args) {
		
	
		Node<Integer> n1 = new Node<Integer>(10);
		Node<Integer> n2 = new Node<Integer>(20);
		Node<Integer> n3 = new Node<Integer>(30);
		Node<Integer> n4 = new Node<Integer>(40);
		
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		
	}
	
	
	
}
