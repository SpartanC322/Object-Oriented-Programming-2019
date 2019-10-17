import javax.swing.*;

public class Bicycle2
{
    public static void main(String[] args)
    {
     String name, make;
     double value;

     Bicycle[] bike = new Bicycle[3];
     Bicycle bike2;

        for(int i=0; i <= 2;i++)
        {
            name = JOptionPane.showInputDialog(null, "Please enter your name: ");
            value = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter the value of your bicycle: "))+10;
            make = JOptionPane.showInputDialog(null, "Please enter the make of your bicycle");

            while(i==0){
               value +=10;
               break;
            }

            bike2 = new Bicycle(name, value, make);

            bike[i] = bike2;
        }






        for(int i=0; i <= 2; i++)
        {
            JOptionPane.showMessageDialog(null, "First Bicycle: "+bike[0]+"\nSecond Bicycle"+bike[1]+"\nThird Bicycle"+bike[2]);
        }

        System.exit(0);
    }
}
