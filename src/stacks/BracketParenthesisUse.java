package stacks;

import java.util.Stack;

public class BracketParenthesisUse {

	public static boolean isBalanced(String expression) {
		// Your code goes here

		if (expression.length() == 0) {
			return true;
		}

		Stack<Character> stacks = new Stack<Character>();

		for (int i = 0; i < expression.length(); i++) {

			if (expression.charAt(i) == '(') {
				stacks.push(expression.charAt(i));
			}
			if (expression.charAt(i) == ')') {
				if (!stacks.isEmpty()) {
					if (stacks.peek() == '(') {
						stacks.pop();
					}
				} else
					stacks.push(expression.charAt(i));
			}

		}

		if (stacks.isEmpty()) {
			return true;
		}
		return false;
	}

}
