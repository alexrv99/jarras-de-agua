package com.alexvilchis.jarras;


public class Main {

  public static void main(String[] args) {
    Game game = new Game();
    game.setMovements(AllMovements.getInstance());
    game.setTargetVolume(2);
    game.play();
  }
}
