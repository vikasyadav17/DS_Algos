package test;

import java.util.Scanner;


public class DoesSContainT {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		String large = s.nextLine();
		String small = s.nextLine();

		System.out.println(DoesSContainTUse.checkSequence(large, small));
	}
} 

