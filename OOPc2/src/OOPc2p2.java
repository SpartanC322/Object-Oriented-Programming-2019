import javax.swing.*;

public class OOPc2p2
{
    public static void main(String[] args)
    {
        JTextArea myTextArea = new JTextArea(5, 20);
        myTextArea.setEditable(false);
        myTextArea = new JTextArea("yards \tinches\n-----------\t------------" + "\n");

        for(int i=0; i < 11; i++)
        {
            int inch = (i*36)
            myTextArea.append(i +"\t" + inch + "\n");

        }
        JOptionPane.showMessageDialog(null,myTextArea);
    }
}
