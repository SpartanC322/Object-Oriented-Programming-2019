public class Animals
{
    private String type;
    private String continents[7];
    private double weight;
    private int age;

    public Animals
    {
        this.type = "No Type Specified";
        this.continents = null;
        this.weight = 0.00;
        this.age = 0;
    }

    public Animals(String type, String continents[7], double wieght, int age)
    {
        setType(type);
        setContinents(continents);
        setWeight(wieght);
        setAge(age);
    }

    public String getType() {return type;}
    public void setType(String type) {this.type=type;}
    public String getContinents() {return continents;}
    public void setContinents(String continents) {this.continents=continents;}
    public double getWeight() {return weight;}
    public void setWeight(double Weight) {this.weight=weight;}
    public int getAge() {return age;}
    public void setAge(int age) {this.age=age;}

    public String toString()
    {
        return "Animel: " +getType()+ "\nWhere they are found: " +getContinents()+ "\nWeight: " +getWeight()+ "\nAge: " +getAge();
    }
}
