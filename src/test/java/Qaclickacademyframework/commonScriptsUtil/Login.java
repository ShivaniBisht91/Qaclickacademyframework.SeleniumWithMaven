package Qaclickacademyframework.commonScriptsUtil;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import Qaclickacademyframework.DriverReaders.AllDrivers;
import Qaclickacademyframework.KeywordUtil.KeywordUtil;
import Qaclickacademyframework.ObjectRepo.ObjectRepo;


public class Login extends AllDrivers{
	
	public Properties pro;
	public FileInputStream fis;
	
	
	  File src=new File("D:\\Shivani_Workspce\\Projects\\Qaclickacademyframework\\src\\Qaclickacademyframework\\Configuration\\Config.properties");
		
	
  public void login() {
	  
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
		
	  
		KeywordUtil key=new KeywordUtil();
		
		ObjectRepo objrep=new ObjectRepo();
		
		String username1=pro.getProperty("username");
		
		System.out.println(username1);
		
		String password=pro.getProperty("password");
	  	    
	   /* key.clickFunction(objrep.signIn);
	    key.sendkeysFunction(objrep.logEmail,username1);
	    key.sendkeysFunction(objrep.logPass,password);
	    key.clickFunction(objrep.logsub);
	    
	    */
	  	    
	  
  }
  
  public static void main(String[] args) {
	  
	  Login l=new Login();
	  l.login();
	  
  }
  
}
