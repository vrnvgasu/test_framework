package ru.edu;

public class ConsoleMessageRender implements MessageRender {

  private MessageProvider provider;

  @Override
  public void setMessageProvider(MessageProvider provider) {
    this.provider = provider;
  }

  @Override
  public void render() {
    System.out.println(provider.getMessage());
  }

}
