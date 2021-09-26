package cm.qa.TestDataMaintains;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class UtilityClass {

	


	public static List<Object> getValues(int rownum) throws IOException {

		File f = new File("C:\\Users\\Ajay\\Desktop\\New Microsoft Office Excel Worksheet (3).xlsx");

		FileInputStream stream = new FileInputStream(f);

		Workbook book = new XSSFWorkbook(stream);

		Sheet sheet = book.getSheet("Sheet1");

		//int rownum = sheet.getLastRowNum();
		//System.out.println(rownum);
		
		List<Object> list=new ArrayList();
		
		
		
		//for (int i = 0; i <= rownum; i++) {

			Row r = sheet.getRow(rownum);

			//System.out.println(r.getLastCellNum());
			for (int j = 0; j < r.getLastCellNum(); j++) {
				Cell c = r.getCell(j);

				//System.out.print(c.getStringCellValue()+" ");
				         
				  //CellType type=c.getCellType();
				  
				
				
				if(c.getCellType().toString().equalsIgnoreCase("string"))
				{
					list.add(c.getStringCellValue());
				}
				else if(c.getCellType().toString().equalsIgnoreCase("numeric"))
				{
					    Double dou=c.getNumericCellValue();
					                 double d=dou.doubleValue();
				
					                            int i=(int)d;
					                                 list.add(Integer.valueOf(i));
					                            
				}
				//list.add(c.getStringCellValue());
			}
		  System.out.println();
		
		
		
		return list;
		
	}
	}
	


