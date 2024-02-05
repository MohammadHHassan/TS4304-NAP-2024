/* Create a random number generator in which the max and min
 * range values are entered by the user.
 * Print out the generated random value.
 */

package day3;

import java.util.Scanner;

public class Exercise1
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Please enter the minimum value: ");
		int minimum = scanner.nextInt();
		
		System.out.print("Please enter the maximum value: ");
		int maximum = scanner.nextInt();
		
		int randomNumber = minimum + (int)(Math.random()*((maximum-minimum)+1));
		
		System.out.println("Random number generated = " + randomNumber);
		
		scanner.close();
	}
}
