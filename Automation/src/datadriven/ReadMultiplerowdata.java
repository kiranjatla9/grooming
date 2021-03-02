package datadriven;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

public class ReadMultiplerowdata {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		 fileLib flib = new fileLib();
		  int rc= flib.getrowcount("E:\\sel\\Automation\\data\\input.xlsx","sheet1");
		  System.out.println(rc);
		  for(int i=0;i<=rc;i++)
		  {
			  String val=flib.getCellData("E:\\sel\\Automation\\data\\input.xlsx","sheet1",i,1);
			  System.out.println(val);
		  }

		 
	}

}

