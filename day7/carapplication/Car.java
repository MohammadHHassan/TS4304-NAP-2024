package day7.carapplication;

public class Car 
{
	// List down attributes
	String brand;
	String model;
	String colour;
	double engineSize;
	int numberOfSeats;
	double currentSpeed=0;
	
	Wheels wheels;			// Adding wheels to your car
	
	@Override
	public String toString() {
		return "Car:\nBrand = " + brand + "\nModel = " + model + "\nColour = " + colour + "\nEngine Size = " + engineSize
				+ "\nNumber Of Seats = " + numberOfSeats + "\n\n";
	}
	
	public void pressAccelerator()		// Behavior 1
	{
		currentSpeed+=10;				// Increase the speed by 10
	}
	
	public void pressBrake()			// Behavior 2
	{
		currentSpeed-=5;				// Decrease the speed by 5
		
		if(currentSpeed<0)
		{
			currentSpeed=0;
		}
	}
}
