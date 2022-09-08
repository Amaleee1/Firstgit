package com.mavenexcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.google.common.collect.Table.Cell;
import java.io.FileInputStream;

public class Mavenexcelproj {

	public static void readAllData() throws IOException {
		File f = new File("C:\\Users\\hp\\Seleniumclassnew\\mavenproj\\formaven.xlsx");
		// To read input file
		FileInputStream Fil = new FileInputStream(f);
		// WorkBook
		Workbook wrkbk = new XSSFWorkbook(Fil);
		Sheet sheetAt = wrkbk.getSheetAt(0);
		int numberOfRows = sheetAt.getPhysicalNumberOfRows();
		for (int i = 0; i < numberOfRows; i++) {
			Row row = sheetAt.getRow(i);
			int numberOfCells = row.getPhysicalNumberOfCells();
			for (int j = 0; j < numberOfCells; j++) {
				org.apache.poi.ss.usermodel.Cell cell = row.getCell(j);
				CellType cellType = cell.getCellType();
				if (cellType.equals(cellType.STRING)) {
					String value = cell.getStringCellValue();
					System.out.println(value);
				} else if (cellType.equals(cellType.NUMERIC)) {
					double value = cell.getNumericCellValue();
					int num = (int) value;
					System.out.println(num);

				}

			}

		}
	}

	public static void main(String[] args) throws IOException {
		readAllData();
	}

}
