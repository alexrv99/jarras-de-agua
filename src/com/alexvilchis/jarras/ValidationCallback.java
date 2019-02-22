package com.alexvilchis.jarras;

@FunctionalInterface
public interface ValidationCallback {
  boolean validate(int x, int y);
}
