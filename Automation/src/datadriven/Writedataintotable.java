package datadriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import Assignment.FileLib;
		public class Writedataintotable {
			public static void main(String[] args) throws EncryptedDocumentException, IOException {
fileLib flib = new fileLib();
flib.setData("E:\\sel\\Automation\\data\\input.xlsx","sheet2",4,5,"raghav");
 System.out.println("done");
			}

		}
		