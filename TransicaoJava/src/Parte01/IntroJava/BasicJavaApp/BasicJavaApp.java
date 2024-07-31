package Parte01.IntroJava.BasicJavaApp;

import java.util.Scanner;

public class BasicJavaApp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Java Programming!");

        System.out.print("Enter first integer: ");
        int number1 = input.nextInt();

        System.out.print("Enter second integer: ");
        int number2 = input.nextInt();

        int sum = number1 + number2;
        System.out.println("Sum is " + sum);

        System.out.println("Welcome\nto\nJava\nProgramming!");

        System.out.println("Comparison results for " + number1 + " and " + number2 + ":");

        if (number1 == number2) {
            System.out.println(number1 + " is equal to " + number2);
        } else {
            System.out.println(number1 + " is not equal to " + number2);
        }

        if (number1 < number2) {
            System.out.println(number1 + " is less than " + number2);
        } else if (number1 > number2) {
            System.out.println(number1 + " is greater than " + number2);
        }

        if (number1 <= number2) {
            System.out.println(number1 + " is less than or equal to " + number2);
        }

        if (number1 >= number2) {
            System.out.println(number1 + " is greater than or equal to " + number2);
        }

        input.close();
    }
}
