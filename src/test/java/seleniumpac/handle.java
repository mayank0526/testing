package seleniumpac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.*;

public class handle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.firefoxdriver().setup();
	    WebDriver dr = new FirefoxDriver();
	    dr.get("https://letcode.in/window");
	    String sh = dr.getWindowHandle();
	    System.out.println(sh);
	    dr.findElement(By.id("multi")).click();
	    System.out.println(dr.getCurrentUrl());
	    
	    
	    Set<String> allwindows = dr.getWindowHandles();
	    System.out.println("Window handles are" +allwindows);
	    
	    for(String cw:dr.getWindowHandles())
		{
			dr.switchTo().window(cw);
			System.out.println("After switching url:"+dr.getCurrentUrl());
	    
	    
	}

}
	
}
