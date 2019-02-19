package com.alexvilchis.jarras;

import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
    // write your code here
    Movement movement1 = new Movement();
    movement1.setValidation((jar4Volume, jar3Volume) -> {
      return true;
    });

    Game game = new Game();
    game.setPossibleMovements(Arrays.asList(movement1));

    game.play();
  }
}
