package com.tdd.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil {

	public static String Test_Data_Sheet = "./src/test/resources/com/tdd/testdata/TDD.xlsx";
	private static Workbook book;
	private static Sheet sheet;

	public static Object[][] getTestData(String sheetName) {

		Object data[][] = null;

		try {
			FileInputStream fp = new FileInputStream(Test_Data_Sheet);
			try {
				book = WorkbookFactory.create(fp);
				sheet = book.getSheet(sheetName);

				data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
				for (int i = 0; i < sheet.getLastRowNum(); i++) {

					for (int j = 0; j < sheet.getRow(0).getLastCellNum(); j++) {

						data[i][j] = sheet.getRow(i + 1).getCell(j).toString();
					}
				}

			} catch (InvalidFormatException e) {

				e.printStackTrace();
			} catch (IOException e) {

				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

		return data;

	}

	public static String readExcelData() {

		String mobileNumber = null;
		Object data[][] = null;

		try {
			FileInputStream fp = new FileInputStream(Test_Data_Sheet);
			XSSFWorkbook workbook1 = new XSSFWorkbook(fp);
			XSSFSheet sheet1 = workbook1.getSheetAt(0);

			Row row = sheet1.getRow(1);
			Cell cell = row.getCell(0);
			mobileNumber = cell.getStringCellValue();
		}

		catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
		return mobileNumber;

	}
}
