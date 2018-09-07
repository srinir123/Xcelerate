package com.ScreenFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.GenericFunctions.GenericMethods;

public class Authorization_NewUser extends GenericMethods{
	

	@FindBy(how=How.XPATH,using="//*[@id='btnAuthAccept']")
	public static WebElement Click_btnAccept;
	
	@FindBy(how=How.XPATH,using="//*[text()= 'Yes']")
	public static WebElement Click_Yes;
	
	@FindBy(how=How.XPATH,using="//*[@id='btnAD']")
	public static WebElement Btn_Activate;
	
	@FindBy(how=How.XPATH,using="//*[text()= 'Yes']")
	public static WebElement Click_Yes1;
	
	@FindBy(how=How.XPATH,using="//*[@id='btnClose']")
	public static WebElement Btn_Close;
	
	@FindBy(how=How.XPATH,using="//*[text()= 'Yes']")
	public static WebElement Click_Yes2;
	
	@FindBy(how=How.XPATH,using="//*[@id='btnLogout2']")
	public static WebElement Btn_logout;

	
	

	public static void Authorization_NewUser() throws Exception 
	{   
		Thread.sleep(3000);
		System.out.println(NewUser_creation.taskid);
		Thread.sleep(6000);
		
		driver.findElement(By.xpath("//td[text()='"+NewUser_creation.taskid+"']")).click();

		waitForElement(Click_btnAccept);
		Click_btnAccept.click();
		waitForElement(Click_Yes);
		Click_Yes.click();
		Thread.sleep(10000);
		waitForElement(Btn_Activate);
		Btn_Activate.click();	
		waitForElement(Click_Yes1);
		Click_Yes1.click();
		Thread.sleep(5000);
		waitForElement(Btn_Close);
		Btn_Close.click();
		waitForElement(Click_Yes2);
		Click_Yes2.click();
		waitForElement(Btn_logout);
		Btn_logout.click();
		
        driver.quit();
        
//		System.out.println(NewUser_creation.taskid);
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//td[text()='"+NewUser_creation.taskid+"']")).click();
        
        
//		String Username=getData("FirstName","NewUser_creation",i).concat(getData("Surname","NewUser_creation",i).substring(0, 1));	
//		  String password=getData("Password","NewUser_creation",i);	
//	      Edi_Username.clear();
//	     Edi_Username.sendKeys(Username);
//	     Edi_Password.clear();
//	     Edi_Password.sendKeys(password);
//	     Btn_Loginbtn.click();
	}
	}