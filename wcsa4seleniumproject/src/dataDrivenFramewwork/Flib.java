package dataDrivenFramewwork;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {
	//to store generic Reuseable methods
	
	//read the data from excel sheet
	public String readExcelData(String excelPath,String sheetName, int rowCount, int cellCount) throws EncryptedDocumentException, IOException {
	FileInputStream fis = new FileInputStream(excelPath);//provide the excel path
	Workbook wb = WorkbookFactory.create(fis);//To read the data then to create WorkbookFactory
	Sheet sheet = wb.getSheet(sheetName);//To provide the sheet name
	Row row = sheet.getRow(rowCount);//To provide the Row no.
	Cell cell = row.getCell(cellCount);//To provide the cell no.
	String data = cell.getStringCellValue();//To get the value of data
	return data;
	}

	//to get row count
	public int rowCount(String excelPath, String sheetName) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis= new FileInputStream(excelPath);
	      Workbook wb = WorkbookFactory.create(fis);
	      Sheet sheet = wb.getSheet(sheetName);
	      int rc = sheet.getLastRowNum();
	      return rc;
	}
	

	//to write data in excel sheet
	public void writeExcelData(String excelPath, String sheetName, int rowCount, int cellCount,String data) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis= new FileInputStream(excelPath);
	      Workbook wb = WorkbookFactory.create(fis);
	      Sheet sheet = wb.getSheet(sheetName);
	      Row row= sheet.getRow(rowCount);
	      Cell cell = row.createCell(cellCount);
	      cell.setCellValue(data);
	}
	
	
}
