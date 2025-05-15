package com.actitime.generic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib {
	public String getPropertyData(String Key) throws IOException{
		FileInputStream fis=new FileInputStream("./commondata/Acticommondata.property");
		Properties p=new Properties();
		p.load(fis);
		String data=p.getProperty(Key);
		return data;
	}		
	public String getExcelData(String sheetName,int row,int cell) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./commondata/testscript.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		return wb.getSheet(sheetName).getRow(row).getCell(cell).getStringCellValue();
	}			
	public void setExcelData(String sheetName,int row,int cell,String value) throws IOException {
		FileInputStream fis=new FileInputStream("./commondata/testscript.xlsx");
		Workbook wb=WorkbookFactory .create(fis);
		wb.getSheet(sheetName).getRow(row).getCell(cell).setCellValue(value);
		FileOutputStream fos=new FileOutputStream("./commondata/testscript.xlsx");
		wb.write(fos);
	}	
	}

