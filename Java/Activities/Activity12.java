package activities;

public class Activity12 {

	interface Addable
	{
		int add(int num1, int num2);
	}
	
	
	public static void main(String[] args) 
	{   
		// implementation as as expression lambda
		Addable ad1 = (num1, num2) -> num1 + num2;
		
		// implementation as as function
		Addable ad2 = (int num1, int num2) -> 
		{
			return num1 +  num2;
		};
		
         System.out.println(ad1.add(10,50));
         System.out.println(ad2.add(20,60));
	}

}
