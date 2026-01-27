package seleniumpac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class elementss {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.firefoxdriver().setup();
        WebDriver dr = new FirefoxDriver();
        dr.get("https://www.amazon.com");

        
        Thread.sleep(5000);
        List<WebElement>links = dr.findElements(By.tagName("a"));
        System.out.println(links.size());

        
        List<WebElement> links1=dr.findElements(By.tagName("a"));
		
		for(WebElement link: links1)
		{
			System.out.println(link.getText());
		}
        }
    
	}


