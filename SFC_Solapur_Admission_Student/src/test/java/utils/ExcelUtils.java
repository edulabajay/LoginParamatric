package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.fasterxml.jackson.databind.exc.InvalidFormatException;

import base.Basetest;


import java.io.File;


public class ExcelUtils extends Basetest {
	
	public static long Page_LOAD_TIMEOUTS= 250;
	public static long IMPLICIT_WAITS = 100;

    public static String TestData_login_path = "C:\\Users\\info\\eclipse_Nwe_Version_Mumbai\\SFC_Solapur_Admission_Student\\src\\test\\java\\testdata\\TestData.xlsx";
    static Workbook book;
    static Sheet sheet;
    static JavascriptExecutor js;
    static WebDriver driver;
    
    
    
    public void switchToFrame() {
        driver.switchTo().frame("mainpanel");
    }

    public static Object[][] getTestData(String sheetName) throws InvalidFormatException {
        FileInputStream file = null;
        try {
            file = new FileInputStream(new File(TestData_login_path));
            book = WorkbookFactory.create(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException("Excel file not found: " + TestData_login_path);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Error reading Excel file: " + TestData_login_path);
        } finally {
            try {
                if (file != null) {
                    file.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        sheet = book.getSheet(sheetName);
        if (sheet == null) {
            throw new RuntimeException("Sheet not found: " + sheetName);
        }

        int rowCount = sheet.getLastRowNum() + 1; // +1 because getLastRowNum() is zero-based
        int colCount = sheet.getRow(0) != null ? sheet.getRow(0).getLastCellNum() : 0;

        Object[][] data = new Object[rowCount - 1][colCount]; // Exclude header row

        for (int i = 1; i < rowCount; i++) { // Start from 1 to skip header row
            Row row = sheet.getRow(i);
            if (row == null) {
                continue; // Skip empty rows
            }
            for (int k = 0; k < colCount; k++) {
                Cell cell = row.getCell(k);
                if (cell == null) {
                    data[i - 1][k] = ""; // Set default value for null cells
                } else {
                    switch (cell.getCellType()) {
                        case STRING:
                            data[i - 1][k] = cell.getStringCellValue();
                            break;
                        case NUMERIC:
                            data[i - 1][k] = cell.getNumericCellValue();
                            break;
                        case BOOLEAN:
                            data[i - 1][k] = cell.getBooleanCellValue();
                            break;
                        case FORMULA:
                            data[i - 1][k] = cell.getCellFormula();
                            break;
                        default:
                            data[i - 1][k] = ""; // Handle other cell types if needed
                            break;
                    }
                }
            }
        }

        return data;
    }

    
}
