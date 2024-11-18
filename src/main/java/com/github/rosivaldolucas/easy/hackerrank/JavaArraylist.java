package com.github.rosivaldolucas.easy.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class JavaArraylist {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    sc.nextLine();

    List<List<String>> linesList = new ArrayList<>();

    for (int i = 0; i < n; i++) {
      String input = sc.nextLine();
      String[] inputSplit = input.split(" ");

      List<String> inputTokens = new ArrayList<>();

      for (int j = 0; j <= Integer.parseInt(inputSplit[0]); j++) {
        inputTokens.add(inputSplit[j]);
      }

      linesList.add(inputTokens);
    }

    int q = sc.nextInt();
    sc.nextLine();

    for (int i = 0; i < q; i++) {
      String input = sc.nextLine();
      Integer[] inputSplit = Arrays.stream(input.split(" ")).map(Integer::parseInt).toArray(Integer[]::new);

      int linhaConsulta = inputSplit[0] - 1;
      int colunaConsulta = inputSplit[1] - 1;

      if (linhaConsulta >= n || colunaConsulta >= linesList.get(linhaConsulta).size() - 1) {
        System.out.println("ERROR!");
      } else {
        String valor = linesList.get(linhaConsulta).get(colunaConsulta + 1);
        System.out.println(valor);
      }
    }

    sc.close();
  }

}
