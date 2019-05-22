package com.ScreenFunctions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.GenericFunctions.DBConnection;
import com.GenericFunctions.GenericMethods;

public class ACBEntryclass_Pmt extends GenericMethods{
	
	@FindBy(how=How.XPATH,using="//*[text()= 'Parameter Maintenance']")
	public static WebElement Click_Paramm;

	@FindBy(how=How.XPATH,using="(//*[@id='btnModify'])[3]")
	public static WebElement Click_ACBEntryClass; 
	
	@FindBy(how=How.XPATH,using="(//*[@id='btnAdd'])[2]")
	public static WebElement btn_Add;

	@FindBy(how=How.XPATH,using="(//*[@id='EntryClassCode'])[2]")
	public static WebElement Edi_EntryCcode;
	
	@FindBy(how=How.XPATH,using="(//*[@id='Description'])[2]")
	public static WebElement Edi_Desp;
	
	@FindBy(how=How.XPATH,using="(//*[@id='ServiceTypeID'])[2]")
	public static WebElement Drop_ServiceType;
	
	@FindBy(how=How.XPATH,using="(//*[@id='NAEDOTrackingDaysID'])[2]")
	public static WebElement Drop_Naedotrackdaysid;
	
	@FindBy(how=How.XPATH,using="(//*[@id='ServiceID'])[2]")
	public static WebElement Drp_Serviceid;
	
	@FindBy(how=How.XPATH,using="(//*[@id='DrCrInd'])[2]")
	public static WebElement Drop_DebORCre;
	
	@FindBy(how=How.XPATH,using="(//*[@id='ServiceChannelID']/option[last()])[2]")
	public static WebElement Drop_ServicechannelID;
	
	@FindBy(how=How.XPATH,using="(//*[@id='B2BFileSchemaId'])[2]") 
	public static WebElement Drop_B2BfILEid;

	@FindBy(how=How.XPATH,using="(//*[@id='btnSaveOne'])[2]") 
	public static WebElement Click_Save;
	
	@FindBy(how=How.XPATH,using="//*[contains(text(), 'Yes')]")
	public static WebElement Btn_Yes;
	
	@FindBy(how=How.XPATH,using="(//*[@id='btnClose'])[2]")
	public static WebElement Click_CloseWindow;
	
	@FindBy(how=How.XPATH,using="//*[@id='btnClose']")
	public static WebElement Click_CloseWindow2;
	
	@FindBy(how=How.XPATH,using="(//*[@id='SendPath'])[2]")
	public static WebElement Edit_SendPath;
	
	@FindBy(how=How.XPATH,using="(//*[@id='ReceivePath'])[2]")
	public static WebElement Edit_ReceivePath;
	
	
	
	
			public static String taskid;
	
	
	public static void ACBEntryclass_Pmt() throws Exception {

	

	
//	  waitForElement(Click_Paramm);
//	
//	if(Click_Paramm.isDisplayed())
//	{
//		System.out.println("Clicking on entity search");
//		
//		Actions acc=new Actions(driver);
//		
//		acc.moveToElement(Click_Paramm).click(Click_Paramm).build().perform();
//		Click_Paramm.click();
//	}
//
//	Thread.sleep(6000);

	
	waitForElement1(Click_ACBEntryClass);
	Click_ACBEntryClass.click();
	Thread.sleep(6000);
	waitForElement(btn_Add);
	btn_Add.click();
	
	waitForElement(Edi_EntryCcode);
	
    String EntryCcode_Name=getData("EntryCcode_Name","story1",5);

    Edi_EntryCcode.sendKeys(EntryCcode_Name);
    
    
	waitForElement(Edi_Desp);
	
    String Desp_Name=getData("Desp_Name","story1",5);

    Edi_Desp.sendKeys(Desp_Name);
    
	waitForElement(Drop_ServiceType);
	
    String ServiceType_Name=getData("ServiceType_Name","story1",5);

    Drop_ServiceType.sendKeys(ServiceType_Name);
    
    
	waitForElement(Drop_Naedotrackdaysid);
	
    String Naedotrackdaysid=getData("Naedotrackdaysid","story1",5);

    Drop_Naedotrackdaysid.sendKeys(Naedotrackdaysid);
    
	waitForElement(Drp_Serviceid);
	
    String Serviceid=getData("Serviceid","story1",5);

    Drp_Serviceid.sendKeys(Serviceid);
    
	waitForElement(Drop_DebORCre);
	
    String DebORCre=getData("DebORCre","story1",5);

    Drop_DebORCre.sendKeys(DebORCre);
    
	waitForElement(Drop_ServicechannelID);
	
   // String ServicechannelID=getData("ServicechannelID","story1",4); 

    Drop_ServicechannelID.click();
//    Thread.sleep(1000);
//    Drop_ServicechannelID.click();
    
	waitForElement(Drop_B2BfILEid);
	
   //String B2BfILEid=getData("B2BfILEid","story1",4);   

    Drop_B2BfILEid.sendKeys("Payment File");
//    Thread.sleep(1000);
//    Drop_B2BfILEid.click();
    
    waitForElement(Edit_SendPath);
    Edit_SendPath.sendKeys("P8/IN/");
    
    waitForElement(Edit_ReceivePath);
    Edit_ReceivePath.sendKeys("P8/OUT/");
    
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
