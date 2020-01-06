package Qaclickacademyframework.ObjectRepo;

import org.openqa.selenium.By;

import Qaclickacademyframework.DriverReaders.AllDrivers;


public class ObjectRepo extends AllDrivers {
	
	//Practice page
	
	public By radio2=By.xpath("//input[@name='radioButton' and @value='radio2']");
	public By auto=By.id("autocomplete");
	public By autolist=By.className("ui-menu-item");
	public By drop3=By.id("dropdown-class-example");
	public By check2=By.id("checkBoxOption2");
	public By openWindow=By.id("openwindow");
	public By childwindowlink=By.xpath("//*[text()='Selenium Webdriver with Java Basics + Advanced + Interview Guide']");
	public By openTab=By.id("opentab");
	public By alerttext=By.id("name");
	public By alertalertbtn=By.id("alertbtn");
	public By alertconfirmbtn=By.id("confirmbtn");
	
	public By Course=By.xpath("//td[text()='WebSecurity Testing for Beginners-QA knowledge to next level']");
	public By table=By.id("product");
	public By rows=By.xpath("//table[@id='product']/tbody/tr");
	public By cols=By.xpath("//table[@id='product']/tbody/tr/td");
	public By tHeadings=By.xpath("//table[@id='product']/tbody/tr/th");

}
