package property_utility;

import java.io.FileInputStream;
import java.util.Properties;

public class Property_utility 
{
		static String path="C:\\Users\\Abhishek\\Rest_assured_demo\\Test_data\\config.properties";
		public static String getdata(String key)
		{
			String value="";
			try 
			{
				FileInputStream fis= new FileInputStream(path);
				Properties prop= new Properties();
				prop.load(fis);
				value=prop.getProperty(key);
			} 
			catch (Exception e) 
			{
				// TODO: handle exception
			}
			return value;
			
		}

	

}
