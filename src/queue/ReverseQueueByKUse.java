package queue;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueueByKUse {

	public static Queue<Integer> reverseKElements(Queue<Integer> input, int k) {
		// Your code goes here

		// 1 2 3 4 5
		// 3 2 1 4 5
		if (k == input.size()) {
			return input;
		}

		Stack<Integer> stack = new Stack<Integer>();
		int count=0;
		while(!input.isEmpty() && count!=k) {
			stack.push(input.peek());
			input.remove();
			count++;
		}
		List<Integer> list = new ArrayList<>();
		while(!input.isEmpty()) {
			list.add(input.peek());
			input.remove();
		}
		while(!stack.isEmpty()) {
			input.add(stack.peek());
			stack.pop();
		}
		for(int i=0;i<list.size();i++) {
			input.add(list.get(i));
		}
		return input;
	}
}
