import java.util.Scanner;

public class GradeChecker {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Marks");
        int marks = obj.nextInt();

        if (marks >= 80) {
            System.out.println("A");
        } else if (marks >= 70 && marks < 80) {
            System.out.println("B");
        } else if (marks >= 60 && marks < 70) {
            System.out.println("C");
        } else if (marks >= 50 && marks < 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}
