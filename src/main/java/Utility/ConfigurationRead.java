package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigurationRead {

	private Properties properties;
	
	public ConfigurationRead()
	{
		File source = new File("./Configuration\\config.properties");
	
	
		try {
				FileInputStream fileInput= new FileInputStream(source); 
				properties = new Properties();
				properties.load(fileInput);
			}
		catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		
	}
	public String getBaseUrl() 
	{
		return properties.getProperty("baseUrl");
	}
	public String getBrowser()
	{
		return properties.getProperty("browser");
	}
	public String getTimeLimit()
	{
		return properties.getProperty("timeLimit");
	}
	public String getChromeBrowser()
	{
		return properties.getProperty("chromeBrowser");
	}
}
