package com.SeleniumPractice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readsingledatafrmexcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
	FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "\\testdata\\Book1.xlsx");	
	XSSFWorkbook workbook = new XSSFWorkbook(file);
	XSSFSheet sheet = workbook.getSheet("Sheet2");
	XSSFRow row = sheet.getRow(2);
	XSSFCell cell = row.getCell(2);

	System.out.println(cell.toString());
	
	
	workbook.close();
	file.close();

	}

}
