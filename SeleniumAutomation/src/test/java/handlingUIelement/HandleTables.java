package handlingUIelement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleTables {
public static void main(String[] args) {
		
	WebDriver driver =WebDriverManager.chromedriver().create();
		driver.manage().window().maximize();
		driver.get("https://selenium.qabible.in/table-pagination.php");
		
		List<WebElement> list = driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr[4]/td"));
	
		for(int i =0;i<list.size();i++) {
			System.out.println(list.get(i).getText());
		}
	
		
//		for(WebElement element : list) {
//			System.out.println(element.getText());
//		}
		
		driver.quit();
		

	}

}
