public abstract class Student implements Categorizable
{
    private String name;
    private int age;

    public Student()
    {
        this.name = "Unnamed";
        this.age = 0;
    }

    public Student(String name, int age)
    {
        setName(name);
        setAge(age);
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public abstract void setCategory(String category);
    public abstract String getCategory();

    @Override
    public String toString()
    {
        return "Student" + " Name: " + name + "\nAge: " + age;
    }
}
