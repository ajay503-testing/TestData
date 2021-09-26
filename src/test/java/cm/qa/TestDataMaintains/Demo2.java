package cm.qa.TestDataMaintains;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Demo2 {

	public static List<String> getValues(int rownum,String sheetname) throws IOException {

		File f = new File("C:\\Users\\Ajay\\Desktop\\New Microsoft Office Excel Worksheet (3).xlsx");

		FileInputStream stream = new FileInputStream(f);

		Workbook book = new XSSFWorkbook(stream);

		Sheet sheet = book.getSheet(sheetname);

		// int rownum = sheet.getLastRowNum();
		// System.out.println(rownum);

		List<String> list = new ArrayList();

		// for (int i = 0; i <= rownum; i++) {

		Row r = sheet.getRow(rownum);

		// System.out.println(r.getLastCellNum());
		for (int j = 0; j < r.getLastCellNum(); j++) {
			Cell c = r.getCell(j);

			// System.out.print(c.getStringCellValue()+" ");

			list.add(c.getStringCellValue());
		}
		System.out.println();

		return list;

	}
}
