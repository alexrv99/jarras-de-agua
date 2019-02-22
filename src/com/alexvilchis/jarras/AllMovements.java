package com.alexvilchis.jarras;

import java.util.Arrays;
import java.util.List;

public class AllMovements {

  private static List<Movement> ourInstance;

  static {
    Movement movement2 = new Movement("2", (x, y) -> y < 3, (x, y, D) -> x, (x, y, D) -> 3);
    Movement movement1 = new Movement("1", (x, y) -> x < 4, (x, y, D) -> 4, (x, y, D) -> y);
//    Movement movement3 = new Movement("3", (x, y) -> x > 0, (x, y, D) -> x - D, (x, y, D) -> y);
//    Movement movement4 = new Movement("4", (x, y) -> y > 0, (x, y, D) -> x, (x, y, D) -> y - D);
    Movement movement3 = new Movement("3", (x, y) -> x > 0, (x, y, D) -> 4, (x, y, D) -> y);
    Movement movement4 = new Movement("4", (x, y) -> y > 0, (x, y, D) -> x, (x, y, D) -> 3);
    Movement movement5 = new Movement("5", (x, y) -> x > 0, (x, y, D) -> 0, (x, y, D) -> y);
    Movement movement6 = new Movement("6", (x, y) -> y > 0, (x, y, D) -> x, (x, y, D) -> 0);
    Movement movement7 = new Movement("7", (x, y) -> x > 0 && y < 3 && x + y >= 3,
        (x, y, D) -> x - (3 - y), (x, y, D) -> 3);
    Movement movement8 = new Movement("8", (x, y) -> x < 4 && y > 0 && x + y >= 4, (x, y, D) -> 4,
        (x, y, D) -> y - (4 - x));
    Movement movement9 = new Movement("9", (x, y) -> x > 0 && y < 3 && x + y <= 3, (x, y, D) -> 0,
        (x, y, D) -> x + y);
    Movement movement10 = new Movement("10", (x, y) -> x < 4 && y > 0 && x + y <= 4,
        (x, y, D) -> x + y,
        (x, y, D) -> 3);
    ourInstance = Arrays
        .asList(movement1, movement2, movement3, movement4, movement5, movement6, movement7,
            movement8, movement9, movement10);
  }

  public static List<Movement> getInstance() {
    return ourInstance;
  }

  private AllMovements() {
  }
}
