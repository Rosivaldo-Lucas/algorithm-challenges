package com.github.rosivaldolucas.easy.hackerrank;

public class JavaStringTokens {

  public static void main(String[] args) {
    String s = "                        ";

    s = s
            .replaceAll("[!,?._'@]", " ")
            .replaceAll("\\s{2,}", " ")
            .trim();

    if (s.isEmpty()) {
      System.out.println(0);
    } else {
      String[] tokens = s.split(" ");

      System.out.println(tokens.length);
      for (String token : tokens) {
        System.out.println(token);
      }
    }
  }

}
