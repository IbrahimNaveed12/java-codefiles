public class EvenNumbersTwentyToZero
{
	public static void main(String[] args)
	{		System.out.println("Even Numbers 20 to 0 Program");		int i = 20;
		int count = 0;
		while (i >= 0)

		{
			if (i % 2 == 0) {
				count++;
				System.out.println(i);
			}
			i-- ;

		}
			System.out.println("The even numbers between 20 and 0 are " + count);

	}

}