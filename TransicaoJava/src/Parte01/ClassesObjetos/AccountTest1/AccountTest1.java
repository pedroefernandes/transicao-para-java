package Parte01.ClassesObjetos.AccountTest1;

import java.util.Scanner;

public class AccountTest1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Account1 myAccount = new Account1();

        System.out.println("Initial name is: " + myAccount.getName());

        System.out.print("Please enter the name: ");
        String theName = input.nextLine();
        myAccount.setName(theName);

        System.out.println("Name in object myAccount is: " + myAccount.getName());

        input.close();
    }
}
