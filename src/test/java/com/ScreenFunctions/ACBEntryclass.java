package com.ScreenFunctions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.GenericFunctions.DBConnection;
import com.GenericFunctions.GenericMethods;

public class ACBEntryclass extends GenericMethods{
	
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
	
	@FindBy(how=How.XPATH,using="(//*[@id='ServiceChannelID'])[2]")
	public static WebElement Drop_ServicechannelID;
	
	@FindBy(how=How.XPATH,using="(//*[@id='B2BFileSchemaId'])[2]")
	public static WebElement Drop_B2BfILEid;

	@FindBy(how=How.XPATH,using="(//*[@id='btnSaveOne'])[2]") 
	public static WebElement Click_Save;
	
	@FindBy(how=How.XPATH,using="//*[contains(text(), 'Yes')]")
	public static WebElement Btn_Yes;
	
	
	
	
	
	
			public static String taskid;
	
	
	public static void ACBEntryclass() throws Exception {

	

	
	  waitForElement(Click_Paramm);
	
	if(Click_Paramm.isDisplayed())
	{
		System.out.println("Clicking on entity search");
		
		Actions acc=new Actions(driver);
		
		acc.moveToElement(Click_Paramm).click(Click_Paramm).build().perform();
		Click_Paramm.click();
	}

	Thread.sleep(6000);

	
	waitForElement1(Click_ACBEntryClass);
	Click_ACBEntryClass.click();
	Thread.sleep(6000);
	waitForElement(btn_Add);
	btn_Add.click();
	
	waitForElement(Edi_EntryCcode);
	
    String EntryCcode_Name=getData("EntryCcode_Name","ACBEbtryClass",1);

    Edi_EntryCcode.sendKeys(EntryCcode_Name);
    
    
	waitForElement(Edi_Desp);
	
    String Desp_Name=getData("Desp_Name","ACBEbtryClass",1);

    Edi_Desp.sendKeys(Desp_Name);
    
	waitForElement(Drop_ServiceType);
	
    String ServiceType_Name=getData("ServiceType_Name","ACBEbtryClass",1);

    Drop_ServiceType.sendKeys(ServiceType_Name);
    
    
	waitForElement(Drop_Naedotrackdaysid);
	
    String Naedotrackdaysid=getData("Naedotrackdaysid","ACBEbtryClass",1);

    Drop_Naedotrackdaysid.sendKeys(Naedotrackdaysid);
    
	waitForElement(Drp_Serviceid);
	
    String Serviceid=getData("Serviceid","ACBEbtryClass",1);

    Drp_Serviceid.sendKeys(Serviceid);
    
	waitForElement(Drop_DebORCre);
	
    String DebORCre=getData("DebORCre","ACBEbtryClass",1);

    Drop_DebORCre.sendKeys(DebORCre);
    
	waitForElement(Drop_ServicechannelID);
	
    String ServicechannelID=getData("ServicechannelID","ACBEbtryClass",1);

    Drop_ServicechannelID.sendKeys(ServicechannelID);
    
	waitForElement(Drop_B2BfILEid);
	
    String B2BfILEid=getData("B2BfILEid","ACBEbtryClass",1);

    Drop_B2BfILEid.sendKeys(B2BfILEid);
    
    waitForElement(Click_Save);
    Click_Save.click();
    
    waitForElement(Btn_Yes);
    Btn_Yes.click();
    
    
    
    
    
    
   

//Thread.sleep(3000);
//driver.quit();
	
			}
	
	
}
