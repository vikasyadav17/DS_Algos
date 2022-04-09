package recursion;

import java.util.Scanner;

public class RemoveDuplicateCharactersRecursively {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		    Scanner s = new Scanner(System.in);
		    System.out.println("enter string");
			String input = s.next();
			System.out.println(RemoveDuplicateCharactersRecursivelyUse.removeConsecutiveDuplicates(input));
	
	}

}
