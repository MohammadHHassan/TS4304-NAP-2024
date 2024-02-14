package day7;

import java.text.DecimalFormat;		// Decimal Format library

public class LearningDecimalPlaces
{
	public static void main(String[] args)
	{
		double pi=3.14159;
		
		System.out.println("Pi = " + pi);
		System.out.printf("Pi in 3 d.p = %.3f\n", pi);
		
		DecimalFormat a = new DecimalFormat("#.##");	// Declaration of Decimal Format in 2 d.p
		DecimalFormat b = new DecimalFormat("#.#");		// Declaration of Decimal Format in 1 d.p
		
		System.out.println("Pi in 2 d.p = " + a.format(pi));
		System.out.println("2.555555555 in 2 d.p = " + a.format(2.555555555));
		
		System.out.println("190.88765 in 1 d.p = " + b.format(190.88765));
		System.out.println("Math.PI in 1 d.p = " + b.format(Math.PI));
	}
}
