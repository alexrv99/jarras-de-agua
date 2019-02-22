package com.alexvilchis.jarras;

import java.util.Arrays;

public class Main {

  public static void main(String[] args) {

    Movement movement1 = new Movement((x, y) -> x < 4, (x, y, D) -> 4, (x, y, D) -> y);
    Movement movement2 = new Movement((x, y) -> y < 3, (x, y, D) -> x, (x, y, D) -> 3);
    Movement movement3 = new Movement((x, y) -> x > 0, (x, y, D) -> x - D, (x, y, D) -> y);
    Movement movement4 = new Movement((x, y) -> y > 0, (x, y, D) -> x, (x, y, D) -> y - D);
    Movement movement5 = new Movement((x, y) -> x > 0, (x, y, D) -> 0, (x, y, D) -> y);
    Movement movement6 = new Movement((x, y) -> y > 0, (x, y, D) -> x, (x, y, D) -> 0);
    Movement movement7 = new Movement((x, y) -> x > 0 && y < 3 && x + y >= 3,
        (x, y, D) -> x - (3 - y), (x, y, D) -> 3);
    Movement movement8 = new Movement((x, y) -> x < 4 && y > 0 && x + y >= 4, (x, y, D) -> 4,
        (x, y, D) -> y - (4 - x));
    Movement movement9 = new Movement((x, y) -> x > 0 && y < 3 && x + y <= 3, (x, y, D) -> 0,
        (x, y, D) -> x + y);
    Movement movement10 = new Movement((x, y) -> x < 4 && y > 0 && x + y <= 4, (x, y, D) -> x + y,
        (x, y, D) -> 3);

    Game game = new Game();
    game.setPossibleMovements(Arrays
        .asList(movement1, movement2, movement3, movement4, movement5, movement6, movement7,
            movement8, movement9, movement10));

    game.play();
  }
}
