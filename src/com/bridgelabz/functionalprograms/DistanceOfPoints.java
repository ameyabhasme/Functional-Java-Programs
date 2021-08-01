package com.bridgelabz.functionalprograms;

import java.util.Scanner;

public class DistanceOfPoints{
	static final Scanner SC = new  Scanner (System.in) ;
	public static double distance (int x, int y) {

		double result1 = Math.pow(x,2);
		double result2 = Math.pow(y,2);
		double result = Math.sqrt(result1 + result2) ;

		return result;


	}
	public static void main(String[] args) {
		System.out.println("Enter the vales of X :- ");
		int x =SC.nextInt();
		System.out.println("Enter the vales of Y :- ");
		int y =SC.nextInt();

		double z = distance(x,y);
		System.out.println("Euclidean distance is " +" "+ z);

	}



}
