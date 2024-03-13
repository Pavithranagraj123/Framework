package Runner_Script;

import static org.testng.Assert.fail;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Generic.Base_class;
import POM.POM_Script;

public class RunnerClass extends Base_class {
	@Test(dataProvider = "test1")
	public void facelogin(String un,String pwd) 
	{
		
		POM_Script p1=new POM_Script(driver);
		p1.PassData(un);
		p1.PassData1(pwd);
		p1.PassData2();
		}
	@Test(dataProvider = "test1")
	public void facelogin1(String un,String pwd) 
	{
		
		POM_Script p1=new POM_Script(driver);
		p1.PassData(un);
		p1.PassData1(pwd);
		p1.PassData2();
		
	}
	@DataProvider(name="test1")
	public Object[][] createData1()
	{
		return new Object[][] {
			{"Pavithra","tanu"},{"sharath","tanu"},
		};
		}
	}
	


