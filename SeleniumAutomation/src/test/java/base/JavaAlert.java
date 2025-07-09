package base;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaAlert {

	

			public static void main(String[] args) throws InterruptedException {
				

				WebDriver driver =WebDriverManager.chromedriver().create();
				driver.manage().window().maximize();
				driver.get("https://the-internet.herokuapp.com/javascript_alerts");
				

				driver.findElement(By.xpath("//ul//li[1]/button")).click();
				 Thread.sleep(2000);
				 /**
				  * For handling JS Alerts
				  * We have to switch to Alert and we can either accept it or dismiss it
				  * We can getText of alert as well
				  */
				Alert alert=  driver.switchTo().alert();
				String alertText=alert.getText();
				Thread.sleep(2000);
				/**
				 * For handling JS Alerts We have to switch to Alert and we can either accept it
				 * or dismiss it We can getText of alert as well
				 */
				Alert alert1 = driver.switchTo().alert();
				String alertText1 = alert1.getText();
				System.out.println(alertText1);

				alert1.accept();

				driver.findElement(By.xpath("//ul/li[2]/button")).click();
				Thread.sleep(1000);
				alert1.dismiss();

				driver.findElement(By.xpath("//ul/li[3]/button")).click();
				Thread.sleep(1000);
				alert1.sendKeys("My name is NISSY");
				alert1.accept();


				 alert1.accept();

				 driver.findElement(By.xpath("//ul/li[2]/button")).click();
				 Thread.sleep(1000);
				 alert1.dismiss();

				 driver.findElement(By.xpath("//ul/li[3]/button")).click();
				 
				 alert1.sendKeys("My name is NISSY");
				 alert1.accept();


				driver.quit();

			}

	}


