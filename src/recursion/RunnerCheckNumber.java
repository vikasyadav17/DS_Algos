package recursion;

import java.util.Scanner;

public class RunnerCheckNumber {

		static Scanner s = new Scanner(System.in);

		public static void main(String[] args) {
			
			System.out.println(" enter length of the array");
			int n = s.nextInt();
			
			System.out.println("Enter elements in array");
			int input[] = new int[n];
			for(int i = 0; i < n; i++) {
				input[i] = s.nextInt();
			}
			
			System.out.println("enter number to be checked");
			
			int x = s.nextInt();
			System.out.println(CheckNumberSolution.checkNumber(input, x));

	}

}
