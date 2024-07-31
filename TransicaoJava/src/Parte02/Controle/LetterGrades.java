package Parte02.Controle;

import java.util.Scanner;

public class LetterGrades {
    public static void main(String[] args) {
        int total = 0;
        int gradeCounter = 0; 
        int aCount = 0; 
        int bCount = 0; 
        int cCount = 0; 
        int dCount = 0;
        int fCount = 0; 

        Scanner input = new Scanner(System.in); 

        System.out.println("Enter the integer grades in the range 0-100.");
        System.out.println("Type the end-of-file indicator to terminate input:");
        System.out.println("On UNIX/Linux/Mac OS X type <Ctrl> d then press Enter");
        System.out.println("On Windows type <Ctrl> z then press Enter");

        while (input.hasNext()) {
            int grade = input.nextInt(); 
            total += grade; 
            ++gradeCounter; 

            switch (grade / 10) {
                case 9: 
                case 10: 
                    ++aCount;
                    break; 

                case 8: 
                    ++bCount;
                    break; 

                case 7: 
                    ++cCount;
                    break; 

                case 6: 
                    ++dCount;
                    break; 

                default: 
                    ++fCount;
                    break; 
            }
        }

        System.out.println("\nGrade Report:");

        if (gradeCounter != 0) { 
            double average = (double) total / gradeCounter; 

            System.out.println("Total of the " + gradeCounter + " grades entered is " + total);
            System.out.println("Class average is " + average);
            System.out.println("\nNumber of students who received each grade:");
            System.out.println("A: " + aCount);
            System.out.println("B: " + bCount);
            System.out.println("C: " + cCount);
            System.out.println("D: " + dCount);
            System.out.println("F: " + fCount);
        } else { 
            System.out.println("No grades were entered");
        }

        input.close(); 
    }
}