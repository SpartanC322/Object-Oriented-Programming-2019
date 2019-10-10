import javax.swing.*;

public class OOPc2p6
{
    public static void main(String[] args)
    {
        JOptionPane.showMessageDialog(null, cube());;

    }

    public static JTextArea cube()
    {
        JTextArea myTextArea = new JTextArea(17, 20);
        myTextArea.setEditable(false);
        myTextArea = new JTextArea("Number \tCube\n-----------\t------------" + "\n");

        for(int i=0; i < 16; i++)
        {
            int cubed = i*i*i;
            myTextArea.append(i +"\t" + cubed + "\n");
        }
        return myTextArea;
    }
}
