import javax.swing.*;

public class BankMachine
{
    public static void main(String[] args)
    {
        String name;
        int accnum;
        double balance;
        SavingsAccount[] savingsAccount = new SavingsAccount[3];
        SavingsAccount savingsAccount2;

        for(int i = 0; i < 3; i++)
        {
            name = JOptionPane.showInputDialog(null, "Please enter your name: ");

            accnum = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter your account number: "));

            balance = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter your balance: "));

            savingsAccount2 = new SavingsAccount(name, accnum, balance);

            savingsAccount2 = savingsAccount[i];
        }

        String quit;

        quit = JOptionPane.showInputDialog(null,"Please enter your option: ");

        if(quit.equals("l"))
        {
            int i;
            double d;
            i = Integer.parseInt(JOptionPane.showInputDialog(null,"Please select an account: "));

            d = Double.parseDouble(JOptionPane.showInputDialog(null,"Please select an account: "));

            savingsAccount[i].lodge(d);

            //JOptionPane.showMessageDialog(null,savingsAccount.toString(),"output",JOptionPane.INFORMATION_MESSAGE);
            for(int j = 0; j < savingsAccount.length; j++)
            {
                JOptionPane.showMessageDialog(null,savingsAccount[j]);
            }

        }

        if(quit.equals("c"))
        {

        }

        else
            {
                JOptionPane.showMessageDialog(null,"Thank you");
            }
    }
}
