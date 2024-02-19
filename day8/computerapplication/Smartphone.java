package day8.computerapplication;

public class Smartphone extends Portable		// Smartphone inherits from Portable
{
	double cameraMegapixel;
	boolean display;
	
	public Smartphone(String operatingSystem, double cameraMegapixel)
	{
		super(operatingSystem);
		this.cameraMegapixel = cameraMegapixel;
		switchOffDisplay();
	}
	
	public void switchOnDisplay()
	{
		display = true;
	}
	
	public void switchOffDisplay()
	{
		display = false;
	}
}
