//Exercise 4 : Read integers until the user enters 0. Count how many nonzero integers were entered.
import java.util.Scanner;

public class dowhile
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        int num;
        int count = 0;

        do
        {
            System.out.println("Enter integers [to stop enter 0]");
            num = obj.nextInt();

          
             if (num != 0) 
			 {
                count++;
			 }

        } while (num != 0);

        System.out.println("Nonzero integers entered: " + count);
    }
}