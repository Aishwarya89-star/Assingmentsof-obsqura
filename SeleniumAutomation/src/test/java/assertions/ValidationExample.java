package assertions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ValidationExample {
	@Test
	public void seleniumValidation() {

		WebDriver driver =WebDriverManager.chromedriver().create();		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");

		String actualTitle = driver.getTitle();

		Assert.assertEquals(actualTitle, "Demo Web Shop");

		boolean isEnabled = driver.findElement(By.cssSelector("[value='Subscribe']")).isEnabled();
		

		System.out.println(isEnabled);
		Assert.assertTrue(isEnabled);
		driver.quit();
	}
}

