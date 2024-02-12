package day6;

public class LearningMethod2
{
	public static void main(String[] args)		// Main method
	{
		System.out.println("Sum from 1-5 = " + sumRangeValues(1,5));
		System.out.println("Sum from 10-15 = " + sumRangeValues(10,15));
		System.out.println("Sum from 20-30 = " + sumRangeValues(20,30));
	}
	
	// Name of the method is sumRangeValues with 2 parameters: int min & int max
	public static int sumRangeValues(int min, int max)
	{
		int sum=0;
		
		for(int i=min ; i<=max ; i++)
		{
			sum = sum+i;
		}
		
		return sum;
	}
}
