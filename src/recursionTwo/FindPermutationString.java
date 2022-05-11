package recursionTwo;

import java.util.Scanner;

public class FindPermutationString {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		String output[] = FindPermutationStringUse.permutationOfString(input);
		for(int i = 0; i < output.length; i++) {
			System.out.println(output[i]);
		}
	}
}

