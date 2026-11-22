import java.util.Scanner;

public class Cafe
{
	public static void main(String[] args)
	{
		Scanner obj = new Scanner (System.in);
		String[] customerNames = new String[3];
		String[] foodItems = new String[3];
		int[] quantities = new int[3];
		double[] bills = new double[3];

		System.out.println("========== Part A : Customer Orders ==========");
		enterOrders(obj, customerNames, foodItems, quantities, bills);
		displayOrders(customerNames, foodItems, quantities, bills);

		System.out.println("\n========== Part B : Manager's Backup ==========");
		double[] backup = copyBills(bills);
		updateBill(obj, customerNames, bills);
		compareBills(bills, backup);

		System.out.println("\n========== Part C : Discount Processing ==========");
		discountProcess(bills);

		System.out.println("\n========== Part D : Sales Analysis ==========");
		totalRevenue(bills);
		averageBill(bills);
		highestBill(customerNames, bills);

		System.out.println("\n========== Part E : Searching and Counting ==========");
		System.out.print("Enter Customer Name you want to Search : ");
		String searchName = obj.nextLine().trim();
		searchCustomer(customerNames, foodItems, quantities, bills, searchName);

		System.out.print("\nEnter Food Item you want to Count : ");
		String searchItem = obj.nextLine().trim();
		countFoodItem(foodItems, searchItem);

		obj.close();
	}

	public static void enterOrders(Scanner obj, String[] customerNames, String[] foodItems, int[] quantities, double[] bills)
	{
		String name;
		String item;
		int quantity;
		double bill;
		for (int i = 0; i < customerNames.length ; i++)
		{
			System.out.println("\n--- Order " + (i + 1) + " ---");
			System.out.print("Please enter the Customer Name : ");
			name = obj.nextLine();
			customerNames[i] = name;

			System.out.print("Dear " + customerNames[i] + " What you want to purchase : ");
			item = obj.nextLine();
			foodItems[i] = item;

			System.out.print("Enter Quantity of " + foodItems[i] + " You want to Purchase : " );
			quantity = obj.nextInt();
			while (quantity <= 0)
			{
				System.out.print("Quantity must be greater than 0, Enter again : ");
				quantity = obj.nextInt();
			}
			quantities[i] = quantity;

			System.out.print("Enter Total Bill of " + foodItems[i] + " Please! : " );
			bill = obj.nextDouble();
			while (bill <= 0)
			{
				System.out.print("Bill must be greater than 0, Enter again : ");
				bill = obj.nextDouble();
			}
			bills[i] = bill;
			obj.nextLine();
		}
	}

	public static void displayOrders(String[] customerNames, String[] foodItems, int[] quantities, double[] bills)
	{
		System.out.println("\nAll Customer Orders : ");
		for (int i = 0; i < customerNames.length ; i++)
		{
			System.out.println("Order " + (i + 1) + " -> Name : " + customerNames[i] + " | Item : " + foodItems[i] + " | Quantity : " + quantities[i] + " | Bill : Rs. " + bills[i]);
		}
	}

	public static double[] copyBills(double[] bills)
	{
		double[] backup = new double[bills.length];
		System.arraycopy(bills, 0, backup, 0, bills.length);
		return backup;
	}

	public static void updateBill(Scanner obj, String[] customerNames, double[] bills)
	{
		System.out.print("Manager Update! Enter New Bill for " + customerNames[0] + " : ");
		double newBill = obj.nextDouble();
		while (newBill <= 0)
		{
			System.out.print("Bill must be greater than 0, Enter again : ");
			newBill = obj.nextDouble();
		}
		bills[0] = newBill;
		obj.nextLine();
	}

	public static void compareBills(double[] bills, double[] backup)
	{
		System.out.println("\nOriginal Bills vs Backup Bills : ");
		for (int i = 0; i < bills.length ; i++)
		{
			System.out.println("Order " + (i + 1) + " -> Original Bill : Rs. " + bills[i] + " | Backup Bill : Rs. " + backup[i]);
		}
	}

	public static void discountProcess(double[] bills)
	{
		int count = 0;
		for (int i = 0; i < bills.length ; i++)
		{
			if (bills[i] > 500)
			{
				bills[i] = bills[i] - (bills[i] * 0.10);
				count++;
			}
		}

		System.out.println("Bills After 10% Discount : ");
		for (int i = 0; i < bills.length ; i++)
		{
			System.out.println("Order " + (i + 1) + " Bill : Rs. " + bills[i]);
		}
		System.out.println("Total Bills Greater than 500 : " + count);
	}

	public static double calculateTotal(double[] bills)
	{
		double total = 0;
		for (int i = 0; i < bills.length ; i++)
		{
			total = total + bills[i];
		}
		return total;
	}

	public static void totalRevenue(double[] bills)
	{
		System.out.println("Total Revenue is : Rs. " + calculateTotal(bills));
	}

	public static void averageBill(double[] bills)
	{
		double avg = calculateTotal(bills) / bills.length;
		System.out.printf("Average Bill is : Rs. %.2f\n", avg);
	}

	public static void highestBill(String[] customerNames, double[] bills)
	{
		int maxIndex = 0;
		for (int i = 1; i < bills.length ; i++)
		{
			if (bills[i] > bills[maxIndex])
			{
				maxIndex = i;
			}
		}
		System.out.println("Highest Bill is : Rs. " + bills[maxIndex] + " by Customer : " + customerNames[maxIndex]);
	}

	public static void searchCustomer(String[] customerNames, String[] foodItems, int[] quantities, double[] bills, String searchName)
	{
		boolean found = false;
		for (int i = 0; i < customerNames.length ; i++)
		{
			if (customerNames[i].equalsIgnoreCase(searchName))
			{
				System.out.println("Customer Found! Item : " + foodItems[i] + " | Quantity : " + quantities[i] + " | Bill : Rs. " + bills[i]);
				found = true;
				break;
			}
		}
		if (!found)
		{
			System.out.println("Sorry! Customer " + searchName + " Not Found.");
		}
	}

	public static void countFoodItem(String[] foodItems, String searchItem)
	{
		int count = 0;
		for (int i = 0; i < foodItems.length ; i++)
		{
			if (foodItems[i].equalsIgnoreCase(searchItem))
			{
				count++;
			}
		}
		System.out.println("Total Orders for " + searchItem + " : " + count);
	}
}
