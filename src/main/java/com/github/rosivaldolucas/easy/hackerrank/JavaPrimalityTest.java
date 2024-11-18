package com.github.rosivaldolucas.easy.hackerrank;

import java.math.BigInteger;

public class JavaPrimalityTest {

  public static void main(String[] args) {
    BigInteger bigInteger = new BigInteger("13");

    if (bigInteger.isProbablePrime(10)) {
      System.out.println("prime");
    } else {
      System.out.println("not prime");
    }
  }

}
