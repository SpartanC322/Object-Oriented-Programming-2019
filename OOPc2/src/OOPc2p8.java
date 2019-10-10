import javax.swing.*;

public class OOPc2p8
{
    public static void main(String[] args)
    {
        int number[11];

        for(int i=0; i < 11; i++)
        {
            number[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter your number: "));
        }
        JOptionPane.showMessageDialog(null,"The first number is " +number[0]+ "\nThe fifth number is number is " +number[4]);
    }
}
