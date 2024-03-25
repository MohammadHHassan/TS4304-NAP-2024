package day15.spherecalcmulticlientapp;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client
{
	public static void main(String[] args)
	{
		try
		{
			// Requesting socket to server
			Socket socket = new Socket("localhost", 9101);
			
			// Enable reading data from server
			DataInputStream fromServer = new DataInputStream(socket.getInputStream());
			// Enable writing data to server
			DataOutputStream toServer = new DataOutputStream(socket.getOutputStream());
			
			// Enable user's input
			Scanner scanner = new Scanner(System.in);
			
			while(true)		// Forever loop for sphere calculator app
			{
				System.out.print("Please enter the radius value: ");
				double radius = scanner.nextDouble();
				
				toServer.writeDouble(radius);	// Send the radius value to the server
				
				double volume = fromServer.readDouble();	// Read the volume value from the server
				
				System.out.println("\nSent radius: " + radius);
				System.out.println("Received volume: " + volume);
			}
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}
