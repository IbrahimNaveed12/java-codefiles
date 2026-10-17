import java.util.Scanner;

public class name_age
{
public static void main(String[] args)
{
		Scanner obj = new Scanner (System.in);
		System.out.println("ENTER NAME & AGE");
		String name = obj.nextLine();
		int age = obj.nextInt();
		System.out.println(" Your name is " + name + " and your age is " + age);
	
	
}



}