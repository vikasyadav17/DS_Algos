package recursion;

import java.util.Scanner;

public class replacePi {	
	
		public static void main(String[] args) {
			
			System.out.println("enter String");
			Scanner s = new Scanner(System.in);
			String input = s.nextLine();
			System.out.println(ReplacePiUse.replace(input));
		}

}
