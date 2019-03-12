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
import com.GenericFunctions.GenericMethods;

public class InterestGroupNSubAccount_Creation extends GenericMethods{

	@FindBy(how=How.XPATH,using="//*[text()= 'Entity Search']")
	public static WebElement Click_EntitySearch;
	
	@FindBy(how=How.XPATH,using="//*[@id='EntityName']")
	public static WebElement Edi_EntitySearch;
	
	@FindBy(how=How.XPATH,using="//*[@id='btnSearch']")
	public static WebElement Btn_Search;
	
	@FindBy(how=How.XPATH,using="//*[@id='resultsGrid']/tbody/tr[1]/td[2]")
	public static WebElement Click_SearchResults;
	
	@FindBy(how=How.XPATH,using="//*[@id='btnOpen']")
	public static WebElement Btn_Open; 

	@FindBy(how=How.XPATH,using="//*[text()='Agreements']")
	public static WebElement Click_Agreemtns;
	
	@FindBy(how=How.XPATH,using="//*[@id='resultsGrid']/tbody/tr[3]/td[1]")
	public static WebElement Click_Agreement1;
	
	@FindBy(how=How.XPATH,using="//*[@id='txtGroupName']")
	public static WebElement Edi_Groupname;
	
	@FindBy(how=How.XPATH,using="//*[@id='btnAddGroup']")
	public static WebElement Click_Add;
	
	@FindBy(how=How.XPATH,using="//*[@id='accordGroups']/div[last()]/div[1]/a")
	public static WebElement Click_Intgroup;
	
	@FindBy(how=How.XPATH,using="(//*[text()='Group Settings'])[last()]")
	public static WebElement Click_GroupSettings;	
	
	@FindBy(how=How.XPATH,using="(//*[@id='InterestRateTypeID'])[last()]")
	public static WebElement Edit_IntrateType;
	
	@FindBy(how=How.XPATH,using="(//*[@id='BucketPeriodTypeID'])[last()]")
	public static WebElement Edit_CollPeriod;
	
	
	

	@FindBy(how=How.XPATH,using="(//*[@id='ClearOutPeriodTypeID'])[last()]")
	public static WebElement Edit_ClearOutPeriod;

	@FindBy(how=How.XPATH,using="(//*[@id='BankAccountID'])[last()]") 
	public static WebElement Edit_BankAccount;
	
	
	
	@FindBy(how=How.XPATH,using="(//*[@id='btnSaveSubAccountChanges'])[last()]") 
	public static WebElement Click_Save_SubAcc;
	
	@FindBy(how=How.XPATH,using="(//*[@id='btnSaveGroupChanges'])[last()]") 
	public static WebElement Click_Save_Acc;
	
	@FindBy(how=How.XPATH,using="//*[@id='btnActual']")
	public static WebElement Click_ActualVsSuggested;
	
	@FindBy(how=How.XPATH,using="(//*[@id='btnModify'])[2]")
	public static WebElement Click_IntSharRatio;
	
	@FindBy(how=How.XPATH,using="//*[@id='model']/fieldset/div/div[2]/div/div")
	public static WebElement Click;
	
	@FindBy(how=How.XPATH,using="//*[@id='btnAdd']")
	public static WebElement Click_btnAdd;
	
	@FindBy(how=How.XPATH,using="//*[@id='Value']")
	public static WebElement Edit_IntSharRatio;
	
	@FindBy(how=How.XPATH,using="//*[@id='EffectiveDate']")
	public static WebElement Edit_Effdate;
	
	@FindBy(how=How.XPATH,using="(//*[@id='btnSaveOne'])[4]")
	public static WebElement Click_btnSave;
	
	@FindBy(how=How.XPATH,using="//*[@id='btnClose']")
	public static WebElement Click_Close;
	
	@FindBy(how=How.XPATH,using="(//*[@id='btnModify'])[3]")
	public static WebElement Click_MinFloatbal;
	
	@FindBy(how=How.XPATH,using="(//*[@id='btnModify'])[4]")
	public static WebElement Click_MinPayoutperct;
	
	@FindBy(how=How.XPATH,using="(//*[@id='btnModify'])[8]")
	public static WebElement Click_Turnday;
	
	@FindBy(how=How.XPATH,using="//*[@id='resultsGrid']/tbody/tr/td[1]")
	public static WebElement Click_quote;
	
	@FindBy(how=How.XPATH,using="//*[@id='btnQuote_submit']")
	public static WebElement Click_Btnquote_submit;
	
	@FindBy(how=How.XPATH,using="//*[@id='btnLogout2']")
	public static WebElement Btn_logout;
	
	@FindBy(how=How.ID,using="txtUsername")
	public static WebElement Edi_Username;
	
	@FindBy(how=How.ID,using="txtPassword")
	public static WebElement Edi_Password;
	
	@FindBy(how=How.ID,using="btnLogin")
	public static WebElement Btn_Loginbtn;
	
	@FindBy(how=How.ID,using="//*[@id='btnAgreement_accept']")
	public static WebElement Btn_Agreement_accept;
	
	@FindBy(how=How.XPATH,using="(//*[@id='txtSubAccountName'])[last()]")
	public static WebElement Edit_Subacc;
	
	@FindBy(how=How.XPATH,using="(//*[@id='btnAddSubAccount'])[last()]")
	public static WebElement Click_Add1;
	
	@FindBy(how=How.XPATH,using="//*[@id='collapseGroup3296']/div/div[last()]/div[1]/a")
	public static WebElement Click_Subacc;
	
	@FindBy(how=How.XPATH,using="(//*[@class='accordion-toggle'])[last()]")
	public static WebElement Click_SubaccSettings;
	
	@FindBy(how=How.XPATH,using="(//*[text()= 'Sub Account Settings'])[last()]")
	public static WebElement Click_SubAccGrpSettings;
	
	@FindBy(how=How.XPATH,using="(//*[@id='btnLinkPolicyAdminSubAccount'])[last()]")
	public static WebElement Click_LinkSystems;
	
	@FindBy(how=How.XPATH,using="//*[@id='PASSystemTypeID']")
	public static WebElement Edit_SysType;
	
	@FindBy(how=How.XPATH,using="//*[@id='ServiceID']")
	public static WebElement Edit_Service;
	
	@FindBy(how=How.XPATH,using="//*[@id='btnSearchPAS']")
	public static WebElement Btn_Search1;
	
	@FindBy(how=How.XPATH,using="(//*[@id='LinkSystem'])[last()]")
	public static WebElement Tick_LinkSystems_Coll;
	
	@FindBy(how=How.XPATH,using="//*[@id='btnLink']")
	public static WebElement Btn_LinkSystems;
	
	@FindBy(how=How.XPATH,using="(//*[@id='LinkSystem'])[last()]")
	public static WebElement Tick_LinkSystems_Pmt;
	
	@FindBy(how=How.XPATH,using="(//*[@id='btnSave'])[2]")
	public static WebElement Btn_Save;
	
	@FindBy(how=How.XPATH,using="//*[text()= 'Yes']")
	public static WebElement Click_Yes;
	
	@FindBy(how=How.XPATH,using="(//*[text()= 'Agreements'])[3]")
	public static WebElement Click_Agreemtns3;
	
	@FindBy(how=How.XPATH,using="(//*[@id='LongName'])[last()]")
	public static WebElement Edit_SubAcName;

	@FindBy(how=How.XPATH,using="(//*[@id='ForcedReference'])[last()]")
	public static WebElement Edit_ForcedRef;
	
	@FindBy(how=How.XPATH,using="(//*[@id='SubAccountCode'])[last()]")
	public static WebElement Edit_SubAccCode;
	
			
			
	
	
	
	
	
	
	
	
	public static String taskid;
	
	
	public static <performDBLCLICK> void InterestGroupNSubAccount_Creation() throws Exception   
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
		

		Edi_EntitySearch.sendKeys("african Unity Health");
		waitForElement(Btn_Search);
		Btn_Search.click();
		
  		waitForElement(Click_SearchResults);
		Click_SearchResults.click();
		waitForElement(Btn_Open);
		Btn_Open.click();
		
		waitForElement(Click_Agreemtns);
		Click_Agreemtns.click();
		waitForElement(Click_Agreement1);
performDBLCLICK(Click_Agreement1);
		
		waitForElement(Edi_Groupname);
				
		String Agreementname=getData("Agreementname","story1",4);

		Edi_Groupname.sendKeys(Agreementname);
		
		Thread.sleep(16000);
		
		waitForElement(Click_Add);
		
		Click_Add.click(); 
		
		Thread.sleep(12000);
		
		waitForElement(Click_Intgroup);
		Click_Intgroup.click();
		
		waitForElement(Click_GroupSettings);
		Click_GroupSettings.click();
		
//		Thread.sleep(2000);
//		
//		waitForElement(Edit_CollPeriod);
//		Edit_CollPeriod.sendKeys("Monthly");
//		
//		Thread.sleep(3000);
//	     
//		waitForElement(Edit_BankAccount);
//		
//		String BankAccount=getData("BankAccount","story1",4);
//
//		Edit_BankAccount.sendKeys(BankAccount);
//		
//		waitForElement(Edit_IntrateType);
//		Edit_IntrateType.sendKeys("Not Applicable");
//		
//		Thread.sleep(2000);
//		
//		waitForElement(Edit_CollPeriod);
//		Edit_CollPeriod.sendKeys("Monthly");
	
		Thread.sleep(3000);
		
		waitForElement(Click_SubaccSettings);
		Click_SubaccSettings.click();
		
		Thread.sleep(2000);
		
		waitForElement(Click_SubAccGrpSettings);
		Click_SubAccGrpSettings.click();
		
		Thread.sleep(2000);
		
		Edit_SubAcName.clear();
		
		waitForElement(Edit_SubAcName);
		
		String SubAccount=getData("SubAccount","story1",4);

		Edit_SubAcName.sendKeys(SubAccount);
		
		Thread.sleep(2000);
		
		Edit_ForcedRef.clear();
		
		waitForElement(Edit_ForcedRef);
		
		String Forced_Ref=getData("Forced_Ref","story1",4);

		Edit_ForcedRef.sendKeys(Forced_Ref);
		
		Thread.sleep(2000);
		
		Edit_SubAccCode.clear();
		
		waitForElement(Edit_SubAccCode);
		
		String SubAccCode=getData("SubAccCode","story1",4);

		Edit_SubAccCode.sendKeys(SubAccCode);
		
		Thread.sleep(2000);
	
		waitForElement(Click_Save_SubAcc);
		Click_Save_SubAcc.click();
		
		Thread.sleep(8000);
		
		waitForElement(Click_LinkSystems);
		Click_LinkSystems.click();	
		
		waitForElement(Edit_SysType);
		Edit_SysType.sendKeys("Standard Epic");
		
		waitForElement(Edit_Service);
		Edit_Service.sendKeys("Collections");
		
		waitForElement(Btn_Search1);
		Btn_Search1.click();
		
		Thread.sleep(2000);
		
		waitForElement(Tick_LinkSystems_Coll);
		Tick_LinkSystems_Coll.click();
		
		waitForElement(Btn_LinkSystems);
		Btn_LinkSystems.click();
		
		Thread.sleep(3000);
		
		waitForElement(Edit_Service);
		Edit_Service.sendKeys("Payments");
		
		waitForElement(Btn_Search1);
		Btn_Search1.click();
		
		waitForElement(Tick_LinkSystems_Pmt);
		Tick_LinkSystems_Pmt.click();
		
		waitForElement(Btn_LinkSystems);
		Btn_LinkSystems.click();
		
		Thread.sleep(3000);
		
		waitForElement(Btn_Save);
		Btn_Save.click();
		
		waitForElement(Click_Yes);
		Click_Yes.click();
		
		Thread.sleep(5000);
		
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


		


	}
}
	 
