package com.investor.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class GlobalExceptionHandler {

  @ResponseBody
  @ExceptionHandler({EntityNotFoundException.class})
  @ResponseStatus(HttpStatus.NOT_FOUND)
  public String EntityNotFound(EntityNotFoundException exception) {
    return exception.getMessage();
  }

  @ResponseBody
  @ExceptionHandler({PayloadValidationFailedException.class})
  @ResponseStatus(HttpStatus.BAD_REQUEST)
  public String payloadValidationFailed(PayloadValidationFailedException exception) {
    return exception.getMessage();
  }
}
