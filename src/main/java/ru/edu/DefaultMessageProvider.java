package ru.edu;

public class DefaultMessageProvider implements MessageProvider {

  @Override
  public String getMessage() {
    return "Default message";
  }

}
