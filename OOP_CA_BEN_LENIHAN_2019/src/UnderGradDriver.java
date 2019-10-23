import javax.swing.*;

public class UnderGradDriver
{
    public static void main(String[] args)
    {
        String name, category;
        String[] subjects = new String[9];
        int age;
        UnderGrad[] underGrads = new UnderGrad[9];
        UnderGrad underGrad;

        for(int i = 0; i < 9; i++)
        {
            name = JOptionPane.showInputDialog(null,"Please enter your name: ");
            age = Integer.parseInt(JOptionPane.showInputDialog(null,"Please enter your age: "));
            for(int j = 0; j < 9; j++)
            {
                subjects[i] = JOptionPane.showInputDialog(null,"Please enter a subject: ");
            }
            category = "Full-Time";

            underGrad = new UnderGrad(name, age, subjects, category);

            JOptionPane.showConfirmDialog(null, underGrad.toString());

            underGrads[i] = underGrad;
        }
    }

    public UnderGrad selectOldestUnderGrad()
    {

    }
}
