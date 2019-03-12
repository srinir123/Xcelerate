package com.ScreenFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.GenericFunctions.DBConnection;
import com.GenericFunctions.GenericMethods;

public class Authorization_CollImport_ISOStory extends GenericMethods{
	

	@FindBy(how=How.XPATH,using="//*[@id='btnProcess']")
	public static WebElement Click_btnProcess;
	
	@FindBy(how=How.XPATH,using="//button[contains(text(),'Yes')]")
	public static WebElement Click_Yes;
	
	@FindBy(how=How.XPATH,using="//*[@id='btnLogout2']")
	public static WebElement Btn_logout;
	
	@FindBy(how=How.XPATH,using="//*[@id='filesGrid']/tbody/tr[last()]/td[4]")
	public static WebElement Click_fileImp;
	
	@FindBy(how=How.XPATH,using="//*[@id='btnLogout2']")
	public static WebElement Btn_logout1;
	
	@FindBy(how=How.XPATH,using="//*[@id='mainnav']/li[1]/a")
	public static WebElement Click_Dashboard;
	
	
	
	
	public static String taskid;
	
	

	public static void Authorization_CollImport_ISOStory() throws Exception 
	{   
		Thread.sleep(5000);
		Click_Dashboard.click();
		Thread.sleep(10000);
		Click_Dashboard.click();
		System.out.println(Review_CImportfiles.taskid);
		Thread.sleep(6000);
		
		driver.findElement(By.xpath("//td[text()='"+Review_CImportfiles.taskid+"']")).click();
		
		Thread.sleep(2000);
		waitForElement(Click_fileImp);
		Click_fileImp.click();
						
		waitForElement(Click_btnProcess);
		Click_btnProcess.click();
		
		Thread.sleep(2000);
		waitForElement(Click_Yes);
		Click_Yes.click();
//		waitForElement(Btn_logout);
//    	Btn_logout.click();	
        //driver.quit();
		Thread.sleep(2000);
    	waitForElement(taskid);
        taskid= DBConnection.dbConnect();
		//Thread.sleep(2000);

        System.out.println(taskid);
        
		waitForElement(Btn_logout);
    	Btn_logout.click();
	}



	private static void waitForElement(String taskid2) {
		// TODO Auto-generated method stub
		
	}
	}