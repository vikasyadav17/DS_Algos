package test;

import java.util.Scanner;

public class maximumProfitOnApp {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int input[] = new int[n];
		for(int i=0;i<n;i++)
			input[i] = s.nextInt();
		
		System.out.println(maximumProfitOnAppUse.maximumProfit(input));
	}

}
