package recursionTwo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import recursion.Solution;

public class FindPermutations {
	 public static void main(String[] args) throws IOException {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        String str = br.readLine().trim();
	        FindPermutationsUse.FindPermutations(str);
	    }

}
