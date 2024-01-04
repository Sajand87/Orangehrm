package com.hrms.bdd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Select {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bulu9\\eclipse-workspace\\HRMS_BDD\\driver\\chromedriver.exe");
		ChromeOptions op=new ChromeOptions();
		op.setBinary("C:\\Users\\bulu9\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
		WebDriver driver=new ChromeDriver(op);
		driver.get("http://183.82.103.245/nareshit/login.php");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("nareshit");
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("nareshit");
		driver.findElement(By.xpath("//input[@type='Submit']")).click();
		
		
		
		
		
		

	}

}
