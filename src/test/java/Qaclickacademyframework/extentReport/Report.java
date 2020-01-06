package Qaclickacademyframework.extentReport;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Report {
	
	public ExtentHtmlReporter reporter;
	public ExtentReports extent;
	public ExtentTest logger;
	
	@BeforeTest
	public void extentReport() {
		reporter=new ExtentHtmlReporter("E:\\Workspace\\Qaclickacademyframework\\src\\Qaclickacademyframework\\resultReport\\ResultReady.html");
		
		extent=new ExtentReports();
		extent.attachReporter(reporter);
		logger=extent.createTest("PracticePage");
	}
	
	@AfterTest
	public void flush() {
		extent.flush();
	}

}
