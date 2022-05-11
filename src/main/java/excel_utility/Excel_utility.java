package excel_utility;

import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_utility 
{
	public static String getdata(String path, int rownmbr, int colmnnmbr)
	{
		String data="";
		try {
			FileInputStream fis=new FileInputStream(path);
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sheet= wb.getSheetAt(0);
			data=sheet.getRow(rownmbr).getCell(colmnnmbr).getStringCellValue();
		} 
		catch (Exception e) {
			 System.out.println("issue in getdata "+e);
		}
		return data;
	}

}
