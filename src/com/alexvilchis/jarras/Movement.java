package com.alexvilchis.jarras;

public class Movement {

  private ValidationCallback validation;

  private FillCallback fourfillCallback;

  private FillCallback threefillCallback;

  public Movement() {
  }

  public Movement(ValidationCallback validation, FillCallback fourfillCallback,
      FillCallback threefillCallback) {
    this.validation = validation;
    this.fourfillCallback = fourfillCallback;
    this.threefillCallback = threefillCallback;
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
