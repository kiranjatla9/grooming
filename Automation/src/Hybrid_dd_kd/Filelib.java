package Hybrid_dd_kd;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Filelib {
		public String readpropdata(String path,String key) throws IOException {
			FileInputStream fis=new FileInputStream(path);
			Properties prop=new Properties();
			prop.load(fis);
			String propvalue = prop.getProperty(key,"incorrect key");
			return propvalue;
	}
}
