package Parte02.Controle1;

import java.util.Scanner;

public class LogicalOperators {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 

        System.out.print("Enter an integer: ");
        int number = input.nextInt(); 

        if (number > 10 && number < 100) {
            System.out.println("The number is between 10 and 100");
        } else {
            System.out.println("The number is not between 10 and 100");
        }

        input.close();
    }
}
