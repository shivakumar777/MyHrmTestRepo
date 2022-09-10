package com.hrm.utils;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * @author ExcelUtils
 *
 */
public class ExcelUtils {

	public static FileInputStream fis = null;
	public static XSSFWorkbook workbook = null;
	public static XSSFSheet sheet = null;
	public static String rowData;

	/**
	 * @author ExcelUtils constructor for excel file reading and workbook initiation
	 *
	 */
	public ExcelUtils() {
		try {
			fis = new FileInputStream("src\\test\\resource\\testdata\\TestData.xlsx");

			workbook = new XSSFWorkbook(fis);

		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	/**
	 * @author Anil
	 * This method will return the given sheet details
	 * @param sheetName for sheet name in the excel file
	 * 
	 * @return sheet for returning sheet content for the given sheet name
	 */
	public static XSSFSheet getDataFromExcelUsingSheetName(String sheetName) {
		try {

			sheet = workbook.getSheet(sheetName);
		} catch (Exception e) {

			e.printStackTrace();
		}
		return sheet;
	}

	/**
	 * @author Anil
	 * @param sheetName for sheet name in the excel file
	 * @param rowNum    row index of the given sheet
	 * @param cellNum   cell index of the given sheet
	 * 
	 * @return sheet for returning sheet content for the given sheet name
	 */
	public String getDataFromExcelByRow(String sheetName, int rowNum, int cellNum) {
		try {

			sheet = workbook.getSheet(sheetName);
			
			Row row = sheet.getRow(rowNum);
			
			Cell cell= row.getCell(cellNum);
			
	            switch (cell.getCellType()) {
	            case Cell.CELL_TYPE_STRING:
	            	String rowStringData =    row.getCell(cellNum).getStringCellValue() ;
	            	rowData = rowStringData;
	                    break;

	            case Cell.CELL_TYPE_NUMERIC:
	            	int rowIntData =    (int) row.getCell(cellNum).getNumericCellValue();	            	
	            	rowData = String.valueOf(rowIntData);
	                    break;
	            }
			//rowData = sheet.getRow(rowNum).getCell(cellNum).getStringCellValue();
		} catch (Exception e) {

			e.printStackTrace();
		}
		return rowData;
	}

	// for code checking
	public static void main(String[] args) {

		ExcelUtils excelUtils = new ExcelUtils();
		// String username = ExcelUtils.getDataFromExcelUsingSheetName("loginDetails").
		String username = excelUtils.getDataFromExcelByRow("loginDetails", 3, 0);
		//System.out.println("username : " + username);
		Log.info("username : " + username);
	}

}
