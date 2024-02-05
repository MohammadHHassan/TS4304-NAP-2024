package day2;

import java.util.Scanner;

public class LearningScanner2
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Please enter an integer value: ");
		try
		{
			int a = scanner.nextInt();
			System.out.println("The integer value entered is " + a);
		}
		catch (Exception e)
		{
			System.out.println("Wrong input.");
		}
		
		scanner.close();
	}
}
