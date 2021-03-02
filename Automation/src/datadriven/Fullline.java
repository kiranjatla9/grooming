package datadriven;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

public class Fullline {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		 fileLib flib = new fileLib();
		  int rc= flib.getrowcount("E:\\sel\\Automation\\data\\input.xlsx","sheet1");
//		  System.out.println(rc);
		  for(int i=0;i<=rc;i++)
		  {
			  String valG=flib.getCellData("E:\\sel\\Automation\\data\\input.xlsx","sheet1",i,1);
			  System.out.println(valG);
			  flib.setData("E:\\sel\\Automation\\data\\input.xlsx","sheet6",i,0,valG);
		  }
		  for(int j=0;j<=rc;j++) {
			  String valB=flib.getCellData("E:\\sel\\Automation\\data\\input.xlsx","sheet1",j,0);
			  System.out.println(valB);
			  flib.setData("E:\\sel\\Automation\\data\\input.xlsx","sheet6",j,1,valB);
		  }

	}

}
