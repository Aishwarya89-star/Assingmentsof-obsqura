package handlingUIelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Learnstaticdropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=WebDriverManager.chromedriver().create();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/dropdown");
		WebElement element=driver.findElement(By.xpath("//select[@id='dropdown']"));
		Select dp=new Select(element);
		//Thread.sleep(1000);
		dp.selectByVisibleText("Option 1");
		Thread.sleep(1000);
		dp.selectByVisibleText("Option 2");
		Thread.sleep(1000);
		dp.selectByIndex(1);
		Thread.sleep(1000);
		dp.selectByValue("1");
		driver.quit();
	

	}

}
