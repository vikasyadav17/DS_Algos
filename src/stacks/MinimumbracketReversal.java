package stacks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MinimumbracketReversal {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws NumberFormatException, IOException {

		System.out.println(MinimumbracketReversalUse.countBracketReversals(br.readLine().trim()));

	}
}
