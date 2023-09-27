package fill.Water;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {
	String filepath= "C:\\Users\\vinishka pranav\\Desktop\\";
	String filename="silver.xlsx";
	String sheetname="jobs";
	
	public void readData() throws IOException
	{
	File f= new File (filepath+filename);
	FileInputStream fs =new FileInputStream(f);
	XSSFWorkbook excelbook= new XSSFWorkbook (fs);
	
	Sheet wbsheet=excelbook.getSheet(sheetname);
	
	int totalrows=wbsheet.getPhysicalNumberOfRows();
	for (int i=0;i<totalrows;i++) {
		
		Row eachrow= wbsheet.getRow(i);
		int totalcolumn=eachrow.getLastCellNum();
		
		for (int j=0;j<totalcolumn;j++) {
			Cell eachcell= eachrow.getCell(j);
			System.out.print(eachcell.getStringCellValue());
			System.out.print("\t");
		}
	System.out.println("");}
	excelbook.close();}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
Excel ex= new Excel();
ex.readData();
	}

}
