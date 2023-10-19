import java.util.Date;

public class Account {
    private int  id=0;
    private double balance =0;
    private double annualInterestRate=0;
    private Date dateCreated;

     public  Account (){
  dateCreated = new Date();
    }
    public Account (int id, double balance){
         this.id =id;
         this.balance=balance;
        dateCreated = new Date();
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }
    public  double getMonthlyInterestRate() {
         return (annualInterestRate/100)/12;
    }
    public  void  withdraw( double  amount){
    this.balance -= amount;
    }
    public void deposit( double amount ){
     this.balance += amount;
    }

    @Override
    public String toString() {
        return "The balance is: " + balance +  " The monthly interest is: " +getMonthlyInterestRate() + " The date is: " + getDateCreated();
    }
}

