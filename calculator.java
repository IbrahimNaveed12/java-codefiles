import java.util.Scanner;
public class calculator
{
	public static void main(String [] args)
	{
		Scanner obj = new Scanner (System.in);
		System.out.println ("Enter any two numbers");
		double num1 = obj.nextDouble();
		double num2 = obj.nextDouble();
		
		System.out.println("Enter 1 for Addition, 2 for subtration , 3 for multiplication , 4 for division of two numbers");
		int num3 = obj.nextInt();
	if (num3 == 1)
		System.out.println("YOUR RESULT IS :" + (num1 + num2));
	else if (num3 == 2)
		System.out.println("YOUR RESULT IS :" + (num1 - num2));
	else if (num3 == 3)
		System.out.println("YOUR RESULT IS :" + (num1 * num2));
	else 
		System.out.println("YOUR RESULT IS :" + (num1 / num2));
		
		
	}
	
	
	
	
}