package com.datatype.practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SeleniumIntro {

	public static void main(String[] args) throws InterruptedException {
		
		//selenium Manager internally installed 
		
		// Firefox Launch WebDriver driver = new FirefoxDriver();
		//Microsofy Edge WebDriver driver = new EdgeDriver();
		
		//Step to Invoke chromedriver 
		//System.setProperty("webdriver.chrome.driver", "//path of externally downloaded chromedriver which should match the Chrome version");
		
		//Browser Invoking
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/");
		driver.wait(3000);
		System.out.println(driver.getTitle());	
		System.out.println(driver.getCurrentUrl());	
		
		driver.close();//Close the current window, quitting the browser if it's the last window currently open. 
		//driver.quit();//Quits this driver, closing every associated window. 

		

	}

}
