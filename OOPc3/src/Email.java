import javax.swing.*;

public class Email
{
    public static void main(String[] args)
    {
        String sender, recipient, messageText;
        Message message = new Message();

        sender = JOptionPane.showInputDialog("Pleaser enter your name: ");

        recipient = JOptionPane.showInputDialog("Please enter the Recipient: ");

        messageText =JOptionPane.showInputDialog("Please enter your message: ");

        message = new Message(sender, recipient, messageText);

        JOptionPane.showMessageDialog(null, message);

    }
}
