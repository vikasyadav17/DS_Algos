package recursion;

import java.util.Scanner;

public class Factorial {
	
	public static int fact(int n) {
		
		if(n == 0) {
			return 1;
		}
		
		return fact(n-1)*n;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter a number");
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		
		int result = fact(x);
		
		System.out.println(result);
		
	}

}
