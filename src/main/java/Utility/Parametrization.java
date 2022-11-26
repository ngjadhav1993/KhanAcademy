package Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Parametrization {

	public static String getexceldata(String sheetName ,int row,int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream file = new FileInputStream("D:\\workspace\\KhanAcademy\\src\\test\\resources\\Excel Worksheet.xlsx");
		String value =WorkbookFactory.create(file).getSheet(sheetName).getRow(row).getCell(cell).getStringCellValue();
		return value ;
	}
}
