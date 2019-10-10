import javax.swing.*;

public class OOPc2p4
{
    public static void main(String[] args)
    {
        String usersName= JOptionPane.showInputDialog("Please enter your first, middle and surname");

        JOptionPane.showMessageDialog(null, "The number of characters in the name is " + usersName.length() +
                "\nThe initial of the firstname is " + usersName.charAt(0) + "\nThe name in caps is " + usersName.toUpperCase()+
                "\nThe surname on its own is " + usersName.substring(usersName.lastIndexOf(" ")));

    }
}
