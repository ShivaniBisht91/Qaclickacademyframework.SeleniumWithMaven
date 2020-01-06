package Qaclickacademyframework.DriverReaders;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.Status;

import Qaclickacademyframework.extentReport.Report;

public class AllDrivers extends Report{
	
	public static WebDriver driver;
	public Properties pro;
	public FileInputStream fis;
	
	
	
  @BeforeTest
  public void openChrome() {
	 
	  
	  File src=new File("E:\\Workspace\\Qaclickacademyframework.Selenium\\src\\test\\java\\Qaclickacademyframework\\Configuration\\Config.properties");
		
		try {
			fis = new FileInputStream(src);
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
		}
		pro=new Properties();
		try {
			pro.load(fis);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		 
		  String browser=pro.getProperty("browserType");
		  
		  System.out.println(browser);
		
		if(browser.equalsIgnoreCase("Chrome")) {
		
		String chropath=pro.getProperty("ChromeDriver");
		System.out.println(chropath);
		System.out.println("Launching chrome....");
		System.setProperty("webdriver.chrome.driver",  System.getProperty("user.dir")+chropath);
		driver= new ChromeDriver();
		driver.get(pro.getProperty("URL"));
		
		logger.log(Status.INFO, "Navigating to URL...");
		
		driver.manage().window().maximize();
		
  }else if(browser.equalsIgnoreCase("firefox")) {
  		
			String firepath=pro.getProperty("FireFoxDriver");
			System.out.println(firepath);
			System.out.println("Launching chrome....");
			System.setProperty("webdriver.chrome.driver",  System.getProperty("user.dir")+firepath);
			driver= new ChromeDriver();
			driver.get(pro.getProperty("URL"));
			
			logger.log(Status.INFO, "Navigating to URL...");
			
			driver.manage().window().maximize();
			
		}else if(browser.equalsIgnoreCase("IE")) {
			
			String iepath=pro.getProperty("IEDriver");
			System.out.println(iepath);
			System.out.println("Launching chrome....");
			System.setProperty("webdriver.chrome.driver",  System.getProperty("user.dir")+iepath);
			driver= new ChromeDriver();
			driver.get(pro.getProperty("URL"));
			
			logger.log(Status.INFO, "Navigating to URL...");
			
			driver.manage().window().maximize();
		
	}else if(browser.equalsIgnoreCase("opera")){
		
		String operapath=pro.getProperty("OperaDriver");
		System.out.println(operapath);
		System.out.println("Launching chrome....");
		System.setProperty("webdriver.chrome.driver",  System.getProperty("user.dir")+operapath);
		driver= new ChromeDriver();
		driver.get(pro.getProperty("URL"));
		
		logger.log(Status.INFO, "Navigating to URL...");
		
		driver.manage().window().maximize();
	}else {
	    System.out.println("No such browser present");
	}
		}
  
 /* @Test
  public void closeBrowser() {
	  
	  driver.close();
  } 
  
  */
  
 /* @AfterTest
  public void quitBrowser() {
	  
	  try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	  
	  driver.quit();
  } */
}
