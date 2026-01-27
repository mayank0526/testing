package seleniumpac;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class tc_1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.google.com/");
		WebElement search=driver.findElement(By.id("APjFqb"));
		search.sendKeys("Test Methods");
		search.submit();
		
		System.out.println("Title is :" +driver.getTitle());
		driver.close();
		// WebElement searchbutton=driver.findElement(By.name("btnK"));
		//searchbutton.click();
		
WebDriverManager.firefoxdriver().setup();
		
		WebDriver dr = new FirefoxDriver();
		dr.get("https://tutorialsninja.com/demo/index.php?");
		WebElement sr=dr.findElement(By.id("APjFqb"));
		sr.sendKeys("Test Methods");
		sr.submit();

		
		
		
		
	}

}
