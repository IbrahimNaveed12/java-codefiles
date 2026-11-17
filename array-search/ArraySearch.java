public class ArraySearch {
    public static void main(String[] args) {
        int[] numbers = {10, 25, 15, 40, 50};
        int target = 15;
        boolean found = false;

        for (int number : numbers) {
            if (number == target) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Element found");
        } else {
            System.out.println("Element not found");
        }
    }
}
