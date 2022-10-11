package ru.edu;

public class ArgumentMessageProvider implements MessageProvider {

  private final String message;

  public ArgumentMessageProvider(String[] args) {
    if (args.length < 1) {
      throw new IllegalArgumentException("Can't find str in arguments");
    }

    message = args[0];
  }

  @Override
  public String getMessage() {
    return message;
  }

}
