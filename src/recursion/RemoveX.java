package recursion;

import java.util.Scanner;

public class RemoveX {

	public static void main(String[] args) {
		
		System.out.println("enter String");
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(RemoveXUse.removeX(input));
	}
}
