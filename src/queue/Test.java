package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Test {
	public static void main(String[] args) {

		Queue<Integer> q = new LinkedList<Integer>();
		for (int i = 1; i < 5; i++) {
			q.add(10 + i);
		System.out.println(q.size());
		}
		
		System.out.print(q.poll() + " " + q.size());
	}
}
