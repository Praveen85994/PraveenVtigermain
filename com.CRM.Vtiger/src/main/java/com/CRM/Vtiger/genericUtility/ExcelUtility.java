package com.CRM.Vtiger.genericUtility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

public class ExcelUtility {
	/*this methodn will help us to fetch the data from excel sheet*/
	
	public void updateExcelData(String sheet,int row,int cell,String data) throws Throwable {
	FileInputStream fis=new FileInputStream(Ipathconstant.excelfilepath);
	Workbook wb=WorkbookFactory.create(fis);
	wb.getSheet(sheet).createRow(row).createCell(cell).setCellValue(data);
	FileOutputStream fos=new FileOutputStream(Ipathconstant.excelfilepath);
	wb.write(fos);
	wb.close();
	}
	public String getTheDataIntoExcel(String sheet,int row,int cell) throws Throwable {
		FileInputStream fis=new FileInputStream(Ipathconstant.excelfilepath);
		Workbook wb=WorkbookFactory.create(fis);
		Cell cel=wb.getSheet(sheet).getRow(row).getCell(cell);
		DataFormatter df=new DataFormatter();
		String value=df.formatCellValue(cel);
		return value;
		
	}
	/**give and fetch value with the help of data provider
	 * in excelsheet
	 * @throws IOException 
	 * @throws EncryptedDocumentException 
	 */

	@DataProvider
	public Object[][] getmultiple() throws EncryptedDocumentException, IOException{
		FileInputStream fs=new FileInputStream(Ipathconstant.excelfilepath);
		Workbook book=WorkbookFactory.create(fs);
		Sheet sh=book.getSheet("Sheet1");
		int lastrow=sh.getLastRowNum()+1;
		int lastcell=sh.getRow(0).getLastCellNum();
		//create object dataprovider to put data into data provider
		Object[][]data=new Object[lastrow][lastcell];
		//we fetch the data with help of for loop
		for(int i=0;i<lastrow;i++) {
			//for cell we are taking j
			for(int j=0;j<lastcell;j++) {
				data[i][j]=sh.getRow(i).getCell(j).getStringCellValue();
			}
		}return data;
		
		
	}
}
