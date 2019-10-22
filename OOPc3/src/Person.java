public class Person
{
    private String name;

    public Person()
    {
        this.name = "No owner specified";
    }

    public Person(String name)
    {
        setName(name);
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    @Override
    public String toString() {
        return getName();
    }
}
