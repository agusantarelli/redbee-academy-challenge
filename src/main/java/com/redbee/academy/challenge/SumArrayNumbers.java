package com.redbee.academy.challenge;

import java.util.List;

public class SumArrayNumbers {

  /**
   * Method that receives an array of numbers and
   * returns the sum of each number
   *
   * @param array - Some integer list. ([1,2,3])
   * @return The result of 1 + 2 + 3
   */
  public static Integer sum(List<Integer> array) {
    int sum = 0;
    if (array.isEmpty()) {
      return sum;
    }
    for (int i = 0; i < array.size(); i++){
      sum += array.get(i);
    }
    return sum;
  }
}
