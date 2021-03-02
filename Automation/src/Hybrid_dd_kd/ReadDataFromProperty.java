package Hybrid_dd_kd;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadDataFromProperty {

	public static void main(String[] args) throws Throwable {
		FileInputStream fis=new FileInputStream("./data/config.properties");
		Properties prop=new Properties();
		prop.load(fis);
		String value = prop.getProperty("url","incorrect key");
		System.out.println(value);
	}

}
