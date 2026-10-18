//A four-digit number ABCD is called Lucky if A + B = C + D.
//Write a program that asks the user to enter a four-digit number and tell if the number is a Lucky number or not.
import java.util.Scanner;
public class LuckyNumber
{
	public static void main(String[] args)
		{
			Scanner obj = new Scanner(System.in);
			System.out.println("Enter a four-digit number");
			int num = obj.nextInt();
			int a = num % 10 ;
			int b = (num / 10) % 10;
			int c = (num / 100) % 10;
			int d = (num / 1000) % 10;
		int result1 = a + b;
		int result2 = c + d;
		if (result1 == result2)
			System.out.println("THE ENTERED NUMBER IS A LUCKY NUMBER");
	else

			System.out.println("THE ENTERED NUMBER IS NOT LUCKY NUMBER");
		}



}