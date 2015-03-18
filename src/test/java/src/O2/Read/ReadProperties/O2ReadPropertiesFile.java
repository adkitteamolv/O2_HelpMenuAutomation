package src.O2.Read.ReadProperties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class O2ReadPropertiesFile {
	
	static Properties prop;
	
	
	public static Properties readProperties() throws FileNotFoundException{
		
		try {
			FileInputStream in= new FileInputStream("C:\\Users\\318759\\workspace\\O2_HelpSection_Automation\\src\\config.properties");
			
			prop=new Properties();
			prop.load(in);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return prop;
		
	}

}
