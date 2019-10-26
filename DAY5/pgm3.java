package DAY5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRichTextString;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class pgm3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try {
			File f=new File("C:\\Users\\gaurav.patil\\Documents\\book1.xlsx");
			FileInputStream fis=new FileInputStream(f);
			XSSFWorkbook wb=new XSSFWorkbook(fis);
			XSSFSheet sh=wb.getSheet("sheet1");
			//XSSFRow r=sh.getRow(1);
			//XSSFCell c=r.getCell(0);
			
			// Adding new row
			XSSFRow r=sh.createRow(3);
			XSSFCell c=r.createCell(0);
			
			//Adding new column in existing row
			
			XSSFRow r1=sh.getRow(0);
			XSSFCell c1=r1.createCell(1);
			
			
			c1.setCellValue("Selenium");
			FileOutputStream fos=new FileOutputStream(f);
			wb.write(fos);
			
			String str=c1.getStringCellValue();
			System.out.println(str);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
