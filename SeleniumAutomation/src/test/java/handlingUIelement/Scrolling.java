package handlingUIelement;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scrolling {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =WebDriverManager.chromedriver().create();
		driver.manage().window().maximize();
		driver.get("https://www.obsqurazone.com/");
		
	
		JavascriptExecutor js= (JavascriptExecutor)driver;
		
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,3500);");
		
		Thread.sleep(2000);
		WebElement desiredSection=driver.findElement(By.cssSelector("[class='home-sec2-head-h2']"));
		js.executeScript("arguments[0].scrollIntoView(true)", desiredSection);

	}

}
