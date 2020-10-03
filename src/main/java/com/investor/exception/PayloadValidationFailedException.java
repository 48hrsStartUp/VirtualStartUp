package com.investor.exception;

public class PayloadValidationFailedException extends RuntimeException {

  private static final long serialVersionUID = 1L;

  public PayloadValidationFailedException(String exception) {
    super(exception);
  }
}
