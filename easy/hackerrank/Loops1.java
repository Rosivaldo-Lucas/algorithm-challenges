package easy.hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Loops1 {
  
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(bufferedReader.readLine().trim());

    for (int i = 0; i < 10; i++) {
      System.out.println(n + " x " + (i + 1) + " = " + (i + 1) * n);
    }

    bufferedReader.close();
  }

}
