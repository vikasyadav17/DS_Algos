package stacks;


import java.util.Stack;

public class MinimumbracketReversalUse {

	public static int countBracketReversals(String input) {


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
		if(stack.size()==0) {
			return -1;
		}
		else 
			if (stack.size() % 2 != 0)
			return -1;
		int leftBrace = 0, rightBrace = 0;
		int noOfBracketsReversed = 0;
		while (!stack.isEmpty()) {
			if (stack.peek() == '{') {
				if (leftBrace > 0) {
					noOfBracketsReversed++;
					leftBrace--;
					stack.pop();
				} else {
					leftBrace++;
					stack.pop();
				}
			}
			else {
				if(rightBrace>0) {
					noOfBracketsReversed++;
					rightBrace--;
					stack.pop();
				}
				else {
					rightBrace++;
					stack.pop();
				}
			}
		}
		if(leftBrace == rightBrace) {
			noOfBracketsReversed=noOfBracketsReversed+rightBrace*2;
		}

		return noOfBracketsReversed;
	}
}

