package com.redbee.academy.challenge;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

public class SumTwoNumbersTests {

  @Test
  @DisplayName("Tests happy path")
  public void testHappyPath() {
    Integer result = SumTwoNumbers.sum(3, 2);
    assertNotNull(result, "The result cannot be null");
    assertEquals(5, result);
  }

  @Test
  @DisplayName("Test when null values are sent")
  public void testNullValues() {
    Integer result = SumTwoNumbers.sum(null, 2);
    assertNotNull(result, "The result cannot be null");
    assertEquals(2, result);
  }
  @Test
  @DisplayName("Test when null values are sent")
  public void testNullValues1() {
    Integer result = SumTwoNumbers.sum(2, null);
    assertNotNull(result, "The result cannot be null");
    assertEquals(2, result);
  }
  @Test
  @DisplayName("Test when null values are sent")
  public void testNullValues3() {
    Integer result = SumTwoNumbers.sum(null, null);
    assertNull(result, "The result is null because both numbers are null");
  }
}
