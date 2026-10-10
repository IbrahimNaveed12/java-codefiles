// Calculates the gross salary by adding the basic salary and house allowance.

import java.util.Scanner;
public class Electricitybill
{
	public static void main(String[] args)
	{
		Scanner obj = new Scanner (System.in);
		System.out.println("----- Employee Salary -----");
		System.out.print("Employee Name: ");
		String name = obj.nextLine();
		
		System.out.print("Basic Salary: ");
		float units = obj.nextFloat();
		System.out.print("House Allowance: ");
		float price = obj.nextFloat();
		double total = units + price ;
		System.out.print("Gross Salary: " + total);
	}
	
	
	
}