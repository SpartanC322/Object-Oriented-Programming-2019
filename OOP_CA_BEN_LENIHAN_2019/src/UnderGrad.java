import java.util.Arrays;

public class UnderGrad extends Student
{
    private String[] subjects= new String[9];
    private String category;

    public UnderGrad()
    {
        this.subjects = null;
        this.category = "No Category";
    }

    public UnderGrad(String name, int age, String[] subjects, String category)
    {
        super(name, age);
        setSubjects(subjects);
        setCategory(category);
    }

    public String[] getSubjects()
    {
        return subjects;
    }

    public void setSubjects(String[] subjects)
    {
        this.subjects = subjects;
    }

    @Override
    public String getCategory()
    {
        return category;
    }

    @Override
    public void setCategory(String category)
    {
        this.category = category;
    }

    @Override
    public String toString()
    {
        return "UnderGrad" + super.toString() + "\nSubjects: " + Arrays.toString(subjects) + "\nCategory: " + category;
    }
}
