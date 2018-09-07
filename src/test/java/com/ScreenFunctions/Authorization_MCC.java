package com.ScreenFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.GenericFunctions.DBConnection;
import com.GenericFunctions.GenericMethods;

public class Authorization_MCC extends GenericMethods{
	

	@FindBy(how=How.XPATH,using="//*[@id='btnProcess']")
	public static WebElement Click_btnProcess;

	@FindBy(how=How.XPATH,using="//button[contains(text(),'Yes')]")
	public static WebElement Click_Yes;
	
	@FindBy(how=How.XPATH,using="//*[@id='btnLogout2']")
	public static WebElement Btn_logout;

	public static String taskid;
	
	
	
	

	
	

	public static void Authorization_MCC() throws Exception 
	{   
		Thread.sleep(3000);
		System.out.println(CollPeriodBalances_MCC.taskid);
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//td[text()='"+CollPeriodBalances_MCC.taskid+"']")).click();

		waitForElement(Click_btnProcess);
		Click_btnProcess.click();
		
		waitForElement(Click_Yes);
		Click_Yes.click();
		waitForElement(Btn_logout);
    	Btn_logout.click();	
        //driver.quit();
		Thread.sleep(3000);
    	waitForElement(taskid);
        taskid= DBConnection.dbConnect();
		//Thread.sleep(2000);

        System.out.println(taskid);
	}








	private static void waitForElement(String taskid2) {
		// TODO Auto-generated method stub
		
	}
	}