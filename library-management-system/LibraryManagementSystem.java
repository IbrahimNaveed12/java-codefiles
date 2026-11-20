import java.util.Scanner;
public class LibraryManagementSystem
{
    public static void main(String [] args)
    {
        int semester = 0;
        Scanner obj = new Scanner (System.in);
        System.out.println("Student details");
        System.out.print("Name: ");
        String name = obj.nextLine().trim();

        String membership = "";
        while (!(membership.equalsIgnoreCase("Regular") || membership.equalsIgnoreCase("Premium")))
        {
            System.out.print("Membership (Regular/Premium): ");
            membership = obj.nextLine().trim();
            if (!(membership.equalsIgnoreCase("Regular") || membership.equalsIgnoreCase("Premium")))
            {
                System.out.println("Invalid membership. Enter Regular or Premium.");
            }
        }
        if (membership.equalsIgnoreCase("Regular"))
        {
            membership = "Regular";
        }
        else
        {
            membership = "Premium";
        }

        while (semester < 1 || semester > 8)
        {
            System.out.print("No of Semesters (1 - 8): ");
            if (obj.hasNextInt())
            {
                semester = obj.nextInt();
            }
            obj.nextLine();
            if (semester < 1 || semester > 8)
            {
                System.out.println("Invalid. Enter a number from 1 to 8.");
                semester = 0;
            }
        }

        int books = 0;
        int i = 1;
        int days = 0;
        double fine = 0;
        int extra = 0;
        String subj;
        double total = 0;
        int out = 0;
        int in = 0;

        int semDays = 0;
        int tBooks = 0;
        int tOut = 0;
        int tIn = 0;
        int tDays = 0;
        int pen = 0;
        double tTotal = 0;
        double max = 0;

        while (i <= semester)
        {
            System.out.println("\nSemester " + i);
            System.out.println("******** Book Details ********");
            books = 0;
            while (books < 1 || books > 10)
            {
                System.out.print("Number of Books (1 - 10): ");
                if (obj.hasNextInt())
                {
                    books = obj.nextInt();
                }
                obj.nextLine();
                if (books < 1 || books > 10)
                {
                    System.out.println("Invalid. Enter a number from 1 to 10.");
                    books = 0;
                }
            }

            out = 0;
            in = 0;
            total = 0;
            semDays = 0;

            for (int j = 1; j <= books; j++)
            {
                fine = 0;
                extra = 0;
                days = 0;
                System.out.print("Book " + j + " Name: ");
                subj = obj.nextLine().trim();

                String ret = "";
                while (!(ret.equalsIgnoreCase("Yes") || ret.equalsIgnoreCase("No")))
                {
                    System.out.print("Was the book returned late? (Yes/No): ");
                    ret = obj.nextLine().trim();
                    if (!(ret.equalsIgnoreCase("Yes") || ret.equalsIgnoreCase("No")))
                    {
                        System.out.println("Invalid. Enter Yes or No.");
                    }
                }

                if (ret.equalsIgnoreCase("Yes"))
                {
                    while (days < 1 || days > 60)
                    {
                        System.out.print("late days (1 - 60): ");
                        if (obj.hasNextInt())
                        {
                            days = obj.nextInt();
                        }
                        obj.nextLine();
                        if (days < 1 || days > 60)
                        {
                            System.out.println("Invalid. Enter a number from 1 to 60.");
                            days = 0;
                        }
                    }
                    if (days > 30)
                    {
                        extra = extra + 200;
                        pen++;
                    }
                    if (membership.equals("Regular") || membership.equals("regular") ||

                    membership.equals("REGULAR"))

                    {
                        System.out.println("20 Rs Fine for Each Day");
                        fine = 20 * days;
                    }
                    else if (membership.equals("Premium") || membership.equals("PREMIUM") ||

                    membership.equals("premium"))

                    {
                        System.out.println("15 Rs Fine for Each Day");
                        fine = 15 * days;
                    }
                    in++;
                }
                else
                {
                    out++;
                }
                total = total + extra + fine;
                semDays = semDays + days;
                if (extra + fine > max)
                {
                    max = extra + fine;
                }
                System.out.printf("Book: %s | Fine: PKR %.2f%n", subj, extra + fine);
            }
            System.out.println ("******** Book details at the end of semester " + i + " ********");
            System.out.println("Books returned on time : " + out);
            System.out.println("Books returned late: " + in);
            System.out.println("days: " + semDays);
            System.out.printf("total: PKR %.2f%n", total);

            tBooks = tBooks + books;
            tOut = tOut + out;
            tIn = tIn + in;
            tDays = tDays + semDays;
            tTotal = tTotal + total;
            i++;
        }
        System.out.println("\n******** Final Summary ********");
        System.out.println("Student Name: " + name);
        System.out.println("Membership: " + membership);
        System.out.println("Total Semesters Completed: " + semester);
        System.out.println("Total Books: " + tBooks);
        System.out.println("Books returned on time : " + tOut);
        System.out.println("Books returned late: " + tIn);
        System.out.println("days: " + tDays);
        System.out.println("Books charged extra penalty: " + pen);
        System.out.printf("total payable fine: PKR %.2f%n", tTotal);
        System.out.printf("Highest fine for a single book: PKR %.2f%n", max);
    }
}