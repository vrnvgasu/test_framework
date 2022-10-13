package ru.edu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

  public static void main(String[] args) {
    // Создаем контекст из зависимости spring-context и будем считывать конфигурацию из ru.edu
    ApplicationContext context = new AnnotationConfigApplicationContext("ru.edu");

    // определили бин в конфигурации MyConfig
    MessageRender messageRender = context.getBean(MessageRender.class);
    messageRender.render();
  }

}
