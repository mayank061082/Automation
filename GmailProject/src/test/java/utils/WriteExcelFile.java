package utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcelFile {
	
	public static void writeValuesToExcel(String[] info ) {
		
		try {	
			FileOutputStream fos = new FileOutputStream(new File(".\\testData\\gmail.xlsx"));
			XSSFWorkbook wb = new XSSFWorkbook();
			XSSFSheet sheet = wb.createSheet("GmailInfo");
			XSSFRow row = sheet.createRow(0);
			for(int i=0; i<info.length; i++) {
			row.createCell(i).setCellValue(info[i]);			
			System.out.println(info[i]);
			}
			wb.write(fos);
			fos.close();
			wb.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}	
}
