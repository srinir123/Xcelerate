package com.ScreenFunctions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.GenericFunctions.GenericMethods;

public class NewEntity_creation extends GenericMethods{

	@FindBy(how=How.XPATH,using="//*[@id='mainnav']/li[3]/a")
	public static WebElement Click_AddEntity;
	
	@FindBy(how=How.XPATH,using="//*[@id='EntityName']")
	public static WebElement Edi_EntityName;
	
	@FindBy(how=How.XPATH,using="//*[@id='LegalEntityTypeID']")
	public static WebElement Dropd_LEnityType;
	
	@FindBy(how=How.XPATH,using="//*[@id='EntityTypeID']")
	public static WebElement Dropd_EnityTypeID;
	
	@FindBy(how=How.XPATH,using="//*[@id='IDCoRegNumber']")
	public static WebElement Edi_RegRIdType;
	
	@FindBy(how=How.XPATH,using="//*[@id='btnNext']")
	public static WebElement Btnt_Next;
	
	@FindBy(how=How.XPATH,using="//*[@id='btnAdd']")
	public static WebElement Click_AddNewEntity;
	
	@FindBy(how=How.XPATH,using="//*[@id='PhysicalAddress']")
	public static WebElement Tick_PhysicalAddress;
	
	@FindBy(how=How.XPATH,using="//*[@id='ProvinceID']")
	public static WebElement Dropd_ProvinceId;
	
	@FindBy(how=How.XPATH,using="//*[@id='Building']")
	public static WebElement Edi_Building;
	
	@FindBy(how=How.XPATH,using="//*[@id='Street']")
	public static WebElement Edi_Street;
		
	@FindBy(how=How.XPATH,using="//*[@id='Suburb']")
	public static WebElement Edi_Suburb;
	
	@FindBy(how=How.XPATH,using="//*[@id='Town']")
	public static WebElement Edi_Town;
	
	@FindBy(how=How.XPATH,using="//*[@id='PostalCode']")
	public static WebElement Edi_PostalCode;
	
	@FindBy(how=How.XPATH,using="//*[@id='IsPostal']")
	public static WebElement Edi_IsPostal;
	
	@FindBy(how=How.XPATH,using="//*[@id='btnSave']")
	public static WebElement Btnt_Save;
	
	@FindBy(how=How.XPATH,using="//*[text()='Yes']")
	public static WebElement Btnt_Yes;
	
	@FindBy(how=How.XPATH,using="//*[@id='btnNext']")
	public static WebElement Btnt_Next1;
	
	@FindBy(how=How.XPATH,using="(//*[@id='btnAdd'])[2]")
	public static WebElement Btnt_AddContact ;
	
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
	
	@FindBy(how=How.XPATH,using="//*[@id='IsPrimaryContact']")
	public static WebElement Tick_PrimContact;
	
	@FindBy(how=How.XPATH,using="//*[@id='btnSave']")
	public static WebElement Btnt_Save1;
	
	@FindBy(how=How.XPATH,using="//*[contains(text(), 'Yes')]")
	public static WebElement Btnt_Yes1;
	
	@FindBy(how=How.XPATH,using="//*[@id='btnNext']")
	public static WebElement Btnt_Next2;
	
	@FindBy(how=How.XPATH,using="(//*[@id='UserID'])[1]")
	public static WebElement Dropd_UserID1;
	
	@FindBy(how=How.XPATH,using="(//*[@id='UserID'])[2]")
	public static WebElement Dropd_UserID2;
	
	@FindBy(how=How.XPATH,using="(//*[@id='UserID'])[3]")
	public static WebElement Dropd_UserID3;
	
	@FindBy(how=How.XPATH,using="(//*[@id='UserID'])[4]")
	public static WebElement Dropd_UserID4;
	
	@FindBy(how=How.XPATH,using="(//*[@id='UserID'])[5]")
	public static WebElement Dropd_UserID5;
	
	@FindBy(how=How.XPATH,using="(//*[@id='UserID'])[6]")
	public static WebElement Dropd_UserID6;
	
	@FindBy(how=How.XPATH,using="(//*[@id='ShadowUserID'])[1]")
	public static WebElement Dropd_SUserID1;
	
	@FindBy(how=How.XPATH,using="(//*[@id='ShadowUserID'])[2]")
	public static WebElement Dropd_SUserID2;
	
	@FindBy(how=How.XPATH,using="(//*[@id='ShadowUserID'])[3]")
	public static WebElement Dropd_SUserID3;
	
    @FindBy(how=How.XPATH,using="//*[@id='btnNext']")
	public static WebElement Btnt_Next3;
    
	@FindBy(how=How.XPATH,using="(//*[@id='resultsGrid']/tbody/tr[6]/td[1])[2]")
	public static WebElement Select_LC;
	
	@FindBy(how=How.XPATH,using="//*[@id='Select0']")
	public static WebElement Btnt_LCselect;
	
	@FindBy(how=How.XPATH,using="//*[@id='btnNext']")
	public static WebElement Btnt_Next4;
	
	@FindBy(how=How.XPATH,using="//*[@id='btnAdd']")
	public static WebElement Btnt_AddnewLE;
	
	@FindBy(how=How.XPATH,using="//*[@id='EntityLinkTypeID']")
	public static WebElement Dropd_ELtype;
	
	@FindBy(how=How.XPATH,using="//*[@id='EntityID']")
	public static WebElement Dropd_Entity;

	@FindBy(how=How.XPATH,using="(//*[@id='btnSave'])[2]")
	public static WebElement Btnt_SaveLE;
	
	@FindBy(how=How.XPATH,using="((//*[text()='Yes'])[2]")
	public static WebElement Btnt_YesSLE;
	
	@FindBy(how=How.XPATH,using="((//*[text()='Yes'])[2]")
	public static WebElement Btnt_Next5;
	
	
	
	public static void NewEntity_creation() throws Exception
	{   
		waitForElement(Click_AddEntity);
//	    if(Click_AddEntity.isDisplayed())
//	{
//		System.out.println("Clicking on entity search");
//		
//		Actions acc=new Actions(driver);
//		
//		acc.moveToElement(Click_AddEntity).click(Click_AddEntity).build().perform();
//		Click_AddEntity.click();
//    }
		//Click_AddEntity.click();
		click_element(Click_AddEntity);
		//Thread.sleep(9000);
		waitForElement(Edi_EntityName);
		Edi_EntityName.sendKeys("NewEntity8_Test83");
		Dropd_LEnityType.sendKeys("Company");
        Dropd_EnityTypeID.sendKeys("Insurer");
        Edi_RegRIdType.sendKeys("1951/118625/26"); 
        Btnt_Next.click();
		//Thread.sleep(12000);
        waitForElement(Click_AddNewEntity);
		Click_AddNewEntity.click();
		Thread.sleep(3000);
		//waitForElement(Tick_PhysicalAddress);
		Tick_PhysicalAddress.click();
		Dropd_ProvinceId.sendKeys("Gauteng");
        Edi_Building.sendKeys("IOM House");
	    Edi_Street.sendKeys("6 St Giles street");
	    Edi_Suburb.sendKeys("Johannesburg");
	    Edi_Town.sendKeys("Midrand");
        Edi_PostalCode.sendKeys("1686");
        Edi_IsPostal.click();
        Btnt_Save.click();
        waitForElement(Btnt_Yes);
        //Thread.sleep(1000);
	    Btnt_Yes.click();
	    waitForElement(Btnt_Next1);
		//Thread.sleep(6000);
	    Btnt_Next1.click();
	    waitForElement(Btnt_AddContact);
        //Thread.sleep(6000);
	    Btnt_AddContact.click();
	    waitForElement(Dropd_Title);
	    //Thread.sleep(4000);
        Dropd_Title.sendKeys("Mr");
        Edi_FirstName.sendKeys("book");
        Edi_Surname.sendKeys("I");
	    Edi_Designation.sendKeys("Tester");
	    Edi_IDNumber.sendKeys("S789456");
	    Edi_Telephone.sendKeys("0113180332");
        Edi_MobilePhone.sendKeys("0843353667");
        Edi_Fax.sendKeys("0112532363");
        Edi_EMailAddress.sendKeys("srinivas@repalas.com");
	    Dropd_Messanger.sendKeys("MSN");
	    Dropd_PositionID.sendKeys("Owner");
        Dropd_EntityAddressID.sendKeys("Physical Address, IOM HOUSE, 6 ST GILESs, RANDBURG, RANDBURG, Gauteng");
	    Tick_PrimContact.click();
        Btnt_Save1.click();
        waitForElement(Btnt_Yes1);
		//Thread.sleep(2000);
		Btnt_Yes1.click();
		waitForElement(Btnt_Next2);
		//Thread.sleep(5000);
        Btnt_Next2.click();
        waitForElement(Tick_PhysicalAddress);
		Thread.sleep(5000);
        Dropd_UserID1.sendKeys("Lynette Van Der Walt");
        Dropd_UserID2.sendKeys("Barry Levy");
        Dropd_UserID3.sendKeys("Angelique Bruggemans");
        Dropd_UserID4.sendKeys("Belinda Dubber");
        Dropd_UserID5.sendKeys("Dorathea Brits");
        Dropd_UserID6.sendKeys("Mpho Bogatsu");
        Dropd_SUserID1.sendKeys("Asiya Swaleh");
		Dropd_SUserID2.sendKeys("Annelise Harrison");
		Dropd_SUserID3.sendKeys("Sunitha Maistry");
		waitForElement(Btnt_Next3);
		//Thread.sleep(2000);
		Btnt_Next3.click();
		waitForElement(Select_LC);
		//Thread.sleep(8000);
        Select_LC.click();
        Btnt_LCselect.click();
        Btnt_Next4.click();
        waitForElement(Btnt_AddnewLE);
		//Thread.sleep(20000);
        Btnt_AddnewLE.click();
		Dropd_ELtype.sendKeys("Insurer");
		Dropd_Entity.sendKeys("Absa Life Limited");
		Btnt_SaveLE.click();
		Btnt_YesSLE.click();
		waitForElement(Btnt_Next5);
		//Thread.sleep(20000);
		Btnt_Next5.click();


		
        
	}
}
	 
