import javax.swing.*;

public class MyPoint2
{
    public static void main(String[] args)
    {
        double xVal, yVal;

        MyPoint myPoint;

         xVal = Double.parseDouble(JOptionPane.showInputDialog(null,"Please enter a value for X: "));

         yVal = Double.parseDouble(JOptionPane.showInputDialog(null,"Please enter a value for Y: "));
         myPoint = new MyPoint(xVal, yVal);

         JOptionPane.showMessageDialog(null, "Here's my point: " +myPoint);



    }
}
