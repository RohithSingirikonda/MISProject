package com.temp;

import java.util.ArrayList;

import org.testng.annotations.Test;
import com.util.Xls_Reader;

public class RetrievingData {
	
	static Xls_Reader reader;
	
	@Test
	public static ArrayList<Object[]> getDatafromExcel(){
		
			ArrayList<Object[]> myData = new ArrayList<Object[]>();
			
			
			try {
			  reader = new Xls_Reader("C:/Users/ramya/Desktop/Rohith/DataDrivenTesting/src/com/testdata/datafiles/MercuryRegiterPageTestData.xlsx");
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
			for (int rowNum =2 ; rowNum<=reader.getRowCount("logintestdata") ; rowNum++) {
				
				String firstName = reader.getCellData("RegisterData", "firstname", rowNum);
				String lastName = reader.getCellData("RegisterData", "lastname", rowNum);
				String phone = reader.getCellData("RegisterData", "phone", rowNum);
				String email = reader.getCellData("RegisterData", "email", rowNum);
				String address1 = reader.getCellData("RegisterData", "address1", rowNum);
				String address2 = reader.getCellData("RegisterData", "address2", rowNum);
				String city = reader.getCellData("RegisterData", "city", rowNum);
				String state = reader.getCellData("RegisterData", "state", rowNum);
				String pincode = reader.getCellData("RegisterData", "pincode", rowNum);
				String username = reader.getCellData("RegisterData", "username", rowNum);
				String password = reader.getCellData("RegisterData", "password", rowNum);
				String cpassword = reader.getCellData("RegisterData", "cpassword", rowNum);
				//String submit = reader.getCellData("", "", rowNum);
				
				Object[] obj = {firstName, lastName, phone, email, address1, address2, city, state, pincode, username, password, cpassword};
				myData.add(obj);
				
			}
			
			return myData;
	}
	
}
