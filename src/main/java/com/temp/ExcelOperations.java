package com.temp;;

public class ExcelOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Xls_Reader reader = new Xls_Reader("C:/Users/ramya/Desktop/Rohith/Testing/src/com/testdata/datafiles/FBLoginTestData.xlsx");

		if(!reader.isSheetExist("NewSheet"))
		{
			reader.addSheet("NewSheet");
			System.out.println("New sheet created");
		}else {
			System.out.println("Sheet Already Exists");
		}
		
		//To get the count of Columns
		int colCount = reader.getColumnCount("logintestdata");
		System.out.println("\nTotal column count is = "+colCount);
		
		//To get the Rows Count
		int rowCount = reader.getRowCount("logintestdata");
		System.out.println("\nTotal Row Count is = "+rowCount+"\n");
	
		System.out.println(""+reader.getCellRowNum("logintestdata", "email", "ROHITH"));
		System.out.println(""+reader.getCellRowNum("logintestdata", "pass", "test123"));

	}

}
