package com.cg.demo.model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import javax.swing.plaf.synth.SynthStyle;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Employee {
	public static void main(String args[]) throws Exception
    {
        
		int rowNum=0;
		int colNum=0;
		FileInputStream fis = new FileInputStream("D:\\Users\\preekm\\Desktop/MyFirstExcel.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet sheet = workbook.getSheet(0);
        XSSFRow row = sheet.getRow(0);
        System.out.println(sheet.getCellComment(1, 1));
        
      
        
        

		
		
	}
}

	
	
	
		
	
	
	


