package seleniumpac;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class pt2 {
  @Test
  public void test4() {
	 
	  WebDriverManager.firefoxdriver()
	  .setup();
	  	WebDriver dr = new FirefoxDriver ();
	  	dr.get("https://www.youtube.com/");
	  	dr.quit();
  }
}
