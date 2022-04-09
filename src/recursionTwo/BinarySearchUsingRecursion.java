package recursionTwo;

import java.util.Scanner;

public class BinarySearchUsingRecursion {

	static Scanner s = new Scanner(System.in);

	public static int[] takeInput() {
		System.out.println("enter size of the array");
		int size = s.nextInt();
		System.out.println("enter elements in the array");
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}

	public static void main(String[] args) {
		int[] input = takeInput();
		System.out.println(" Elements to be searched ");
		int element = s.nextInt();
		System.out.println(BinarySearchUsingRecursionUse.binarySearch(input, element));
	}
}
