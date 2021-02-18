package com.ScreenFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.GenericFunctions.DBConnection;
import com.GenericFunctions.GenericMethods;

public class Authorization_Journal extends GenericMethods{
	

	@FindBy(how=How.XPATH,using="//*[@id='btnProcess']")
	public static WebElement Click_btnProcess;
	
	@FindBy(how=How.XPATH,using="//button[contains(text(),'Yes')]")
	public static WebElement Click_Yes;
	
	@FindBy(how=How.XPATH,using="//*[@id='btnLogout2']")
	public static WebElement Btn_logout;
	
	@FindBy(how=How.XPATH,using="//*[@id='journalsGrid']/tbody/tr[last()]/td[1]")
	public static WebElement Click_Journal;
	
	
	
	public static String taskid;

	
	

	public static void Authorization_Journal() throws Exception 
	{   
		Thread.sleep(3000);
		System.out.println(Journals.taskid);
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//td[text()='"+Journal_ISO_Story.taskid+"']")).click();
		
		waitForElement(Click_Journal);
		Click_Journal.click();
		Thread.sleep(6000);
		waitForElement(Click_btnProcess);
		Click_btnProcess.click();
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