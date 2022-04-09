package recursion;

import java.util.Scanner;

public class RunnableFirstIndexOfNumber {
	
	 	static Scanner s = new Scanner(System.in);
		
		public static int[] takeInput(){
			
			System.out.println(" Enter length of the array ");
			
			int size = s.nextInt();
			
			int[] input = new int[size];
			System.out.println(" Enter the elements ");
			for(int i = 0; i < size; i++){
				input[i] = s.nextInt();
			}
			
			return input;
		}
		
		public static void main(String[] args) {
			int[] input = takeInput();
			System.out.println("element to be checked");
			int x = s.nextInt();
			System.out.println(FirstIndexOfNumberSolution.firstIndex(input, x));
	}      
}
