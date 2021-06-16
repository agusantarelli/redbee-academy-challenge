package com.redbee.academy.challenge;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

public class CompareNumbersTests {

  @Test
  @DisplayName("Tests happy path")
  public void testHappyPath() {
    Integer result = CompareNumbers.max(1, 3, 2);
    assertNotNull(result, "The result cannot be null");
    assertEquals(3, result);
  }

  @Test
  @DisplayName("Tests happy path")
  public void testHappyPath1() {
    Integer result = CompareNumbers.max(3, 1, 2);
    assertNotNull(result, "The result cannot be null");
    assertEquals(3, result);
  }

  @Test
  @DisplayName("Tests happy path")
  public void testHappyPath2() {
    Integer result = CompareNumbers.max(1, 2, 3);
    assertNotNull(result, "The result cannot be null");
    assertEquals(3, result);
  }

  @Test
  @DisplayName("Tests happy path")
  public void testEquals() {
    Integer result = CompareNumbers.max(1, 1, 1);
    assertNotNull(result, "The result cannot be null");
    assertEquals(1, result);
  }

  @Test
  @DisplayName("Test when null values are sent")
  public void testNullValues() {
    Integer result = CompareNumbers.max(null, 2, null);
    assertNotNull(result, "The result cannot be null");
    assertEquals(2, result);
  }

  @Test
  @DisplayName("Test when null values are sent")
  public void testNullValues1() {
    Integer result = CompareNumbers.max(null, null, null);
    assertNull(result, "The result is null");
  }

  @Test
  @DisplayName("Test when null values are sent")
  public void testNullValues2() {
    Integer result = CompareNumbers.max(3, 2, null);
    assertNotNull(result, "The result cannot be null");
    assertEquals(3, result);
  }

  @Test
  @DisplayName("Test when null values are sent")
  public void testNullValues3() {
    Integer result = CompareNumbers.max(null, 0, -1);
    assertNotNull(result, "The result cannot be null");
    assertEquals(0, result);
  }

  @Test
  @DisplayName("Test when null values are sent")
  public void testNullValues4() {
    Integer result = CompareNumbers.max(1, null, 0);
    assertNotNull(result, "The result cannot be null");
    assertEquals(1, result);
  }

  @Test
  @DisplayName("Test when null values are sent")
  public void testNullEqualValue() {
    Integer result = CompareNumbers.max(null, 5, 5);
    assertNotNull(result, "The result cannot be null");
    assertEquals(5, result);
  }

  @Test
  @DisplayName("Test when null values are sent")
  public void testNullEqualValue1() {
    Integer result = CompareNumbers.max(4, null, 4);
    assertNotNull(result, "The result cannot be null");
    assertEquals(4, result);
  }
  @Test
  @DisplayName("Test when null values are sent")
  public void testNullEqualValue2() {
    Integer result = CompareNumbers.max(0, 0, null);
    assertNotNull(result, "The result cannot be null");
    assertEquals(0, result);
  }
}
