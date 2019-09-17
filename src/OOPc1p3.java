import java.util.Scanner;

public class OOPc1p3
{
    public static void main(String[] args)
    {
        String name;
        double taxIncome, taxDue, netIn, taxR;

        Scanner input=new Scanner(System.in);

        System.out.print("Please enter your name: ");
        name = input.nextLine();

        System.out.print("Please enter your taxable income: ");
        taxIncome = input.nextDouble();

        if(taxIncome <= 20000.00 && taxIncome >= 0.00)
        {
            taxR=0.00;
            System.out.print(name+ "\n\nYour income is " +taxIncome+ "\n\nYour tax rate is " +taxR);
        }

        else if(taxIncome >= 20000.01 && taxIncome <= 36000.00)
        {
            taxR=0.20;
            taxDue=taxIncome*taxR;
            netIn=taxIncome-taxDue;


            System.out.print(name+ "\n\nYour taxable income is " +taxIncome+ "\nYour tax rate is " +taxR+ "\nYour tax due is " +taxDue+ "\nYour net income is " +netIn);
        }

        else if(taxIncome >= 36000.01)
        {
            taxR=0.41;
            taxDue=taxIncome*taxR;
            netIn=taxIncome-taxDue;


            System.out.print(name+ "\n\nYour taxable income is " +taxIncome+ "\nYour tax rate is " +taxR+ "\nYour tax due is " +taxDue+ "\nYour net income is " +netIn);
        }
        else
        {
            System.out.print("Goodbye");
        }
    }
}
