package Beecrowd;
import java.util.Scanner;

public class Beecrowd2137 {
  public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            scanner.nextLine();

            String[] codigos = new String[n];

            for (int i = 0; i < n; i++) {
                codigos[i] = scanner.nextLine();
            }

            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - 1 - i; j++) {
                    if (codigos[j].compareTo(codigos[j + 1]) > 0) {
                        String temp = codigos[j];
                        codigos[j] = codigos[j + 1];
                        codigos[j + 1] = temp;
                    }
                }
            }

            for (String codigo : codigos) {
                System.out.println(codigo);
            }
        }

        scanner.close();
  }
}
