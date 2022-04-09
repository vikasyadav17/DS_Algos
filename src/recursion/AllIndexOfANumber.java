package recursion;

import java.util.Scanner;

public class AllIndexOfANumber {
	
			
		static Scanner s = new Scanner(System.in);
		
		public static int[] takeInput(){
	
			System.out.println("enter size of the array");
			int size = s.nextInt();
			System.out.println("Enter elements in the array");
			int[] input = new int[size];
			for(int i = 0; i < size; i++){
				input[i] = s.nextInt();
			}
			return input;
		}
		
		public static void main(String[] args) {
			int[] input = takeInput();
			System.out.println("Enter target Number");
			int x = s.nextInt();
			int output[] = AllIndexOfNumberSolution.allIndexes(input, x);
			for(int i = 0; i < output.length; i++) {
				System.out.print(output[i] + " ");
			}
		}
}