package com.ScreenFunctions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.GenericFunctions.GenericMethods;

public class NewUser_creation extends GenericMethods{
	@FindBy(how=How.XPATH,using="//*[@id='mainnav']/li[2]/a")
	public static WebElement Click_EntitySearch;
	
	@FindBy(how=How.XPATH,using="//*[@id='EntityName']")
	public static WebElement Edi_EntitySearch;
	
	@FindBy(how=How.XPATH,using="//*[@id='btnSearch']")
	public static WebElement Btn_Search;
	
	@FindBy(how=How.XPATH,using="//*[@id='resultsGrid']/tbody/tr[1]/td[1]")
	public static WebElement Click_SearchResults;
	
	@FindBy(how=How.XPATH,using="//*[@id='btnOpen']")
	public static WebElement Btn_Open;
	
	@FindBy(how=How.XPATH,using="//*[@id='collapse1']/div/ul/li[1]/ul/li[3]/a")
	public static WebElement Click_Contactppl;
	
	@FindBy(how=How.XPATH,using="//*[@id='btnAdd']")
	public static WebElement Click_AddNewContact;
	
	@FindBy(how=How.XPATH,using="//*[@id='TitleID']")
	public static WebElement Dropd_Title;
	
	@FindBy(how=How.XPATH,using="//*[@id='FirstName']")
	public static WebElement Edi_FirstName;
	
	@FindBy(how=How.XPATH,using="//*[@id='Surname']")
	public static WebElement Edi_Surname;
	
	@FindBy(how=How.XPATH,using="//*[@id='Designation']")
	public static WebElement Edi_Designation;
		
	@FindBy(how=How.XPATH,using="//*[@id='IDNumber']")
	public static WebElement Edi_IDNumber;
	
	@FindBy(how=How.XPATH,using="//*[@id='Telephone']")
	public static WebElement Edi_Telephone;
	
	@FindBy(how=How.XPATH,using="//*[@id='MobilePhone']")
	public static WebElement Edi_MobilePhone;
	
	@FindBy(how=How.XPATH,using="//*[@id='Facsimile']")
	public static WebElement Edi_Fax;
	
	@FindBy(how=How.XPATH,using="//*[@id='EMailAddress']")
	public static WebElement Edi_EMailAddress;
	
	@FindBy(how=How.XPATH,using="//*[@id='InstantMessengerID']")
	public static WebElement Dropd_Messanger;
	
	@FindBy(how=How.XPATH,using="//*[@id='PositionID']")
	public static WebElement Dropd_PositionID;
	
	@FindBy(how=How.XPATH,using="//*[@id='EntityAddressID']")
	public static WebElement Dropd_EntityAddressID;
	
	@FindBy(how=How.XPATH,using="//*[@id='btnSave']")
	public static WebElement Btnt_Save;
	
	@FindBy(how=How.XPATH,using="//*[contains(text(), 'Yes')]")
	public static WebElement Btnt_Yes;
	
	@FindBy(how=How.XPATH,using="//*[text()='bzreddy']")
	public static WebElement Click_NUser;
		
	@FindBy(how=How.XPATH,using="//*[@id='btnSetupUser']")
	public static WebElement Click_MUser;
	
	@FindBy(how=How.XPATH,using="//*[contains(text(), 'Create')]")
	public static WebElement Create_NUser;
	
	@FindBy(how=How.XPATH,using="//*[@id='RoleAndPermissionsTab']")
	public static WebElement Btnt_RolesP;
	
	@FindBy(how=How.XPATH,using="//*[@id='btnSaveAsNew']")
	public static WebElement Btnt_SaveANew;
	
	@FindBy(how=How.XPATH,using="//*[@id='btnOpen']")
	public static WebElement Btnt_Open;
	
	//@FindBy(how=How.XPATH,using="//*[@id='RoleAndPermissionsTab']")
	//public static WebElement Btnt_RolesP;
	
	//@FindBy(how=How.XPATH,using="//*[@id='btnSaveAsNew']")
	//public static WebElement Btnt_SaveANew;
	
	

	public static <performDBLCLICK> void NewUser_creation() throws Exception
	{   
		waitForElement(Click_EntitySearch);
		if(Click_EntitySearch.isDisplayed())
		{
			System.out.println("Clicking on entity search");
			
			Actions acc=new Actions(driver);
			
			acc.moveToElement(Click_EntitySearch).click(Click_EntitySearch).build().perform();
			Click_EntitySearch.click();
        }
		waitForElement(Edi_EntitySearch);
		
		Click_EntitySearch.click();
		waitForElement(Edi_EntitySearch);
		Edi_EntitySearch.sendKeys("Insure group managers");
		Btn_Search.click();
		waitForElement(Click_SearchResults);
		Click_SearchResults.click();
		Btn_Open.click();
		waitForElement(Click_Contactppl);
//		waitForElement(Click_Contactppl);
//		if(Click_Contactppl.isDisplayed())
//		{
//			System.out.println("Clicking on entity search");
//			
//			Actions acc=new Actions(driver);
//			
//			acc.moveToElement(Click_Contactppl).click(Click_Contactppl).build().perform();
//			Click_Contactppl.click();
//        }
		Click_Contactppl.click();
		waitForElement(Click_AddNewContact);
		Click_AddNewContact.click();
		//waitForElement(Dropd_Title);
	//	waitUntilClickable(Dropd_Title);
      Thread.sleep(11000);
        Dropd_Title.sendKeys("Mrs");
		Edi_FirstName.sendKeys("bzreddy");
        Edi_Surname.sendKeys("z");
	    Edi_Designation.sendKeys("Tester");
	    Edi_IDNumber.sendKeys("S789456");
	    Edi_Telephone.sendKeys("0113180332");
        Edi_MobilePhone.sendKeys("0843353667");
        Edi_Fax.sendKeys("0112532363");
        Edi_EMailAddress.sendKeys("srinivas@repalas.com");
	    Dropd_Messanger.sendKeys("MSN");
	    Dropd_PositionID.sendKeys("Owner");
        Dropd_EntityAddressID.sendKeys("Physical Address, IOM HOUSE, 6 ST GILESs, RANDBURG, RANDBURG, Gauteng");
	    Btnt_Save.click();
	    waitForElement(Btnt_Yes);
	    Btnt_Yes.click();
	    waitForElement(Click_NUser);
		//performDBLCLICK(Click_NUser);
		performDBLCLICK(Click_NUser);
		waitForElement(Click_MUser);
		Click_MUser.click();
		waitForElement(Create_NUser);;
		Create_NUser.click();
		waitForElement(Btnt_RolesP);;
	    Btnt_RolesP.click();
	    waitForElement(Btnt_SaveANew);
	    Btnt_SaveANew.click();
	    waitForElement(Btnt_Open);
		Btnt_Open.click();

		
	}
	

}
	 