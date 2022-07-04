package stacks;

import java.util.Stack;

public class MinimumbracketReversalUse {

	public static int countBracketReversals(String input) {

		if (input.length() % 2 != 0)
			return -1;

		Stack<Character> stack = new Stack<Character>();

		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			if (c == '{') {
				stack.push(c);
			} else {
				if (!stack.isEmpty() && stack.peek() == '{')
					stack.pop();
				else
					stack.push(c);
			}

		}
		if (stack.size() == 0 && stack.size() % 2 != 0) {
			return -1;
		}
		int count = 0;
		while (!stack.isEmpty()) {
			char c1 = stack.pop();
			char c2 = stack.pop();
			
			if(c1!=c2) {
				count+=2;
			}
			else count+=1;
		}
		return count;
	}
}
