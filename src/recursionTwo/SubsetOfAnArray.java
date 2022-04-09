package recursionTwo;

import java.util.Scanner;

public class SubsetOfAnArray {
	
	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		System.out.println("enter size of the array");
		int size = s.nextInt();
		System.out.println(" enter elements in the new array" );
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int[] input = takeInput();
		int output[][] = SubsetOfAnArrayUse.subsets(input);
		for(int i = 0; i < output.length; i++) {
			for(int j = 0; j < output[i].length; j++) {
				System.out.print(output[i][j] + " ");
			}
			System.out.println();
		}
	}
}


