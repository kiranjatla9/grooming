package Assignment;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
public class FileLib {

	public static String getpropkeyvalue(String path,String key) throws IOException {
		FileInputStream fis=new FileInputStream(path);
		Properties prop=new Properties();
		prop.load(fis);
		String propvalue = prop.getProperty(key,"incorrect key");
		return propvalue;

	}
	}

