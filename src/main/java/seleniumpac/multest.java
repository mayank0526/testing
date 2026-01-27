package seleniumpac;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class multest {
  @Test
  public void test1() {
	 WebDriverManager.firefoxdriver()
.setup();
	WebDriver dr = new FirefoxDriver ();
	dr.get("https://www.amazon.com/");
	dr.quit();
  }
  @Test
  
  public void test2() {
	  WebDriverManager.edgedriver()
	  .setup();
	  	WebDriver dr = new EdgeDriver ();
	  	dr.get("https://www.flipkart.com/");
	  	dr.quit();
  }
  @Test
  public void test3() {
	  WebDriverManager.chromedriver()
	  .setup();
	  	WebDriver dr = new ChromeDriver ();
	  	dr.get("https://www.myntra.com/");
	  	dr.quit();
  }
  
}
