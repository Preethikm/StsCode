package com.cg.demo.model;

public class ReadExcelDataUsingUtilClass
{
    public static void main(String args[]) throws Exception
    {
        ExcelApiTest eat = new ExcelApiTest("D:\\\\\\\\Users\\\\\\\\preekm\\\\\\\\Desktop/MyFirstExcel.xlsx");        
        System.out.println(eat.getCellData("MyFirstExcel","Datatype",2));
       /* System.out.println(eat.getCellData("Credentials","PassWord",2));
        System.out.println(eat.getCellData("Credentials","DateCreated",2));
        System.out.println(eat.getCellData("Credentials","NoOfAttempts",2));*/
    }
}
