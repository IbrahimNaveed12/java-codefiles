// Calculates the electricity bill using units consumed and price per unit.

import java.util.Scanner;
public class ElectricityBill
{
	public static void main(String[] args)
	{
		Scanner obj = new Scanner (System.in);
		System.out.println("---- Electricity Bill ----");
		System.out.print("Customer Name: ");
		String name = obj.nextLine();

		System.out.print("Units Consumed: ");
		float units = obj.nextFloat();
		System.out.print("Price per Unit: ");
		float price = obj.nextFloat();
		double total = units * price ;
		System.out.print("Total Bill: " + total);
	}



}