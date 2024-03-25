// Threads allow you to run lines of codes simultaneously

package day14.learningthreads;

public class Message implements Runnable
{
	String name;		// Instance variable name
	
	public Message(String name)
	{
		this.name = name;	// Storing the data from parameter variable name to instance variable name
	}

	@Override
	public void run()
	{
		for(int i=0 ; i<10 ; i++)
		{
			System.out.println(i + ". " + name);
			
			try
			{
				Thread.sleep(1000);		// Delay for 1 sec / 1000ms
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}
