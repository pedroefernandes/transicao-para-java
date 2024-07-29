package Parte01.ClassesObjetos.AccountTest3;

import java.util.Scanner;

public class AccountTest3 {
    public static void main(String[] args) {
        Account3 account1 = new Account3("Jane Green", 50.00);
        Account3 account2 = new Account3("John Blue", -7.53);

        System.out.println("account1 balance: " + account1.getBalance());
        System.out.println("account2 balance: " + account2.getBalance());

        Scanner input = new Scanner(System.in);

        System.out.print("Enter deposit amount for account1: ");
        double depositAmount = input.nextDouble();
        System.out.println("adding " + depositAmount + " to account1 balance");
        account1.deposit(depositAmount);

        System.out.println("account1 balance: " + account1.getBalance());
        System.out.println("account2 balance: " + account2.getBalance());

        System.out.print("Enter deposit amount for account2: "); 
        depositAmount = input.nextDouble(); 
        System.out.println("adding " + depositAmount + " to account2 balance");
        account2.deposit(depositAmount);

        System.out.println("account1 balance: " + account1.getBalance());
        System.out.println("account2 balance: " + account2.getBalance());

        input.close();
    }
}
