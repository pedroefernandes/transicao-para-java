public class Interest {
  public static void main(String[] args) {
      double amount; 
      double principal = 1000.0; 
      double rate = 0.05; 

      System.out.println("Ano\tQuantia no depósito");

      for (int year = 1; year <= 10; year++) {
          amount = principal * Math.pow(1.0 + rate, year);

          System.out.println(year + "\t" + amount);
      }
  }
} 