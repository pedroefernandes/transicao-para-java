package Parte01.ClassesObjetos.AccountSystem;

import java.util.Scanner;

public class AccountTestSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Account account1 = new Account("Alice Brown", 100.00);
        Account account2 = new Account("Bob Smith", 50.00);

        System.out.println("account1 holder is: " + account1.getAccountHolder());
        System.out.println("account1 balance is: " + account1.getBalance());
        System.out.println("account2 holder is: " + account2.getAccountHolder());
        System.out.println("account2 balance is: " + account2.getBalance());

        System.out.print("Enter deposit amount for account1: ");
        double depositAmount = input.nextDouble();
        System.out.println("Adding " + depositAmount + " to account1 balance");
        account1.deposit(depositAmount);

        System.out.println("account1 balance is: " + account1.getBalance());
        System.out.println("account2 balance is: " + account2.getBalance());

        System.out.print("Enter deposit amount for account2: ");
        depositAmount = input.nextDouble();
        System.out.println("Adding " + depositAmount + " to account2 balance");
        account2.deposit(depositAmount);

        System.out.println("account1 balance is: " + account1.getBalance());
        System.out.println("account2 balance is: " + account2.getBalance());

        input.close();
    }
}
