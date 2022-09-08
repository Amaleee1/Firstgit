package com.mavenexcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Datadriven_create_cell {

	public static void writedata() throws IOException {
		File f = new File("C:\\Users\\hp\\Seleniumclassnew\\mavenproj\\formaven.xlsx");
		// To read input file
		FileInputStream Fil = new FileInputStream(f);
		// WorkBook
		Workbook wrkbk = new XSSFWorkbook(Fil);
		Sheet createSheet = wrkbk.createSheet("Data");
		Row createRow = createSheet.createRow(0);
		Cell createCell = createRow.createCell(0);
		createCell.setCellValue("AmalJancy");
		wrkbk.getSheet("Data").getRow(0).createCell(1).setCellValue("123");
		wrkbk.getSheet("Data").createRow(1).createCell(0).setCellValue("Stevan");
		wrkbk.getSheet("Data").getRow(1).createCell(1).setCellValue("456");
		wrkbk.getSheet("Data").createRow(2).createCell(0).setCellValue("Snowfia");
		wrkbk.getSheet("Data").getRow(2).createCell(1).setCellValue("555");
		FileOutputStream excel = new FileOutputStream(f);
		wrkbk.write(excel);
		//wrkbk.close();
	}
	public static void main(String[] args) throws IOException {
		writedata();
	}
	
	
	
	
	
	
}
