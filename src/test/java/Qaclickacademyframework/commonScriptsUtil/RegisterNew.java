package Qaclickacademyframework.commonScriptsUtil;

import org.testng.annotations.Test;

import Qaclickacademyframework.DriverReaders.AllDrivers;
import Qaclickacademyframework.ExcelReader.ExcelUtil;
import Qaclickacademyframework.KeywordUtil.KeywordUtil;
import Qaclickacademyframework.ObjectRepo.ObjectRepo;


public class RegisterNew extends AllDrivers {
	

 
  @Test(dataProvider="testData", dataProviderClass=ExcelUtil.class)
public void registerNewUser(String email, String gender, String fname,String lname, String pass,String Afname, String Alname, String address, String city, String state1,String code, String mobile, String alias) {
//  public void RegisterNewUser(Object[][] data1) {  
		KeywordUtil key=new KeywordUtil();
		
		ObjectRepo objrep=new ObjectRepo();
		
		
		String [] emailSplit = email.split("@");
		
		//	Random objGen = new Random();
			
	        double a=Math.random();
	        String time = Double.toString(a).replace(".", "");
	        System.out.println(time);
	        
			
			String emailNew = emailSplit[0]+time+"@"+emailSplit[1]; 
			
			System.out.println(emailNew);
/*			
		//	if(objrep.item.isDisplayed()) {
			key.clearFunction(objrep.email_id);
		
	  //  key.sendkeysFunction(objrep.email_id,emailNew);
	    
 // }else {
	  
	  key.sendkeysFunction(objrep.email_id,emailNew);
	  
 // }
	    try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	    key.clickFunction(objrep.sub);
	    	
	  
	   WebDriverWait wait= new WebDriverWait(driver,60);
	    
	WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(objrep.mrs));
	if(element.isDisplayed()) {
		
		key.clickFunction(objrep.mrs);
		}
	    key.sendkeysFunction(objrep.fname, fname);
	    key.sendkeysFunction(objrep.lname, lname);
	    key.sendkeysFunction(objrep.pass, pass);
	    key.sendkeysFunction(objrep.address, address);	
	    key.sendkeysFunction(objrep.city, city);	
		
		WebElement state=driver.findElement(objrep.state);
		
		Select drop=new Select(state);
		drop.selectByValue("32");
		
		key.sendkeysFunction(objrep.postcode, code);	
		
		WebElement country=driver.findElement(objrep.country);
		Select drop1=new Select(country);
		
		if(!country.isSelected()) {
			
			drop1.selectByValue("21");
			
		}
		
		
		key.sendkeysFunction(objrep.mobile, mobile);
		key.sendkeysFunction(objrep.alias, alias);
		key.clickFunction(objrep.subAccount);
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		key.clickFunction(objrep.signout);
		
		//WebElement name=driver.findElement(By.xpath("//*[@id=\"header\"]//div//a//span[contains(text(),'Shivani Bisht')]"));
	    }
	    
	   
  }   */
  }}
