// A PROGRAM THAT READS AN INTEGER BETWEEN 1 AND 10 BY USER USING WHILE LOOP
import java.util.Scanner;

public class read_num 
{
    public static void main(String[] args) 
	{
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter a number between 1 and 10: ");
        int i = obj.nextInt();

        while (i < 1 || i > 10) 
		{
            System.out.print(i + " is not between 1 and 10. Try again: ");
            i = obj.nextInt();
        }

        System.out.println(i + " is between 1 and 10. Thanks!");
    }
}
