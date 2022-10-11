package ru.edu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("classpath:beans.xml");

    MessageRender messageRender = context.getBean(MessageRender.class);
    messageRender.render();
  }

}
