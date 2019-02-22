package com.alexvilchis.jarras;

import java.util.List;
import java.util.Random;

public class Game {

  private Jar jar4 = new Jar(0, 4, "4G");

  private Jar jar3 = new Jar(0, 3, "3G");

  private List<Movement> possibleMovements;

  public void play() {

    while (jar4.getVolume() != 2) {
      List<Movement> possibleMovements = getPossibleMovements();
      Movement movement = possibleMovements.get(new Random().nextInt(possibleMovements.size()));
      makeMovement(movement);
    }

    System.out.println("¡Eureka!");
  }

  public final void makeMovement(Movement movement) {
    int currentVolume4 = jar4.getVolume();
    int currentVolume3 = jar3.getVolume();
    int result4 = movement.getFourfillCallback()
        .call(currentVolume4, currentVolume3, jar3.getVolume());
    int result3 = movement.getThreefillCallback()
        .call(currentVolume4, currentVolume3, jar3.getVolume());
    jar4.setVolume(result4);
    jar3.setVolume(result3);
    System.out.printf("(%d, %d) -> (%d, %d)\n", currentVolume4, currentVolume3, result4, result3);
  }

  public boolean isMovementValid(Movement movement) {
    return movement.getValidation().validate(jar4.getVolume(), jar3.getVolume());
  }

  public List<Movement> getPossibleMovements() {
    return possibleMovements;
  }

  public void setPossibleMovements(List<Movement> possibleMovements) {
    this.possibleMovements = possibleMovements;
  }
}
