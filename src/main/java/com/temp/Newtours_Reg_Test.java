package com.temp;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

public class Newtours_Reg_Test {

	WebDriver driver;
	
	@BeforeTest
	public void setUp(){
		
		System.setProperty("webdriver.chrome.driver","C:\\Softwares\\Extracted Files\\chromedriver_win32 new\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("http://newtours.demoaut.com/mercuryregister.php");
		
	}
	
	@AfterTest
	public void logout(){
		
		System.out.println("Logout Successfull");
		driver.quit();
	}
	
	
	@DataProvider (name = "getData")
	public Iterator<Object[]> GetTestData() {
	
		ArrayList<Object[]> testData = RetrievingData.getDatafromExcel();
		return testData.iterator();
	}
	
	
	
	@Test(dataProvider="getData")
	public void FillRegPage(String firstName, String lastName, String phone, String email, String address1, String address2,
							String city, String pincode, String username, String password, String cpassword){
		
		driver.findElement(By.xpath("//input[@name='firstName']")).clear();
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("firstName");

		driver.findElement(By.xpath("//input[@name='lastName']")).clear();
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("lastName");

		driver.findElement(By.xpath("//input[@name='phone']")).clear();
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("phone");
		
		driver.findElement(By.xpath("//input[@name='userName']")).clear();
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("email");
		
		driver.findElement(By.xpath("//input[@name='address1']")).clear();
		driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("address1");
		
		driver.findElement(By.xpath("//input[@name='address2']")).clear();
		driver.findElement(By.xpath("//input[@name='address2']")).sendKeys("address2");
		
		driver.findElement(By.xpath("//input[@name='city']")).clear();
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("city");
		
		driver.findElement(By.xpath("//input[@name='postalCode']")).clear();
		driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("pincode");
		
		driver.findElement(By.xpath("//input[@name='email']")).clear();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("username");
		
		driver.findElement(By.xpath("//input[@name='password']")).clear();
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("password");
		
		driver.findElement(By.xpath("//input[@name='confirmPassword']")).clear();
		driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("cpassword");
	
	}
	

	
	
	
	
	
}
