package day5;

import java.time.LocalDate;
import java.util.Scanner;

public class Example2
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		LocalDate now = LocalDate.now();
		
		System.out.print("Please enter your birth year: ");
		int birthYear = scanner.nextInt();
		
		System.out.println("You are " + (now.getYear()-birthYear) + " years old this year.");
		
		scanner.close();
	}
}
