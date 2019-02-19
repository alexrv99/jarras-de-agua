package com.alexvilchis.jarras;

import java.util.List;

public class Game {

  private Jar jar4 = new Jar(0, 4, "4G");

  private Jar jar3 = new Jar(0, 3, "3G");

  private List<Movement> possibleMovements;

  public void play() {

  }

  public final void makeMovement(Movement movement) {

  }

  public boolean isMovementValid(Movement movement) {
    return movement.getValidation().call(jar4.getVolume(), jar3.getVolume());
  }

  public final List<Movement> getPossibleMovements() {
    return null;
  }

  public void setPossibleMovements(List<Movement> possibleMovements) {
    this.possibleMovements = possibleMovements;
  }
}
