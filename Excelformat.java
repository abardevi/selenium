package fill.Water;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelformat {
	String filepath="C:\\Users\\vinishka pranav\\Desktop\\";
	String filename ="writefile.xlsx";
	String [] course= {"python","java","c#","selenium"};
	
	public void readwrite() throws IOException{
		File F= new File (filepath+filename);
		FileOutputStream fs= new FileOutputStream(F);
		XSSFWorkbook writeworkbook =new XSSFWorkbook();
		Sheet sheet= writeworkbook.createSheet("OUTPUT");
		int sizeofCourse=course.length;
		for (int i=0;i<sizeofCourse;i++) {
			Row eachRow =sheet.createRow(i);
			Cell eachcell =eachRow.createCell(0);
			eachcell.setCellValue(course[i]);
		}
	writeworkbook.write(fs);
	fs.close();
	System.out.println("write operations done");
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Excelformat ex = new Excelformat();
		ex.readwrite();
	}

}
