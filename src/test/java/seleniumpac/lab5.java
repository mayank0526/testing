package seleniumpac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class lab5 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.firefoxdriver().setup();
		
		WebDriver dr = new FirefoxDriver();
		dr.get("https://tutorialsninja.com/demo/index.php?");
		String title = dr.getTitle();
		System.out.println("Title is: " +title);
		
		dr.findElement(By.linkText("My Account")).click();
		dr.findElement(By.linkText("Register")).click();
		
		dr.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]")).click();
	String msg = 	dr.findElement(By.xpath("//*[@id=\"account-register\"]/div[1]")).getText()
;		
	System.out.println("Error is :" + msg);
	
	dr.close();
	}

}
