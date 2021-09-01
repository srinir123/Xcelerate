package com.ScreenFunctions;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
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
import com.GenericFunctions.GetDateinJava;
import com.GenericFunctions.NewDBConnection_OTP_Story1;

public class FissionTest extends GenericMethods{

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
	
	@FindBy(how=How.XPATH,using="//*[@id='ServiceID2']")
	public static WebElement Edit_Service;
	
	@FindBy(how=How.XPATH,using="//*[@id='btnLinkIG']")
	public static WebElement Click_Search;
	
	@FindBy(how=How.XPATH,using="//*[@id='SystemName']")
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
	
	@FindBy(how=How.XPATH,using="//*[@id='ImportFileFormatID']")
	public static WebElement Dropdown_Filetype;
	
	
	@FindBy(how=How.XPATH,using="//*[@id='FileDescription']")
	public static WebElement Edit_FileDesp;
	
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
	
	//@FindBy(how=How.XPATH,using="(//*[@class='accordion-toggle disabled'])[last()]")
	//public static WebElement Click_Subacc;
	
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
	
	@FindBy(how=How.XPATH,using="//*[@id='btnAddImport']")
	public static WebElement Click_add;

	@FindBy(how=How.XPATH,using="//*[@id='ColumnIndex'][1]")
	public static WebElement Edit_Accholder;
	
	@FindBy(how=How.XPATH,using="(//*[@id='ColumnIndex'])[2]")
	public static WebElement Edit_Accnum;
	
	@FindBy(how=How.XPATH,using="(//*[@id='ColumnIndex'])[3]")
	public static WebElement Edit_AccType;
	
	@FindBy(how=How.XPATH,using="(//*[@id='ColumnIndex'])[4]")
	public static WebElement Edit_ActionDate;
	
	@FindBy(how=How.XPATH,using="(//*[@id='FormatID'])[4]")
	public static WebElement Edit_ActionDateFormat;
	
	@FindBy(how=How.XPATH,using="(//*[@id='ColumnIndex'])[5]")
	public static WebElement Edit_Amt;
	
	@FindBy(how=How.XPATH,using="(//*[@id='FormatID'])[5]")
	public static WebElement Edit_AmtFormat;
	
	@FindBy(how=How.XPATH,using="(//*[@id='ColumnIndex'])[6]")
	public static WebElement Edit_BankRef;
	
	@FindBy(how=How.XPATH,using="(//*[@id='ColumnIndex'])[7]")
	public static WebElement Edit_BranchNumber;
	
	@FindBy(how=How.XPATH,using="(//*[@id='ColumnIndex'])[10]")
	public static WebElement Edit_SplitBenfIdentifier;
	
	@FindBy(how=How.XPATH,using="(//*[@id='ColumnIndex'])[11]")
	public static WebElement Edit_SplitFissionStrikeDay;
	
	@FindBy(how=How.XPATH,using="(//*[@id='ColumnIndex'])[12]")
	public static WebElement Edit_SplitTransAmt;
	
	@FindBy(how=How.XPATH,using="(//*[@id='FormatID'])[12]")
	public static WebElement Edit_SplitTransAmtFormat;
	
	@FindBy(how=How.XPATH,using="(//*[@id='ColumnIndex'])[13]")
	public static WebElement Edit_SubAccIdentifier;
	
	@FindBy(how=How.XPATH,using="(//*[@id='ColumnIndex'])[14]")
	public static WebElement Edit_TransComment;
	
	@FindBy(how=How.XPATH,using="(//*[@id='ColumnIndex'])[15]")
	public static WebElement Edit_TransType;
	
	@FindBy(how=How.XPATH,using="//*[@id='btnSaveOne']")
	public static WebElement Click_Save3;
	
	@FindBy(how=How.XPATH,using="//*[text()='Contact People']")
	public static WebElement Click_Contactppl;
	@FindBy(how=How.XPATH,using="//*[@id='resultsGrid']/tbody/tr[16]/td[10]/button[4]")
	public static WebElement Click_Top1User;
	@FindBy(how=How.XPATH,using="//*[@id='RoleAndPermissionsTab']")
	public static WebElement Click_RolesNpermessions;
	@FindBy(how=How.XPATH,using="//*[@id='btnOpen']")
	public static WebElement Click_Open;
	@FindBy(how=How.XPATH,using="//*[@id='RolesGrid']/tbody/tr[3]/td[2]")
	public static WebElement Click_UserRoles;
	@FindBy(how=How.XPATH,using="//*[@id='PermissionsGrid']/tbody/tr[5]/td[1]/input")
	public static WebElement Click_UserPermissions;
	@FindBy(how=How.XPATH,using="//*[@id='btnSave']")
	public static WebElement Click_Save4;
	
	@FindBy(how=How.XPATH,using="//*[@id='btnClose']")
	public static WebElement Click_Close;
	
	@FindBy(how=How.XPATH,using="(//*[contains(text(), 'Yes')])[2]")
	public static WebElement Btnt_Yes2;

	@FindBy(how=How.XPATH,using="//*[text()= 'Collection Period Balances']")
	public static WebElement Click_CollPeriodBalances;
	
	@FindBy(how=How.XPATH,using="//*[@id='ServiceID']/option[4]")
	public static WebElement Edit_Servicetype;

	@FindBy(how=How.XPATH,using="//*[@id='ServiceID']/option[2]")
	public static WebElement Edit_Servicetypec;
	
	@FindBy(how=How.XPATH,using="//*[@id='ServiceID']/option[3]")
	public static WebElement Edit_Servicetypep;
	
	@FindBy(how=How.XPATH,using="//*[@id='BucketStartDate']")
	public static WebElement Edit_CollPeriodstartdate;
		
	@FindBy(how=How.XPATH,using="//*[@id='pagecontainer']/div/div[1]/div[2]/div/div/div/div/div/div[3]/button")
	public static WebElement Click_Importfile;
	
	@FindBy(how=How.XPATH,using="//*[@id='searchGrid']/tbody/tr[2]/td[6]/button")
	public static WebElement btn_CollImportFile;
	
	@FindBy(how=How.XPATH,using="//*[@id='Div3']/div/div/div/div[1]/div[1]/div/div[2]/button[2]")
	public static WebElement btn_CollImport;
	
	@FindBy(how=How.XPATH,using="//*[@id='ui-datepicker-div']/div[2]/button[2]")
	public static WebElement Done_Click;
	
	@FindBy(how=How.XPATH,using="//*[text()= 'Imported Files']")
	public static WebElement Click_Impfiles; 

	@FindBy(how=How.XPATH,using="//*[@id='fileimport-grid']/thead/tr/th[1]")
	public static WebElement Click_ID; 
	
	@FindBy(how=How.XPATH,using="(//*[@id='btnReviewItem'])[1]")
	public static WebElement btn_ReviewItem;

	@FindBy(how=How.XPATH,using="//*[@id='btnSaveTrans']")
	public static WebElement btn_SaveTrans;
	
	@FindBy(how=How.XPATH,using="//*[text()= 'OK']")
	public static WebElement Click_Ok;
	

	
	
	
	
	
	
	
	
					
					
	
	
				
	
	
			
			
					
							
									
											
	
	
	
	
	
	public static String taskid;
	
	public static String OTP;


	public static void FissionTest() throws Exception{
		
	
Thread.sleep(20000);
waitForElement(Click_EntitySearch);

waitForElement(Click_EntitySearch);
if(Click_EntitySearch.isDisplayed())
{
	System.out.println("Clicking on entity search");
	
	Actions acc=new Actions(driver);
	
	acc.moveToElement(Click_EntitySearch).click(Click_EntitySearch).build().perform();
Click_EntitySearch.click();
}

Thread.sleep(2000);
waitForElement(Edi_EntitySearch);

String Entity_Name2=getData("EntityName","story1",1);

Thread.sleep(2000);

Edi_EntitySearch.sendKeys(Entity_Name2);

Thread.sleep(2000);

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
Edit_SysType.sendKeys("In-House");

waitForElement(Edit_SysName);
Edit_SysName.sendKeys("Fission Test");

waitForElement(Dropdown_Filetype);
Dropdown_Filetype.sendKeys("Comma Separated Values");

waitForElement(Edit_FileDesp);
Edit_FileDesp.sendKeys("Fission Test");

Thread.sleep(2000);


waitForElement(Edit_Service);
Edit_Service.sendKeys("Fission");

waitForElement(Click_add);
Click_add.click();


waitForElement(Edit_Accholder);
Edit_Accholder.sendKeys("5");

waitForElement(Edit_Accnum);
Edit_Accnum.sendKeys("3");

waitForElement(Edit_AccType);
Edit_AccType.sendKeys("8");

waitForElement(Edit_ActionDate);
Edit_ActionDate.sendKeys("7");

waitForElement(Edit_ActionDateFormat);
Edit_ActionDateFormat.sendKeys("YYMMDD");

waitForElement(Edit_Amt);
Edit_Amt.sendKeys("4");

waitForElement(Edit_AmtFormat);
Edit_AmtFormat.sendKeys("Last 2 digits is Cents");

waitForElement(Edit_BankRef);
Edit_BankRef.sendKeys("6");

waitForElement(Edit_BranchNumber);
Edit_BranchNumber.sendKeys("2");

waitForElement(Edit_SplitBenfIdentifier);
Edit_SplitBenfIdentifier.sendKeys("12");

waitForElement(Edit_SplitFissionStrikeDay);
Edit_SplitFissionStrikeDay.sendKeys("11");

waitForElement(Edit_SplitTransAmt);
Edit_SplitTransAmt.sendKeys("13");

waitForElement(Edit_SplitTransAmtFormat);
Edit_SplitTransAmtFormat.sendKeys("Last 2 digits is Cents");

waitForElement(Edit_SubAccIdentifier);
Edit_SubAccIdentifier.sendKeys("10");

waitForElement(Edit_TransComment);
Edit_TransComment.sendKeys("9");

waitForElement(Edit_TransType);
Edit_TransType.sendKeys("1");

waitForElement(Click_Save3);
Click_Save3.click();

waitForElement(Btnt_Yes1);
Btnt_Yes1.click();

Thread.sleep(2000);

waitForElement(Click_Contactppl);
Click_Contactppl.click();

waitForElement(Click_Top1User);
Click_Top1User.click();

waitForElement(Click_RolesNpermessions);
Click_RolesNpermessions.click();

waitForElement(Click_Open);
Click_Open.click();

waitForElement(Click_UserRoles);
Click_UserRoles.click();

waitForElement(Click_UserPermissions);
Click_UserPermissions.click();

try
{
    Click_UserPermissions.click();
				
}
catch (Exception e)
{
}

                
waitForElement(Click_Save4);
Click_Save4.click();

Thread.sleep(5000);


waitForElement(Click_Close);
Click_Close.click();

waitForElement(Btnt_Yes2);
Btnt_Yes2.click();


Thread.sleep(2000);
	
	waitForElement(Btn_logout);
	Btn_logout.click();	
	
	Thread.sleep(6000);
    
    Edi_Username.sendKeys("path");
    Edi_Password.sendKeys("P@ssw0rd");
    Btn_Loginbtn.click();
	Thread.sleep(6000);

	waitForElement(Click_CollPeriodBalances);
	Click_CollPeriodBalances.click();
	
	waitForElement(Edit_Servicetype);
	Edit_Servicetype.click();	

    waitForElement(Edit_CollPeriodstartdate);
    Edit_CollPeriodstartdate.sendKeys("February 2021");
    
    waitForElement(Done_Click);
    Done_Click.click();
	
    waitForElement(Click_Importfile);
    Click_Importfile.click();

    waitForElement(btn_CollImportFile);
    btn_CollImportFile.click();
    
    Thread.sleep(5000);

    StringSelection ss = new StringSelection("C:\\Users\\srinir.SOLARSYSTEM\\Downloads\\FissionImportFileCSV_new.csv");
    
	System.out.println(ss);

    Thread.sleep(3000);
    
    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

    Thread.sleep(3000);

    Robot robot = new Robot();

    robot.keyPress(KeyEvent.VK_CONTROL);

    robot.keyPress(KeyEvent.VK_V);

    robot.keyRelease(KeyEvent.VK_V);

    robot.keyRelease(KeyEvent.VK_CONTROL);

    Thread.sleep(3000);

    robot.keyPress(KeyEvent.VK_ENTER); 

    
      Thread.sleep(3000);
      System.out.println("Fission file imported successfully");
	  LogEvent("Pass","Fission file imported successfully");

	  
		waitForElement(Edit_Servicetypec);
		Edit_Servicetypec.click();	

	    waitForElement(Edit_CollPeriodstartdate);
	    Edit_CollPeriodstartdate.sendKeys("February 2021");
	    
	    waitForElement(Done_Click);
	    Done_Click.click();
		
	    waitForElement(Click_Importfile);
	    Click_Importfile.click();

	    waitForElement(btn_CollImportFile);
	    btn_CollImportFile.click();
	    
		Thread.sleep(6000);
	    
	    StringSelection ss1 = new StringSelection("C:\\Users\\srinir.SOLARSYSTEM\\Downloads\\Fission SFTP Test\\OneFile Solutions_Collections\\Onefile Collection file.csv");
	    
		System.out.println(ss1);

	    Thread.sleep(3000);
	    
	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss1, null);

	    Thread.sleep(3000);

	    Robot robot1 = new Robot();

	    robot1.keyPress(KeyEvent.VK_CONTROL);

	    robot1.keyPress(KeyEvent.VK_V);

	    robot1.keyRelease(KeyEvent.VK_V);

	    robot1.keyRelease(KeyEvent.VK_CONTROL);

	    Thread.sleep(3000);

	    robot1.keyPress(KeyEvent.VK_ENTER); 

	    
	      Thread.sleep(3000);
	      System.out.println("OneFileSolution Collection file imported successfully");
		  LogEvent("Pass","OneFileSolution Collection file imported successfully");

		  
		  waitForElement(Click_Impfiles);
			
			if(Click_Impfiles.isDisplayed())
			{
				System.out.println("Clicking on Imported Files search");
				
				Actions acc=new Actions(driver);
				
				acc.moveToElement(Click_Impfiles).click(Click_Impfiles).build().perform();
				Click_Impfiles.click();
			}
			waitForElement1(Click_ID);
			performDBLCLICK(Click_ID);	
			waitForElement(btn_ReviewItem);
			btn_ReviewItem.click();

			
			waitForElement(btn_SaveTrans);
			click_element(btn_SaveTrans);


			
			waitForElement(Click_Ok);
			Click_Ok.click();
			
			
			
		    Thread.sleep(3000);
			System.out.println("The Imported File has been reviewed  sucessfully");
			LogEvent("Pass","The Imported File has been reviewed  sucessfully");
			
			
			
			// OneFile Solutions_Payments
			
			waitForElement(Click_CollPeriodBalances);
			Click_CollPeriodBalances.click();
			
			waitForElement(Edit_Servicetypep);
			Edit_Servicetypep.click();	

		    waitForElement(Edit_CollPeriodstartdate);
		    Edit_CollPeriodstartdate.sendKeys("February 2021");
		    
		    waitForElement(Done_Click);
		    Done_Click.click();
			
		    waitForElement(Click_Importfile);
		    Click_Importfile.click();

		    waitForElement(btn_CollImportFile);
		    btn_CollImportFile.click();
		    
		    Thread.sleep(6000);
			
		    StringSelection ss2 = new StringSelection("C:\\Users\\srinir.SOLARSYSTEM\\Downloads\\Fission SFTP Test\\OneFile Solutions_Payments\\Onefile Payment file.csv");
		    
			System.out.println(ss2);

		    Thread.sleep(3000);
		    
		    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss2, null);

		    Thread.sleep(3000);

		    Robot robot2 = new Robot();

		    robot2.keyPress(KeyEvent.VK_CONTROL);

		    robot2.keyPress(KeyEvent.VK_V);

		    robot2.keyRelease(KeyEvent.VK_V);

		    robot2.keyRelease(KeyEvent.VK_CONTROL);

		    Thread.sleep(3000);

		    robot2.keyPress(KeyEvent.VK_ENTER); 

		    
		      Thread.sleep(3000);
		      System.out.println("OneFileSolution Payment file imported successfully");
			  LogEvent("Pass","OneFileSolution Payment file imported successfully");

			  
			  waitForElement(Click_Impfiles);
				
				if(Click_Impfiles.isDisplayed())
				{
					System.out.println("Clicking on Imported Files search");
					
					Actions acc=new Actions(driver);
					
					acc.moveToElement(Click_Impfiles).click(Click_Impfiles).build().perform();
					Click_Impfiles.click();
				}
				waitForElement1(Click_ID);
				performDBLCLICK(Click_ID);	
				waitForElement(btn_ReviewItem);
				btn_ReviewItem.click();

				
				waitForElement(btn_SaveTrans);
	
				click_element(btn_SaveTrans);
	

				
				waitForElement(Click_Ok);
				Click_Ok.click();
				
				
				
			    Thread.sleep(3000);
				System.out.println("The Imported File has been reviewed  sucessfully");
				LogEvent("Pass","The Imported File has been reviewed  sucessfully");






	}}
