package oops;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		
		System.out.println("insert values please\n");
		Scanner s = new Scanner(System.in);

		System.out.println("Insert first Complex numbers");
		int real1 = s.nextInt();
		int imaginary1 = s.nextInt();

		System.out.println("insert second complex numbers");
		int real2 = s.nextInt();
		int imaginary2 = s.nextInt();

		ComplexNumbers c1 = new ComplexNumbers(real1, imaginary1);
		ComplexNumbers c2 = new ComplexNumbers(real2, imaginary2);

		System.out.println("make a choice");
		int choice = s.nextInt();

		 
		if(choice == 1) {
			// Add
			c1.plus(c2);
			c1.print();
		}
		else if(choice == 2) {
			// Multiply
			c1.multiply(c2);
			c1.print();
		}
		else {
			return;
		}
	}
}
