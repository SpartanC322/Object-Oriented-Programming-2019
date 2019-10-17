public class MyPoint
{
    private double xVal;
    private double yVal;

    public MyPoint()
    {
        this.xVal = 0;
        this.yVal = 0;
    }

    public MyPoint(double xVal, double yVal)
    {
        setXVal(xVal);
        setYVal(yVal);
    }

    public double getXVal() {return xVal;}
    public void setXVal(double xVal) {this.xVal=xVal;}
    public double getYVal() {return yVal;}
    public void setYVal(double yVal ) {this.yVal=yVal;}

    public double moveHorizontally(double xVal)
    {
        this.xVal += xVal;

        return xVal;
    }

    public double moveVertically()
    {
        this.yVal += yVal;

        return yVal;
    }

    public void translate(double xVal, double yVal)
    {
        this.xVal = xVal;
        this.yVal = yVal;

    }

    public double distanceFromOrigin(double xVal, double yVal)
    {
        double hy = ((xVal*xVal)+(yVal*yVal));
        hy = Math.sqrt(hy);

        return hy;
    }

    public String toString()
    {
        return "X value: " +getXVal()+ "Y Value: " +getYVal();
    }

}
