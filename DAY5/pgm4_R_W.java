package DAY5;
import DAY4.student;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class pgm4_R_W {

	public student read_excel(int row) {

		student s1=new student();
		
		try {
			File f=new File("C:\\Users\\gaurav.patil\\Documents\\book1.xlsx");
			FileInputStream fis=new FileInputStream(f);
			XSSFWorkbook wb=new XSSFWorkbook(fis);
			XSSFSheet sh=wb.getSheet("sheet1");
		
			
			
			XSSFRow r=sh.getRow(row);
			XSSFCell c=r.getCell(0);
			s1.rollno=(int) c.getNumericCellValue();
			
			XSSFCell c1=r.getCell(1);
			s1.name=c1.getStringCellValue();
			
			XSSFCell c2=r.getCell(2);
			s1.m1=(int) c2.getNumericCellValue();
			
			XSSFCell c3=r.getCell(3);
			s1.m2=(int) c3.getNumericCellValue();
			return s1;
	
				
			}catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		return s1;
		
		
	}

	public void write_excel(student s,int row) {


		try {
			File f=new File("C:\\Users\\gaurav.patil\\Documents\\book1.xlsx");
			FileInputStream fis=new FileInputStream(f);
			XSSFWorkbook wb=new XSSFWorkbook(fis);
			XSSFSheet sh=wb.getSheet("sheet1");
			XSSFRow r=sh.getRow(row);
			XSSFCell c=r.createCell(4);
			
			c.setCellValue((double)s.avg);
			FileOutputStream fos=new FileOutputStream(f);
			wb.write(fos);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
