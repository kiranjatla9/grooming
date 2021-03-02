package datadriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.CellAddress;

import Assignment.FileLib;

public class fileLib {

	private static final int CellAddress = 0;
	private String path;
	public String getCellData(String path,String SheetName,int row,int cell) throws EncryptedDocumentException, IOException  {
		FileInputStream fis = new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);
		String val = wb.getSheet(SheetName).getRow(row).getCell(cell).getStringCellValue();
		return val;
	}
//Get Row Count
	public int getrowcount(String path,String sheet) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(path);
        Workbook wb = WorkbookFactory.create(fis);
        int val = wb.getSheet(sheet).getLastRowNum();
			return val;
	}
	//write data into file
public void setData(String path,String sheet,int row,int cell,String data) throws EncryptedDocumentException, IOException {
FileInputStream fis=new FileInputStream(path);
Workbook wb=WorkbookFactory.create(fis);
 wb.getSheet(sheet).getRow(row).createCell(cell).setCellValue(data);
 FileOutputStream fos=new FileOutputStream(path);
 wb.write(fos);
 }
//Get Cell Count
public int getcellcount(String path,String sheet) throws EncryptedDocumentException, IOException {
	FileInputStream fis = new FileInputStream(path);
    Workbook wb = WorkbookFactory.create(fis);
    CellAddress val = wb.getSheet(sheet).getActiveCell();
		return CellAddress;
}}



