package recursion;

import java.util.Scanner;

public class QuickSortWithArrayCreations {

	static Scanner s = new Scanner(System.in);

	public static int[] takeInput() {
		System.out.println(" Enter size ");
		int size = s.nextInt();
		System.out.println("Enter elements ");
		int[] input = new int[size];
		for (int i = 0; i < size; i++) {
			input[i] = s.nextInt();
		}
		return input;
	}

	public static void main(String[] args) {
		int[] input = takeInput();
		QuickSortWithArrayCreationsUse.quickSort(input);
		for (int i = 0; i < input.length; i++) {
			if(i==0) {
				System.out.println();
			}
			System.out.print(input[i] + " ");
		}
	}
}
