import java.util.Scanner;

public class OOP1
{
    public static void main(String[] args)
    {
            String Name, ClassName;
            int  SnackPrice=2, SnackNum;

        Scanner input=new Scanner(System.in);

        System.out.print("Please enter your name? :");
        Name=input.nextLine();

        System.out.print("Please enter your class? :");
        ClassName=input.nextLine();

        System.out.print("Please enter how many you would like? :");
        SnackNum=input.nextInt();

        if(SnackNum >=0)

            System.out.print(Name + "from class " + ClassName + " would like " + SnackNum + ". This will cost €" + SnackPrice*SnackNum);

        else
            System.out.print("Please enter a number :");
            SnackNum=input.nextInt();
    }
}
