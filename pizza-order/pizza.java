//Question
//First check whether a pizza has been ordered. If the answer is yes, use an else-if ladder to check the
//pizza size and price: 1 → Small Pizza, 2 → Medium Pizza, 3 → Large Pizza. For any other size value,
//display "Invalid Pizza Size". If no pizza was ordered, display "No Pizza Ordered".

import java.util.Scanner;
public class pizza 
{
public static void main(String[] args) 
{
Scanner input = new Scanner(System.in);
System.out.print("Press to order pizza (1 = Pizza, 0 = No Pizza) : ");
int order = input.nextInt();
if (order == 1) 
{
System.out.print("Size (1 = Small, 2 = Medium, 3 = Large): ");
int size = input.nextInt();
if (size == 1)
System.out.println("Small Pizza price is 500RS");
else if (size == 2)
System.out.println("Medium Pizza price is 800RS");
else if (size == 3)
System.out.println("Large Pizza price is 1000RS");
else
System.out.println("Invalid Pizza Size");
}
else 
{
System.out.println("No Pizza Ordered");
}
}
}