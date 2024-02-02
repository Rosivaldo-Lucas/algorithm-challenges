package easy.hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DataTypes {

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(bufferedReader.readLine().trim());

    String[] inputs = new String[n];

    for (int i = 0; i < n; i++) {
      inputs[i] = bufferedReader.readLine().trim();
    }

    for (int i = 0; i < inputs.length; i++) {
      long number = 0;

      System.out.print(inputs[i]);

      try {
        number = Long.parseLong(inputs[i]);

      } catch (NumberFormatException ex) {
        System.out.print(" can't be fitted anywhere.");

        System.out.println();

        continue;
      }

      System.out.println(" can be fitted in:");

      if (number >= -128 && number <= 127) {
        System.out.println("* byte");
      }

      if (number >= -32768 && number <= 32767) {
        System.out.println("* short");
      }
      
      if (number >= -Math.pow(2, 31) && number <= Math.pow(2, 31) - 1) {
        System.out.println("* int");
      }
      
      if (number >= -Math.pow(2, 63) && number <= Math.pow(2, 63) - 1) {
        System.out.println("* long");
      }
    }

    bufferedReader.close();
  }
  
}
