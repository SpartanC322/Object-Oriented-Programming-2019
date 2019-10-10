import javax.swing.*;

public class OOPc2p3
{
    public static void main(String[] args)
    {
        JTextArea myTextArea = new JTextArea(10, 20);
        myTextArea.setEditable(false);


        String usersName = JOptionPane.showInputDialog("Please enter your name");

        float lengthOfRoom = Float.parseFloat(JOptionPane.showInputDialog("Please enter the length of the room"));

        float widthOfRoom = Float.parseFloat(JOptionPane.showInputDialog("Please enter breadth of the room"));

        float carpetCostPerSquareMetre = Float.parseFloat(JOptionPane.showInputDialog("Please enter cost of carpet per square metre"));

        myTextArea = new JTextArea("Quotation for " + usersName + "\nLength of room:\t\t\t" + lengthOfRoom + " m " +
                "\nBreadth of room:\t\t" + widthOfRoom + " m " + "\ntotal area of the room:\t\t" + String.format("%.2f", (lengthOfRoom*widthOfRoom)) + " sq. m." +
                "\nCost per square metre of carpet:\t" + carpetCostPerSquareMetre + "\nTotal cost of carpet:\t\t" + String.format("%.2f",(carpetCostPerSquareMetre*(lengthOfRoom*widthOfRoom))) + " euro");
        JOptionPane.showMessageDialog(null,myTextArea);

    }
}
