package easy.hackerrank;

import java.util.Scanner;

public class StaticInitializerBlock {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();

    try {
      if (a <= 0 || b <= 0) throw new Exception("Breadth and height must be positive");
    
      System.out.println(a * b);
    } catch (Exception ex) {
      System.out.println(ex.getClass().getName() + ": " + ex.getMessage());
    }

    sc.close();
  }

}
