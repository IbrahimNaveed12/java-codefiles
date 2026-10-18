import java.util.Scanner;

public class TravelCost {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- Travel Cost ---");
        System.out.print("Traveler Name: ");
        String name = scanner.nextLine();

        System.out.print("Distance: ");
        float distance = scanner.nextFloat();
        System.out.print("Fuel Consumption: ");
        float consumption = scanner.nextFloat();
        System.out.print("Fuel Price: ");
        float price = scanner.nextFloat();

        float fuelRequired = distance / consumption;
        float totalCost = fuelRequired * price;
        System.out.println("Fuel Required: " + fuelRequired + " liters");
        System.out.println("Estimated Fuel Cost: " + totalCost);
        scanner.close();
    }
}
