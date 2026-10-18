import java.util.Scanner;
public class ShoppingBill
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("---- Shopping Bill ----");

        System.out.print("Product 1: ");
        String name1 = obj.nextLine();
        System.out.print("Price: ");
        float price1 = obj.nextFloat();
        System.out.print("Quantity: ");
        int quantity1 = obj.nextInt();
		float total1 = price1 * quantity1;
		System.out.println("Cost: " + total1);
        obj.nextLine();

		System.out.print("\nProduct 2: ");
        String name2 = obj.nextLine();
        System.out.print("Price: ");
        float price2 = obj.nextFloat();
        System.out.print("Quantity: ");
        int quantity2 = obj.nextInt();
        float total2 = price2 * quantity2;
		System.out.println("Cost: " + total2);
        obj.nextLine();

		System.out.print("\nProduct 3: ");
        String name3 = obj.nextLine();
        System.out.print("Price: ");
        float price3 = obj.nextFloat();
        System.out.print("Quantity: ");
        int quantity3 = obj.nextInt();
		float total3 = price3 * quantity3 ;
		System.out.println("Cost: " + total3);


        float finalAmount = total1 + total2 + total3;
        System.out.println("\nFinal Bill: " + finalAmount);
    }
}