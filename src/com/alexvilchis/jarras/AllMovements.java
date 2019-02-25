package com.alexvilchis.jarras;

import java.util.Arrays;
import java.util.List;

public class AllMovements {

  private static List<Movement> ourInstance;

  static {
    Movement movement1 = new Movement("1", (x, y) -> x < 4, (x, y) -> 4, (x, y) -> y);
    Movement movement2 = new Movement("2", (x, y) -> y < 3, (x, y) -> x, (x, y) -> 3);
    Movement movement5 = new Movement("5", (x, y) -> x > 0, (x, y) -> 0, (x, y) -> y);
    Movement movement6 = new Movement("6", (x, y) -> y > 0, (x, y) -> x, (x, y) -> 0);
    Movement movement7 = new Movement("7", (x, y) -> x > 0 && y < 3 && x + y >= 3,
        (x, y) -> x - (3 - y), (x, y) -> 3);
    Movement movement8 = new Movement("8", (x, y) -> x < 4 && y > 0 && x + y >= 4, (x, y) -> 4,
        (x, y) -> y - (4 - x));
    Movement movement9 = new Movement("9", (x, y) -> x > 0 && y < 3 && x + y <= 3, (x, y) -> 0,
        (x, y) -> x + y);
    Movement movement10 = new Movement("10", (x, y) -> x < 4 && y > 0 && x + y <= 4,
        (x, y) -> x + y,
        (x, y) -> 3);
    ourInstance = Arrays
        .asList(movement1, movement2, movement5, movement6, movement7, movement8, movement9,
            movement10);
  }

  public static List<Movement> getInstance() {
    return ourInstance;
  }

  private AllMovements() {
  }
}
