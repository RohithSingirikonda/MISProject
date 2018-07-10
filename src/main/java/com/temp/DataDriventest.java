package com.project;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class DataDriventest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Xls_Reader reader = new Xls_Reader("C:/Users/ramya/Desktop/Rohith/DataDrivenTesting/src/com/testdata/datafiles/FBLoginTestData.xlsx");

		String email = reader.getCellData("logintestdata", "email",2 );
		System.out.println(email);
		
		String pass = reader.getCellData("logintestdata", "pass",2 );
		System.out.println(pass);
		
		System.setProperty("webdriver.chrome.driver","C:\\Softwares\\Extracted Files\\chromedriver_win32 new\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		//driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("pass")).sendKeys(email);
		//driver.findElement(By.id("loginbutton")).click();
		
		driver.close();
		

	}

}
