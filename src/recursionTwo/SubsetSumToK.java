package recursionTwo;

import java.util.Scanner;

public class SubsetSumToK {

	static Scanner s = new Scanner(System.in);

	public static int[] takeInput() {
		System.out.println(" size of the array ");
		int size = s.nextInt();
		int arr[] = new int[size];
		System.out.println(" enter array elements");
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}

	public static void main(String[] args) {
		
		int[] input = takeInput();
		System.out.println(" enter element to be checked against ");
		int k = s.nextInt();
		SubsetSumToKUse.printSubsetsSumTok(input, k);

	}
}