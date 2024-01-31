import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

public class BigNumber {

  public static void main(String[] args) {
    final Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    sc.nextLine();

    final String[] values = new String[n];

    for (int i = 0; i < n; i++) {
      values[i] = sc.nextLine();
    }

    Arrays.sort(values, (s1, s2) -> new BigDecimal(s2).compareTo(new BigDecimal(s1)));

    for (final String value : values) {
      System.out.println(value);
    }

    sc.close();
  }

}
