package handlingUIelement;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot {
public static void main(String[] args) throws IOException {
		

	WebDriver driver =WebDriverManager.chromedriver().create();
		driver.manage().window().maximize();
		driver.get("https://www.obsqurazone.com/");
		
		TakesScreenshot screenshot = (TakesScreenshot)driver; 
		File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
		
	    File destFile = new File(System.getProperty("user.dir")+"\\src\\test\\java\\handlingUIElements\\screenshot.png");
		
	    FileUtils.moveFile(srcFile, destFile);
		driver.quit();

	}


}
