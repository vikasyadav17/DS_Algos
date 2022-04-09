package recursion;

import java.util.Scanner;

public class PairStar {
	
		public static void main(String[] args) {
			System.out.println("Insert string");
			Scanner s = new Scanner(System.in);
			String input = s.nextLine();
			System.out.println(PairStarUse.addStars(input));
	}


}
