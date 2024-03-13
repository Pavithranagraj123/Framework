package Runner_Script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parallel {
	WebDriver driver;
	@Parameters({"browser"})
	@Test
	public void exec(String browser)
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		if(browser.equals("firefox"))
		{
			driver=new FirefoxDriver();
			driver.get("https://www.facebook.com");
			driver.findElement(By.id("email")).sendKeys("ABC");
			driver.findElement(By.id("pass")).sendKeys("LMN");
			driver.findElement(By.name("login")).click();
			
		}
		else
		{
			driver=new ChromeDriver();
			driver.get("https://www.facebook.com");
			driver.findElement(By.id("email")).sendKeys("ABC");
			driver.findElement(By.id("pass")).sendKeys("LMN");
			driver.findElement(By.name("login")).click();
			
		}

    }

}
