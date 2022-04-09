package recursion;

import java.util.Scanner;

public class RunnerSumofArray {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("Enter size of array");
		
		int n = s.nextInt();
		int input[] = new int[n];
		System.out.println("enter array elements");
		for(int i = 0; i < n; i++) {
			input[i] = s.nextInt();
		}
		System.out.println("Sum of the array is " + SumOfArraysSolution.sum(input));
	}
	
}
