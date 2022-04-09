package recursionTwo;

import java.util.Scanner;

public class QuickSortByYoursTruly {

	static Scanner s = new Scanner(System.in);

	public static int[] takeInput() {
		int size = s.nextInt();
		int[] input = new int[size];
		for (int i = 0; i < size; i++) {
			input[i] = s.nextInt();
		}
		return input;
	}

	public static void main(String[] args) {
		int[] input = takeInput();
		QuickSortByYoursTrulyUse.quickSort(input);
		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i] + " ");
		}

	}
}