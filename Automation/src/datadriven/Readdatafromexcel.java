package datadriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.imageio.stream.FileCacheImageInputStream;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Readdatafromexcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
FileInputStream fis = new FileInputStream("E:\\sel\\Automation\\data\\input.xlsx");
Workbook wb = WorkbookFactory.create(fis);
Sheet sh = wb.getSheet("sheet1");
Row r = sh.getRow(0);
Cell c = r.getCell(0);
String val = c.getStringCellValue();
System.out.println(val);
	}

}
