package com.alexvilchis.jarras;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Game {

  private Jug jug4 = new Jug(0, 4, "4G");

  private Jug jug3 = new Jug(0, 3, "3G");

  private List<Movement> movements;

  private int targetVolume;

  void play() {
    while (jug4.getVolume() != targetVolume) {
      List<Movement> availableMovements = getAvailableMovements();
      Movement movement = availableMovements.get(new Random().nextInt(availableMovements.size()));
      makeMovement(movement);
    }
    System.out.println("¡Eureka!");
  }

  private void makeMovement(Movement movement) {
    int currentVolume4 = jug4.getVolume();
    int currentVolume3 = jug3.getVolume();
    int result4 = movement.getFourfillCallback()
        .call(currentVolume4, currentVolume3);
    int result3 = movement.getThreefillCallback()
        .call(currentVolume4, currentVolume3);
    jug4.setVolume(result4);
    jug3.setVolume(result3);
    System.out.printf("Movement %s: (%d, %d) -> (%d, %d)\n", movement.getLabel(), currentVolume4,
        currentVolume3, result4, result3);
  }


  private List<Movement> getAvailableMovements() {
    return movements.stream()
        .filter(movement -> movement.getValidation().validate(jug4.getVolume(), jug3.getVolume()))
        .collect(Collectors.toList());
  }

  public List<Movement> getMovements() {
    return movements;
  }

  public void setMovements(List<Movement> movements) {
    this.movements = movements;
  }

  public int getTargetVolume() {
    return targetVolume;
  }

  public void setTargetVolume(int targetVolume) {
    this.targetVolume = targetVolume;
  }
}
