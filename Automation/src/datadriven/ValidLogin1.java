package datadriven;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

public class ValidLogin1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException { 
			fileLib flib=new fileLib();
			for(int i=0;i<=8;i++) {
			String val = flib.getCellData("E:\\\\sel\\\\Automation\\\\data\\\\input.xlsx","Sheet2",i,1);
			System.out.println(val);
			}}}
