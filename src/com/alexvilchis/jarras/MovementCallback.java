package com.alexvilchis.jarras;

@FunctionalInterface
public interface MovementCallback {
  void call(int move, Movement movement, int beforeVolume4, int beforeVolume3, int afterVolume4, int afterVolume3);
}
