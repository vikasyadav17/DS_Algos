package oopSecond;

import java.util.Scanner;

public class PolynomialMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println(" Degree of polynomial 1 is ");
		int n = s.nextInt();
		int degree1[] = new int[n];
		System.out.println(" Start entering degree ");
		for (int i = 0; i < n; i++) {
			degree1[i] = s.nextInt();
		}
		System.out.println("start entering coefffiencet ");
		int coeff1[] = new int[n];
		for (int i = 0; i < n; i++) {
			coeff1[i] = s.nextInt();
		}
		Polynomial first = new Polynomial();
		System.out.println("start setting coefficient for the equation ");
		for (int i = 0; i < n; i++) {
			first.setCoefficient(degree1[i], coeff1[i]);
		}
		n = s.nextInt();
		System.out.println("Degree of polynomial is 2 ");
		int degree2[] = new int[n];
		System.out.println("Start entering degree for equations 2");
		for (int i = 0; i < n; i++) {
			degree2[i] = s.nextInt();
		}
		System.out.println("start entering coefficient for equation 2 ");
		int coeff2[] = new int[n];
		for (int i = 0; i < n; i++) {
			coeff2[i] = s.nextInt();
		}
		Polynomial second = new Polynomial();
		System.out.println("setting degrees and coefficent for the equation 2");
		for (int i = 0; i < n; i++) {
			second.setCoefficient(degree2[i], coeff2[i]);
		}
		int choice = s.nextInt();
		Polynomial result;
		switch (choice) {
		// Add
		case 1:
			result = first.add(second);
			result.print();
			break;
		// Subtract
		case 2:
			result = first.subtract(second);
			result.print();
			break;
		// Multiply
		case 3:
			result = first.multiply(second);
			result.print();
			break;
		}

	}

}
