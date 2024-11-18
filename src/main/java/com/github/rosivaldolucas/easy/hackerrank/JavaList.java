package com.github.rosivaldolucas.easy.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class JavaList {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    sc.nextLine();

    String[] inputList = sc.nextLine().split(" ");

    List<String> list = new ArrayList<>(Arrays.asList(inputList));

    int q = sc.nextInt();
    sc.nextLine();

    for (int i = 0; i < q; i++) {
      String inputValue = sc.nextLine();

      if (inputValue.equals("Insert")) {
        String[] inputInsert = sc.nextLine().split(" ");

        int index = Integer.parseInt(inputInsert[0]);
        String value = inputInsert[1];

        list.add(index, value);
      } else if (inputValue.equals("Delete")) {
        String inputDelete = sc.nextLine();

        list.remove(Integer.parseInt(inputDelete));
      }
    }

    for (String s : list) {
      System.out.print(s + " ");
    }

    sc.close();
  }

}
