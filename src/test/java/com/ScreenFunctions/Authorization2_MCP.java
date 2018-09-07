package com.ScreenFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.GenericFunctions.DBConnection;
import com.GenericFunctions.GenericMethods;

public class Authorization2_MCP extends GenericMethods{
	

	@FindBy(how=How.XPATH,using="//*[@id='btnProcess']")
	public static WebElement Click_btnProcess;
	
	@FindBy(how=How.XPATH,using="//button[contains(text(),'Yes')]")
	public static WebElement Click_Yes;
	
	@FindBy(how=How.XPATH,using="//*[@id='btnLogout2']")
	public static WebElement Btn_logout;
	
	
	
	public static String taskid;

	
	

	public static void Authorization2_MCP() throws Exception 
	{   
		Thread.sleep(3000);
		System.out.println(Authorization_MCP.taskid);
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//td[text()='"+Authorization_MCP.taskid+"']")).click();

		waitForElement(Click_btnProcess);
		Click_btnProcess.click();
		waitForElement(Click_Yes);
		Click_Yes.click();
		waitForElement(Btn_logout);
    	Btn_logout.click();	
        //driver.quit();
		Thread.sleep(2000);
    	waitForElement(taskid);
        taskid= DBConnection.dbConnect();
		//Thread.sleep(2000);

        System.out.println(taskid);
	}




	private static void waitForElement(String taskid2) {
		// TODO Auto-generated method stub
		
	}



}