package day13.javainputoutput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class LearningFileInputStream
{
	public static void main(String[] args) throws IOException
	{
		try
		{
			FileInputStream input = new FileInputStream("test.dat");
			
			int value = input.read();	// Reading the first data
			
			while(value!=-1)			// While there is still data inside the file
			{
				System.out.println(value);
				value = input.read();	// Reading the next data
			}
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
	}
}
