package com.ScreenFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.GenericFunctions.DBConnection;
import com.GenericFunctions.GenericMethods;

public class Authorization_ISOPAIN extends GenericMethods{
	

	@FindBy(how=How.XPATH,using="//*[@id='btnProcess']")
	public static WebElement Click_btnProcess;
	
	@FindBy(how=How.XPATH,using="//*[text()= 'Yes']")
	public static WebElement Click_Yes;
	
	@FindBy(how=How.XPATH,using="//*[@id='btnLogout2']")
	public static WebElement Btn_logout;
	
	
	
	
	public static String taskid;
	
	

	public static void Authorization_ISOPAIN() throws Exception 
	{   
		Thread.sleep(3000);
		System.out.println(ISOPAIN.taskid);
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//td[text()='"+ISOPAIN.taskid+"']")).click();

		waitForElement(Click_btnProcess);
		Click_btnProcess.click();
		waitForElement(Click_Yes);
		Click_Yes.click();
		waitForElement(Btn_logout);
    	Btn_logout.click();	
        driver.quit();
	}
	}