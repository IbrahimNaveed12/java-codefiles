import java.util.Scanner;

public class LoginCheck {
    public static void main(String[] args) {
        String username = "admin";
        String password = "1234";

        if (username.equals("admin")) {
            if (password.equals("1234")) {
                System.out.println("Login successful.");
            }
        }
    }
}
