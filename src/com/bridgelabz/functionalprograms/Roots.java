package com.bridgelabz.functionalprograms;

import java.util.Scanner;

public class Roots {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		System.out.println("Enter the value of a:");
		a = sc.nextInt();
		System.out.println("Enter the value of b:");
		b = sc.nextInt();
		System.out.println("Enter the value of c:");
		c = sc.nextInt();
		;
		sc.close();
		quadraticRoots(a, b, c);

	}

	static void quadraticRoots(int a, int b, int c) {
		double fr = 0, Sr = 0;
		if (a == 0) {
			System.out.println("The value of a cannot be 0.");
			return;
		}
		int d = b * b - 4 * a * c;
		double D = Math.sqrt(Math.abs(d));
		if (d > 0) {
			fr = (-b + D) / (2 * a);
			Sr = (-b - D) / (2 * a);
			System.out.println("The roots of the equation are real and different. \n");
			System.out.println(fr + "\n" + Sr);
		} else if (d == 0) {
			fr = -b / (2 * a);
			Sr = -b / (2 * a);
			System.out.println("The roots of the equation are real and same. \n");
			System.out.println(fr + "\n" + Sr);
		}
		else {
			fr = -(double) b / (2 * a);
			Sr = -(double) b / (2 * a);
			System.out.println("The roots of the equation are complex and different. \n");
			System.out.println(fr + " + i" + D + "\n" + Sr + " - i" + D);
		}
	}

}
