public class PostGrad extends Student
{
    private String supervisor;
    private String category;

    public PostGrad()
    {
        this.supervisor = null;
        this.category = "No Category";
    }

    public PostGrad(String name, int age, String supervisor, String category)
    {
        super(name, age);
        setSupervisor(supervisor);
        setCategory(category);
    }

    public String getSupervisor()
    {
        return supervisor;
    }

    public void setSupervisor(String supervisor)
    {
        this.supervisor = supervisor;
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
    public String toString() {
        return "PostGrad{" + super.toString() +"\nSupervisor: " + supervisor + "\nCategory: " + category;
    }
}
