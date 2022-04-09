package recursionTwo;

import java.util.Scanner;

public class Staircase {

			public static void main(String[] args) {
			System.out.println("enter number of stairs available");
			Scanner s = new Scanner(System.in);
			int n = s.nextInt();
			System.out.println(StaircaseUse.staircase(n));
		}
	}

