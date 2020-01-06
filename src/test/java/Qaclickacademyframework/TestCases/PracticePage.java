package Qaclickacademyframework.TestCases;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import Qaclickacademyframework.DriverReaders.AllDrivers;
import Qaclickacademyframework.KeywordUtil.KeywordUtil;
import Qaclickacademyframework.ObjectRepo.ObjectRepo;

public class PracticePage extends AllDrivers{
	
  @Test
  public void all() {
	  
	
	  KeywordUtil key=new KeywordUtil();
		
	  ObjectRepo objrep=new ObjectRepo();
	  
	  key.clickFunction(objrep.radio2);
	  
	  logger.log(Status.INFO, "Radio2 clicked");
	  
	  String autotext=pro.getProperty("autotext");
	  key.sendkeysFunction(objrep.auto,autotext);
	  
	  logger.log(Status.INFO, "text send to audot text field");
	  
	  key.threadSleep(4000);
	  
	  String ScreenLoc=pro.getProperty("destFileForScreenshot");
	  
	  key.autocomplete(objrep.autolist,autotext);
	  
	  logger.log(Status.INFO, "item selected from autocomplete control");
	  
	  key.screenShots(ScreenLoc);
	  key.basicDropDown(objrep.drop3);
	  key.checkBox(objrep.check2);
	  	  
	  key.openNewWindow(objrep.openWindow, objrep.childwindowlink);
	  
	  key.openNewWindow(objrep.openTab, objrep.childwindowlink);
	  
	  String alerttext=pro.getProperty("alerttext");
	  key.sendkeysFunction(objrep.alerttext,alerttext);
	  key.threadSleep(3000);
	  key.clickFunction(objrep.alertalertbtn);
	  key.alertAccept();
	  key.clickFunction(objrep.alertconfirmbtn);
	  key.alertDismiss();
	  
	  
	  key.webTableAllRecords(objrep.tHeadings,objrep.rows,objrep.cols,objrep.Course);
	
  }
}
