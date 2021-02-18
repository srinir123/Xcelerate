package com.ScreenFunctions;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.GenericFunctions.DBConnection;
import com.GenericFunctions.DBConnection1;
import com.GenericFunctions.GenericMethods;
import com.GenericFunctions.NewDBConnection_OTP_Story1;

public class NewEntityCreation_ISOStory extends GenericMethods{
	
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
	
	@FindBy(how=How.ID,using="//*[@id='btnAgreement_accept']")
	public static WebElement Btn_Agreement_accept;
	
	@FindBy(how=How.XPATH,using="//*[@id='resultsGrid']/tbody/tr/td[2]")
	public static WebElement Click_Agreement;
	
	@FindBy(how=How.XPATH,using="//*[@id='accordGroups']/div/div[1]/div/button[1]")
	public static WebElement Click_OpenInterestGroups;
	
	@FindBy(how=How.XPATH,using="//*[text()='Group Settings']") 
	public static WebElement Click_Grpsettings;
	
	@FindBy(how=How.XPATH,using="//*[@id='btnQuote_submit']") 
	public static WebElement Click_QuoteApproval;
	
	@FindBy(how=How.XPATH,using="//*[text()='Agreements']")
	public static WebElement Click_Agreements;
	
	@FindBy(how=How.XPATH,using="//*[@id='btnAuthAccept']")
	public static WebElement Click_btnVerify;
	
	@FindBy(how=How.XPATH,using="//button[contains(text(),'Yes')]")
	public static WebElement Click_Yes;
	
	@FindBy(how=How.XPATH,using="//*[@id='btnAuthAccept']")
	public static WebElement Click_verifyEntityinfo;
	
	@FindBy(how=How.XPATH,using="//*[@id='btnAgreement_accept']")
	public static WebElement Click_Accept_Agreement;
	
	@FindBy(how=How.XPATH,using="//*[text()='Entity Information']")
	public static WebElement Click_EntityInformation;
	
	@FindBy(how=How.XPATH,using="//*[text()='License Categories']") 
	public static WebElement Click_LicenseCategories;
			
	@FindBy(how=How.XPATH,using="//*[@id='btnAuthAccept']")
	public static WebElement Click_VerifyEntityInfo;
	
	@FindBy(how=How.XPATH,using="//*[text()='Role Assignment']")
	public static WebElement Click_RoleAssignment;
	
	@FindBy(how=How.XPATH,using="//*[text()='Policy Admin Systems']")
	public static WebElement Click_PolicyAdminSys;
	
	@FindBy(how=How.XPATH,using="//*[@id='btnAgreement_accept']")
	public static WebElement Click_AcceptAgreementDoc;
	
	@FindBy(how=How.XPATH,using="(//*[@id='Select0'])[1]")
	public static WebElement Tick_LongTerm1;
	
	@FindBy(how=How.XPATH,using="(//*[@id='Select1'])[1]")
	public static WebElement Tick_LongTerm2;
	
	@FindBy(how=How.XPATH,using="(//*[@id='Select0'])[2]")
	public static WebElement Tick_ShortTermp1;
	
	@FindBy(how=How.XPATH,using="(//*[@id='Select1'])[2]")
	public static WebElement Tick_ShortTermp2;
	
	@FindBy(how=How.XPATH,using="(//*[@id='Select0'])[6]")
	public static WebElement Tick_ShortTermc1;
	
	@FindBy(how=How.XPATH,using="(//*[@id='Select1'])[6]")
	public static WebElement Tick_ShortTermc2;
	
	@FindBy(how=How.XPATH,using="//*[@id='btnAdd']")
	public static WebElement Btnt_AddNew;
	
	@FindBy(how=How.XPATH,using="//*[@id='PASSystemTypeID']")
	public static WebElement Edit_SysType;
	
	@FindBy(how=How.XPATH,using="//*[@id='SearchIGServiceID']")
	public static WebElement Edit_Service;
	
	@FindBy(how=How.XPATH,using="//*[@id='btnLinkIG']")
	public static WebElement Click_Search;
	
	@FindBy(how=How.XPATH,using="(//*[@id='SystemName'])[2]")
	public static WebElement Edit_SysName;
	
	@FindBy(how=How.XPATH,using="(//*[text()='Standard CSV Collection'])[1]")
	public static WebElement Click_CsvCollFile;
	
	@FindBy(how=How.XPATH,using="(//*[text()='Payment CSV'])[1]")
	public static WebElement Click_CsvPmtFile;
	
	@FindBy(how=How.XPATH,using="(//*[text()='Standard CSV Rejections'])[1]")
	public static WebElement Click_CsvCollRejFile;
	
	@FindBy(how=How.XPATH,using="(//*[text()='Payment CSV Rejections'])[1]")
	public static WebElement Click_CsvPmtRejFile;
	
	@FindBy(how=How.XPATH,using="//*[@id='btnSave']")
	public static WebElement Click_Save;
	
	@FindBy(how=How.XPATH,using="//*[@id='tabsHeaders']/li[2]/a")
	public static WebElement Click_ExportFiles;
	
	@FindBy(how=How.XPATH,using="//*[@id='LinkImportFileID']")
	public static WebElement Edit_LinkedImpFile;
	
	@FindBy(how=How.XPATH,using="//*[@id='brokerResultsGrid']/tbody/tr[1]/td[7]/button[2]")
	public static WebElement View_CollRejFile;
	
	@FindBy(how=How.XPATH,using="//*[@id='brokerResultsGrid']/tbody/tr[2]/td[7]/button[2]")
	public static WebElement View_PmtRejFile;
	
	@FindBy(how=How.XPATH,using="//*[@id='UseForManualTransactions']")
	public static WebElement Tick_UseForManualTrans ;
	
	@FindBy(how=How.XPATH,using="//*[@id='btnSaveFile']")
	public static WebElement Click_Save1;
	
	@FindBy(how=How.XPATH,using="//*[@id='btnReturnToPolicyAdminSystems']")
	public static WebElement Click_Returntopas;
	
	@FindBy(how=How.XPATH,using="//*[@id='accordGroups']")
	public static WebElement Click_InterestGrp;
	
//	@FindBy(how=How.XPATH,using="(//*[@class='accordion-toggle'])[last()]")//*[@id="accordGroups"]/div/div[1]/a/i
//	public static WebElement Click_Subacc;
	
	//@FindBy(how=How.XPATH,using="/html/body/div[2]/div[5]/div/div[2]/div/div[2]/div/fieldset/div/div/div[2]/div/div[8]/div[1]/a/text()")   //(//*[@id='accordGroups']/div/div[1]/a/i //*[@id='collapseGroup1424']/div/div[8]/div[1]/a
    //public static WebElement Click_Subacc; 
	
	//@FindBy(how=How.XPATH,using="(//*[@class='accordion-toggle disabled'])[last()]")
	@FindBy(how=How.XPATH,using="(/html/body/div[2]/div[5]/div/div[2]/div/div[2]/div/fieldset/div/div/div[2]/div/div[8]/div[1]/a)")
	public static WebElement Click_Subacc;
	
	@FindBy(how=How.XPATH,using="(//*[text()= 'Sub Account Settings'])[last()]")
	public static WebElement Click_SubAccSettings;
	
	@FindBy(how=How.XPATH,using="(//*[@id='LongName'])[last()]")
	public static WebElement Edit_SubAcName;

	@FindBy(how=How.XPATH,using="(//*[@id='ForcedReference'])[last()]")
	public static WebElement Edit_ForcedRef;
	
	@FindBy(how=How.XPATH,using="(//*[@id='SubAccountCode'])[last()]")
	public static WebElement Edit_SubAccCode;
	
	@FindBy(how=How.XPATH,using="(//*[@id='btnSaveSubAccountChanges'])[last()]") 
	public static WebElement Click_Save_SubAcc;
	
	@FindBy(how=How.XPATH,using="(//*[@id='btnLinkPolicyAdminSubAccount'])[last()]")
	public static WebElement Click_LinkSystems;
	
	@FindBy(how=How.XPATH,using="//*[@id='btnSearchPAS']")
	public static WebElement Btn_Search1;
	
	@FindBy(how=How.XPATH,using="(//*[@id='LinkSystem'])[1]")
	public static WebElement Tick_LinkSystems_Coll;
	
	@FindBy(how=How.XPATH,using="(//*[@id='LinkSystem'])[2]")
	public static WebElement Tick_LinkSystems_Pmt;
	
	@FindBy(how=How.XPATH,using="//*[@id='btnLink']")
	public static WebElement Btn_LinkSystems;
	
//	@FindBy(how=How.XPATH,using="(//*[@id='LinkSystem'])[last()]")
//	public static WebElement Tick_LinkSystems_Pmt;
	
	@FindBy(how=How.XPATH,using="(//*[@id='btnSave'])[2]")
	public static WebElement Btn_Save;
	
	@FindBy(how=How.XPATH,using="(//*[@id='BucketPeriodTypeID'])[last()]")
	public static WebElement Edit_CollPeriod;
	
	@FindBy(how=How.XPATH,using="(//*[@id='BankAccountID'])[last()]") 
	public static WebElement Edit_BankAccount;
			
	@FindBy(how=How.XPATH,using="(//*[@id='InterestRateTypeID'])[last()]")
	public static WebElement Edit_IntrateType;		
					
	@FindBy(how=How.XPATH,using="(//*[@id='btnSaveGroupChanges'])[last()]") 
	public static WebElement Click_Save_Acc;

	@FindBy(how=How.XPATH,using="(//*[text()='Group Settings'])[last()]")
	public static WebElement Click_GroupSettings;
	
	@FindBy(how=How.XPATH,using="//*[text()='Nominated Payment Parties']")
	public static WebElement Click_Nomipmtparties;
	
	@FindBy(how=How.XPATH,using="//*[@id='btnAdd']")
	public static WebElement Click_BtnAdd;
	
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
	
	@FindBy(how=How.XPATH,using="//*[@id='btnSaveOne']")
	public static WebElement Click_Save2;
	
	@FindBy(how=How.XPATH,using="//*[@id='btnAuthAccept']")
	public static WebElement Click_Btnaccept;
	
	@FindBy(how=How.XPATH,using="//*[@id='mainnav']/li[1]/a")
	public static WebElement Click_Dashboard;
	
	
	
	
	
	
	
	
	
	
			
			
					
							
									
											
	
	
	
	
	
	public static String taskid;
	
	public static String OTP;

	
	
	public static void NewEntityCreation_ISOStory() throws Exception   
	{


		Thread.sleep(20000);
		waitForElement(Click_AddEntity);
		//waitForElement(Edi_EntityName);

		Click_AddEntity.click();
		
		

		
        waitForElement(Edi_EntityName);
        
		
        String EntityName=getData("EntityName","story1",1);

		Edi_EntityName.sendKeys(EntityName);
		
        String LEntityType=getData("LEntityType","story1",1);
        		
		Dropd_LEntityType.sendKeys(LEntityType);
		
        
        String EnityTypeID=getData("EnityTypeID","story1",1);

        Dropd_EnityTypeID.sendKeys(EnityTypeID);
        
        String RegRIdType=getData("RegRIdType","story1",1);

        Edi_RegRIdType.sendKeys(RegRIdType); 
		Thread.sleep(3000);
		waitForElement(Btnt_Next);
        Btnt_Next.click();
        
        Thread.sleep(3000);

        waitForElement(Click_AddNewEntity);
        Click_AddNewEntity.click();
        Thread.sleep(5000);
        Tick_PhysicalAddress.click();

        String ProvinceId=getData("ProvinceId","story1",1);

        Dropd_ProvinceId.sendKeys(ProvinceId);

        String Building=getData("Building","story1",1);

        Edi_Building.sendKeys(Building);

        String Street=getData("Street","story1",1);

        Edi_Street.sendKeys(Street);

        String Suburb=getData("Suburb","story1",1);

        Edi_Suburb.sendKeys(Suburb);

        String Town=getData("Town","story1",1);

        Edi_Town.sendKeys(Town);

        String PostalCode=getData("PostalCode","story1",1);

        Edi_PostalCode.sendKeys(PostalCode);
        Edi_IsPostal.click();
        Btnt_Save.click();
        waitForElement(Btnt_Yes);
        Btnt_Yes.click();

        Thread.sleep(10000);

        waitForElement(Btnt_Next1);
        Btnt_Next1.click();


        waitForElement(Btnt_AddContact);
        Btnt_AddContact.click();
        waitForElement(Dropd_Title);

        String Title1=getData("Title1","story1",1);

        Dropd_Title.sendKeys(Title1);

        String FirstName1=getData("FirstName1","story1",1);

        Edi_FirstName.sendKeys(FirstName1);

        String Surname1=getData("Surname1","story1",1);

        Edi_Surname.sendKeys(Surname1);

        String Designation1=getData("Designation1","story1",1);

        Edi_Designation.sendKeys(Designation1);

        String IDNumber1=getData("IDNumber1","story1",1);

        Edi_IDNumber.sendKeys(IDNumber1);

        String Telephone1=getData("Telephone1","story1",1);

        Edi_Telephone.sendKeys(Telephone1);

        String MobilePhone1=getData("MobilePhone1","story1",1);

         Edi_MobilePhone.sendKeys(MobilePhone1);
       // Edi_Telephone.sendKeys("00917799005938");

        String Fax1=getData("Fax1","story1",1);

        Edi_Fax.sendKeys(Fax1);

        String EMailAddress1=getData("EMailAddress1","story1",1);

        Edi_EMailAddress.sendKeys(EMailAddress1);

        String Messanger1=getData("Messanger1","story1",1);

        Dropd_Messanger.sendKeys(Messanger1);

        String PositionID1=getData("PositionID1","story1",1);

        Dropd_PositionID.sendKeys(PositionID1);

        String EntityAddressID=getData("EntityAddressID","story1",1);

        Dropd_EntityAddressID.sendKeys(EntityAddressID);

        Tick_PrimContact.click();
        Btnt_Save1.click();
        waitForElement(Btnt_Yes1);
        Btnt_Yes1.click();

        Thread.sleep(6000);

        waitForElement(Btnt_Next2);
        Btnt_Next2.click();
        waitForElement(Dropd_UserID1);
        Dropd_UserID1.sendKeys("Lynette Van Der Walt");
        Dropd_UserID2.sendKeys("Barry Levy");
        Dropd_UserID3.sendKeys("Ernst Potgieter");
   	 Dropd_UserID4.sendKeys("Sophie Seemi");
      Dropd_UserID5.sendKeys("Dorathea Brits");
      Dropd_UserID6.sendKeys("Nthabiseng Motshabi");
        Dropd_SUserID1.sendKeys("Asiya Swaleh");
      Dropd_SUserID2.sendKeys("Retief Jansen");
      Dropd_SUserID3.sendKeys("Mpho Bogatsu");
        waitForElement(Btnt_Next3);
        Btnt_Next3.click();
        
        Thread.sleep(2000);
        
        waitForElement(Tick_LongTerm1);
        Tick_LongTerm1.click();
        
        Thread.sleep(1000);
        
        waitForElement(Tick_LongTerm2);
        Tick_LongTerm2.click();
    
        Thread.sleep(1000);
        
        waitForElement(Tick_ShortTermp1);
        Tick_ShortTermp1.click();
        
        Thread.sleep(1000);
        
        waitForElement(Tick_ShortTermp2);
        Tick_ShortTermp2.click();
        
        Thread.sleep(1000);
        
        waitForElement(Tick_ShortTermc1);
        Tick_ShortTermc1.click();
        
        Thread.sleep(1000);
        
        waitForElement(Tick_ShortTermc2);
        Tick_ShortTermc2.click();
        
        Thread.sleep(1000);
        
        Btnt_Next4.click();
        waitForElement(Btnt_AddnewLE);
        
        Btnt_AddnewLE.click();
        
        waitForElement(Dropd_ELtype);
       // String ELtype=getData("ELtype","story1",1);
        Dropd_ELtype.sendKeys("Insurer");

        waitForElement(Dropd_Entity);
        //String Entity=getData("Entity","story1",1);
        Dropd_Entity.sendKeys("Absa Life Limited");
        
        waitForElement(Btnt_SaveLE);
        Btnt_SaveLE.click();
        waitForElement(Btnt_YesSLE);
        Btnt_YesSLE.click();

                        
       Thread.sleep(40000);
        Btn_NextLE.click();
        
        waitForElement(Btn_subYes);
        Btn_subYes.click();
              
        
        System.out.println("The new Entity has been created successfully");
    	LogEvent("Pass","The new Entity has been created successfully");
    	Thread.sleep(8000);
    	
    	waitForElement(Click_EntitySearch);
    	Click_EntitySearch.click();
    	
    	waitForElement(Edi_EntitySearch);
    	
    	String Entity_Name=getData("EntityName","story1",1);
    	Edi_EntitySearch.sendKeys(Entity_Name);
    	waitForElement(Btn_Search);
    	Btn_Search.click();
    	waitForElement(Click_SearchResults);
    	Click_SearchResults.click();
    	Btn_Open.click();
    	
    				
    	waitForElement(Click_Qtotes);
		Click_Qtotes.click();
		waitForElement(Btn_Createqtote);
		Btn_Createqtote.click();
		
		waitForElement(Edi_Quotename);
		//Edi_Quotename.clear();
		
		waitForElement(Edi_Quotename);
		
	     String Quotename=getData("QuoteName","QuoteCreation",1);

	     Edi_Quotename.sendKeys(Quotename);
		
		waitForElement(Edi_Agreetypeid);
		
	     String AgreementType=getData("AgreementType","QuoteCreation",1);

	     Edi_Agreetypeid.sendKeys(AgreementType);
	     
	     waitForElement(Btn_Continue);
	     Btn_Continue.click();
	     
	     Thread.sleep(20000);
	     
	    	
	     
	     
	     //Thread.sleep(3000);
	    	
	       	waitForElement1(Click_InterestGrp);
	       	click_element1(Click_InterestGrp);
	     
			waitForElement(Click_GroupSettings);
			Click_GroupSettings.click();
	     
			waitForElement(Edit_CollPeriod);
			Edit_CollPeriod.sendKeys("Monthly");
			
			Thread.sleep(3000);
		     
			waitForElement(Edit_BankAccount);
			
			String BankAccount=getData("BankAccount","story1",4);

			Edit_BankAccount.sendKeys(BankAccount);
			
			waitForElement(Edit_IntrateType);
			Edit_IntrateType.sendKeys("Not Applicable");
			
			Thread.sleep(2000);
			
			waitForElement(Edit_CollPeriod);
			Edit_CollPeriod.sendKeys("Monthly");
			
			waitForElement(Click_Save_Acc);
			Click_Save_Acc.click();
	     
	     
	     Thread.sleep(6000);
	     
	     
	     
	     waitForElement(Click_QuoteApproval);
	     Click_QuoteApproval.click();
	     
	     waitForElement(Btn_Yes);
	     Btn_Yes.click();
	     
	     Thread.sleep(2000);
	     
	     waitForElement(Btn_Yes);
	     Btn_Yes.click();
	     
	     Thread.sleep(10000);
	     
        
    	waitForElement(Btn_logout);
    	Btn_logout.click();
    	
    	Thread.sleep(6000);
        
        Edi_Username.sendKeys("theab");
        Edi_Password.sendKeys("P@ssw0rd");
        Btn_Loginbtn.click();
		
		Thread.sleep(9000);
    	waitForElement(Click_EntitySearch);
    	if(Click_EntitySearch.isDisplayed())
    	{
    		System.out.println("Clicking on entity search");
    		
    		Actions acc=new Actions(driver);
    		
    		acc.moveToElement(Click_EntitySearch).click(Click_EntitySearch).build().perform();
    	Click_EntitySearch.click();
    	}
    
       	waitForElement(Edi_EntitySearch);
     	String Entity_Name1=getData("EntityName","story1",1);
     	Thread.sleep(4000);   
     	Edi_EntitySearch.sendKeys(Entity_Name1);
    	waitForElement(Btn_Search);
    	Btn_Search.click();
    	waitForElement(Click_SearchResults);
    	Click_SearchResults.click();
    	Btn_Open.click();
        
    	
		Thread.sleep(6000);
    	
	     waitForElement(Click_Agreements);
	     Click_Agreements.click();
	     
	 	Thread.sleep(3000);
	     
	     waitForElement(Click_Agreement);
	    performDBLCLICK(Click_Agreement);
	    
	    Thread.sleep(16000);
	    
	    waitForElement(Click_AcceptAgreementDoc);
	    Click_AcceptAgreementDoc.click();
	    
		waitForElement(Click_Yes);
		Click_Yes.click();
    	
        Thread.sleep(3000);  
        
		waitForElement(Click_LicenseCategories);
		Click_LicenseCategories.click();
		
		waitForElement(Click_VerifyEntityInfo);
		Click_VerifyEntityInfo.click();
		
		Thread.sleep(3000);
//		waitForElement(Click_Yes);
//		click_element(Click_Yes);
		
		waitForElement(Click_Yes);
		Click_Yes.click();
		
		Thread.sleep(3000);
		
		Click_Yes.click();
        
    	
    	Thread.sleep(3000);
    	
		waitForElement(Click_EntityInformation);
  		Click_EntityInformation.click();
  		
  		waitForElement(Click_VerifyEntityInfo);
  		Click_VerifyEntityInfo.click();
  		
  		Thread.sleep(3000);
  		
  		waitForElement(Click_Yes);
  		Click_Yes.click();
  		Thread.sleep(3000);

//  		waitForElement(Click_Yes);
//  		Click_Yes.click();
//  		
//  		Thread.sleep(3000);
  		
    	waitForElement(Btn_logout);
    	Btn_logout.click();
    	

    	Thread.sleep(6000);
        
        Edi_Username.sendKeys("ashp");
        Edi_Password.sendKeys("P@ssw0rd");
        Btn_Loginbtn.click();
        


        Thread.sleep(9000);
    	waitForElement(Click_EntitySearch);
    	if(Click_EntitySearch.isDisplayed())
    	{
    		System.out.println("Clicking on entity search");
    		
    		Actions acc=new Actions(driver);
    		
    		acc.moveToElement(Click_EntitySearch).click(Click_EntitySearch).build().perform();
    	Click_EntitySearch.click();
    	}
    
    	
    	waitForElement(Edi_EntitySearch);
    	
    	String Entity_Name2=getData("EntityName","story1",1);
    	Thread.sleep(4000);
    	Edi_EntitySearch.sendKeys(Entity_Name2);
    	waitForElement(Btn_Search);
    	Btn_Search.click();
    	waitForElement(Click_SearchResults);
    	Click_SearchResults.click();
    	Btn_Open.click();
    	
    	waitForElement(Click_PolicyAdminSys);
    	Click_PolicyAdminSys.click();
		
    	waitForElement(Btnt_AddNew);
    	Btnt_AddNew.click();
    	
    	waitForElement(Edit_SysType);
    	Edit_SysType.sendKeys("Standard Epic"); //Standard Epic
    	
    	waitForElement(Edit_Service);
    	Edit_Service.sendKeys("Collections");
    	
    	waitForElement(Click_Search);
    	Click_Search.click();
    	
    	waitForElement(Edit_SysName);
    	Edit_SysName.sendKeys("ImportColFile");
    	
    	waitForElement(Click_CsvCollFile);
    	Click_CsvCollFile.click();
    	
    	waitForElement(Click_Save);
    	Click_Save.click();

    	waitForElement(Click_Yes);
    	Click_Yes.click();
    	
    	Thread.sleep(4000);
    	    	
    	waitForElement(Btnt_AddNew);
    	Btnt_AddNew.click();
    	
    	waitForElement(Edit_SysType);
    	Edit_SysType.sendKeys("Standard Epic");
    	
    	waitForElement(Edit_Service);
    	Edit_Service.sendKeys("Payments");
    	
    	waitForElement(Click_Search);
    	Click_Search.click();
    	
    	waitForElement(Edit_SysName);
    	Edit_SysName.sendKeys("ImportPmtFile");
    	
    	waitForElement(Click_CsvPmtFile);
    	Click_CsvPmtFile.click();
    	
    	waitForElement(Click_Save);
    	Click_Save.click();

    	waitForElement(Click_Yes);
    	Click_Yes.click();
    	
    	Thread.sleep(8000);
    	
    	waitForElement(Click_ExportFiles);
    	Click_ExportFiles.click();
    	
    	Thread.sleep(6000);    	
    	
    	waitForElement(Btnt_AddNew);
    	Btnt_AddNew.click();
    	
      	waitForElement(Edit_SysType);
    	Edit_SysType.sendKeys("Standard Epic");
    	
    	waitForElement(Edit_LinkedImpFile);
    	Edit_LinkedImpFile.sendKeys("Standard CSV Collection");
    	
       	waitForElement(Edit_Service);
    	Edit_Service.sendKeys("Collection Rejections");
    	
     	waitForElement(Click_Search);
    	Click_Search.click();
    	
    	waitForElement(Edit_SysName);
    	Edit_SysName.sendKeys("ExportColRejFile");
    	
    	waitForElement(Click_CsvCollRejFile);
    	Click_CsvCollRejFile.click();
    	
    	waitForElement(Click_Save);
    	Click_Save.click();

    	waitForElement(Click_Yes);
    	Click_Yes.click();
    	
    	Thread.sleep(6000);
    	
    	waitForElement(Btnt_AddNew);
    	Btnt_AddNew.click();
    	
      	waitForElement(Edit_SysType);
    	Edit_SysType.sendKeys("Standard Epic");
    	
    	waitForElement(Edit_LinkedImpFile);
    	Edit_LinkedImpFile.sendKeys("Payment CSV");
    	
       	waitForElement(Edit_Service);
    	Edit_Service.sendKeys("Payment Rejections");
    	
     	waitForElement(Click_Search);
    	Click_Search.click();
    	
    	waitForElement(Edit_SysName);
    	Edit_SysName.sendKeys("ExportPmtRejFile");
    	
    	waitForElement(Click_CsvPmtRejFile);
    	Click_CsvPmtRejFile.click();
    	    	
    	waitForElement(Click_Save);
    	Click_Save.click();

    	waitForElement(Click_Yes);
    	Click_Yes.click();
    	
    	Thread.sleep(6000);
    	
    	waitForElement(View_CollRejFile);
    	View_CollRejFile.click();
    	
    	waitForElement(Tick_UseForManualTrans);
    	Tick_UseForManualTrans.click();
    	
    	waitForElement(Click_Save1);
    	Click_Save1.click();
    	
      	waitForElement(Click_Yes);
    	Click_Yes.click();
    	
    	
    	waitForElement(Click_Returntopas);
    	Click_Returntopas.click();
    	
    	waitForElement(Click_Yes);
    	Click_Yes.click();
    	
    	Thread.sleep(6000);
    	
    	waitForElement(View_PmtRejFile);
    	View_PmtRejFile.click();
    	
    	waitForElement(Tick_UseForManualTrans);
    	Tick_UseForManualTrans.click();
    	
    	waitForElement(Click_Save1);
    	Click_Save1.click();
    	
      	waitForElement(Click_Yes);
    	Click_Yes.click();
    	
     	Thread.sleep(3000);
    	
    	waitForElement(Click_Agreements);
    	Click_Agreements.click();
    	
    	Thread.sleep(10000);
    	
       	waitForElement(Click_Agreement);
    	performDBLCLICK(Click_Agreement);
    	
    	Thread.sleep(3000);
    	
       	waitForElement1(Click_InterestGrp);
       	click_element1(Click_InterestGrp);

/////////////		
		waitForElement(Click_Subacc);
		Click_Subacc.click();
		
		Thread.sleep(2000);
		
		waitForElement(Click_SubAccSettings);
		Click_SubAccSettings.click();
		
		Thread.sleep(2000);
		
//		Edit_SubAcName.clear();
//		
//		waitForElement(Edit_SubAcName);
//		
//		Edit_SubAcName.sendKeys("XAcc0001");
//		
//		Thread.sleep(2000);
//		
//		Edit_ForcedRef.clear();
//		
//		waitForElement(Edit_ForcedRef);
//		
//		Edit_ForcedRef.sendKeys("X0001");
//		
//		Thread.sleep(2000);
//		
//		Edit_SubAccCode.clear();
//		
//		waitForElement(Edit_SubAccCode);
//	
//		Edit_SubAccCode.sendKeys("X0001");
//		
//		Thread.sleep(2000);
//	
//		waitForElement(Click_Save_SubAcc);
//		Click_Save_SubAcc.click();
//		
//		Thread.sleep(8000);
		
		waitForElement(Click_LinkSystems);
		Click_LinkSystems.click();	
		
		waitForElement(Edit_SysType);
		Edit_SysType.sendKeys("Standard Epic");
		
		waitForElement(Btn_Search1);
		Btn_Search1.click();
		
		Thread.sleep(2000);
		
		waitForElement(Tick_LinkSystems_Coll);
		Tick_LinkSystems_Coll.click();
		
		waitForElement(Tick_LinkSystems_Pmt);
		Tick_LinkSystems_Pmt.click();
		
		waitForElement(Btn_LinkSystems);
		Btn_LinkSystems.click();
		
		Thread.sleep(3000);
		
		waitForElement(Btn_Save);
		Btn_Save.click();
		
		waitForElement(Click_Yes);
		Click_Yes.click();
		

		
		Thread.sleep(2000);
		//Nominated payment parties 
		
		
		waitForElement(Btn_logout);
    	Btn_logout.click();
    	

    	Thread.sleep(5000);
        
        Edi_Username.sendKeys("thenjiwem");
        Edi_Password.sendKeys("P@ssw0rd");
        Btn_Loginbtn.click();
        


        Thread.sleep(9000);
    	waitForElement(Click_EntitySearch);
    	if(Click_EntitySearch.isDisplayed())
    	{
    		System.out.println("Clicking on entity search");
    		
    		Actions acc=new Actions(driver);
    		
    		acc.moveToElement(Click_EntitySearch).click(Click_EntitySearch).build().perform();
    	Click_EntitySearch.click();
    	}
    
    	
    	waitForElement(Edi_EntitySearch);
    	
    	String Entity_Name3=getData("EntityName","story1",1);
    	Thread.sleep(4000);
    	Edi_EntitySearch.sendKeys(Entity_Name3);
    	waitForElement(Btn_Search);
    	Btn_Search.click();
    	waitForElement(Click_SearchResults);
    	Click_SearchResults.click();
    	Btn_Open.click();

		
		waitForElement(Click_Nomipmtparties);
		Click_Nomipmtparties.click();
		
//		waitForElement(Click_Yes);
//		Click_Yes.click();
//		
//		waitForElement(Click_Yes);
//		Click_Yes.click();
		
		waitForElement(Click_BtnAdd);
		Click_BtnAdd.click();
		
		//Need to add		
		
		waitForElement(Edi_Accdescrip);
		String AccountDescription3=getData("AccountDescription2","story1",1);
		Edi_Accdescrip.sendKeys(AccountDescription3);
		
		waitForElement(Edi_AccHoldr);
		String AccountHolder3=getData("AccountHolder2","story1",1);
		Edi_AccHoldr.sendKeys(AccountHolder3);
		
		waitForElement(Edi_Transref);
		String TransactionReference1=getData("TransactionReference","story1",1);
		Edi_Transref.sendKeys(TransactionReference1);
		
		waitForElement(Edi_branchcode);
		String Branchcode1=getData("Branchcode1","story1",1);
		Edi_branchcode.sendKeys(Branchcode1);

		waitForElement(Edi_Accnum);
		String Accountnumber1=getData("Accountnumber1","story1",1);
		Edi_Accnum.sendKeys(Accountnumber1);
		
		waitForElement(drop_bnkacctypid);
		String Bankaccounttypeid1=getData("Bankaccounttypeid","story1",1);
		drop_bnkacctypid.sendKeys(Bankaccounttypeid1);
		
		waitForElement(Edi_Days);
		String Days1=getData("Days","story1",1);
		Edi_Days.sendKeys(Days1);
		
		waitForElement(Edi_transtypid);
		String Transactiontypeid1=getData("Transactiontypeid","story1",1);
		Edi_transtypid.sendKeys(Transactiontypeid1);

		waitForElement(Edi_transsubtypid);
		String Transactionsubtypeid1=getData("Transactionsubtypeid","story1",1);
		Edi_transsubtypid.sendKeys(Transactionsubtypeid1);
		
		waitForElement(Edi_dayofmonth);
		String DayofMonth1=getData("DayofMonth","story1",1);
		Edi_dayofmonth.sendKeys(DayofMonth1);
		
		waitForElement(Edi_intref);
		String InternalRef1=getData("InternalRef","story1",1);
		Edi_intref.sendKeys(InternalRef1);
		
		waitForElement(Click_active4pmts);
		Click_active4pmts.click();
		
		waitForElement(Click_Save2);
		Click_Save2.click();
		
		waitForElement(Click_Yes2);
		Click_Yes2.click();
		
		Thread.sleep(15000);
		
		waitForElement(Click_BtnAdd);
		Click_BtnAdd.click();
		
		waitForElement(Edi_Accdescrip);
		String AccountDescription4=getData("AccountDescription2","story1",2);
		Edi_Accdescrip.sendKeys(AccountDescription4);
		
		waitForElement(Edi_AccHoldr);
		String AccountHolder4=getData("AccountHolder2","story1",2);
		Edi_AccHoldr.sendKeys(AccountHolder4);
		
		waitForElement(Edi_Transref);
		String TransactionReference2=getData("TransactionReference","story1",2);
		Edi_Transref.sendKeys(TransactionReference2);
		
		waitForElement(Edi_branchcode);
		String Branchcode2=getData("Branchcode1","story1",2);
		Edi_branchcode.sendKeys(Branchcode2);

		waitForElement(Edi_Accnum);
		String Accountnumber2=getData("Accountnumber1","story1",2);
		Edi_Accnum.sendKeys(Accountnumber2);
		
		waitForElement(drop_bnkacctypid);
		String Bankaccounttypeid2=getData("Bankaccounttypeid","story1",2);
		drop_bnkacctypid.sendKeys(Bankaccounttypeid2);
		
		waitForElement(Edi_Days);
		String Days2=getData("Days","story1",2);
		Edi_Days.sendKeys(Days2);
		
		waitForElement(Edi_transtypid);
		String Transactiontypeid2=getData("Transactiontypeid","story1",2);
		Edi_transtypid.sendKeys(Transactiontypeid2);

		waitForElement(Edi_transsubtypid);
		String Transactionsubtypeid2=getData("Transactionsubtypeid","story1",2);
		Edi_transsubtypid.sendKeys(Transactionsubtypeid2);
		
		waitForElement(Edi_dayofmonth);
		String DayofMonth2=getData("DayofMonth","story1",2);
		Edi_dayofmonth.sendKeys(DayofMonth2);
		
		waitForElement(Edi_intref);
		String InternalRef2=getData("InternalRef","story1",2);
		Edi_intref.sendKeys(InternalRef2);
		
		waitForElement(Click_active4pmts);
		Click_active4pmts.click();
		
		waitForElement(Click_Save2);
		Click_Save2.click();
		
		waitForElement(Click_Yes2);
		Click_Yes2.click();
		
		Thread.sleep(12000);
		
		waitForElement(Click_BtnAdd);
		Click_BtnAdd.click();
		
		waitForElement(Edi_Accdescrip);
		String AccountDescription5=getData("AccountDescription2","story1",3);
		Edi_Accdescrip.sendKeys(AccountDescription5);
		
		waitForElement(Edi_AccHoldr);
		String AccountHolder5=getData("AccountHolder2","story1",3);
		Edi_AccHoldr.sendKeys(AccountHolder5);
		
		waitForElement(Edi_Transref);
		String TransactionReference3=getData("TransactionReference","story1",3);
		Edi_Transref.sendKeys(TransactionReference3);
		
		waitForElement(Edi_branchcode);
		String Branchcode3=getData("Branchcode1","story1",3);
		Edi_branchcode.sendKeys(Branchcode3);

		waitForElement(Edi_Accnum);
		String Accountnumber3=getData("Accountnumber1","story1",3);
		Edi_Accnum.sendKeys(Accountnumber3);
		
		waitForElement(drop_bnkacctypid);
		String Bankaccounttypeid3=getData("Bankaccounttypeid","story1",3);
		drop_bnkacctypid.sendKeys(Bankaccounttypeid3);
		
		waitForElement(Edi_Days);
		String Days3=getData("Days","story1",3);
		Edi_Days.sendKeys(Days3);
		
		waitForElement(Edi_transtypid);
		String Transactiontypeid3=getData("Transactiontypeid","story1",3);
		Edi_transtypid.sendKeys(Transactiontypeid3);

		waitForElement(Edi_transsubtypid);
		String Transactionsubtypeid3=getData("Transactionsubtypeid","story1",3);
		Edi_transsubtypid.sendKeys(Transactionsubtypeid3);
		
		waitForElement(Edi_dayofmonth);
		String DayofMonth3=getData("DayofMonth","story1",3);
		Edi_dayofmonth.sendKeys(DayofMonth3);
		
		waitForElement(Edi_intref);
		String InternalRef3=getData("InternalRef","story1",3);
		Edi_intref.sendKeys(InternalRef3);
		
		waitForElement(Click_active4pmts);
		Click_active4pmts.click();
		
		waitForElement(Click_Save2);
		Click_Save2.click();
		
		waitForElement(Click_Yes2);
		Click_Yes2.click();
		
		waitForElement(Btn_logout);
		Btn_logout.click();	
		
					
			Thread.sleep(3000);
			
			taskid= DBConnection.dbConnect();
			Thread.sleep(3000);
			
			waitForElement(Edi_Username);	           
            Edi_Username.sendKeys("grantd");
            //arleneg
            Edi_Password.sendKeys("P@ssw0rd");
            Btn_Loginbtn.click();
			
			Thread.sleep(3000);
			System.out.println(NewEntityCreation_ISOStory.taskid);
			Thread.sleep(8000);
			
			driver.findElement(By.xpath("//td[text()='"+NewEntityCreation_ISOStory.taskid+"']")).click();

			waitForElement(Click_Btnaccept);
			Click_Btnaccept.click();
			
			waitForElement(Click_Yes2);
			Click_Yes2.click();
			
			Thread.sleep(15000);
			
			taskid= DBConnection.dbConnect();
			Thread.sleep(3000);
			
			waitForElement(Click_Dashboard);
			Click_Dashboard.click();
			
			Thread.sleep(3000);
			System.out.println(NewEntityCreation_ISOStory.taskid);
			Thread.sleep(8000);
			
			driver.findElement(By.xpath("//td[text()='"+NewEntityCreation_ISOStory.taskid+"']")).click();

			waitForElement(Click_Btnaccept);
			Click_Btnaccept.click();
			
			waitForElement(Click_Yes2);
			Click_Yes2.click();
			
			Thread.sleep(15000);
			
			taskid= DBConnection.dbConnect();
			Thread.sleep(3000);
			
			waitForElement(Click_Dashboard);
			Click_Dashboard.click();
			
			Thread.sleep(3000);
			System.out.println(NewEntityCreation_ISOStory.taskid);
			Thread.sleep(8000);
			
			driver.findElement(By.xpath("//td[text()='"+NewEntityCreation_ISOStory.taskid+"']")).click();

			waitForElement(Click_Btnaccept);
			Click_Btnaccept.click();
			
			waitForElement(Click_Yes2);
			Click_Yes2.click();
			
//			Thread.sleep(10000);
//			
//			taskid= DBConnection.dbConnect();
			Thread.sleep(3000);
			
			waitForElement(Btn_logout);
			Btn_logout.click();	
			


        
	}
	
}
	 
