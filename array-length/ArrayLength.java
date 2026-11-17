public class ArrayLength {
    public static void main(String[] args) {
        int[] numbers = {0, 1, 3, 4};

        for (int number : numbers) {
            System.out.print(number + "\t");
        }

        System.out.println("\nThe length of array is " + numbers.length);
    }
}
