package Generic;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import POM.POM_Script;
import Utils.FetchProp;

public class Base_class implements FrameWorkConstants {
	public WebDriver driver;
	@BeforeMethod
	public void openappl() throws FileNotFoundException, IOException
	{
		System.setProperty(c_key,c_value);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get(FetchProp.fetchurl());
	}
	@AfterMethod
	public void closeappl(ITestResult res)
	{
		if(ITestResult.FAILURE==res.getStatus())
		{
			CSSclass.get_photo(driver);
		}
		driver.close();
		
	}

}
