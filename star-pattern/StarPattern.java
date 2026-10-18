public class StarPattern
{
    public static void main(String[] args)
    {
        System.out.println("Star Pattern Program");
        for (int i = 1; i <= 4; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
