// Calculates the fuel required and estimated travel cost for a trip.

import java.util.Scanner;
public class traveler
{
	public static void main (String [] args)
	{
		
		Scanner obj = new Scanner (System.in);
		System.out.println("--- Travel Cost ---");
		System.out.print("Traveler Name : ");
		String name = obj.nextLine();
		
		
		System.out.print("Distance: ");
		float distance = obj.nextFloat();
		
		
		System.out.print("Fuel Consumption: ");
		float consumption = obj.nextFloat();
		System.out.print("Fuel Price: ");
		float price = obj.nextFloat();
		
		float required = distance / consumption;
		System.out.print("Fuel Required: " + required + "per liter" );
		
		float totalCost = required * price ;
		System.out.print("\nEstimated Fuel Cost: " + totalCost );
	
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}