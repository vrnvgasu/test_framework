package ru.edu.framework;

import java.io.FileInputStream;
import java.util.Properties;
import ru.edu.MessageProvider;
import ru.edu.MessageRender;

public class AppFramework {
  private final MessageProvider messageProvider;
  private final MessageRender messageRender;

  public AppFramework(String[] args) {
    Properties properties = new Properties();

    try(FileInputStream stream = new FileInputStream("config.properties")) {
      properties.load(stream);
    } catch (Exception e) {
      throw new RuntimeException("Failed to read properties error=" + e.toString(), e);
    }

    String renderClass = properties.getProperty("render.class");
    String providerClass = properties.getProperty("provider.class");

    try {
      // создаем классы из их полного имени через рефлексию
      messageRender = (MessageRender) Class.forName(renderClass).newInstance();
      messageProvider = (MessageProvider) Class.forName(providerClass).newInstance();

      // делаем зависимости внутри фреймворка
      messageRender.setMessageProvider(messageProvider);
    } catch (Exception e) {
      throw new RuntimeException("Failed to init framework error=" + e.toString(), e);
    }
  }

  public MessageProvider getMessageProvider() {
    return messageProvider;
  }

  public MessageRender getMessageRender() {
    return messageRender;
  }

}
