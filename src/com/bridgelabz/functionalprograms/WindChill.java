package com.bridgelabz.functionalprograms;

import java.util.Scanner;

public class WindChill {
	static final Scanner SC = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Enter the temperature in Fahrenheit between -58ºF and 41ºF: ");
		double temp = SC.nextInt();
		System.out.println("Enter the wind speed (>= 2) in miles per hour: ");
		double speed = SC.nextInt();
		windchill(temp, speed);
	}

	static void windchill(double t, double s) {

		double w = 35.74 + 0.6215 * t + 0.4275 * t * Math.pow(s, 0.16) - 35.75 * Math.pow(s, 0.16);
		System.out.println("Thw wind chill index is : " + w);
	}

}
