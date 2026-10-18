import java.util.Scanner;

public class NonzeroCounterForLoop {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int count = 0;

        System.out.println("Enter integers [to stop enter 0]");
        int num;
		for (num = obj.nextInt(); num != 0; num = obj.nextInt()) {
            count++;
            System.out.println("Enter integers [to stop enter 0]");
        }

        System.out.println("Nonzero integers entered: " + count);
        obj.close();
    }
}