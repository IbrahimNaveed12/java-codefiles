// Non-Zero Counter Program
import java.util.Scanner;

public class NonzeroCounter
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        int num;
        int count = 0;

        System.out.println("Non-Zero Counter Program");
        do
        {
            System.out.println("Enter integers [to stop enter 0]");
            num = obj.nextInt();




            if (num != 0) {
                count++;
            }


        } while (num != 0);

        System.out.println("Nonzero integers entered: " + count);
    }
}
