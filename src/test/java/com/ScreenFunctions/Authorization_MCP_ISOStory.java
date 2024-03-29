package com.ScreenFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.GenericFunctions.DBConnection;
import com.GenericFunctions.GenericMethods;

public class Authorization_MCP_ISOStory extends GenericMethods{
	

	@FindBy(how=How.XPATH,using="//*[@id='btnProcess']")
	public static WebElement Click_btnProcess;
	
	@FindBy(how=How.XPATH,using="//button[contains(text(),'Yes')]")
	public static WebElement Click_Yes;
	
	@FindBy(how=How.XPATH,using="//*[@id='manualTabTab']")
	public static WebElement Click_ManualTab;
	
	@FindBy(how=How.XPATH,using="//*[@id='btnLogout2']")
	public static WebElement Btn_logout;
	
	@FindBy(how=How.XPATH,using="//*[@id='fileTabtab']")
	public static WebElement Tab_Importfiles;

	@FindBy(how=How.XPATH,using="//*[@id='filesGrid']/tbody/tr/td")
	public static WebElement Click_fileImp;

	
	
	
	
	public static String taskid;
	
	

	public static void Authorization_MCP_ISOStory() throws Exception 
	{   
		
		
		Thread.sleep(3000);
		System.out.println(CollPeriodBalances_MCP_ISO_Story.taskid);
		Thread.sleep(15000);
		
		driver.findElement(By.xpath("//td[text()='"+CollPeriodBalances_MCP_ISO_Story.taskid+"']")).click();
	
		
//		//Level 2 Import auth
//Thread.sleep(2000);
//
//		
//		waitForElement(Tab_Importfiles);
//		Tab_Importfiles.click();
//		
//		waitForElement(Click_fileImp);
//		Click_fileImp.click();
//		
//		waitForElement(Click_btnProcess);
//		Click_btnProcess.click();
//		
//		Thread.sleep(2000);
//		waitForElement(Click_Yes);
//		Click_Yes.click();
//
//		Thread.sleep(4000);
//		
//		//Level 2 Import auth finished
		
		waitForElement(Click_ManualTab);
		Click_ManualTab.click();

		waitForElement(Click_btnProcess);
		Click_btnProcess.click();
		
		Thread.sleep(2000);
		waitForElement(Click_Yes);
		Click_Yes.click();
		waitForElement(Btn_logout);
    	Btn_logout.click();	

		Thread.sleep(2000);
    	waitForElement(taskid);
        taskid= DBConnection.dbConnect();


        System.out.println(taskid);
	}



	private static void waitForElement(String taskid2) {

		
	}
	}