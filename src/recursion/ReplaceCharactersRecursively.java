package recursion;

import java.util.Scanner;

public class ReplaceCharactersRecursively {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		    Scanner s = new Scanner(System.in);
		    System.out.println("enter string");
			String input = s.next();
			char c1 = s.next().charAt(0);
			char c2 = s.next().charAt(0);
			System.out.println(ReplaceCharactersRecursivelyUse.replaceCharacter(input, c1, c2));
	
	}

}
