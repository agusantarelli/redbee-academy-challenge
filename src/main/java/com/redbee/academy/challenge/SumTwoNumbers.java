package com.redbee.academy.challenge;

public class SumTwoNumbers {

  /**
   * Method that receives two numbers and returns the
   * sum of both
   *
   * @param a - Some Integer Number
   * @param b - Another Integer Number
   * @return The result of a + b
   */
  public static Integer sum(Integer a, Integer b) {
    if (a == null & b == null) {
      System.out.println("Both numbers are null");
      return null;
    } else if (a == null) {
      System.out.println("The first number is null");
      return b;
    } else if(b == null){
      System.out.println("The second number is null");
      return a;
    } else {
      int sum;
      sum = a + b;
      return sum;
    }
  }
}
