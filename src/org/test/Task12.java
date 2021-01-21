package org.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task12 {
public static void main(String[] args) {
	

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sathish\\eclipse-workspace\\SeleniumDay9\\driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://output.jsbin.com/osebed/2");
	
	WebElement fruits = driver.findElement(By.id("fruits"));
	
	Select s = new Select(fruits);
	List<WebElement> options = s.getOptions();
	
	for (int i = 0; i < options.size(); i++) {
		if (i%2!=0) {
			s.selectByIndex(i);
		}
	}
	
	List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
	int a=	options.size()-allSelectedOptions.size();
	System.out.println(a);

}
}
