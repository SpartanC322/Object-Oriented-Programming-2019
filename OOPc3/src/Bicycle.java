public class Bicycle
{
    private String name;
    private double value;
    private String make;

    public Bicycle()
    {
        this.name = "No Title";
        this.value = 0.00;
        this.make = "No Make";

    }

    public Bicycle(String name, double value, String make)
    {
        setName(name);
        setValue(value);
        setMake(make);
    }

    public String getName() {return name;}
    public void setName(String name) {this.name=name;}
    public double getValue() {return value;}
    public void setValue(double value) {this.value=value;}
    public String getMake() {return make;}
    public void setMake(String make) {this.make=make;}

    public String toString() {
        return "Name: " + getName() + "\nValue: " + getValue() + "\nMake: "
                + getMake();
    }
}
