package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumLocators {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=WebDriverManager.chromedriver().create();
		driver.manage().window().maximize();
		//to open any page
		driver.get("https://www.saucedemo.com/");
		//sel supports multiple locators
		//By name
		//By id
		/**
		 * 
		 */
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		driver.findElement(By.className("submit-button" )).click();
		driver.findElement(By.id("react-burger-menu-btn")).click();
		//one element can have multiple classes
		Thread.sleep(1000);
		driver.findElement(By.linkText("About")).click();
		driver.navigate().back();
		driver.findElement(By.id("react-burger-menu-btn")).click();
		Thread.sleep(1000);
		driver.findElement(By.partialLinkText("Log")).click();
		driver.quit();
		

	}

}
