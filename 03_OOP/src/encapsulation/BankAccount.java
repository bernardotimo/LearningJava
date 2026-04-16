package encapsulation;

public class BankAccount {

    // private = cannot be accessed directly from outside
    // without encapsulation anyone could do account.balance = - 99999
    private double balance;

    //constructor - creates the object "initialBalance"
    public BankAccount(double initialBalance) {
        if (initialBalance >= 0) {
            this.balance = initialBalance; // uses this because program has "double balance" and "double initialBalance"
        }
    }

    // public method to read (getter)
    public double getBalance() {
        return balance;
    }

    // controlled way to modify data - only this can modify balance
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }
}
