package com.ScreenFunctions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.GenericFunctions.GenericMethods;

public class NewEntity_creation extends GenericMethods{

	@FindBy(how=How.XPATH,using="//*[@id='mainnav']/li[3]/a")
	public static WebElement Click_AddEntity;
	
	@FindBy(how=How.XPATH,using="//*[@id='EntityName']")
	public static WebElement Edi_EntityName;
	
	@FindBy(how=How.XPATH,using="//*[@id='LegalEntityTypeID']")
	public static WebElement Dropd_LEntityType;
	
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
	
	@FindBy(how=How.XPATH,using="(//*[@id='btnAdd'])[3]")
	public static WebElement Btnt_AddnewLE;
	
	@FindBy(how=How.XPATH,using="//*[@id='EntityLinkTypeID']")
	public static WebElement Dropd_ELtype;
	
	@FindBy(how=How.XPATH,using="//*[@id='EntityID']")
	public static WebElement Dropd_Entity;

	@FindBy(how=How.XPATH,using="(//*[@id='btnSave'])[2]")
	public static WebElement Btnt_SaveLE;
	
	@FindBy(how=How.XPATH,using="(//*[text()='Yes'])[2]")
	public static WebElement Btnt_YesSLE;
	
	@FindBy(how=How.XPATH,using="//*[@id='btnNext']")
	public static WebElement Btnt_Next5;
	
	@FindBy(how=How.XPATH,using="//*[@id='Select0']")
	public static WebElement Btnt_AddLc;
	
	@FindBy(how=How.XPATH,using="//*[@id=btnNext']")
	public static WebElement Btnt_AddLcNext;
	
	@FindBy(how=How.XPATH,using="(//*[@id='btnAdd'])[3]")
	public static WebElement Btnt_AddLE;	
	
	@FindBy(how=How.XPATH,using="//*[@id='EntityLinkTypeID']")
	public static WebElement Drop_EntLnkType;
	
	@FindBy(how=How.XPATH,using="//*[@id='EntityID']")
	public static WebElement Drop_Ent;
	
	@FindBy(how=How.XPATH,using="(//*[@id='btnSave'])[2]")
	public static WebElement Btn_saveLE;
	
	@FindBy(how=How.XPATH,using="//*[@id='btnNext']")
	public static WebElement Btn_NextLE;
	
//	@FindBy(how=How.XPATH,using="(//*[text()='Yes'])[2]")
//	public static WebElement Btn_subYes;
	
	
	
	
	public static void NewEntity_creation() throws Exception   
	{
		//waitForElement(Click_AddEntity);
        //click_element(Click_AddEntity);
		Click_AddEntity.click();

		
        waitForElement(Edi_EntityName);
        
        //Thread.sleep(14000);
		
        String EntityName=getData("EntityName","NewEntity_creation",1);

		Edi_EntityName.sendKeys(EntityName);
		
        String LEntityType=getData("LEntityType","NewEntity_creation",1);
        		
		Dropd_LEntityType.sendKeys(LEntityType);
		
        Dropd_EnityTypeID.sendKeys("Insurer");
        
        String EnityTypeID=getData("EnityTypeID","NewEntity_creation",1);

        Dropd_EnityTypeID.sendKeys(EnityTypeID);
        
        String RegRIdType=getData("RegRIdType","NewEntity_creation",1);

        Edi_RegRIdType.sendKeys(RegRIdType); 
		Thread.sleep(3000);

///////        waitForElement(Btnt_Next);
        Btnt_Next.click();
        
        Thread.sleep(3000);

        waitForElement(Click_AddNewEntity);
        Click_AddNewEntity.click();
        Thread.sleep(3000);
        //waitForElement(Tick_PhysicalAddress);
        Tick_PhysicalAddress.click();

        String ProvinceId=getData("ProvinceId","NewEntity_creation",1);

        Dropd_ProvinceId.sendKeys(ProvinceId);

        String Building=getData("Building","NewEntity_creation",1);

        Edi_Building.sendKeys(Building);

        String Street=getData("Street","NewEntity_creation",1);

        Edi_Street.sendKeys(Street);

        String Suburb=getData("Suburb","NewEntity_creation",1);

        Edi_Suburb.sendKeys(Suburb);

        String Town=getData("Town","NewEntity_creation",1);

        Edi_Town.sendKeys(Town);

        String PostalCode=getData("PostalCode","NewEntity_creation",1);

        Edi_PostalCode.sendKeys(PostalCode);
        Edi_IsPostal.click();
        Btnt_Save.click();
        waitForElement(Btnt_Yes);
        //Thread.sleep(1000);
        Btnt_Yes.click();

        Thread.sleep(4000);

        waitForElement(Btnt_Next1);
        //Thread.sleep(6000);
        Btnt_Next1.click();


        waitForElement(Btnt_AddContact);
        //Thread.sleep(6000);
        Btnt_AddContact.click();
        waitForElement(Dropd_Title);
        //Thread.sleep(4000);

        String Title=getData("Title","NewEntity_creation",1);

        Dropd_Title.sendKeys(Title);

        String FirstName=getData("FirstName","NewEntity_creation",1);

        Edi_FirstName.sendKeys(FirstName);

        String Surname=getData("Surname","NewEntity_creation",1);

        Edi_Surname.sendKeys(Surname);

        String Designation=getData("Designation","NewEntity_creation",1);

        Edi_Designation.sendKeys(Designation);

        String IDNumber=getData("IDNumber","NewEntity_creation",1);

        Edi_IDNumber.sendKeys(IDNumber);

        String Telephone=getData("Telephone","NewEntity_creation",1);

        Edi_Telephone.sendKeys(Telephone);

        String MobilePhone=getData("MobilePhone","NewEntity_creation",1);

        Edi_MobilePhone.sendKeys(MobilePhone);


        String Fax=getData("Fax","NewEntity_creation",1);

        Edi_Fax.sendKeys(Fax);

        String EMailAddress=getData("EMailAddress","NewEntity_creation",1);

        Edi_EMailAddress.sendKeys(EMailAddress);

        String Messanger=getData("Designation","NewEntity_creation",1);

        Dropd_Messanger.sendKeys(Messanger);

        String PositionID=getData("PositionID","NewEntity_creation",1);

        Dropd_PositionID.sendKeys(PositionID);

        String EntityAddressID=getData("EntityAddressID","NewEntity_creation",1);

        Dropd_EntityAddressID.sendKeys(EntityAddressID);

        Tick_PrimContact.click();
        Btnt_Save1.click();
        waitForElement(Btnt_Yes1);
        //Thread.sleep(2000);
        Btnt_Yes1.click();

        Thread.sleep(4000);

        waitForElement(Btnt_Next2);
        //Thread.sleep(5000);
        Btnt_Next2.click();
        //waitForElement(Tick_PhysicalAddress);
        //Thread.sleep(5000);
        waitForElement(Dropd_UserID1);
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
        waitForElement(Dropd_ELtype);
        String ELtype=getData("ELtype","NewEntity_creation",1);

        Dropd_ELtype.sendKeys(ELtype);
        waitForElement(Dropd_Entity);
        String Entity=getData("Entity","NewEntity_creation",1);
    
        Dropd_Entity.sendKeys(Entity);
        
        waitForElement(Btnt_SaveLE);
        Btnt_SaveLE.click();
        waitForElement(Btnt_YesSLE);
        Btnt_YesSLE.click();
            
        waitForElement(Btn_NextLE);
		Btn_NextLE.click();

      

        
//         waitForElement(Btn_submitLE);
//         Btn_submitLE.click();
//         waitForElement(Btn_subYes);
//         Btn_subYes.click();
     
        
        //Btn_submitLE.click();
        //Btn_submitLE.click();
//        Thread.sleep(3000);
//        waitForElement(Btnt_AddLc);
//        Btnt_AddLc.click();
//        Thread.sleep(3000);
//
//        waitForElement(Btnt_AddLcNext);
//        Btnt_AddLcNext.click();
//        //Thread.sleep(15000);
//
//
//        waitForElement(Btnt_AddLE);
//        Btnt_AddLE.click();
//        //click_element(Btnt_AddLE);
//        //waitForElement(Drop_EntLnkType);
//
//        String EntLnkType=getData("EntLnkType","NewEntity_creation",1);
//
//        Drop_EntLnkType.sendKeys(EntLnkType);
//
//        //waitForElement(Drop_Ent);
//
//        String EntityName1=getData("EntityName1","NewEntity_creation",1);
//
//        Drop_Ent.sendKeys(EntityName1);
//
//        waitForElement(Btn_saveLE);
//
//        Btn_saveLE.click();
//
//
//
//        driver.quit();
//
//




        

	


	}
}
	 
