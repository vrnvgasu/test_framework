package ru.edu.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import ru.edu.ArgumentMessageProvider;
import ru.edu.ConsoleMessageRender;
import ru.edu.DefaultMessageProvider;
import ru.edu.JsonMessageRender;
import ru.edu.MessageProvider;
import ru.edu.MessageRender;

@Configuration // аннотация для конфигурации
@PropertySource("classpath:application.properties") // файл с параметрами
public class MyConfig {

  @Value("${provider.default.args}")  // DI в свойство
  private String[] args;

  @Bean
  public MessageProvider messageProvider() {
//    MessageProvider provider = new DefaultMessageProvider();

    MessageProvider provider = new ArgumentMessageProvider(args); // DI в конструктор

    return provider;
  }

  /**
   * Вместо создания бина в конфигурации, можем указать у нужного класса тип @Component
   */
//  @Bean
//  public MessageRender  messageRender() {
//    MessageRender render = new JsonMessageRender();
//    render.setMessageProvider(messageProvider()); // DI в сеттер
//    return render;
//  }

}
