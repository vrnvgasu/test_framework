package ru.edu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component // Создаем бин в контексте
public class JsonMessageRender implements MessageRender {

  private MessageProvider provider;

  @Override
  @Autowired // DI в сеттер другого бина
  public void setMessageProvider(MessageProvider provider) {
    this.provider = provider;
  }

  @Override
  public void render() {
    String json = String.format("{\"message\":\"%s\"}", provider.getMessage());
    System.out.println(json);
  }

}
