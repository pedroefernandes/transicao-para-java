package Parte02.Controle;

import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a nota do aluno: ");
        int grade = input.nextInt();

        if (grade >= 60) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }

        int counter = 1;
        while (counter <= 10) {
            System.out.println(counter);
            counter++;
        }

        System.out.println();

        // Conta de 1 a 10 usando um loop for
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println();

        counter = 1;
        do {
            System.out.println(counter);
            counter++;
        } while (counter <= 10);

        int totalGrades = 0;
        int gradeCounter = 0;
        int aCount = 0;
        int bCount = 0;
        int cCount = 0;
        int dCount = 0;
        int fCount = 0;

        System.out.println("Digite as notas no intervalo de 0-100 (digite -1 para terminar):");

        while (true) {
            int studentGrade = input.nextInt();

            if (studentGrade == -1) {
                break;
            }

            totalGrades += studentGrade;
            gradeCounter++;

            if (studentGrade >= 90) {
                aCount++;
            } else if (studentGrade >= 80) {
                bCount++;
            } else if (studentGrade >= 70) {
                cCount++;
            } else if (studentGrade >= 60) {
                dCount++;
            } else {
                fCount++;
            }
        }

        if (gradeCounter != 0) {
            double average = (double) totalGrades / gradeCounter;
            System.out.println("A média da classe é " + average);
            System.out.println("Número de alunos que receberam cada nota:");
            System.out.println("A: " + aCount);
            System.out.println("B: " + bCount);
            System.out.println("C: " + cCount);
            System.out.println("D: " + dCount);
            System.out.println("F: " + fCount);
        } else {
            System.out.println("Nenhuma nota foi inserida.");
        }

        // Verifica condições lógicas
        System.out.print("Digite a idade: ");
        int age = input.nextInt();
        System.out.print("É estudante? (true/false): ");
        boolean isStudent = input.nextBoolean();
        System.out.print("Está empregado? (true/false): ");
        boolean isEmployed = input.nextBoolean();

        if (age > 18 && isStudent) {
            System.out.println("Você é um estudante adulto.");
        }

        if (isStudent || isEmployed) {
            System.out.println("Você é estudante ou está empregado.");
        }

        if (!isEmployed) {
            System.out.println("Você não está empregado.");
        }

        input.close();
    }
}