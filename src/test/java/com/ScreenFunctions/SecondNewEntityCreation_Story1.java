package com.ScreenFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.GenericFunctions.DBConnection;
import com.GenericFunctions.DBConnection1;
import com.GenericFunctions.DBConnection2;
import com.GenericFunctions.GenericMethods;
import com.GenericFunctions.NewDBConnection_OTP_Story1;

public class SecondNewEntityCreation_Story1 extends GenericMethods{

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
	
	@FindBy(how=How.XPATH,using="//*[@id='mainnav']/li[1]/a")
	public static WebElement Click_Dashboard;
	
	@FindBy(how=How.XPATH,using="//*[@id='btnAuthAccept']")
	public static WebElement Click_btnVerify;
	
	@FindBy(how=How.XPATH,using="//button[contains(text(),'Yes')]")
	public static WebElement Click_Yes;
	
	@FindBy(how=How.XPATH,using="//*[@id='btnAuthAccept']")
	public static WebElement Click_verifyEntityinfo;
	
	@FindBy(how=How.XPATH,using="//*[text()='Bank Accounts']")
	public static WebElement Click_BankAccounts;
	
	@FindBy(how=How.XPATH,using="//*[@id='btnAdd']")
	public static WebElement Click_BtnAdd;
	
	@FindBy(how=How.XPATH,using="//*[@id='Text1']")
	public static WebElement Edi_AccHolder;
	
	@FindBy(how=How.XPATH,using="//*[@id='AccountNumber']")
	public static WebElement Edi_Accnumber;
	
	@FindBy(how=How.XPATH,using="//*[@id='AccountDescription']")
	public static WebElement Edi_Accdescrp;
	
	@FindBy(how=How.XPATH,using="//*[@id='BankAccountTypeID']")
	public static WebElement drop_AcctypeID;
	
	@FindBy(how=How.XPATH,using="//*[@id='BranchCode']")
	public static WebElement Edi_Branchcode;
	
	@FindBy(how=How.XPATH,using="//*[@id='StatusID']")
	public static WebElement Drop_Statusid;
	
	@FindBy(how=How.XPATH,using="//*[@id='btnSaveOne']")
	public static WebElement Click_btnsave;
	
	@FindBy(how=How.XPATH,using="//*[text()='Entity Link']")
	public static WebElement Click_Entitylink;
	
	@FindBy(how=How.XPATH,using="//*[@id='EntityLinkTypeID']")
	public static WebElement Click_Entitylinktypeid;
	
	@FindBy(how=How.XPATH,using="//*[@id='EntityID']")
	public static WebElement Click_Entitid;
	
	@FindBy(how=How.XPATH,using="//*[@id='btnSave']")
	public static WebElement btn_Save;
	
//	@FindBy(how=How.XPATH,using="//*[text()='Yes']")
//	public static WebElement Btn_Yes;
	
	@FindBy(how=How.XPATH,using="//*[text()='Nominated Payment Parties']")
	public static WebElement Click_Nomipmtparties;
	
	
	
	
	@FindBy(how=How.XPATH,using="//*[@id='AccountDescription']")
	public static WebElement Edi_Accdescrip;
	
	@FindBy(how=How.XPATH,using="//*[@id='AccountHolder']")
	public static WebElement Edi_AccHoldr;
	
	@FindBy(how=How.XPATH,using="//*[@id='TransactionReference']")
	public static WebElement Edi_Transref;
	
	@FindBy(how=How.XPATH,using="//*[@id='BranchCode']")
	public static WebElement Edi_branchcode;
	
	@FindBy(how=How.XPATH,using="//*[@id='AccountNumber']")
	public static WebElement Edi_Accnum;
	
	@FindBy(how=How.XPATH,using="//*[@id='BankAccountTypeID']")
	public static WebElement drop_bnkacctypid;
	
	@FindBy(how=How.XPATH,using="//*[@id='Days']")
	public static WebElement Edi_Days;
	
	@FindBy(how=How.XPATH,using="//*[@id='TransactionTypeID']")
	public static WebElement Edi_transtypid;
	
	@FindBy(how=How.XPATH,using="//*[@id='TransactionSubTypeID']")
	public static WebElement Edi_transsubtypid;
	
	@FindBy(how=How.XPATH,using="//*[@id='DayOfMonth']")
	public static WebElement Edi_dayofmonth;
	
	@FindBy(how=How.XPATH,using="//*[@id='InternalReference']")
	public static WebElement Edi_intref;
	
	@FindBy(how=How.XPATH,using="//*[@id='ActiveForPayments']")
	public static WebElement Click_active4pmts;
	
	@FindBy(how=How.XPATH,using="//*[@id='btnSaveOne']")
	public static WebElement Click_Save;
	
	@FindBy(how=How.XPATH,using="//button[contains(text(),'Yes')]")
	public static WebElement Click_Yes1;
	
	
	@FindBy(how=How.XPATH,using="//*[text()= 'Insurers / UMAs']")
	public static WebElement Click_InsurerUma;
	
	@FindBy(how=How.XPATH,using="//*[@id='lstLeft']/li[1]/p")
	public static WebElement Click_Uma;
	
	@FindBy(how=How.XPATH,using="//*[@id='btnAdd']")
	public static WebElement Add_Uma;
	


	
	
	
	
	
	
	public static String taskid;
	
	public static String OTP;

	
	
	public static void SecondNewEntityCreation_Story1() throws Exception   
	{
Thread.sleep(14000);
 // BACK TO 4 SEC
		
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
  


//OTP=NewDBConnection_OTP_Story1.dbConnect3(1);
//       
//
//Thread.sleep(2000);
//		
//		System.out.println("Passwords have been reset");
//		System.out.println("OTP");
//		System.out.println(OTP);
//        
//		//String OTP=getData("OTP","NewUser_creation",i);
//
//		Edit_Otp.sendKeys(OTP);
//		Edit_Pwd.sendKeys("P@ssw0rd");
//		Edit_CPwd.sendKeys("P@ssw0rd");
//		waitForElement(Btn_Reset);
//		Btn_Reset.click();
//		waitForElement(Btn_Accept);
//		Btn_Accept.click();
//		
//		
//		
//		
//		waitForElement(Btn_logout);
//		Btn_logout.click();
//		String Username=getData("FirstName","story1",1).concat(getData("Surname","story1",1).substring(0, 1));	
//		  String password=getData("Password","story1",1);	
//	      Edi_Username.clear();
//	     Edi_Username.sendKeys(Username);
//	     Edi_Password.clear();
//	     Edi_Password.sendKeys(password);
//	     Btn_Loginbtn.click();
		

		
		//Thread.sleep(10000);
		waitForElement(Click_AddEntity);
//		Thread.sleep(3000);
		Click_AddEntity.click();

		
        waitForElement(Edi_EntityName);
        
		
        String EntityName=getData("EntityName","story1",2);

		Edi_EntityName.sendKeys(EntityName);
		
        String LEntityType=getData("LEntityType","story1",2);
        		
		Dropd_LEntityType.sendKeys(LEntityType);
		
        //Dropd_EnityTypeID.sendKeys("Underwriter");
        
        String EnityTypeID=getData("EnityTypeID","story1",2);

        Dropd_EnityTypeID.sendKeys(EnityTypeID);
        
        String RegRIdType=getData("RegRIdType","story1",2);

        Edi_RegRIdType.sendKeys(RegRIdType); 
		Thread.sleep(3000);
		waitForElement(Btnt_Next);
        Btnt_Next.click();
        
        Thread.sleep(3000);

        waitForElement(Click_AddNewEntity);
        Click_AddNewEntity.click();
        Thread.sleep(5000);
        Tick_PhysicalAddress.click();

        String ProvinceId=getData("ProvinceId","story1",2);

        Dropd_ProvinceId.sendKeys(ProvinceId);

        String Building=getData("Building","story1",2);

        Edi_Building.sendKeys(Building);

        String Street=getData("Street","story1",2);

        Edi_Street.sendKeys(Street);

        String Suburb=getData("Suburb","story1",2);

        Edi_Suburb.sendKeys(Suburb);

        String Town=getData("Town","story1",2);

        Edi_Town.sendKeys(Town);

        String PostalCode=getData("PostalCode","story1",2);

        Edi_PostalCode.sendKeys(PostalCode);
        Edi_IsPostal.click();
        Btnt_Save.click();
        waitForElement(Btnt_Yes);
        Btnt_Yes.click();

        Thread.sleep(5000);

        waitForElement(Btnt_Next1);
        Btnt_Next1.click();


        waitForElement(Btnt_AddContact);
        Btnt_AddContact.click();
        waitForElement(Dropd_Title);

        String Title1=getData("Title1","story1",2);

        Dropd_Title.sendKeys(Title1);

        String FirstName1=getData("FirstName1","story1",2);

        Edi_FirstName.sendKeys(FirstName1);

        String Surname1=getData("Surname1","story1",2);

        Edi_Surname.sendKeys(Surname1);

        String Designation1=getData("Designation1","story1",2);

        Edi_Designation.sendKeys(Designation1);

        String IDNumber1=getData("IDNumber1","story1",2);

        Edi_IDNumber.sendKeys(IDNumber1);

        String Telephone1=getData("Telephone1","story1",2);

        Edi_Telephone.sendKeys(Telephone1);

        String MobilePhone1=getData("MobilePhone1","story1",2);

        Edi_MobilePhone.sendKeys(MobilePhone1);


        String Fax1=getData("Fax1","story1",2);

        Edi_Fax.sendKeys(Fax1);

        String EMailAddress1=getData("EMailAddress1","story1",2);

        Edi_EMailAddress.sendKeys(EMailAddress1);

        String Messanger1=getData("Messanger1","story1",2);

        Dropd_Messanger.sendKeys(Messanger1);

        String PositionID1=getData("PositionID1","story1",2);

        Dropd_PositionID.sendKeys(PositionID1);

        String EntityAddressID=getData("EntityAddressID","story1",2);

        Dropd_EntityAddressID.sendKeys(EntityAddressID);

        Tick_PrimContact.click();
        Btnt_Save1.click();
        waitForElement(Btnt_Yes1);
        Btnt_Yes1.click();

        Thread.sleep(6000);

        waitForElement(Btnt_Next2);
        Btnt_Next2.click();
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
        Thread.sleep(10000);
        //waitForElement(Btnt_Next3);
        click_element(Btnt_Next3);
        
        waitForElement(Select_LC);
        Select_LC.click();
        waitForElement(Btnt_LCselect);
        Btnt_LCselect.click();
        Btnt_Next4.click();
        waitForElement(Btnt_AddnewLE);
        
        Btnt_AddnewLE.click();
        waitForElement(Dropd_ELtype);
        String ELtype=getData("ELtype","story1",2);

        Dropd_ELtype.sendKeys(ELtype);
        waitForElement(Dropd_Entity);
        String Entity=getData("Entity","story1",2);
    
        Dropd_Entity.sendKeys(Entity);
        
        waitForElement(Btnt_SaveLE);
        Btnt_SaveLE.click();
        waitForElement(Btnt_YesSLE);
        Btnt_YesSLE.click();
            
        Thread.sleep(45000);
        Btn_NextLE.click();
        
        waitForElement(Btn_subYes);
        Btn_subYes.click();
        Thread.sleep(5000);
        
        System.out.println("The new Entity has been created successfully");
    	LogEvent("Pass","The new Entity has been created successfully");
        
        
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

        
        Thread.sleep(5000);
        

    	//driver.quit();
 
		
        taskid= DBConnection2.dbConnect2();
        
        System.out.println(taskid);
        
		Click_Dashboard.click();
		Thread.sleep(6000);
		
		System.out.println(story1.taskid);
		driver.findElement(By.xpath("//td[text()='"+SecondNewEntityCreation_Story1.taskid+"']")).click();
		Thread.sleep(5000);
		waitForElement(Click_btnVerify);
		Click_btnVerify.click();
		waitForElement(Click_Yes);
		Click_Yes.click();
		Thread.sleep(3000);
		waitForElement(Click_Entityinfo);
		Click_Entityinfo.click();
		
		waitForElement(Click_verifyEntityinfo);
		Click_verifyEntityinfo.click();
		
		waitForElement(Click_Yes);
		Click_Yes.click();
		
	   	waitForElement(Btn_logout);
    	Btn_logout.click();
		
		
	     Edi_Username.sendKeys("idahm");
	     Edi_Password.sendKeys("P@ssw0rd");
	     Btn_Loginbtn.click();
	     
			waitForElement1(Click_EntitySearch);
			if(Click_EntitySearch.isDisplayed())
			{
				System.out.println("Clicking on entity search");
				
				Actions acc=new Actions(driver);
				
				
				acc.moveToElement(Click_EntitySearch).click(Click_EntitySearch).build().perform();
				Click_EntitySearch.click();
	        }

			waitForElement(Edi_EntitySearch);
			
			//Click_EntitySearch.click();
			waitForElement(Edi_EntitySearch);
			
			String EntityName2=getData("EntityName","story1",2);	
			Edi_EntitySearch.sendKeys(EntityName2);
			
			waitForElement(Btn_Search);
			Btn_Search.click();
			waitForElement(Click_SearchResults);
			Click_SearchResults.click();
			waitForElement(Btn_Open);
			Btn_Open.click();
			waitForElement(Click_BankAccounts);
			Click_BankAccounts.click();
		    waitForElement(Click_BtnAdd);
		    Click_BtnAdd.click();

		    waitForElement(Edi_AccHolder);
			String AccountHolder=getData("AccountHolder","story1",1);
		    Edi_AccHolder.sendKeys(AccountHolder);
		    
		    waitForElement(Edi_Accnumber);
			String AccountNumber=getData("AccountNumber","story1",1);
			Edi_Accnumber.sendKeys(AccountNumber);
		    
		    waitForElement(Edi_Accdescrp);
			String AccountDescription=getData("AccountDescription","story1",1);
			Edi_Accdescrp.sendKeys(AccountDescription);
			
			waitForElement(drop_AcctypeID);
			String AccountTypeID=getData("AccountTypeID","story1",1);
			drop_AcctypeID.sendKeys(AccountTypeID);
			
		    waitForElement(Edi_Branchcode);
			String BranchCode=getData("BranchCode","story1",1);
			Edi_Branchcode.sendKeys(BranchCode);
			
		    waitForElement(Drop_Statusid);
			String StatusID=getData("StatusID","story1",1);
			Drop_Statusid.sendKeys(StatusID);
			
			waitForElement(Click_btnsave);
			Click_btnsave.click();
			
			waitForElement(Btnt_Yes);
			Btnt_Yes.click();
			
			Thread.sleep(5000);
			
//			waitForElement(Click_BtnAdd);
//		    Click_BtnAdd.click();

		    waitForElement(Edi_AccHolder);
			String AccountHolder1=getData("AccountHolder","story1",2);
		    Edi_AccHolder.sendKeys(AccountHolder1);
		    
			Thread.sleep(1000);
		    
		    waitForElement(Edi_Accnumber);
			String AccountNumber1=getData("AccountNumber","story1",2);
			Edi_Accnumber.sendKeys(AccountNumber1);
		    
		    waitForElement(Edi_Accdescrp);
			String AccountDescription1=getData("AccountDescription","story1",2);
			Edi_Accdescrp.sendKeys(AccountDescription1);
			
			waitForElement(drop_AcctypeID);
			String AccountTypeID1=getData("AccountTypeID","story1",2);
			drop_AcctypeID.sendKeys(AccountTypeID1);
			
		    waitForElement(Edi_Branchcode);
			String BranchCode1=getData("BranchCode","story1",2);
			Edi_Branchcode.sendKeys(BranchCode1);
			
		    waitForElement(Drop_Statusid);
			String StatusID1=getData("StatusID","story1",2);
			Drop_Statusid.sendKeys(StatusID1);
			
			waitForElement(Click_btnsave);
			Click_btnsave.click();
			
			waitForElement(Btnt_Yes);
			Btnt_Yes.click();
			
			Thread.sleep(3000);
			
			waitForElement1(Click_EntitySearch);
			if(Click_EntitySearch.isDisplayed())
			{
				System.out.println("Clicking on entity search");
				
				Actions acc=new Actions(driver);
				
				
				acc.moveToElement(Click_EntitySearch).click(Click_EntitySearch).build().perform();
				Click_EntitySearch.click();
	        }

			waitForElement(Edi_EntitySearch);
			
			//Click_EntitySearch.click();
			waitForElement(Edi_EntitySearch);
			
			String EntityName3=getData("EntityName","story1",1);	
			Edi_EntitySearch.sendKeys(EntityName3);
			
			waitForElement(Btn_Search);
			Btn_Search.click();
			waitForElement(Click_SearchResults);
			Click_SearchResults.click();
			waitForElement(Btn_Open);
			Btn_Open.click();
			
			waitForElement(Click_Entitylink);
			Click_Entitylink.click();
			
			waitForElement(Click_BtnAdd);
			Click_BtnAdd.click();
			
			waitForElement(Click_Entitylinktypeid);
			String Entitylinktypeid=getData("Entitylinktypeid","story1",1);
			Click_Entitylinktypeid.sendKeys(Entitylinktypeid);
			
			waitForElement(Click_Entitid);
			String EntityId=getData("EntityId","story1",1);
			Click_Entitid.sendKeys(EntityId);
			
			waitForElement(Click_Entitylinktypeid);
			String Entitylinktypeid1=getData("Entitylinktypeid","story1",1);
			Click_Entitylinktypeid.sendKeys(Entitylinktypeid1);
			
			waitForElement(Click_Entitid);
			String EntityId1=getData("EntityId","story1",2);
			Click_Entitid.sendKeys(EntityId1);
			
			waitForElement(Click_Nomipmtparties);
			Click_Nomipmtparties.click();
			
			
			
			waitForElement(Click_BtnAdd);
			Click_BtnAdd.click();
			
			waitForElement(Edi_Accdescrip);
			String AccountDescription2=getData("AccountDescription2","story1",1);
			Edi_Accdescrip.sendKeys(AccountDescription2);
			
			waitForElement(Edi_AccHoldr);
			String AccountHolder2=getData("AccountHolder2","story1",1);
			Edi_AccHoldr.sendKeys(AccountHolder2);
			
			waitForElement(Edi_Transref);
			String TransactionReference=getData("TransactionReference","story1",1);
			Edi_Transref.sendKeys(TransactionReference);
			
			waitForElement(Edi_branchcode);
			String Branchcode=getData("Branchcode1","story1",1);
			Edi_branchcode.sendKeys(Branchcode);

			waitForElement(Edi_Accnum);
			String Accountnumber=getData("Accountnumber1","story1",1);
			Edi_Accnum.sendKeys(Accountnumber);
			
			waitForElement(drop_bnkacctypid);
			String Bankaccounttypeid=getData("Bankaccounttypeid","story1",1);
			drop_bnkacctypid.sendKeys(Bankaccounttypeid);
			
			waitForElement(Edi_Days);
			String Days=getData("Days","story1",1);
			Edi_Days.sendKeys(Days);
			
			waitForElement(Edi_transtypid);
			String Transactiontypeid=getData("Transactiontypeid","story1",1);
			Edi_transtypid.sendKeys(Transactiontypeid);

			waitForElement(Edi_transsubtypid);
			String Transactionsubtypeid=getData("Transactionsubtypeid","story1",1);
			Edi_transsubtypid.sendKeys(Transactionsubtypeid);
			
			waitForElement(Edi_dayofmonth);
			String DayofMonth=getData("DayofMonth","story1",1);
			Edi_dayofmonth.sendKeys(DayofMonth);
			
			waitForElement(Edi_intref);
			String InternalRef=getData("InternalRef","story1",1);
			Edi_intref.sendKeys(InternalRef);
			
			waitForElement(Click_active4pmts);
			Click_active4pmts.click();
			
			waitForElement(Click_Save);
			Click_Save.click();
			
			waitForElement(Click_Yes1);
			Click_Yes1.click();
			
		Thread.sleep(9000);	
			
			waitForElement(Click_BtnAdd);
			Click_BtnAdd.click();
			
			waitForElement(Edi_Accdescrip);
			String AccountDescription3=getData("AccountDescription2","story1",2);
			Edi_Accdescrip.sendKeys(AccountDescription3);
			
			waitForElement(Edi_AccHoldr);
			String AccountHolder3=getData("AccountHolder2","story1",2);
			Edi_AccHoldr.sendKeys(AccountHolder3);
			
			waitForElement(Edi_Transref);
			String TransactionReference1=getData("TransactionReference","story1",2);
			Edi_Transref.sendKeys(TransactionReference1);
			
			waitForElement(Edi_branchcode);
			String Branchcode1=getData("Branchcode1","story1",2);
			Edi_branchcode.sendKeys(Branchcode1);

			waitForElement(Edi_Accnum);
			String Accountnumber1=getData("Accountnumber1","story1",2);
			Edi_Accnum.sendKeys(Accountnumber1);
			
			waitForElement(drop_bnkacctypid);
			String Bankaccounttypeid1=getData("Bankaccounttypeid","story1",2);
			drop_bnkacctypid.sendKeys(Bankaccounttypeid1);
			
			waitForElement(Edi_Days);
			String Days1=getData("Days","story1",2);
			Edi_Days.sendKeys(Days1);
			
			waitForElement(Edi_transtypid);
			String Transactiontypeid1=getData("Transactiontypeid","story1",2);
			Edi_transtypid.sendKeys(Transactiontypeid1);

			waitForElement(Edi_transsubtypid);
			String Transactionsubtypeid1=getData("Transactionsubtypeid","story1",2);
			Edi_transsubtypid.sendKeys(Transactionsubtypeid1);
			
			waitForElement(Edi_dayofmonth);
			String DayofMonth1=getData("DayofMonth","story1",2);
			Edi_dayofmonth.sendKeys(DayofMonth1);
			
			waitForElement(Edi_intref);
			String InternalRef1=getData("InternalRef","story1",2);
			Edi_intref.sendKeys(InternalRef1);
			
			waitForElement(Click_active4pmts);
			Click_active4pmts.click();
			
			waitForElement(Click_Save);
			Click_Save.click();
			
			waitForElement(Click_Yes1);
			Click_Yes1.click();
			
			Thread.sleep(8000);
			
			waitForElement(Click_BtnAdd);
			Click_BtnAdd.click();
			
			waitForElement(Edi_Accdescrip);
			String AccountDescription4=getData("AccountDescription2","story1",3);
			Edi_Accdescrip.sendKeys(AccountDescription4);
			
			waitForElement(Edi_AccHoldr);
			String AccountHolder4=getData("AccountHolder2","story1",3);
			Edi_AccHoldr.sendKeys(AccountHolder4);
			
			waitForElement(Edi_Transref);
			String TransactionReference2=getData("TransactionReference","story1",3);
			Edi_Transref.sendKeys(TransactionReference2);
			
			waitForElement(Edi_branchcode);
			String Branchcode2=getData("Branchcode1","story1",3);
			Edi_branchcode.sendKeys(Branchcode2);

			waitForElement(Edi_Accnum);
			String Accountnumber2=getData("Accountnumber1","story1",3);
			Edi_Accnum.sendKeys(Accountnumber2);
			
			waitForElement(drop_bnkacctypid);
			String Bankaccounttypeid2=getData("Bankaccounttypeid","story1",3);
			drop_bnkacctypid.sendKeys(Bankaccounttypeid2);
			
			waitForElement(Edi_Days);
			String Days2=getData("Days","story1",3);
			Edi_Days.sendKeys(Days2);
			
			waitForElement(Edi_transtypid);
			String Transactiontypeid2=getData("Transactiontypeid","story1",3);
			Edi_transtypid.sendKeys(Transactiontypeid2);

			waitForElement(Edi_transsubtypid);
			String Transactionsubtypeid2=getData("Transactionsubtypeid","story1",3);
			Edi_transsubtypid.sendKeys(Transactionsubtypeid2);
			
			waitForElement(Edi_dayofmonth);
			String DayofMonth2=getData("DayofMonth","story1",3);
			Edi_dayofmonth.sendKeys(DayofMonth2);
			
			waitForElement(Edi_intref);
			String InternalRef2=getData("InternalRef","story1",3);
			Edi_intref.sendKeys(InternalRef2);
			
			waitForElement(Click_active4pmts);
			Click_active4pmts.click();
			
			waitForElement(Click_Save);
			Click_Save.click();
			
			waitForElement(Click_Yes1);
			Click_Yes1.click();
			
	Thread.sleep(3000);		
			
			waitForElement(Click_InsurerUma);
			Click_InsurerUma.click();
			
			waitForElement(Click_Uma);
			Click_Uma.click();
			waitForElement(Add_Uma);
			Add_Uma.click();
			
			waitForElement(Click_Uma);
			Click_Uma.click();
			waitForElement(Add_Uma);
			Add_Uma.click();
			

			

			
	   	waitForElement(Btn_logout);
    	Btn_logout.click();
    	
    	
        
        

	}
}
	 
