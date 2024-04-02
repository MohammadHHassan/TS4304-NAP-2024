package day16.additionquizmulticlient;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Client
{
	public static void main(String[] args)
	{
		try
		{
			// Requesting socket with port number 9101 to the server
			Socket socket = new Socket("localhost", 9101);
			
			// Declaration of decimal format in 2 d.p
			DecimalFormat df = new DecimalFormat("#.##");
			
			// Enable user's input
			Scanner scanner = new Scanner(System.in);
			
			// Enable reading data from server
			DataInputStream fromServer = new DataInputStream(socket.getInputStream());
			// Enable writing data to server
			DataOutputStream toServer = new DataOutputStream(socket.getOutputStream());
			
			// Prompt a message for the user to enter their name and store it
			System.out.print("Please enter your name: ");
			String name = scanner.nextLine();
			
			toServer.writeUTF(name);	// Send user's name to the server
			
			int questionNumber=0, marks=0;	// Declare variables to count the question number and correct answer
			double totalMarks;		// Declare variable to calculate the percentage of correct answers
			
			while(true)		// Forever loop to send and receive data from the server
			{
				questionNumber++;		// Increment the question number
				
				int randomNumber1 = fromServer.readInt();	// Receive the first random number generated from the server
				int randomNumber2 = fromServer.readInt();	// Receive the second random number generated from the server
				
				// Prompt the question to the user
				System.out.println("\nQ" + questionNumber + ": " + randomNumber1 + " + " + randomNumber2 + "?");
				int answer = scanner.nextInt();		// Store user's answer
				
				toServer.writeInt(answer);		// Send the answer to the server
				
				if(answer==(randomNumber1+randomNumber2))		// If the answer is correct
				{
					marks++;		// Increment marks to count the correct answer
					
					totalMarks = ((double)(marks)/questionNumber)*100;		// Calculate the total marks in percentage
					
					System.out.println("Correct! :) - Current marks = " + df.format(totalMarks) + "%");
				}
				else
				{
					totalMarks = ((double)(marks)/questionNumber)*100;		// Calculate the total marks in percentage
					
					System.out.println("Incorrect! :( - Current marks = " + df.format(totalMarks) + "%");
				}
				
				toServer.writeDouble(totalMarks);	// Send the total marks to the server
			}
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}
