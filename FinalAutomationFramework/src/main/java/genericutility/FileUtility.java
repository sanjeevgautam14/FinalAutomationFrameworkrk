package genericutility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * @author sanjeev
 */

public class FileUtility {
	/**
	 * This method is used to read the data from property file
	 * This method takes key as a parameter and returns value
	 * @param key
	 * @return
	 * @throws IOException 
	 */
	
	public String getDataFromProperty(String Key) throws IOException{
		FileInputStream fis=new FileInputStream("./src/test/resources/TestData/commondata.properties");
		Properties prop=new Properties();
		prop.load(fis);
		return prop.getProperty(Key);
		
	}

}
