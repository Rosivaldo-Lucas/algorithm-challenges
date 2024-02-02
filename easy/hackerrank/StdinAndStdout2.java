package easy.hackerrank;

import java.util.Locale;
import java.util.Scanner;

public class StdinAndStdout2 {

  public static void main(String[] args) {
    final Scanner sc = new Scanner(System.in).useLocale(Locale.US);

    int i = sc.nextInt();
    double d = sc.nextDouble();

    sc.nextLine(); // limpa o buffer antes de ler a string
    String s = sc.nextLine();

    System.out.println("String: " + s);
    System.out.println("Double: " + d);
    System.out.println("Int: " + i);

    sc.close();
  }

}
