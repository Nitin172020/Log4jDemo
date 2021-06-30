package com.LOg4jDemo;

import com.LOg4jDemo.*;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Log4jDemo {

	public static void main(String[] args) {

		// System.out.println(System.getProperty("user.dir"));

		// D:\Data\Project\Log4jDemo\Drivers\chromedriver.exe
		DOMConfigurator.configure("log4j.xml");
		LoggerClass.info("Seting Up the chrome browser to test");
		System.setProperty("webdriver.chrome.driver", "D:\\Data\\Project\\Log4jDemo\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		LoggerClass.info("Loded the log4j.xml file");
		
		
		LoggerClass.info("Launched the calcultor app");
		driver.get("http://www.calculator.net/");
		
		LoggerClass.info("Finding the Logo and checking if displayed");
		boolean visibility_status=driver.findElement(By.xpath("//div[@id='logo']")).isDisplayed();
		
		 LoggerClass.startTestCase("HomepageLogoTest");
		
		LoggerClass.info("Asserting the image");
		 if(visibility_status==true) {
			 LoggerClass.info("Logo Found on the page");
			 
		 }
		 
		 LoggerClass.endTestCase("HomepageLogoTest");
		

	}

}
