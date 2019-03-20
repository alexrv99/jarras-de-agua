package com.alexvilchis.jarras;


public class Main {

  public static void main(String[] args) {
    Game game = new Game();
    game.setMovements(AllMovements.getInstance());
    game.setTargetVolume(2);
    game.setOnMovement((move, movement, beforeVolume4, beforeVolume3, afterVolume4, afterVolume3) ->
        System.out.printf("Movement %s %d: (%d, %d) -> (%d, %d)\n", movement.getLabel(), move,
            beforeVolume4, beforeVolume3, afterVolume4, afterVolume3));
    game.setOnWin(() -> System.out.println("¡Eureka!"));
    game.play();
  }
}
