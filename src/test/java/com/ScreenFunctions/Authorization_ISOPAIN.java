package com.ScreenFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.GenericFunctions.GenericMethods;

public class Authorization_ISOPAIN extends GenericMethods{
	

	@FindBy(how=How.XPATH,using="//*[@id='btnAuthAccept']")
	public static WebElement Click_btnAccept;
	
	@FindBy(how=How.XPATH,using="//*[text()= 'Yes']")
	public static WebElement Click_Yes;
	
	@FindBy(how=How.XPATH,using="/html/body/div[4]/div[1]/a/span")
	public static WebElement Btn_X;
	
	@FindBy(how=How.XPATH,using="//*[@id='btnLogout2']")
	public static WebElement Btn_logout;
	
	
	
	
	public static String taskid;
	
	

	public static void Authorization_ISOPAIN() throws Exception 
	{  
		Thread.sleep(3000);
		System.out.println(ISOPAIN.taskid);
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//td[text()='"+ISOPAIN.taskid+"']")).click();
		waitForElement(Click_btnAccept);
		Click_btnAccept.click();
		System.out.println("The new B2B User has been Authorized and Accepted by the system");
		LogEvent("Pass","The new B2B User has been Authorized and Accepted by the system");
		waitForElement(Click_Yes);
		Click_Yes.click();
//		
//		waitForElement(Btn_X);
//		Btn_X.click();
		waitForElement(Btn_logout);
		Btn_logout.click();	
	
		Thread.sleep(2000);

        driver.quit();
        
	}
	}