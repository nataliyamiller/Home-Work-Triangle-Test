import org.fluentlenium.adapter.FluentTest;
import static org.junit.Assert.*;
import org.junit.*;
import org.junit.ClassRule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import static org.assertj.core.api.Assertions.assertThat;

public class AppTest extends FluentTest {

  public WebDriver webDriver = new HtmlUnitDriver();
  public WebDriver getDefaultDriver() {
      return webDriver;
  }

  @ClassRule
  public static ServerRule server = new ServerRule();

  @Test
  public void rootTest() {
    goTo("http://localhost:4567/");
    assertThat(pageSource()).contains("Triangle Test!");
  }

  @Test
  public void usernamePage_takesInput() {
    goTo("http://localhost:4567/");
    fill("#username").with("nata");
    submit(".btn");
    assertThat(pageSource().contains("Triangle Test!"));
  }

  // @Test
  // public void resultPage_showsLength() {
  //   goTo("http://localhost:4567/home");
  //   fill("#length").with("2");
  //   fill("#width").with("2");
  //   fill("#height").with("8");
  //   submit(".btn");
  //   assertThat(pageSource().contains("triangle's length"));
  // }
  //
  // @Test
  // public void resultPage_showsTypeOfTriangleMessage() {
  //   goTo("http://localhost:4567/home");
  //   fill("#length").with("2");
  //   fill("#width").with("2");
  //   fill("#height").with("2");
  //   submit(".btn");
  //   assertThat(pageSource().contains("Triangle is Equilateral"));
  // }
}
