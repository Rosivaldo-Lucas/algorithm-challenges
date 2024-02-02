package easy.hackerrank;

import java.util.Scanner;

public class OutputFormatting {

  public static void main(String[] args) {
    final Scanner sc = new Scanner(System.in);

    String[] input = new String[3];

    for (int i = 0; i < 3; i++) {
      input[i] = sc.nextLine();
    }

    System.out.println("================================");
    for (int i = 0; i < input.length; i++) {
      String[] dado = input[i].split(" ");

      System.out.printf("%-15s%03d%n", dado[0], Integer.parseInt(dado[1]));
    }    
    System.out.println("================================");

    sc.close();
  }
  
}
