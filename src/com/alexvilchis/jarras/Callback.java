package com.alexvilchis.jarras;

@FunctionalInterface
public interface Callback {
  boolean call(int jar4Volume, int jar3Volume);
}
