package recursion;

import java.util.Scanner;

public class ReturnKeypadCode {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println(" Insert number ");
		int input = s.nextInt();
		String output[] = ReturnKeypadCodeUse.keypad(input);
		for (int i = 0; i < output.length; i++) {
			System.out.println(output[i]);
		}

	}
}
