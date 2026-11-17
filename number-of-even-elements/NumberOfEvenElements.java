public class NumberOfEvenElements {
    public static void main(String[] args) {
        int[] numbers = {12, 7, 8, 15, 20};
        int count = 0;

        for (int number : numbers) {
            if (number % 2 == 0) {
                count++;
            }
        }

        System.out.println("Number of even elements: " + count);
    }
}
