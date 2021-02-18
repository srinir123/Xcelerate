package com.ScreenFunctions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.GenericFunctions.DBConnection1;
import com.GenericFunctions.GenericMethods;
import com.GenericFunctions.NewDBConnection_OTP_ISOStory;
import com.GenericFunctions.NewDBConnection_OTP_Story1;

public class NewB2BUserCreation_ISO_Story extends GenericMethods{

	@FindBy(how=How.XPATH,using="//*[text()='Add Entity']")
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
	
	@FindBy(how=How.XPATH,using="(//*[text()='Yes'])[2]")
	public static WebElement Btn_subYes;
	
	@FindBy(how=How.XPATH,using="//*[@id='btnLogout2']")
	public static WebElement Btn_logout;
	
	
	@FindBy(how=How.XPATH,using="//*[@id='otp']")
	public static WebElement Edit_Otp;
	
	@FindBy(how=How.XPATH,using="//*[@id='password']")
	public static WebElement Edit_Pwd;
	
	@FindBy(how=How.XPATH,using="//*[@id='confirmpassword']")
	public static WebElement Edit_CPwd;
	
	@FindBy(how=How.XPATH,using="//*[@id='btnReset']")
	public static WebElement Btn_Reset;
	
	@FindBy(how=How.XPATH,using="//*[@id='btnAccept']")
	public static WebElement Btn_Accept;
	
	@FindBy(how=How.ID,using="txtUsername")
	public static WebElement Edi_Username;
	
	@FindBy(how=How.ID,using="txtPassword")
	public static WebElement Edi_Password;
	
	@FindBy(how=How.ID,using="btnLogin")
	public static WebElement Btn_Loginbtn;
	
	@FindBy(how=How.XPATH,using="//*[text()= 'Entity Search']")
	public static WebElement Click_EntitySearch;
	
	@FindBy(how=How.XPATH,using="//*[@id='EntityName']")
	public static WebElement Edi_EntitySearch;
	
	@FindBy(how=How.XPATH,using="//*[@id='btnSearch']")
	public static WebElement Btn_Search;
	
	@FindBy(how=How.XPATH,using="//*[@id='resultsGrid']/tbody/tr[1]/td[1]")
	public static WebElement Click_SearchResults;
	
	@FindBy(how=How.XPATH,using="//*[@id='btnOpen']")
	public static WebElement Btn_Open; 

	@FindBy(how=How.XPATH,using="//*[text()='Quotes']")
	public static WebElement Click_Qtotes;
	
	@FindBy(how=How.XPATH,using="//*[text()='Create Quote']")
	public static WebElement Btn_Createqtote;
	
	@FindBy(how=How.XPATH,using="//*[@id='Description']")
	public static WebElement Edi_Quotename;
	
	@FindBy(how=How.XPATH,using="//*[@id='AgreementTypeID']")
	public static WebElement Edi_Agreetypeid;
	
	@FindBy(how=How.XPATH,using="//*[@id='btnSave']")
	public static WebElement Btn_Continue;
	
	@FindBy(how=How.XPATH,using="//*[@id='btnQuote_submit']")
	public static WebElement Btn_SubmitApproval;	
	
	@FindBy(how=How.XPATH,using="//*[text()='Yes']")
	public static WebElement Btn_Yes;
	
	@FindBy(how=How.XPATH,using="//*[text()='Entity Information']")
	public static WebElement Click_Entityinfo;
	
	
	
	
	public static String taskid;
	
	public static String OTP;

	
	
	public static void NewB2BUserCreation_ISO_Story() throws Exception   
	{
Thread.sleep(5000);
		
//		try
//		{
//		
//			OTP=NewDBConnection_OTP.dbConnect2;
//
//		}
//		catch (Exception e)
//		{
//			
//	}
//		Thread.sleep(3000);
//		
//		try
//		{
//		
//			OTP=NewDBConnection_OTP_Story1.dbConnect3;
//		}
//		catch (Exception e)
//		{
//			
//	}
  


OTP=NewDBConnection_OTP_ISOStory.dbConnect3();
       

Thread.sleep(3000);
		
		System.out.println("Passwords have been reset");
		System.out.println("OTP");
		System.out.println(OTP);
        
		Thread.sleep(15000);
		//String OTP=getData("OTP","story1",0);

		Edit_Otp.sendKeys(OTP);
		Edit_Pwd.sendKeys("P@ssw0rd");
		Edit_CPwd.sendKeys("P@ssw0rd");
		waitForElement(Btn_Reset);
		Btn_Reset.click();
		waitForElement(Btn_Accept);
		Btn_Accept.click();
		
		
		
		
		waitForElement(Btn_logout);
		Btn_logout.click();
		String Username=getData("FirstName","story1",4).concat(getData("Surname","story1",4).substring(0, 1));	
		  String password=getData("Password","story1",4);	
	      Edi_Username.clear();
	     Edi_Username.sendKeys(Username);
	     Edi_Password.clear();
	     Edi_Password.sendKeys(password);
	     Btn_Loginbtn.click();
		



		
		Thread.sleep(10000);
//		waitForElement(Click_AddEntity);
//		Thread.sleep(3000);
//		Click_AddEntity.click();
//
//		
//        waitForElement(Edi_EntityName);
//        
//		
//        String EntityName=getData("EntityName","story1",1);
//
//		Edi_EntityName.sendKeys(EntityName);
//		
//        String LEntityType=getData("LEntityType","story1",1);
//        		
//		Dropd_LEntityType.sendKeys(LEntityType);
//		
//        //Dropd_EnityTypeID.sendKeys("Underwriter");
//        
//        String EnityTypeID=getData("EnityTypeID","story1",1);
//
//        Dropd_EnityTypeID.sendKeys(EnityTypeID);
//        
//        String RegRIdType=getData("RegRIdType","story1",1);
//
//        Edi_RegRIdType.sendKeys(RegRIdType); 
//		Thread.sleep(3000);
//		waitForElement(Btnt_Next);
//        Btnt_Next.click();
//        
//        Thread.sleep(3000);
//
//        waitForElement(Click_AddNewEntity);
//        Click_AddNewEntity.click();
//        Thread.sleep(5000);
//        Tick_PhysicalAddress.click();
//
//        String ProvinceId=getData("ProvinceId","story1",1);
//
//        Dropd_ProvinceId.sendKeys(ProvinceId);
//
//        String Building=getData("Building","story1",1);
//
//        Edi_Building.sendKeys(Building);
//
//        String Street=getData("Street","story1",1);
//
//        Edi_Street.sendKeys(Street);
//
//        String Suburb=getData("Suburb","story1",1);
//
//        Edi_Suburb.sendKeys(Suburb);
//
//        String Town=getData("Town","story1",1);
//
//        Edi_Town.sendKeys(Town);
//
//        String PostalCode=getData("PostalCode","story1",1);
//
//        Edi_PostalCode.sendKeys(PostalCode);
//        Edi_IsPostal.click();
//        Btnt_Save.click();
//        waitForElement(Btnt_Yes);
//        Btnt_Yes.click();
//
//        Thread.sleep(5000);
//
//        waitForElement(Btnt_Next1);
//        Btnt_Next1.click();
//
//
//        waitForElement(Btnt_AddContact);
//        Btnt_AddContact.click();
//        waitForElement(Dropd_Title);
//
//        String Title1=getData("Title1","story1",1);
//
//        Dropd_Title.sendKeys(Title1);
//
//        String FirstName1=getData("FirstName1","story1",1);
//
//        Edi_FirstName.sendKeys(FirstName1);
//
//        String Surname1=getData("Surname1","story1",1);
//
//        Edi_Surname.sendKeys(Surname1);
//
//        String Designation1=getData("Designation1","story1",1);
//
//        Edi_Designation.sendKeys(Designation1);
//
//        String IDNumber1=getData("IDNumber1","story1",1);
//
//        Edi_IDNumber.sendKeys(IDNumber1);
//
//        String Telephone1=getData("Telephone1","story1",1);
//
//        Edi_Telephone.sendKeys(Telephone1);
//
//        String MobilePhone1=getData("MobilePhone1","story1",1);
//
//        Edi_MobilePhone.sendKeys(MobilePhone1);
//
//
//        String Fax1=getData("Fax1","story1",1);
//
//        Edi_Fax.sendKeys(Fax1);
//
//        String EMailAddress1=getData("EMailAddress1","story1",1);
//
//        Edi_EMailAddress.sendKeys(EMailAddress1);
//
//        String Messanger1=getData("Messanger1","story1",1);
//
//        Dropd_Messanger.sendKeys(Messanger1);
//
//        String PositionID1=getData("PositionID1","story1",1);
//
//        Dropd_PositionID.sendKeys(PositionID1);
//
//        String EntityAddressID=getData("EntityAddressID","story1",1);
//
//        Dropd_EntityAddressID.sendKeys(EntityAddressID);
//
//        Tick_PrimContact.click();
//        Btnt_Save1.click();
//        waitForElement(Btnt_Yes1);
//        Btnt_Yes1.click();
//
//        Thread.sleep(6000);
//
//        waitForElement(Btnt_Next2);
//        Btnt_Next2.click();
//        waitForElement(Dropd_UserID1);
//        Dropd_UserID1.sendKeys("Lynette Van Der Walt");
//        Dropd_UserID2.sendKeys("Barry Levy");
//        Dropd_UserID3.sendKeys("Angelique Bruggemans");
//        Dropd_UserID4.sendKeys("Belinda Dubber");
//        Dropd_UserID5.sendKeys("Dorathea Brits");
//        Dropd_UserID6.sendKeys("Mpho Bogatsu");
//        Dropd_SUserID1.sendKeys("Asiya Swaleh");
//        Dropd_SUserID2.sendKeys("Annelise Harrison");
//        Dropd_SUserID3.sendKeys("Sunitha Maistry");
//        waitForElement(Btnt_Next3);
//        Btnt_Next3.click();
//        
//        waitForElement(Select_LC);
//        Select_LC.click();
//        waitForElement(Btnt_LCselect);
//        //Btnt_LCselect.click();
//        click_element(Btnt_LCselect);
//        Btnt_Next4.click();
//        waitForElement(Btnt_AddnewLE);
//        
//        Btnt_AddnewLE.click();
//        waitForElement(Dropd_ELtype);
//        String ELtype=getData("ELtype","story1",1);
//
//        Dropd_ELtype.sendKeys(ELtype);
//        waitForElement(Dropd_Entity);
//        String Entity=getData("Entity","story1",1);
//    
//        Dropd_Entity.sendKeys(Entity);
//        
//        waitForElement(Btnt_SaveLE);
//        Btnt_SaveLE.click();
//        waitForElement(Btnt_YesSLE);
//        Btnt_YesSLE.click();
//            
//        Thread.sleep(45000);
//        Btn_NextLE.click();
//        
//        waitForElement(Btn_subYes);
//        Btn_subYes.click();
//        
//        System.out.println("The new Entity has been created successfully");
//    	LogEvent("Pass","The new Entity has been created successfully");
//    
//        Thread.sleep(3000);
//
//        
//        waitForElement1(Click_EntitySearch);
//		if(Click_EntitySearch.isDisplayed())
//		{
//			System.out.println("Clicking on entity search");
//			
//			Actions acc=new Actions(driver);
//			
//			
//			acc.moveToElement(Click_EntitySearch).click(Click_EntitySearch).build().perform();
//			Click_EntitySearch.click();
//        }
//
//
//		//Click_EntitySearch.click();
//		waitForElement(Edi_EntitySearch);
//		
//	     String EntityName1=getData("EntityName","story1",1);
//
//		Edi_EntitySearch.sendKeys(EntityName1);
//		waitForElement(Btn_Search);
//		Btn_Search.click();
//		
//		waitForElement(Click_SearchResults);
//		Click_SearchResults.click();
//		waitForElement(Btn_Open);
//		Btn_Open.click();
//		
//		waitForElement(Click_Qtotes);
//		Click_Qtotes.click();
//		waitForElement(Btn_Createqtote);
//		Btn_Createqtote.click();
//		
//		waitForElement(Edi_Quotename);
//		
//	     String Quotename=getData("QuoteName","story1",1);
//
//	     Edi_Quotename.sendKeys(Quotename);
//		
//		waitForElement(Edi_Agreetypeid);
//		
//	     String AgreementType=getData("AgreementType","story1",1);
//
//	     Edi_Agreetypeid.sendKeys(AgreementType);
//	     
//	     waitForElement(Btn_Continue);
//	     Btn_Continue.click();
//	     
//	     waitForElement(Btn_SubmitApproval);
//	     click_element(Btn_SubmitApproval);
//	     waitForElement(Btn_Yes);
//	     Btn_Yes.click();
//	     waitForElement(Btn_Yes);
//	     click_element(Btn_Yes);
//
//        
//       Thread.sleep(3000);
        

    	//driver.quit();
    	waitForElement(Btn_logout);
    	Btn_logout.click();
		
        taskid= DBConnection1.dbConnect1();
        
        System.out.println(taskid);

	}
}
	 
