package Parte01.ClassesObjetos.AccountSystem;

public class Account {
    String accountHolder;
    double balance;

    public Account(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        if (initialBalance > 0.0) {
            this.balance = initialBalance;
        }
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void deposit(double depositAmount) {
        if (depositAmount > 0.0) {
            balance += depositAmount;
        }
    }

    public double getBalance() {
        return balance;
    }
}
