package ClassAndObject.Level2;

class BankAccount {

    String accountHolder;
    int accountNumber;
    double balance;

    void deposit(double amount) {

        balance += amount;
    }

    void withdraw(double amount) {

        if (balance >= amount) {

            balance -= amount;
            System.out.println("Withdrawal Successful");

        } else {

            System.out.println("Insufficient Balance");
        }
    }

    void displayBalance() {

        System.out.println("Current Balance = " + balance);
    }
}

public class BankDemo {

    public static void main(String[] args) {

        BankAccount b = new BankAccount();

        b.accountHolder = "Siddhi";
        b.accountNumber = 12345;
        b.balance = 5000;

        b.deposit(1000);

        b.withdraw(2000);

        b.displayBalance();
    }
}