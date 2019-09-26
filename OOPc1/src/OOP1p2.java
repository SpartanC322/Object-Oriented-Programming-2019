import java.util.Scanner;

public class OOP1p2
{
    public static void main(String[] args)
    {
        String FirstName, initial, LastName;
        int km, kmex, kmp=7, kmpex=10;

        Scanner input=new Scanner(System.in);

                System.out.print("Please enter your first name? :");
                        String FirstName=input.nextLine();

                System.out.print("Please enter your initials? :");
                        String initial=input.nextLine();

                System.out.print("Please enter your last name? :");
                        String LastName=input.nextLine();

                System.out.print("Please enter how many kilometers? :");
                        String km=input.nextInt();
    }
}
