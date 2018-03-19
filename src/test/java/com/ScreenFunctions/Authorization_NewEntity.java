package com.ScreenFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.GenericFunctions.GenericMethods;

public class Authorization_NewEntity extends GenericMethods{
	

	@FindBy(how=How.XPATH,using="//*[@id='btnAuthAccept']")
	public static WebElement Click_btnVerify;
	
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

	
	

	public static void Authorization_NewEntity() throws Exception 
	{   
		Thread.sleep(3000);
		System.out.println(NewEntity_creation.taskid);
		Thread.sleep(8000);
		
		driver.findElement(By.xpath("//td[text()='"+NewEntity_creation.taskid+"']")).click();

		waitForElement(Click_btnVerify);
		Click_btnVerify.click();
		waitForElement(Click_Yes);
		Click_Yes.click();
		Thread.sleep(3000);

		waitForElement(Btn_logout);
		Btn_logout.click();
		
        driver.quit();
	}
	}