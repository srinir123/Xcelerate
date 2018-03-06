package com.ScreenFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.GenericFunctions.DBConnection;
import com.GenericFunctions.GenericMethods;

public class Authorization_MCP extends GenericMethods{
	

	@FindBy(how=How.XPATH,using="//*[@id='btnProcess']")
	public static WebElement Click_btnProcess;
	
	@FindBy(how=How.XPATH,using="//*[text()= 'Yes']")
	public static WebElement Click_Yes;
	
	@FindBy(how=How.XPATH,using="//*[@id='btnLogout2']")
	public static WebElement Btn_logout;
	
	
	
	
	public static String taskid;
	
	

	public static void Authorization_MCP() throws Exception 
	{   
		Thread.sleep(3000);
		System.out.println(CollPeriodBalances_MCP.taskid);
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//td[text()='"+CollPeriodBalances_MCP.taskid+"']")).click();

		waitForElement(Click_btnProcess);
		Click_btnProcess.click();
		waitForElement(Click_Yes);
		Click_Yes.click();
		waitForElement(Btn_logout);
    	Btn_logout.click();	
        //driver.quit();
		Thread.sleep(2000);
        taskid= DBConnection.dbConnect();
        
        System.out.println(taskid);
	}
	}