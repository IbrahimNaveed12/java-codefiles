// Checks the purchase amount and membership type to decide the discount.

import java.util.Scanner;
public class discount
{
	public static void main(String[] args)
	{
		Scanner obj = new Scanner (System.in);

			System.out.println("Enter your purchase amount :");
					double amount = obj.nextDouble();
						if (amount >= 10000)
					{
						System.out.println("Enter 1 for premimum membership & 0 for regular :");
							int membership = obj.nextInt();
							
								if (membership == 1)
								
									System.out.println("20% Discount");
									
									
								
								else 
									
										
										System.out.println("10% Discount");
																			
										
									
									
									
								
								
								
								}
		
					else 
					{
						
							System.out.println("No Discount");

						
					}
		
		
	} 	
	
	
	
	
	
}