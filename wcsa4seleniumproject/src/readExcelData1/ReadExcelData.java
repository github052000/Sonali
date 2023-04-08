package readExcelData1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcelData {
	
	
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
	FileInputStream fis = new FileInputStream("./data/TestData.xlsx");//provide the excel path
	Workbook wb = WorkbookFactory.create(fis);//To read the data then to create WorkbookFactory
	Sheet sheet = wb.getSheet("IPL");//To provide the sheet name
	Row row = sheet.getRow(1);//To provide the Row no.
	Cell cell = row.getCell(0);//To provide the cell no.
	String data = cell.getStringCellValue();//To get the value of data
	System.out.println(data);
	
}
}
