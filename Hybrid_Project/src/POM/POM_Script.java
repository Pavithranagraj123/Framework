package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic.Base_page;

public class POM_Script extends Base_page {
	@FindBy(id="email")
	private WebElement uname;
	@FindBy(id="pass")
	private WebElement pname;
	@FindBy(name="login")
	private WebElement bname;
	//initilization
	public POM_Script(WebDriver driver)
	{
		super(driver);
	}
	//utilization
	public void PassData(String name)
	{
		uname.sendKeys(name);
		
	}
	public void PassData1(String pass)
	{
		pname.sendKeys(pass);
	}
	public void PassData2()
	{
		bname.click();
	}
}


