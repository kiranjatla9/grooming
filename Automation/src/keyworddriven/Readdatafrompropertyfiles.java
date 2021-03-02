package keyworddriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Readdatafrompropertyfiles {

	public static void main(String[] args) throws IOException{
		//open the file in read mode
		FileInputStream fis=new FileInputStream("./data/config.properties");
		//Create an object of properties class
		Properties prop=new Properties();
		//keep the file ready for reading
		prop.load(fis);
		//give the key to get the value
//		String value = prop.getProperty("institute");
		String value = prop.getProperty("institute","incorrect key");
//print it
System.out.println(value);
	}
}
