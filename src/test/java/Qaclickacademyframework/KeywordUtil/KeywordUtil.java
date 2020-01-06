package Qaclickacademyframework.KeywordUtil;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

//import com.sun.jna.platform.FileUtils;

import Qaclickacademyframework.DriverReaders.AllDrivers;

public class KeywordUtil extends AllDrivers {

	public void sendkeysFunction(By id, String s) {

		driver.findElement(id).sendKeys(s);

	}

	public void clickFunction(By id) {
		driver.findElement(id).click();
	}

	public void clearFunction(By id) {
		driver.findElement(id).clear();
	}

	public void threadSleep(int s) {
		try {
			Thread.sleep(s);
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
	}

	public void autocomplete(By id, String auto) {
		List<WebElement> items = driver.findElements(id);
		for (int i = 0; i < items.size(); i++) {
			if (items.get(i).getText().equals(auto)) {
				items.get(i).click();
			}
	  }
	}

	public void basicDropDown(By id) {

		WebElement optionDrop = driver.findElement(id);
		Select drop = new Select(optionDrop);
		drop.selectByVisibleText("Option3");
	}

	public void checkBox(By id) {
		driver.findElement(id).click();
	}

	public void openNewWindow(By id, By xpath) {
		try {
			driver.findElement(id).click();
			String mainWindow = driver.getWindowHandle();
			Set<String> allWindow = driver.getWindowHandles();
			Iterator<String> it = allWindow.iterator();
			while (it.hasNext()) {

				String window = it.next();

				if (!window.equals(mainWindow)) {

					String childWindow = window;
					driver.switchTo().window(childWindow);
					threadSleep(4000);				
					driver.findElement(xpath).click();
				}

			}
			threadSleep(4000);	
			

			driver.close();

			driver.switchTo().window(mainWindow);
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void alertAccept() {

		driver.switchTo().alert().accept();
	}

	public void alertDismiss() {

		driver.switchTo().alert().dismiss();
	}

	public void webTableAllRecords(By tHeadings,By row, By col, By coltofetch) {
		
		  List<WebElement> allRows=driver.findElements(row);
		  List<WebElement> allCols=driver.findElements(col);
		  //List<WebElement> allHeadings=driver.findElements(tHeadings);
		  
		  String columnToFetch=driver.findElement(coltofetch).getText();
		  
		  for(int i=0;i<allRows.size();i++) {
			  
			  for(int j=0;j<allCols.size();j++) {
				  
				  String record=allCols.get(i).getText();
				  
				  if(record.equals(columnToFetch)) {
					  
					  System.out.println("abc");
					  
				  }
				  
			  }
			  
		  }
	}
	
	public void screenShots(String destFile) {
		TakesScreenshot ts=((TakesScreenshot)driver);
		  
		  File srcFile=ts.getScreenshotAs(OutputType.FILE);
		  File destFilenew=new File(destFile+new Date().getTime());
		  
		  try {
			FileHandler.copy(srcFile, destFilenew);
			//FileUtils.copyFile(srcFile, destFilenew);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
}
