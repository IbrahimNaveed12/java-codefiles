public class RightSidedTriangle
{
    public static void main(String[] args)
    {
        for (int row = 1; row <= 5; row++)
        {
            for (int space = 1; space <= row; space++)
            {
                System.out.print(" ");
            }
            for (int star = 5; star >= row; star--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
