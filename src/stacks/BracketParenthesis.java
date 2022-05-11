package stacks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class BracketParenthesis {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws NumberFormatException, IOException {
		String expression = br.readLine().trim();
		System.out.println(BracketParenthesisUse.isBalanced(expression));
	}
}
