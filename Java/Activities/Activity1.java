package activities;

public class Activity1 {

	public static void main(String[] args) 
	{
		Car carobj1 = new Car("Red","Manual",2020);
		carobj1.displayCharacteristics();
		carobj1.accelerate();
		carobj1.brake();
	}
	
}
