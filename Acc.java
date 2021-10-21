package acc;
public class Acc {
    public static void main(String[] args) {
        Account a = new Account();
        Date d= new Date();
        a.setID(1122);
        a.setBalance(20000);
        a.setRate(4.5);
        a.withDraw(2500);
        a.deposite(3000);
        System.out.println("Balance is: " + a.getBalance());
        System.out.println("Monthly Rate is: " + a.getMonthlyInterestRate());
        a.getDate(d, 20, 10, 2021);
    }
    
}
