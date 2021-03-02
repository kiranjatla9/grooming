package datadriven;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

public class ValidLogin {

	public static void main(String[] args) throws EncryptedDocumentException, IOException { 
		fileLib flib=new fileLib();
		String val = flib.getCellData("E:\\sel\\Automation\\data\\input.xlsx","sheet1",1,1);
		System.out.println(val);
		

	}

}
