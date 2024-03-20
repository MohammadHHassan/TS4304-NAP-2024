package day13.javainputoutput;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class LearningDataOutputStream
{
	public static void main(String[] args) throws IOException
	{
		try
		{
			DataOutputStream output = new DataOutputStream(new FileOutputStream("data.dat"));
			
			output.writeUTF("Upin");
			output.writeDouble(2.5);
			output.writeBoolean(true);
			
			output.writeUTF("Ipin");
			output.writeDouble(7.3);
			output.writeBoolean(false);
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
	}
}
