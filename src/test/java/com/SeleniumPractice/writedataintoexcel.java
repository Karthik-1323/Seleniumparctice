package com.SeleniumPractice;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class writedataintoexcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\myfile.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("Data");
		XSSFRow row1 = sheet.createRow(0);
		    row1.createCell(0).setCellValue(1);
		    row1.createCell(1).setCellValue("Varun");
		    row1.createCell(2).setCellValue("EC");
		    row1.createCell(3).setCellValue(27);

		XSSFRow row2 = sheet.createRow(1);
		    row2.createCell(0).setCellValue(2);
		    row2.createCell(1).setCellValue("Karthik");
		    row2.createCell(2).setCellValue("EE");
		    row2.createCell(3).setCellValue(28);

		XSSFRow row3 = sheet.createRow(2);
		    row3.createCell(0).setCellValue(3);
		    row3.createCell(1).setCellValue("Jani");
		    row3.createCell(2).setCellValue("CE");
		    row3.createCell(3).setCellValue(29);

		XSSFRow row4 = sheet.createRow(3);
		    row4.createCell(0).setCellValue(4);
		    row4.createCell(1).setCellValue("Gopi");
		    row4.createCell(2).setCellValue("CS");
		    row4.createCell(3).setCellValue(30);

		workbook.write(file);
		workbook.close();
		file.close();
		System.out.println("File created");

	}
}
