package Runner_Script;

import org.testng.annotations.Test;

import Generic.Base_class;
import Generic.excelclass;
import POM.POM_Script;

public class Runner1 extends Base_class {
	@Test(dataProvider = "")
	public void read()
	{
		POM_Script p1=new POM_Script(driver);
		p1.PassData(excelclass.getdata("Sheet1", 0, 0));
		p1.PassData1(excelclass.getdata("Sheet1", 0, 1));
		p1.PassData2();
	}

}
