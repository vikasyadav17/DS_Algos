package recursion;

import java.util.Scanner;

public class MergeSort {
	
	public static int[] takeInput() {
		
		System.out.println("enter size of the array ");
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int arr[] = new int[size];
		System.out.println("enter elements of the array ");
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}
	
	public static void printArray(int input[]) {
		for(int i = 0; i < input.length; i++) {
			
			System.out.println(input[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		int[] input = takeInput();
		MergeSortUse.mergeSort(input,0,input.length-1);
		printArray(input);
	}
}

// tc1

// 6 
// 2 6 8 5 4 3


// tc2
//5
//2 1 5 2 3
