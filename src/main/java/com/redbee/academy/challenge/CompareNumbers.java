package com.redbee.academy.challenge;

public class CompareNumbers {

  /**
   * Method that receives two numbers and returns the
   * max of both
   *
   * @param a - Some Integer Number
   * @param b - Another Integer Number
   * @param c - Another Integer Number
   * @return The max of a, b and c
   */
  public static Integer max(Integer a, Integer b, Integer c) {
    if (a == null & b == null & c == null){
      System.out.println("The three arguments are null");
      return null;
    } else if(a == null & b == null){
      System.out.println("The first and second arguments are null");
      return c;
    } else if(a == null & c == null){
      System.out.println("The first and third arguments are null");
      return b;
    } else if(b == null & c == null){
      System.out.println("The second and third arguments are null");
      return a;
    } else if(a == null){
      if(b > c){
        return b;
      } else{
        return c;
      }
    } else if(b == null){
      if(a > c){
        return a;
      } else{
        return c;
      }
    } else if(c == null){
      if(a > b){
        return a;
      }
      else{
        return b;
      }
    } else if(a > b & a > c){
      return a;
    } else if(b > a & b > c){
      return b;
    } else if(c > a & c > b){
      return c;
    } else{
      System.out.println("The three numbers are equal");
      return a;
    }
  }
}
