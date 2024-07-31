package Parte03.Arrays;

public class InitArray3 {
  public static void main(String[] args) {
      final int ARRAY_LENGTH = 10;
      int[] array = new int[ARRAY_LENGTH];
      
      for (int counter = 0; counter < array.length; counter++) {
          array[counter] = 2 + 2 * counter;
      }
      
      System.out.println("Index Value");
      for (int counter = 0; counter < array.length; counter++) {
          System.out.println(counter + " " + array[counter]);
      }
  }
}