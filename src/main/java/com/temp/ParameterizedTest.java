package com.project;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParameterizedTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver","C:\\Softwares\\Extracted Files\\chromedriver_win32 new\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		//driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		
		//To Read Data from Excel File
		Xls_Reader reader = new Xls_Reader("C:/Users/ramya/Desktop/Rohith/DataDrivenTesting/src/com/testdata/datafiles/FBLoginTestData.xlsx");

		int rowCount = reader.getRowCount("logintestdata");
		
		reader.addColumn("logintestdata", "Status");  //creating the New column
		
		
		for (int rowNum = 2; rowNum <=rowCount; rowNum++) {
			
			System.out.println("\nEntering New Data:");
			
			
			String email = reader.getCellData("logintestdata", "email", rowNum);
			System.out.println(email);
			
			String pass = reader.getCellData("logintestdata", "pass", rowNum);
			System.out.println(pass);
			
			driver.findElement(By.id("email")).clear();
			driver.findElement(By.id("email")).sendKeys(email);
			
			driver.findElement(By.id("pass")).clear();
			driver.findElement(By.id("pass")).sendKeys(email);
		
			//Writes the data into cells
			reader.setCellData("logintestdata", "Status", rowNum, "Pass"); 
			Thread.sleep(1000);
			
		}
		
		driver.close();
	}

}
