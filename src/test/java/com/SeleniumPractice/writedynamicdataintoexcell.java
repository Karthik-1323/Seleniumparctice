package com.SeleniumPractice;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class writedynamicdataintoexcell {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir") + "\\testdata\\myfile1.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("Dynamicdata");
		Scanner sc = new Scanner(System.in);
		System.out.println("rows");
		int totalrows = sc.nextInt();
		System.out.println("col");
		int totalcol = sc.nextInt();

		for (int r = 0; r <= totalrows; r++) {

			XSSFRow currentrow = sheet.createRow(r);

			for (int c = 0; c <= totalcol; c++) {

				XSSFCell cell = currentrow.createCell(c);
				cell.setCellValue(sc.next());

			}
		}

		workbook.write(file);
		workbook.close();
		file.close();
		System.out.println("File created");

	}

}
