package base;

import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Seleniumbasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=WebDriverManager.chromedriver().create();
		driver.manage().window().maximize();
		//to open any page
		driver.get("https://www.flipkart.com/");
		String title=driver.getTitle();
		System.out.println(title);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		//to refresh the page
		driver.navigate().refresh();
		driver.navigate().back();
		driver.navigate().forward();
		//close will close current window
		driver.close();
		//quit will close entire browser
		driver.quit();

	}

}
