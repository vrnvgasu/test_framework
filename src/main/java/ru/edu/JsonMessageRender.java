package ru.edu;

public class JsonMessageRender implements MessageRender {

  private MessageProvider provider;

  @Override
  public void setMessageProvider(MessageProvider provider) {
    this.provider = provider;
  }

  @Override
  public void render() {
    String json = String.format("{\"message\":\"%s\"}", provider.getMessage());
    System.out.println(json);
  }

}
