package com.Swag_Lab_Genericlibrary;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class File_Library {
	public String readPropertyFile(String key) throws IOException {
		FileInputStream fis=new FileInputStream("./testdata/slab.property");
		Properties p=new Properties();
		p.load(fis);
		String value = p.getProperty(key);
		return value;
	}
	public String readExcelFile(String sheetname,int r,int c) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./testdata/TD.xlsx");
		Workbook work = WorkbookFactory.create(fis);
		String data = work.getSheet(sheetname).getRow(r).getCell(c).getStringCellValue();
		return data;
	}
	public void updateExceldata(String sheetname,int r, int c, String udata) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./testdata/TD.xlsx");
		Workbook work = WorkbookFactory.create(fis);
		work.getSheet(sheetname).getRow(r).getCell(c).setCellValue(udata);
		FileOutputStream fos=new FileOutputStream("./testdata/TD.xlsx");
		work.write(fos);
	}
}
