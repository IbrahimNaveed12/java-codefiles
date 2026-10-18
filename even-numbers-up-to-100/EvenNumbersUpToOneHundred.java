//Write a program which prints the even numbers between 1 and 100 in an increasing order.
//2 4 6 8 10 12 14 16 18 ... 100

public class EvenNumbersUpToOneHundred
{
	public static void main(String [] args)
	{
		for (int i = 1; i <= 100; i++)
		{
			if (i % 2 == 0)
			System.out.print("\t" + i);
		}
	}
}
