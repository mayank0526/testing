package seleniumpac;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class navigate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        WebDriverManager.firefoxdriver().setup();
        WebDriver dr = new FirefoxDriver();
        
        dr.get("https://www.amazon.in/");
        System.out.println("title is :" + dr.getTitle());
        
        dr.navigate().forward();
        System.out.println("title is :" + dr.getTitle());
		
        System.out.println("url is " + dr.getCurrentUrl());
        System.out.println(dr.getPageSource());
        
	}

}
