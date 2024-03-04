package day12.studentapplication;

public class Student
{
	private int id;			// Instance variable
	private String name;	// Instance variable
	private int age;		// Instance variable
	private static int numberOfStudents=0;		// Class variable
	
	public Student(String name, int age)		// Constructor for student class
	{
		this.name = name;	// Store parameter variable name to instance variable name
		editAge(age);		// Store parameter variable age to instance variable age
		numberOfStudents++;		// Increment numberOfStudents by 1 each time a student object is created
		this.id = numberOfStudents;		// Store the numberOfStudents data in instance variable id
	}
	
	public int getId()		// Method to retrieve the id of the student
	{
		return id;
	}
	
	public String getName()		// Method to retrieve the name of the student
	{
		return name;
	}
	
	public int getAge()		// Method to retrieve the age of the student
	{
		return age;
	}
	
	public void editAge(int age)	// Method to edit the age of the existing student
	{
		this.age = age;		// Store the new age in the instance variable age
	}
}