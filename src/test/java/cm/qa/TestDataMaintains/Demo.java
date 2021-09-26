package cm.qa.TestDataMaintains;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Demo {

	public static void main(String[] ar) throws IOException {

		File f = new File("C:\\Users\\Ajay\\Desktop\\New Microsoft Office Excel Worksheet (3).xlsx");

		FileInputStream stream = new FileInputStream(f);

		Workbook book = new XSSFWorkbook(stream);

		Sheet sheet = book.getSheet("Sheet1");

		int rownum = sheet.getLastRowNum();
		System.out.println(rownum);

		for (int i = 0; i <= rownum; i++) {

			Row r = sheet.getRow(i);

			//System.out.println(r.getLastCellNum());
			for (int j = 0; j < r.getLastCellNum(); j++) {
				Cell c = r.getCell(j);

				          
				System.out.print(c.getStringCellValue()+" ");
			}
		  System.out.println();
		}

		/*
		 * Row row=sheet.getRow(1);
		 * 
		 * Cell c=row.getCell(0); String str1=c.getStringCellValue();
		 * 
		 * System.out.println(str1);
		 * 
		 */

	}

}
