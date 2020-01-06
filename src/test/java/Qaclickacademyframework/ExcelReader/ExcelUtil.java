package Qaclickacademyframework.ExcelReader;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ExcelUtil {
	
	
    static File f = new File("E:\\Workspace\\Qaclickacademyframework.Selenium\\src\\test\\java\\Qaclickacademyframework\\TestData\\Register-Login.xlsx");
	static	Workbook wb;
	static FileInputStream fis;
	
//	public static void main(String[] args) throws Exception {
//		readExcel("Register");
//	}
		
		
 @DataProvider(name="testData")
 public static Object[][] readExcel() throws Exception {
	        
	 Object[][] tabArray = null;
		try {
			fis = new FileInputStream(f);

			wb = new XSSFWorkbook(fis);

			Sheet sh = wb.getSheet("Register");

			int rowCount = sh.getLastRowNum();
		  //  System.out.println("Rows"+ rowCount );
			
		    int cellCount=sh.getRow(0).getLastCellNum();
		  //  System.out.println(cellCount);
		    
		    tabArray=new String[rowCount][cellCount];

			for (int i = 1; i <= rowCount; i++) {

				//static Row rw = sh.getRow(i);

				for (int j = 0; j < cellCount; j++) {
					
					tabArray[i-1][j]=sh.getRow(i).getCell(j).getStringCellValue();
					System.out.println(tabArray[i-1][j]);
			

				}
		
			}
			
			wb.close();
			}
			catch (IOException e) {
				
				e.printStackTrace();
				
			}
		
		return(tabArray);
		
		}
 

 }

