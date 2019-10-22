public abstract class BankAccount implements Transactable, Taxable
{
    private String name;
    private int accnum;


    public BankAccount()
    {
        this.name = "No Name";
        this.accnum = 0;
    }

    public BankAccount(String name, int accnum)
    {
        setName(name);
        setAccnum(accnum);
    }

    public String getName()
    {
    return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAccnum()
    {
        return accnum;
    }

    public void setAccnum(int accnum)
    {
        this.accnum = accnum;
    }

    public abstract void lodge(double amount);
    public abstract void withdraw(double amount);
    public abstract double calcTax();

    @Override
    public String toString() {
        return "BankAccount{" +
                "name='" + name + '\'' +
                ", accnum=" + accnum +
                '}';
    }
}
