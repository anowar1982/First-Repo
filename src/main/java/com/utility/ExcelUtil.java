package com.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil {
	static File pathToFile;
	static File path;
	static FileInputStream FIS;
	static FileOutputStream FOS;
	static XSSFWorkbook WB;
	static XSSFSheet sheet;
	static int firstRow;
	static int lastRow;
	public static ArrayList<Object[]> getDataFromExcel(){
		ArrayList<Object[]> myData = new ArrayList<Object[]>();
		try {
			pathToFile = new File("E:\\Work\\mavenProjectFive\\TestData.xlsx");
			FIS = new FileInputStream(pathToFile);
			WB = new XSSFWorkbook(FIS);
			sheet = WB.getSheetAt(0);
			firstRow = sheet.getFirstRowNum();
			lastRow = sheet.getLastRowNum();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		for (int rownum = firstRow+1; rownum<= lastRow; rownum++){
			String firstName = sheet.getRow(rownum).getCell(0).getStringCellValue();
			String lastName = sheet.getRow(rownum).getCell(1).getStringCellValue();
			String Address1 = sheet.getRow(rownum).getCell(2).getStringCellValue();
			String Address2 = sheet.getRow(rownum).getCell(3).getStringCellValue();
			String zip = sheet.getRow(rownum).getCell(4).toString();
			//int zip = Integer.parseInt(zip);

			String country = sheet.getRow(rownum).getCell(5).getStringCellValue();
			String phone = sheet.getRow(rownum).getCell(6).getStringCellValue();
			Object ob[] = {firstName, lastName, Address1, Address2, zip, country, phone};
			myData.add(ob);
			//myData.add(new Object[]{firstName, lastName, Address1, Address2, zip, country, phone});
		}
		return myData;
	}
	
	
	public static String excelReaderString(String filePath, int SheetNo, int RowNumb, int cellNo ){			
		String result = null;
		try {
			path = new File(filePath);
			FIS = new FileInputStream(path);
			WB = new XSSFWorkbook(FIS);
			sheet = WB.getSheetAt(SheetNo);
			result = sheet.getRow(RowNumb).getCell(cellNo).getStringCellValue();
			//firstRow = sheet.getFirstRowNum();
			//lastRow = sheet.getLastRowNum();
			WB.close();
			FIS.close();
		} catch (Exception e) {
		}		
		return result;		
	}
	
	public static Integer excelReaderIntiger(String filePath, int SheetName, int RowNumb, int cellNo ){
		double result = 0;
		try {
			path = new File(filePath);
			FIS = new FileInputStream(path);
			WB = new XSSFWorkbook(FIS);
			sheet = WB.getSheetAt(SheetName);
			result = sheet.getRow(RowNumb).getCell(cellNo).getNumericCellValue();
			//firstRow = sheet.getFirstRowNum();
			//lastRow = sheet.getLastRowNum();
			WB.close();
			FIS.close();
		} catch (Exception e) {
		}		
		//int value = (int)result;
		//int rs = (int)value;
		int rs = (int)result;
		return rs;		
	}
	
	public static double excelReaderDouble(String filePath, int SheetName, int RowNumb, int cellNo ){
		double result = 0;
		try {
			path = new File(filePath);
			FIS = new FileInputStream(path);
			WB = new XSSFWorkbook(FIS);
			sheet = WB.getSheetAt(SheetName);
			result = sheet.getRow(RowNumb).getCell(cellNo).getNumericCellValue();
			//firstRow = sheet.getFirstRowNum();
			//lastRow = sheet.getLastRowNum();
			WB.close();
			FIS.close();
		} catch (Exception e) {
		}		

		return result;		
	}
	
	public static Integer getRowCount(String filePath, int SheetNo){		
		int rowCount = 0;
		try {
			path = new File(filePath);
			FIS = new FileInputStream(path);
			WB = new XSSFWorkbook(FIS);
			sheet = WB.getSheetAt(SheetNo);			
			rowCount = sheet.getLastRowNum();
			WB.close();
			FIS.close();
		} catch (Exception e) {
		}		
	
		return rowCount;		
	}
	
	
	
	
	public static void excelWriteString(String filePath, int SheetNo, int RowNumb, int cellNo, String cellValue ){		
		try {
			path = new File(filePath);
			FIS = new FileInputStream(path);			
			WB = new XSSFWorkbook(FIS);
			sheet = WB.getSheetAt(SheetNo);
			sheet.getRow(RowNumb).createCell(cellNo).setCellValue(cellValue);
			//firstRow = sheet.getFirstRowNum();
			//lastRow = sheet.getLastRowNum();
			FOS = new FileOutputStream(path);
			WB.write(FOS);
			WB.close();
			FIS.close();
			FOS.close();
		} catch (Exception e) {
		}				
	}
}
