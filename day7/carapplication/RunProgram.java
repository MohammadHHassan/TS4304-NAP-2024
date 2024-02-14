package day7.carapplication;

public class RunProgram
{
	public static void main(String[] args)
	{
		// Instantiate wheel1 object
		Wheels wheel1 = new Wheels();
		wheel1.brand = "Bridgestone";
		wheel1.size = 20;
		
		// Instantiate wheel2 object
		Wheels wheel2 = new Wheels();
		wheel2.brand = "LingLong";
		wheel2.size = 16;
		
		// Instantiate car1 object
		Car car1 = new Car();
		car1.brand = "Toyota";
		car1.model = "Vios";
		car1.colour = "Pink";
		car1.engineSize = 1.6;
		car1.numberOfSeats = 5;
		car1.wheels = wheel2;			// Adding wheel2 into car1
		
		System.out.println(car1);
		
		// Instantiate car2 object
		Car car2 = new Car();
		car2.brand = "Kia";
		car2.model = "Cerato";
		car2.colour = "Red";
		car2.engineSize = 3.6;
		car2.numberOfSeats = 2;
		car2.wheels = wheel1;			// Adding wheel1 into car2
		
		System.out.println(car2);
		
		System.out.println("Current speed of car2 = " + car2.currentSpeed + " km/h");
		car2.pressAccelerator();
		car2.pressAccelerator();
		System.out.println("Speed of car2 after accelerating: " + car2.currentSpeed + " km/h");
		car2.pressBrake();
		car2.pressBrake();
		car2.pressBrake();
		car2.pressBrake();
		car2.pressBrake();
		System.out.println("Speed of car2 after braking: " + car2.currentSpeed + " km/h");
		
		System.out.println("\nCar 1 " + car1.wheels);
		System.out.println("Car 2 " + car2.wheels);
	}
}
