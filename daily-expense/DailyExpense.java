import java.util.Scanner;
public class DailyExpense
{
public static void main (String [] args)
{
Scanner obj = new Scanner (System.in);
float total = 0;
for (int day = 1; day <= 7; day++)
{
System.out.print("Enter Expense of Day " + day + ": ");
float amount = obj.nextFloat();
total = total + amount;
}
float average = total / 7;
System.out.println("Total Weekly Expenses: " + total);
System.out.println("Average Daily Expense: " + average);
}
}