package queue;

import java.util.Queue;
import java.util.Stack;

public class ReverseQueueUse {

	public static void reverseQueue(Queue<Integer> input) {
		// Your code goes here

		if (input.size() == 0) {
			return;
		}
		Stack<Integer> stack = new Stack<Integer>();
		
		while(!input.isEmpty()) {
			stack.push(input.poll());
		}
		while(!stack.isEmpty()) {
			input.add(stack.pop());
		}
		
		
	}

}
