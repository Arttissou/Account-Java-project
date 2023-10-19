import java.text.DateFormat;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
     Account account = new Account(1122,20000);
        account.setAnnualInterestRate(4.5);
        account.withdraw(2500);
        account.deposit(3000);
        System.out.println("the balance is: " + account.getBalance());
        System.out.println("the monthly interest is: " + account.getMonthlyInterestRate());
        System.out.println("date created: " + account.getDateCreated());
    }
    }
