package Utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class FetchProp {
	@Test
	public static String fetchurl() throws FileNotFoundException, IOException
	{
		Properties p=new Properties();
		p.load(new FileInputStream("./PropertyFile.properties"));
		String val=p.getProperty("baseURL");
		return val;
	}

}
