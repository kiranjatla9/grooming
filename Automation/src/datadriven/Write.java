package datadriven;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

public class Write {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
	
	fileLib f=new fileLib();
	f.setData("E:\\sel\\Automation\\data\\input.xlsx","sheet5",0,0,"valB");
	}
}
