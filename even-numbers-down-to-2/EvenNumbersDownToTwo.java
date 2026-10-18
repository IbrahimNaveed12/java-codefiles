//Write a program which prints the even numbers between 1 and 100 in a decreasing order.
//100 98 96 94 92 90 88 ... 2

public class EvenNumbersDownToTwo
{
	public static void main(String [] args)
	{
		for (int i = 100; i >= 1; i--)
		{
			if (i % 2 == 0)
			System.out.print("\t" + i);
		}
	}
}
