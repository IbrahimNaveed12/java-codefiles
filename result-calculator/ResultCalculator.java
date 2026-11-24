import java.util.Scanner;
public class ResultCalculator
{
public static void main (String [] args)
{
Scanner obj = new Scanner (System.in);
float totalMarks = 0;
for (int i = 1; i <= 5; i++)
{
System.out.print("Enter Marks of Subject " + i + ": ");
float marks = obj.nextFloat();
totalMarks = totalMarks + marks;
}
float percentage = (totalMarks / 500) * 100;
System.out.println("Total Marks: " + totalMarks);
System.out.println("Percentage: " + percentage + "%");
}
}