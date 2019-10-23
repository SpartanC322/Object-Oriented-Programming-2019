public class SavingsAccount extends BankAccount
{
    private String name;
    private int accnum;
    private double balance;

    public SavingsAccount()
    {
        this.balance = 0.00;
    }

    public SavingsAccount(String name, int accnum, double balance)
    {
        super(name,accnum);
        setBalance(balance);
    }


    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public void lodge(double amount)
    {
        this.balance = balance + amount;
    }

    @Override
    public void withdraw(double amount)
    {
        this.balance = balance - amount;
    }

    @Override
    public double calcTax()
    {
        return balance/0.23;
    }

    public String toString()
    {
        return super.toString() + "balance: " + balance;
    }
}
