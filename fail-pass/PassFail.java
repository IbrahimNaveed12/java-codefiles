import java.util.Scanner;

public class PassFail {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter marks");
        int marks = obj.nextInt();
        System.out.println(marks);

        if (marks >= 50) {
            System.out.println("pass");
        } else {
            System.out.println("fail");
        }
    }
}
