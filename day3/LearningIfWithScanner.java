package day3;

import java.util.Scanner;		// Import Scanner library

public class LearningIfWithScanner
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);		// Declaration of Scanner class
		
		System.out.print("Please enter a value between 5 and 10: ");
		int input = scanner.nextInt();		// Store the user's input
		
		if(input>=5 && input<=10)		// If the value is in between 5-10 inclusive
		{
			System.out.println("The value is within the range.");
		}
		else
		{
			System.out.println("The value is NOT in range.");
		}
		
		scanner.close();
	}
}
