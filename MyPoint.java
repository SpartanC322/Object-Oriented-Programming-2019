import javax.swing.*;

public class MyPoint
{
    private int xVal;
    private int yVal;


    public MyPoint
    {
        this.xVal = 0;
        this.yVal = 0;
    }

    public MyPoint(int xVal, int yVal)
    {
        setXVal(xVal);
        setYVal(yVal);
    }

    public moveHorizontally(int i, int xVal)
    {
        i = Integer.parseInt(JOptionPane.showInputDialog(null,"Please enter your number: "));

        setXVal(i);
    }

    public moveHorizontally(int i, int yVal)
    {
        i = Integer.parseInt(JOptionPane.showInputDialog(null,"Please enter your number: "));

        setYVal(i);
    }

    public int getXVal() {return xVal;}
    public void setXVal(int xVal) {this.xVal=xVal;}
    public int getYVal() {return yVal;}
    public void setYVal(int yVal) {this.yVal=yVal;}

    public String toString()
    {
        return "X value: " +getXVal()+ "Y V value: " + getYVal();
    }
}
