package ru.edu;

import ru.edu.framework.AppFramework;

public class App {

  public static void main(String[] args) {
    AppFramework appFramework = new AppFramework(args);

    MessageRender messageRender = appFramework.getMessageRender();
    messageRender.render();
  }

}
