package recursion;

import java.util.Scanner;

public class TowerOFHanoi {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		TowerOFHanoiUse.towerOfHanoi(n, 'a', 'b', 'c');
	}
}
