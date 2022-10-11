package ru.edu;

public class XmlMessageRender implements MessageRender {

  private MessageProvider provider;

  @Override
  public void setMessageProvider(MessageProvider provider) {
    this.provider = provider;
  }
  @Override
  public void render() {
     String xml = String.format("<render>%s</render>", provider.getMessage());
    System.out.println(xml);
  }

}
