package seleniumpac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class partial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.firefoxdriver().setup();
WebDriver dr = new FirefoxDriver();
dr.get("https://tutorialsninja.com/demo/index.php?");
dr.findElement(By.partialLinkText("Account")).click();
dr.findElement(By.partialLinkText("Register")).click();


dr.close();
	}

}
