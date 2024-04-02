package day16.additionquizmulticlient;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.DecimalFormat;
import java.util.Date;

public class Server
{
	public static void main(String[] args)
	{
		try 
		{
			// Declaration of server socket with port number 9101
			ServerSocket socketServer = new ServerSocket(9101);
			// Display the time and date when the server is started
			System.out.println("Server started at " + new Date());
			
			// Declaration of decimal format in 2 d.p
			DecimalFormat df = new DecimalFormat("#.##");
			
			while(true)		// Forever loop to accept multiple clients
			{
				// Accepting socket request from client
				Socket socket = socketServer.accept();
				
				// Implement thread to serve multiple clients simultaneously
				new Thread(new Runnable() 
				{
					@Override
					public void run() 
					{
						try 
						{
							// Enable reading data from client
							DataInputStream fromClient = new DataInputStream(socket.getInputStream());
							// Enable writing data to client
							DataOutputStream toClient = new DataOutputStream(socket.getOutputStream());
							
							String name = fromClient.readUTF();		// Receive the name from the client
							System.out.println("\n" + name + " has been connected.");
							
							int questionNumber=0;		// Declare a variable to count the question number
							
							while(true)		// Forever loop to send and receive data from specific client
							{
								questionNumber++;		// Increment the question number in sequence
								
								// Generate 2 random numbers between 10-99 and send to client
								int randomNumber1 = 10 + (int)(Math.random()*((99-10)+1));
								toClient.writeInt(randomNumber1);
								int randomNumber2 = 10 + (int)(Math.random()*((99-10)+1));
								toClient.writeInt(randomNumber2);
								
								int answer = fromClient.readInt();		// Accept user's answer from client
								
								String question = "\n" + name + "'s Q" + questionNumber + ": " + randomNumber1 + " + " + randomNumber2 + "?";
								
								if(answer==(randomNumber1+randomNumber2))	// If the answer is correct
								{
									System.out.println(question + " Answered " + answer + " [CORRECT]");
								}
								else		// If the user answer incorrectly
								{
									System.out.println(question + " Answered " + answer + " [INCORRECT]");	
								}
								
								double totalMarks = fromClient.readDouble();	// Receive the total marks from client
								System.out.println(name + " current marks = " + df.format(totalMarks) + "%");
							}
						} 
						catch (IOException e) 
						{
							e.printStackTrace();
						}
						
						
					}
				}).start();
			}
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
	}
}
