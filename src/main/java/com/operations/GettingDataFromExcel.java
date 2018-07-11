package com.operations;

import org.apache.commons.lang3.ObjectUtils.Null;

import com.util.Xls_Reader;

public class GettingDataFromExcel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(System.getProperty("user.dir"));
		//Xls_Reader reader = new Xls_Reader(System.getProperty("user.dir")+"/src/main/java/com/excel/MISData.xlsx");
		
		Xls_Reader reader = new Xls_Reader("C:/Users/ramya/Desktop/SudhakarSirTraining/MISProject/src/main/java/com/excel/MISData.xlsx");
		int rowCount = reader.getRowCount("login_details");

		for (int rowNum = 2; rowNum <=rowCount; rowNum++) {
		
			String Name = reader.getCellData("login_details", "Name", rowNum);
			String Tkt = reader.getCellData("login_details", "Ticket", rowNum);
			
			System.out.println(Name+" "+Tkt);
			
				reader.setCellData("test_data", "Name", rowNum, Name);
				reader.setCellData("test_data", "Ticket", rowNum, Tkt);
				System.out.println("Inserted Successfully");
		//test_data
		}		
		
		
	}
	
}
