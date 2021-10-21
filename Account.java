package acc;
public class Account 
{
    private int id;
    private double balance;
    private double annualInterestRate;
    public Account()
    {
        id=0;
        balance=0;
        annualInterestRate=0;
    }
    public Account(int id, int balance)
    {
        this.id=id;
        this.balance=balance;
    }
    public void setID(int ID)
    {
        id=ID;
    }
    public int getID()
    {
        return id;
    }
    public void setBalance(double Balance)
    {
        balance=Balance;
    }
    public double getBalance()
    {
        return balance;
    }
     public void setRate(double Rate)
    {
        annualInterestRate=Rate;
    }
    public double getRate()
    {
        return annualInterestRate;
    }
    public void getDate(Date dateCreated, int d, int m, int y)
    {
        dateCreated.day=d;
        dateCreated.month=m;
        dateCreated.year=y;
        System.out.println("Date is: "+dateCreated.getdate());
    }
    public double getMonthlyInterestRate()
    {
        annualInterestRate/=100;
        annualInterestRate/=12;
        return annualInterestRate*100;
    }
    public double withDraw(double withdraw)
    {
        return balance -= withdraw;
    }
    public double deposite(double d)
    {
        return balance += d;
    }
}
