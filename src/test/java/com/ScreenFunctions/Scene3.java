package com.ScreenFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.GenericFunctions.DBConnection;
import com.GenericFunctions.DBConnection1;
import com.GenericFunctions.GenericMethods;
import com.GenericFunctions.NewDBConnection_OTP_Story1;

public class Scene3 extends GenericMethods{

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
	
	@FindBy(how=How.XPATH,using="(//*[text()='Yes'])[3]")
	public static WebElement Click_Yes1;
	
	
	@FindBy(how=How.XPATH,using="//*[text()= 'Insurers / UMAs']")
	public static WebElement Click_InsurerUma;
	
	@FindBy(how=How.XPATH,using="//*[@id='lstLeft']/li[1]/p")
	public static WebElement Click_Uma;
	
	@FindBy(how=How.XPATH,using="//*[@id='btnAdd']")
	public static WebElement Add_Uma;
	
	@FindBy(how=How.XPATH,using="//button[contains(text(),'Yes')]")
	public static WebElement Click_Yes2;
	


	
	
	
	
	
	
	public static String taskid;
	
	public static String OTP;

	
	
	public static void Scene3() throws Exception   
	{
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
		
		String EntityName2=getData("EntityName","story1",1);	
		Edi_EntitySearch.sendKeys(EntityName2);
		
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
	
		// Entity link	
		waitForElement(Click_Entitylinktypeid);
		String Entitylinktypeid=getData("Entitylinktypeid","story1",1);
		Click_Entitylinktypeid.sendKeys(Entitylinktypeid);
		
		waitForElement(Click_Entitid);
		String EntityId=getData("EntityId","story1",1);
		Click_Entitid.sendKeys(EntityId);
		
		waitForElement(btn_Save);
		btn_Save.click();
		
		waitForElement(Click_Yes1);
		Click_Yes1.click();

		
		waitForElement(Click_Entitylinktypeid);
		String Entitylinktypeid1=getData("Entitylinktypeid","story1",1);
		Click_Entitylinktypeid.sendKeys(Entitylinktypeid1);
		
		waitForElement(Click_Entitid);
		String EntityId1=getData("EntityId","story1",2);
		Click_Entitid.sendKeys(EntityId1);
		
		waitForElement(btn_Save);
		btn_Save.click();
		
		waitForElement(Click_Yes1);
		Click_Yes1.click();
		
		Thread.sleep(5000);
		
		
//		
//		
//		waitForElement1(Click_EntitySearch);
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
//		waitForElement(Edi_EntitySearch);
//		
//		//Click_EntitySearch.click();
//		waitForElement(Edi_EntitySearch);
//		
//		String EntityName3=getData("EntityName","story1",1);	
//		Edi_EntitySearch.sendKeys(EntityName3);
//		
//		waitForElement(Btn_Search);
//		Btn_Search.click();
//		waitForElement(Click_SearchResults);
//		Click_SearchResults.click();
//		waitForElement(Btn_Open);
//		Btn_Open.click();
//		
//		waitForElement(Click_Entitylink);
//		Click_Entitylink.click();
//		
//		waitForElement(Click_BtnAdd);
//		Click_BtnAdd.click();
//	
//		// Entity link	
//		waitForElement(Click_Entitylinktypeid);
//		String Entitylinktypeid2=getData("Entitylinktypeid","story1",1);
//		Click_Entitylinktypeid.sendKeys(Entitylinktypeid2);
//		
//		waitForElement(Click_Entitid);
//		String EntityId2=getData("EntityId","story1",1);
//		Click_Entitid.sendKeys(EntityId2);
//		
//		waitForElement(btn_Save);
//		btn_Save.click();
//		
//		waitForElement(Click_Yes1);
//		Click_Yes1.click();
//
//		
//		waitForElement(Click_Entitylinktypeid);
//		String Entitylinktypeid3=getData("Entitylinktypeid","story1",1);
//		Click_Entitylinktypeid.sendKeys(Entitylinktypeid3);
//		
//		waitForElement(Click_Entitid);
//		String EntityId3=getData("EntityId","story1",2);
//		Click_Entitid.sendKeys(EntityId3);
//		
//		waitForElement(btn_Save);
//		btn_Save.click();
//		
//		waitForElement(Click_Yes1);
//		Click_Yes1.click();
		
//	     Edi_Username.sendKeys("idahm");
//	     Edi_Password.sendKeys("P@ssw0rd");
//	     Btn_Loginbtn.click();
		
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
		//waitForElement(Edi_EntitySearch);
		
		String EntityName4=getData("EntityName","story1",1);	
		Edi_EntitySearch.sendKeys(EntityName4);
		
		waitForElement(Btn_Search);
		Btn_Search.click();
		waitForElement(Click_SearchResults);
		Click_SearchResults.click();
		waitForElement(Btn_Open);
		Btn_Open.click();
		
		
		waitForElement(Click_Nomipmtparties);
		Click_Nomipmtparties.click();
		
		waitForElement(Click_BtnAdd);
		Click_BtnAdd.click();
		
		//Need to add		
	
		
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
		
		waitForElement(Click_Yes2);
		Click_Yes2.click();
		
		Thread.sleep(10000);
		
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
		
		waitForElement(Click_Yes2);
		Click_Yes2.click();
		
					
			Thread.sleep(3000);
		
		waitForElement(Click_EntitySearch);
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
		
		String EntityName1=getData("EntityName","story1",2);	
		Edi_EntitySearch.sendKeys(EntityName1);
		
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
		
		Thread.sleep(10000);
		
//		waitForElement(Click_BtnAdd);
//	    Click_BtnAdd.click();

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
			
			
//		   	waitForElement(Btn_logout);
//	    	Btn_logout.click();
//	    	
//		     Edi_Username.sendKeys("idahm");
//		     Edi_Password.sendKeys("P@ssw0rd");
//		     Btn_Loginbtn.click();
			
			
						
		   	waitForElement(Btn_logout);
	    	Btn_logout.click();
			

//		     Edi_Username.sendKeys("thenjiwem");
//		     Edi_Password.sendKeys("P@ssw0rd");
//		     Btn_Loginbtn.click();
//		     
//		     taskid= DBConnection.dbConnect();
//		     
//		     Thread.sleep(4000);
//		     
//				System.out.println(Scene3.taskid);
//				driver.findElement(By.xpath("//td[text()='"+Scene3.taskid+"']")).click();

			
//	   	waitForElement(Btn_logout);
//    	Btn_logout.click();
    	
    	
        
        

	}
}
	 
