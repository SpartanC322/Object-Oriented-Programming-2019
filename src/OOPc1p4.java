import java.util.Scanner;

public class OOPc1p4
{
    public static void main(String[] args)
    {
        String useIn = " ";
        int num = 0;

        Scanner input =new Scanner (System.in);

        do
        {
            num++;
            System.out.print("Please enter a number\n\nq to quit\nCurrent: " +num+ "\n");
            useIn = input.nextLine();

        }
        while(!useIn.equals("q"));

    }
}
