import java.util.Scanner;

public class vote {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter Age");
        int age = obj.nextInt();
        boolean citizen = true;

        if (age >= 18) {
            if (citizen) {
                System.out.println("Eligible to work");
            }
        }
    }
}
