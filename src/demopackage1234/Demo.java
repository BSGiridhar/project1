package demopackage1234;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo {

	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	@Test
	public void test() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		Thread.sleep(1000);
		driver.quit();
	}
	 
}
