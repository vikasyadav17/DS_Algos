package stacks;

import java.util.Stack;

public class checkRedundantBracketsUse {

	public static boolean checkRedundantBrackets(String expression) {
		// Your code goes here
	
	  Stack<Character> stacks = new Stack<Character>();
	  
	  for(int i=0;i<expression.length();i++) {
		  
		  if(expression.charAt(i)=='(') {
			  stacks.push('(');
		  }
		  else if(expression.charAt(i)==')') {
			  if(stacks.peek() =='(') return true;
			  else if(stacks.peek()=='+' || stacks.peek()=='-' || stacks.peek()=='*' || stacks.peek()=='/') {
				  while(stacks.peek()!='(') {
					  stacks.pop();
				  }
				  stacks.pop();
			  }
			  
		  }
		  else if(expression.charAt(i) == '+' || expression.charAt(i) == '-' || expression.charAt(i) == '*' || expression.charAt(i) == '/') {
			  stacks.push(expression.charAt(i));
		  }
		  
	  }
	  
		return false;
	}
}
