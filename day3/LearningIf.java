package day3;

public class LearningIf
{
	public static void main(String[] args)
	{
		int a=3, b=3;
		
		if(a<b)			// The condition is if a is less than b
		{
			System.out.println("a is less than b");
		}
		else if(a>b)	// The condition is if a is greater than b
		{
			System.out.println("a is greater than b");
		}
		else			// Other than the first and second condition
		{
			System.out.println("a is equal to b");
		}
	}
}
