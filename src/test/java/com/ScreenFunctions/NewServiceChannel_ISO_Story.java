package com.ScreenFunctions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.GenericFunctions.DBConnection;
import com.GenericFunctions.GenericMethods;

public class NewServiceChannel_ISO_Story extends GenericMethods{
	
	@FindBy(how=How.XPATH,using="//*[text()= 'Parameter Maintenance']")
	public static WebElement Click_Paramm;

	@FindBy(how=How.XPATH,using="(//*[@id='btnModify'])[57]")
	public static WebElement Click_NewServiceChannel; 
	
	@FindBy(how=How.XPATH,using="(//*[@id='btnAdd'])[2]")
	public static WebElement btn_Add;
	
	@FindBy(how=How.XPATH,using="(//*[@id='ShortDescription'])[2]")
	public static WebElement Edit_ShortDesp;
	
	@FindBy(how=How.XPATH,using="(//*[@id='FileProtocolID'])[2]")
	public static WebElement Drop_Protocol;
	
	@FindBy(how=How.XPATH,using="//*[@id='Mandatory']")
	public static WebElement Drop_Mandatory;
	
	@FindBy(how=How.XPATH,using="(//*[@id='LongDescription'])[2]")
	public static WebElement Edit_LongDesp;
	
	@FindBy(how=How.XPATH,using="(//*[@id='IPAddress'])[2]")
	public static WebElement Edit_IpAdd;
	
	@FindBy(how=How.XPATH,using="(//*[@id='btnSaveOne'])[2]")
	public static WebElement Click_Save;
	
	@FindBy(how=How.XPATH,using="//button[contains(text(),'Yes')]")
	public static WebElement Btn_Yes;
	
	@FindBy(how=How.XPATH,using="(//*[@id='btnClose'])[2]")
	public static WebElement Click_CloseWindow;
	
	@FindBy(how=How.XPATH,using="//*[@id='btnClose']")
	public static WebElement Click_CloseWindow2;
	
		
	
	
	
	
	
			public static String taskid;
	
	
	public static void NewServiceChannel_ISO_Story() throws Exception {

	

	
	  waitForElement(Click_Paramm);
	
	if(Click_Paramm.isDisplayed())
	{
		System.out.println("Clicking on entity search");
		
		Actions acc=new Actions(driver);
		
		acc.moveToElement(Click_Paramm).click(Click_Paramm).build().perform();
		Click_Paramm.click();
	}

	Thread.sleep(10000);

	
	waitForElement1(Click_NewServiceChannel);
	Click_NewServiceChannel.click();
	Thread.sleep(9000);
	waitForElement(btn_Add);
	btn_Add.click();
	
	Thread.sleep(4000);

	waitForElement(Edit_ShortDesp);
	Edit_ShortDesp.sendKeys("XHost5678");
	
	waitForElement(Edit_LongDesp);
	Edit_LongDesp.sendKeys("Xchange Host5678");
	
//	waitForElement(Drop_Mandatory);
//	Drop_Mandatory.sendKeys("Mandatory");
	
	waitForElement(Edit_IpAdd);
	Edit_IpAdd.sendKeys("196.11.129.67");
	
	waitForElement(Drop_Protocol);
	Drop_Protocol.sendKeys("SFTP");
	
	
	    
    waitForElement(Click_Save);
    Click_Save.click();
    
    waitForElement(Btn_Yes);
    Btn_Yes.click();
    
    Thread.sleep(5000);
    
    waitForElement(Click_CloseWindow);
    Click_CloseWindow.click();
    
    waitForElement(Btn_Yes);
    Btn_Yes.click();
    
    
	try
	{
	
	    //waitForElement(Click_CloseWindow);
	    Click_CloseWindow2.click();
	    Thread.sleep(3000);
	    //waitForElement(Btn_Yes);
	    Btn_Yes.click();
	}
	catch (Exception e)
	{
		
}
    
    
    
    
    
   

//Thread.sleep(3000);
//driver.quit();
	
			}
	
	
}
