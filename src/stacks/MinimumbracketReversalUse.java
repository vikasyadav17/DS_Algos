package stacks;

import java.util.Stack;

public class MinimumbracketReversalUse {

	public static int countBracketReversals(String input) {

		int extra1=0,extra2=0;
		
		Stack<Character> stacks = new Stack<Character>();
		
		for(int i=0;i<input.length();i++) {
			if(input.charAt(i)=='{') ++extra1;
			else ++extra2;
		}
		if(extra1==extra2) {
			return extra1+extra2;
		}
		int extra = extra1-extra2;
		extra = (extra<0) ? extra*-1 : extra;
		if(extra%2==0) {
			return extra/2;
		}
		else {
			return -1;
		}
	}
}
