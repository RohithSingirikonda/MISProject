package com.temp;

import com.util.Xls_Reader;

public class DateTest {

	public static void main(String[] args) {
		
		Xls_Reader reader = new Xls_Reader("C:/Users/ramya/Desktop/SudhakarSirTraining/MISProject/src/main/java/com/temp/Temp.xlsx");
		int rowCount = reader.getRowCount("a");

		for (int rowNum = 2; rowNum <=rowCount; rowNum++) {
			
			String Name = reader.getCellData("a", "Date", rowNum);
			
			System.out.println(Name);
			
			reader.setCellData("b", "Date", rowNum, Name);
			System.out.println("Inserted Successfully");
		
		}		
		

	}

}
