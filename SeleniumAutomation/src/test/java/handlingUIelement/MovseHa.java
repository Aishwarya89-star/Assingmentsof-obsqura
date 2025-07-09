package handlingUIelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MovseHa {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =WebDriverManager.chromedriver().create();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		Actions act=new Actions(driver);
		WebElement e=driver.findElement(By.xpath("//div[@class='H6-NpN _3N4_BX']/a"));
		e.click();
		act.moveToElement(e).build().perform();
		
		
		driver.quit();
	

	}

}
