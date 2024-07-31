package Parte03.Arrays;

public class InitArray1 {
  public static void main(String[] args) {
      int[] array = new int[10];
      
      System.out.println("Index Value");
      for (int counter = 0; counter < array.length; counter++) {
          System.out.println(counter + " " + array[counter]);
      }
  }
}