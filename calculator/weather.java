// Decides travel advice based on temperature and rain conditions.

import java.util.Scanner;
public class weather
{
public static void main (String [] args)
{
Scanner obj = new Scanner (System.in);
System.out.println("Enter Temperature : ");
double temp = obj.nextDouble();

if (temp < 10)
	{
	System.out.println("If its raining press 1 else press 0 : ");
	int raining = obj.nextInt();
	
	if (raining == 1)
	
		
		System.out.println("Take a taxi ");
			
	else
		
		System.out.println("Wear warm clothes ");
	}

else 
{
System.out.println("Normal conditions to travel");
		
	
}

}




}