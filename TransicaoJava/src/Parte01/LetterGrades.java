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

        System.out.println("Digite as notas no intervalo de 0 a 100.\nDigite o valor de fim de arquivo para terminar a entrada:");

        while (input.hasNext()) {
            int grade = input.nextInt(); 
            total += grade; 
            gradeCounter++; 

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

        System.out.println("\nRelatório de notas:");
        if (gradeCounter != 0) {
            double average = (double) total / gradeCounter;

            System.out.println("Total das " + gradeCounter + " notas inseridas é " + total);
            System.out.println("A média da classe é " + average);
            System.out.println("Número de estudantes que receberam cada nota:");
            System.out.println("A: " + aCount);
            System.out.println("B: " + bCount);
            System.out.println("C: " + cCount);
            System.out.println("D: " + dCount);
            System.out.println("F: " + fCount);
        } else {
            System.out.println("Nenhuma nota foi inserida");
        }

        input.close();
    }
} 