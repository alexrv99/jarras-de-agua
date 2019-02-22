package com.alexvilchis.jarras;

public class Movement {

  private String label;

  private ValidationCallback validation;

  private FillCallback fourfillCallback;

  private FillCallback threefillCallback;

  public Movement(String label, ValidationCallback validation, FillCallback fourfillCallback,
      FillCallback threefillCallback) {
    this.label = label;
    this.validation = validation;
    this.fourfillCallback = fourfillCallback;
    this.threefillCallback = threefillCallback;
  }

  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public FillCallback getFourfillCallback() {
    return fourfillCallback;
  }

  public void setFourfillCallback(FillCallback fourfillCallback) {
    this.fourfillCallback = fourfillCallback;
  }

  public FillCallback getThreefillCallback() {
    return threefillCallback;
  }

  public void setThreefillCallback(FillCallback threefillCallback) {
    this.threefillCallback = threefillCallback;
  }

  public ValidationCallback getValidation() {
    return validation;
  }

  public void setValidation(ValidationCallback validation) {
    this.validation = validation;
  }
}
