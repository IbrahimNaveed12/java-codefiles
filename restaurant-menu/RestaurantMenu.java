import java.util.Scanner;

public class RestaurantMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalBill = 0;
        char choice;

        do {
            System.out.println("\n--- Restaurant Menu ---");
            System.out.println("1. Burger   - Rs. 500");
            System.out.println("2. Pizza    - Rs. 1,200");
            System.out.println("3. Sandwich - Rs. 350");
            System.out.print("Select an item (1-3): ");
            int item = scanner.nextInt();

            switch (item) {
                case 1:
                    totalBill += 500;
                    System.out.println("Burger added.");
                    break;
                case 2:
                    totalBill += 1200;
                    System.out.println("Pizza added.");
                    break;
                case 3:
                    totalBill += 350;
                    System.out.println("Sandwich added.");
                    break;
                default:
                    System.out.println("Invalid selection. Nothing added to the bill.");
            }

            System.out.print("Do you want to order another item? (y/n): ");
            choice = scanner.next().toLowerCase().charAt(0);
        } while (choice == 'y');

        System.out.println("\nTotal Bill: Rs. " + totalBill);
        scanner.close();
    }
}