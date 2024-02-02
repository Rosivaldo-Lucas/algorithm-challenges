package easy.hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Loops2 {
  
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(bufferedReader.readLine().trim());

    String[] inputs = new String[n];

    for (int i = 0; i < n; i++) {
      inputs[i] = bufferedReader.readLine().trim();
    }

    for (int i = 0; i < inputs.length; i++) {
      int a = Integer.parseInt(inputs[i].split(" ")[0]);
      int b = Integer.parseInt(inputs[i].split(" ")[1]);
      int nn = Integer.parseInt(inputs[i].split(" ")[2]);

      int m = a;

      for (int j = 0; j < nn; j++) {
        m += Math.pow(2, j) * b;

        System.out.print(m + " ");
      }

      System.out.print("\n");
    }

    bufferedReader.close();
  }

}
