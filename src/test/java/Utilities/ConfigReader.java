package Utilities;



import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

	
	public class ConfigReader {
		
	//This method is used to load the properties from the config file
	public static Properties init_prop() throws IOException
	{	
		FileInputStream ip = new FileInputStream("./src/test/resources/Config/config.properties");

	  Properties prop=new Properties();
	 
			prop.load(ip);
		
		
		return prop;
	}}