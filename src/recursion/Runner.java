package recursion;

import java.util.Scanner;

public class Runner {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("enter the number ");
		int x = s.nextInt();
		
		System.out.println("enter the power");
		int n = s.nextInt();
		
		System.out.println(Solution.power(x, n));
	}
}
