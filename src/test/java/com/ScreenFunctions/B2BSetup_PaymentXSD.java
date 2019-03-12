package com.ScreenFunctions;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.io.File;
import java.awt.event.KeyEvent;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.GenericFunctions.GenericMethods;

public class B2BSetup_PaymentXSD extends GenericMethods{
	@FindBy(how=How.XPATH,using="//*[text()= 'B2B Setup']")
	public static WebElement Click_b2bSetup;
	
	@FindBy(how=How.XPATH,using="//button[contains(text(),'Choose File')]")
	public static WebElement Btn_ChooseFile;
	
	@FindBy(how=How.XPATH,using="//*[@id='SchemaDescription']")
	public static WebElement Edit_Schemadesp;
	
	//@FindBy(how=How.XPATH,using="//*[@id='saveSchemaInfo']")
	//public static WebElement Btn_Saveschamainfo;
	
	@FindBy(how=How.XPATH,using="//*[@id='treeView']/ul/li/label[1]")
	public static WebElement Click_Doc;

	@FindBy(how=How.XPATH,using="//*[@id='treeView']/ul/li/ul/li/label[1]")
	public static WebElement Click_CstmrDrctDbtInitn;
	
	
	@FindBy(how=How.XPATH,using="//*[@id='treeView']/ul/li/ul/li/ul/li[1]/label[1]")
	public static WebElement Click_GrpHdr;	
	
	@FindBy(how=How.XPATH,using="//*[@id='treeView']/ul/li/ul/li/ul/li[1]/ul/li[1]/div/select")
	public static WebElement edit_MsgId; 
		
	@FindBy(how=How.XPATH,using="//*[@id='treeView']/ul/li/ul/li/ul/li[1]/ul/li[2]/div/select")
	public static WebElement edit_CreDtTm;
	
	@FindBy(how=How.XPATH,using="//*[@id='treeView']/ul/li/ul/li/ul/li[1]/ul/li[4]/div/select")
	public static WebElement edit_NbOfTxs; 
	
	@FindBy(how=How.XPATH,using="//*[@id='treeView']/ul/li/ul/li/ul/li[1]/ul/li[5]/div/select") 
	public static WebElement edit_CtrlSum;
	
	@FindBy(how=How.XPATH,using="//*[@id='treeView']/ul/li/ul/li/ul/li[1]/ul/li[6]/label[1]") 
	public static WebElement Click_InitgPty;
	
	@FindBy(how=How.XPATH,using="//*[@id='treeView']/ul/li/ul/li/ul/li[1]/ul/li[6]/ul/li[1]/div/select") 
	public static WebElement edit_Nm;
	
	@FindBy(how=How.XPATH,using="//*[@id='treeView']/ul/li/ul/li/ul/li[1]/ul/li[6]/ul/li[1]/div/input")
	public static WebElement Edi_NmVariable;
	
	@FindBy(how=How.XPATH,using="//*[@id='treeView']/ul/li/ul/li/ul/li[2]/label[1]")
	public static WebElement Click_PmtInf;
	
	@FindBy(how=How.XPATH,using="//*[@id='treeView']/ul/li/ul/li/ul/li[2]/ul/li[1]/div/select")
	public static WebElement edit_PmtInfoID;
	
	@FindBy(how=How.XPATH,using="//*[@id='treeView']/ul/li/ul/li/ul/li[2]/ul/li[2]/div/select")
	public static WebElement edi_PmtMtd;
	
	@FindBy(how=How.XPATH,using="//*[@id='treeView']/ul/li/ul/li/ul/li[2]/ul/li[4]/div/select")
	public static WebElement edi_NbOfTxs;
	
	@FindBy(how=How.XPATH,using="//*[@id='treeView']/ul/li/ul/li/ul/li[2]/ul/li[5]/div/select")
	public static WebElement edi_CtrlSum;
	
	@FindBy(how=How.XPATH,using="//*[@id='treeView']/ul/li/ul/li/ul/li[2]/ul/li[6]/label[1]")
	public static WebElement Click_PmtTpInf;
	
	@FindBy(how=How.XPATH,using="//*[@id='treeView']/ul/li/ul/li/ul/li[2]/ul/li[6]/ul/li[2]/label[1]")
	public static WebElement Click_SvcLvl;
	
	@FindBy(how=How.XPATH,using="//*[@id='treeView']/ul/li/ul/li/ul/li[2]/ul/li[6]/ul/li[2]/ul/li[1]/div/select")
	public static WebElement Edi_Cd;
	
	@FindBy(how=How.XPATH,using="//*[@id='treeView']/ul/li/ul/li/ul/li[2]/ul/li[7]/div/select")
	public static WebElement edi_ReqdExctnDt;
	
	@FindBy(how=How.XPATH,using="//*[@id='treeView']/ul/li/ul/li/ul/li[2]/ul/li[8]/label[1]")
	public static WebElement Click_Cdtr;
	
	@FindBy(how=How.XPATH,using="//*[@id='treeView']/ul/li/ul/li/ul/li[2]/ul/li[8]/ul/li[1]/div/select")
	public static WebElement Edi_Nm;
	
	@FindBy(how=How.XPATH,using="//*[@id='treeView']/ul/li/ul/li/ul/li[2]/ul/li[9]/ul/li[1]/div/select")
	public static WebElement Edi_Nm1;
	
	
	
	@FindBy(how=How.XPATH,using="//*[@id='treeView']/ul/li/ul/li/ul/li[2]/ul/li[9]/ul/li[1]/div/input")
	public static WebElement Edi_NmVariable2; 
	
	

	@FindBy(how=How.XPATH,using="//*[@id='treeView']/ul/li/ul/li/ul/li[2]/ul/li[8]/ul/li[3]/label[1]") 
	public static WebElement Click_Id; 
	
	@FindBy(how=How.XPATH,using="//*[@id='treeView']/ul/li/ul/li/ul/li[2]/ul/li[10]/ul/li[1]/label[1]") 
	public static WebElement Click_Id1;
	
	
	
	@FindBy(how=How.XPATH,using="//*[@id='treeView']/ul/li/ul/li/ul/li[2]/ul/li[9]/label[1]") 
	public static WebElement Click_Cdtracct;  
	
	@FindBy(how=How.XPATH,using="//*[@id='treeView']/ul/li/ul/li/ul/li[2]/ul/li[9]/ul/li[1]/label[1]") 
	public static WebElement Click_ID; 
	
	@FindBy(how=How.XPATH,using="//*[@id='treeView']/ul/li/ul/li/ul/li[2]/ul/li[9]/ul/li[1]/ul/li[1]/div/select") 
	public static WebElement Edit_IBAN;
	
	@FindBy(how=How.XPATH,using="//*[@id='treeView']/ul/li/ul/li/ul/li[2]/ul/li[9]/ul/li[2]/label[1]") 
	public static WebElement Click_Tp;
	
	@FindBy(how=How.XPATH,using="//*[@id='treeView']/ul/li/ul/li/ul/li[2]/ul/li[10]/ul/li[2]/label[1]") 
	public static WebElement Click_Tp1;
	
	
	
	
	
	
	
	@FindBy(how=How.XPATH,using="//*[@id='treeView']/ul/li/ul/li/ul/li[2]/ul/li[9]/ul/li[2]/ul/li[1]/div/select") 
	public static WebElement Edit_CD; 
	
	@FindBy(how=How.XPATH,using="//*[@id='treeView']/ul/li/ul/li/ul/li[2]/ul/li[10]/ul/li[2]/ul/li[1]/div/select") 
	public static WebElement Edit_CD1;
	
	@FindBy(how=How.XPATH,using="//*[@id='treeView']/ul/li/ul/li/ul/li[2]/ul/li[10]/ul/li[2]/ul/li[1]/div/input") 
	public static WebElement Edit_CD1Variable;
	
	
	
	
	
	@FindBy(how=How.XPATH,using="//*[@id='treeView']/ul/li/ul/li/ul/li[2]/ul/li[10]/label[1]") 
	public static WebElement Click_CDtrAgt; 
	
	@FindBy(how=How.XPATH,using="//*[@id='treeView']/ul/li/ul/li/ul/li[2]/ul/li[17]/ul/li[14]/label[1]") 
	public static WebElement Click_CDtrAgt1; 
	
	@FindBy(how=How.XPATH,using="//*[@id='treeView']/ul/li/ul/li/ul/li[2]/ul/li[17]/ul/li[14]/ul/li[1]/label[1]") 
	public static WebElement Click_FinInstnld2;
	
	@FindBy(how=How.XPATH,using="//*[@id='treeView']/ul/li/ul/li/ul/li[2]/ul/li[17]/ul/li[14]/ul/li[1]/ul/li[2]/label[1]") 
	public static WebElement Click_ClrsyMmbld;
	
	@FindBy(how=How.XPATH,using="//*[@id='treeView']/ul/li/ul/li/ul/li[2]/ul/li[17]/ul/li[14]/ul/li[1]/ul/li[2]/ul/li[2]/div/select") 
	public static WebElement Edit_Mmbld2;
	
	@FindBy(how=How.XPATH,using="//*[@id='treeView']/ul/li/ul/li/ul/li[2]/ul/li[17]/ul/li[14]/ul/li[2]/label[1]") 
	public static WebElement Click_Brnchld3;
	
	@FindBy(how=How.XPATH,using="//*[@id='treeView']/ul/li/ul/li/ul/li[2]/ul/li[17]/ul/li[14]/ul/li[2]/ul/li[1]/div/select") 
	public static WebElement Edit_Id2;
	
	@FindBy(how=How.XPATH,using="//*[@id='treeView']/ul/li/ul/li/ul/li[2]/ul/li[17]/ul/li[16]/label[1]") 
	public static WebElement Click_Cdtr1;
	
	@FindBy(how=How.XPATH,using="//*[@id='treeView']/ul/li/ul/li/ul/li[2]/ul/li[17]/ul/li[16]/ul/li[1]/div/select") 
	public static WebElement Edit_Nm1;
	
	@FindBy(how=How.XPATH,using="//*[@id='treeView']/ul/li/ul/li/ul/li[2]/ul/li[17]/ul/li[17]/label[1]") 
	public static WebElement Click_Cdtracct1;
	
	@FindBy(how=How.XPATH,using="//*[@id='treeView']/ul/li/ul/li/ul/li[2]/ul/li[17]/ul/li[17]/ul/li[1]/label[1]") 
	public static WebElement Click_Id2;
	
	@FindBy(how=How.XPATH,using="//*[@id='treeView']/ul/li/ul/li/ul/li[2]/ul/li[17]/ul/li[17]/ul/li[1]/ul/li[2]/label[1]") 
	public static WebElement Click_Oth;
	
	@FindBy(how=How.XPATH,using="//*[@id='treeView']/ul/li/ul/li/ul/li[2]/ul/li[17]/ul/li[17]/ul/li[1]/ul/li[2]/ul/li[1]/div/select") 
	public static WebElement Edit_Id3;
	
	@FindBy(how=How.XPATH,using="//*[@id='treeView']/ul/li/ul/li/ul/li[2]/ul/li[17]/ul/li[17]/ul/li[2]/label[1]") 
	public static WebElement Click_Tp2;
	
	@FindBy(how=How.XPATH,using="//*[@id='treeView']/ul/li/ul/li/ul/li[2]/ul/li[17]/ul/li[17]/ul/li[2]/ul/li[1]/div/select") 
	public static WebElement Edit_Cd1;
	
	@FindBy(how=How.XPATH,using="//*[@id='treeView']/ul/li/ul/li/ul/li[2]/ul/li[17]/ul/li[25]/label[1]") 
	public static WebElement Click_Rmtinf;
	
	@FindBy(how=How.XPATH,using="//*[@id='treeView']/ul/li/ul/li/ul/li[2]/ul/li[17]/ul/li[25]/ul/li[1]/div/select") 
	public static WebElement Edit_Ustrd1;
	
	@FindBy(how=How.XPATH,using="//*[@id='treeView']/ul/li/ul/li/ul/li[2]/ul/li[17]/label[1]") 
	public static WebElement Click_CdtTrfTxinf;
	
	@FindBy(how=How.XPATH,using="//*[@id='treeView']/ul/li/ul/li/ul/li[2]/ul/li[10]/ul/li[1]/label[1]") 
	public static WebElement Click_FinInstnld; 
	
	@FindBy(how=How.XPATH,using="//*[@id='treeView']/ul/li/ul/li/ul/li[2]/ul/li[11]/ul/li[1]/label[1]") 
	public static WebElement Click_FinInstnld1;
	
	@FindBy(how=How.XPATH,using="//*[@id='treeView']/ul/li/ul/li/ul/li[2]/ul/li[10]/ul/li[1]/ul/li[2]/label[1]") 
	public static WebElement Click_ClrSysMmbId;
	
	@FindBy(how=How.XPATH,using="//*[@id='treeView']/ul/li/ul/li/ul/li[2]/ul/li[10]/ul/li[1]/ul/li[2]/ul/li[2]/div/select") 
	public static WebElement Edit_Mmbld;
	
	@FindBy(how=How.XPATH,using="//*[@id='treeView']/ul/li/ul/li/ul/li[2]/ul/li[11]/ul/li[1]/ul/li[2]/ul/li[2]/div/select") 
	public static WebElement Edit_Mmbld1;
	
	@FindBy(how=How.XPATH,using="//*[@id='treeView']/ul/li/ul/li/ul/li[2]/ul/li[10]/ul/li[2]/label[1]") 
	public static WebElement Click_Brnchld;
	
	@FindBy(how=How.XPATH,using="//*[@id='treeView']/ul/li/ul/li/ul/li[2]/ul/li[11]/ul/li[2]/label[1]") 
	public static WebElement Click_Brnchld2;
	
	@FindBy(how=How.XPATH,using="//*[@id='treeView']/ul/li/ul/li/ul/li[2]/ul/li[10]/ul/li[2]/ul/li[1]/div/select") 
	public static WebElement Edit_id;
	
	@FindBy(how=How.XPATH,using="//*[@id='DrctDbtTxInf']") 
	public static WebElement Tick_Is_Transaction_Collection;
	
	@FindBy(how=How.XPATH,using="//*[@id='treeView']/ul/li/ul/li/ul/li[2]/ul/li[17]/label[1]") 
	public static WebElement Click_DrctDbtTxInf;
	
	@FindBy(how=How.XPATH,using="//*[@id='treeView']/ul/li/ul/li/ul/li[2]/ul/li[17]/ul/li[1]/label[1]") 
	public static WebElement Click_Pmtld;
	
	@FindBy(how=How.XPATH,using="//*[@id='treeView']/ul/li/ul/li/ul/li[2]/ul/li[17]/ul/li[1]/ul/li[2]/div/select") 
	public static WebElement Edit_EndToEndld;
	
	@FindBy(how=How.XPATH,using="//*[@id='treeView']/ul/li/ul/li/ul/li[2]/ul/li[17]/ul/li[7]/label[1]") 
	public static WebElement Click_DbtrAgt;
	
	@FindBy(how=How.XPATH,using="//*[@id='treeView']/ul/li/ul/li/ul/li[2]/ul/li[11]/label[1]") 
	public static WebElement Click_DbtrAgt1;
	
	@FindBy(how=How.XPATH,using="//*[@id='treeView']/ul/li/ul/li/ul/li[2]/ul/li[17]/ul/li[7]/ul/li[1]/label[1]") 
	public static WebElement Click_Fininstnld;
	
	@FindBy(how=How.XPATH,using="//*[@id='treeView']/ul/li/ul/li/ul/li[2]/ul/li[17]/ul/li[7]/ul/li[1]/ul/li[2]/label[1]") 
	public static WebElement Click_ClrSysMmbId1;
	
	@FindBy(how=How.XPATH,using="//*[@id='treeView']/ul/li/ul/li/ul/li[2]/ul/li[11]/ul/li[1]/ul/li[2]/label[1]") 
	public static WebElement Click_ClrSysMmbId2;
	
	@FindBy(how=How.XPATH,using="//*[@id='treeView']/ul/li/ul/li/ul/li[2]/ul/li[17]/ul/li[7]/ul/li[1]/ul/li[2]/ul/li[2]/div/select") 
	public static WebElement Edit_MmbId;
	
	@FindBy(how=How.XPATH,using="//*[@id='treeView']/ul/li/ul/li/ul/li[2]/ul/li[17]/ul/li[7]/ul/li[2]/label[1]") 
	public static WebElement Click_Brnchld1;
	
	@FindBy(how=How.XPATH,using="//*[@id='treeView']/ul/li/ul/li/ul/li[2]/ul/li[17]/ul/li[7]/ul/li[2]/ul/li[1]/div/select") 
	public static WebElement Edit_Id;
	
	@FindBy(how=How.XPATH,using="//*[@id='treeView']/ul/li/ul/li/ul/li[2]/ul/li[17]/ul/li[9]/label[1]") 
	public static WebElement Click_Dbtr;
	
	@FindBy(how=How.XPATH,using="//*[@id='treeView']/ul/li/ul/li/ul/li[2]/ul/li[9]/label[1]") 
	public static WebElement Click_Dbtr1;
	
	@FindBy(how=How.XPATH,using="//*[@id='treeView']/ul/li/ul/li/ul/li[2]/ul/li[17]/ul/li[9]/ul/li[1]/div/select") 
	public static WebElement Edit_Nm;
	
	@FindBy(how=How.XPATH,using="//*[@id='treeView']/ul/li/ul/li/ul/li[2]/ul/li[17]/ul/li[10]/label[1]") 
	public static WebElement Click_DbtrAcct;
	
	@FindBy(how=How.XPATH,using="//*[@id='treeView']/ul/li/ul/li/ul/li[2]/ul/li[10]/label[1]") 
	public static WebElement Click_DbtrAcct1;
		
	@FindBy(how=How.XPATH,using="//*[@id='CdtTrfTxInf']") 
	public static WebElement Tick_Is_Transaction_Collection1;
	
	@FindBy(how=How.XPATH,using="//*[@id='treeView']/ul/li/ul/li/ul/li[2]/ul/li[17]/ul/li[10]/ul/li[1]/ul/li[1]/div/select") 
	public static WebElement Edit_IBAN1;
	
	@FindBy(how=How.XPATH,using="//*[@id='treeView']/ul/li/ul/li/ul/li[2]/ul/li[17]/ul/li[3]/label[1]") 
	public static WebElement Click_Amt;
	
	@FindBy(how=How.XPATH,using="//*[@id='treeView']/ul/li/ul/li/ul/li[2]/ul/li[17]/ul/li[3]/ul/li[1]/div/select") 
	public static WebElement Edit_InstdAmt;
		
	@FindBy(how=How.XPATH,using="//*[@id='treeView']/ul/li/ul/li/ul/li[2]/ul/li[17]/ul/li[10]/ul/li[2]/ul/li[1]/div/select") 
	public static WebElement Edit_Cd;
	
	@FindBy(how=How.XPATH,using="//*[@id='treeView']/ul/li/ul/li/ul/li[2]/ul/li[17]/ul/li[17]/label[1]") 
	public static WebElement Click_RmtInf;
	
	@FindBy(how=How.XPATH,using="//*[@id='treeView']/ul/li/ul/li/ul/li[2]/ul/li[17]/ul/li[17]/ul/li[1]/div/select") 
	public static WebElement Edit_Ustrd;
	
	@FindBy(how=How.XPATH,using="//*[@id='treeView']/ul/li/ul/li/ul/li[2]/ul/li[8]/ul/li[3]/ul/li[1]/label[1]")
	public static WebElement Click_OrgId; 
	
	@FindBy(how=How.XPATH,using="//*[@id='treeView']/ul/li/ul/li/ul/li[2]/ul/li[8]/ul/li[3]/ul/li[1]/ul/li[2]/label[1]")
	public static WebElement Click_Othr;
	
	@FindBy(how=How.XPATH,using="//*[@id='treeView']/ul/li/ul/li/ul/li[2]/ul/li[10]/ul/li[1]/ul/li[2]/label[1]")
	public static WebElement Click_Othr1;
	
	@FindBy(how=How.XPATH,using="//*[@id='treeView']/ul/li/ul/li/ul/li[2]/ul/li[10]/ul/li[1]/ul/li[2]/ul/li[1]/div/select")
	public static WebElement Edit_Id1;
	
	@FindBy(how=How.XPATH,using="//*[@id='treeView']/ul/li/ul/li/ul/li[2]/ul/li[8]/ul/li[3]/ul/li[1]/ul/li[2]/ul/li[1]/div/select")
	public static WebElement edi_id;
	
	@FindBy(how=How.XPATH,using="//*[@id='treeView']/ul/li/ul/li/ul/li[2]/ul/li[11]/ul/li[2]/ul/li[1]/div/select")
	public static WebElement edi_id1;
		
	@FindBy(how=How.XPATH,using="//*[@id='saveSchemaInfo']")
	public static WebElement Click_Schemainfo;
		
	@FindBy(how=How.XPATH,using="//*[@id='tabsHeaders']/li[2]/a") 
	public static WebElement Click_editb2bSchema;
	
	@FindBy(how=How.XPATH,using="//*[@id='CreditAggregateLimit']")
	public static WebElement Edi_CreAgreeLim;
	
	@FindBy(how=How.XPATH,using="//*[@id='dailyCr']")
	public static WebElement Radio_dailyCr;
	
	@FindBy(how=How.XPATH,using="(//*[@id='btnSaveOne'])[1]")
	public static WebElement Btn_Save1; 
	
	@FindBy(how=How.XPATH,using="//*[text()= 'Yes']")
	public static WebElement Btn_Yes2;
	
	@FindBy(how=How.XPATH,using="//*[text()= 'L321']")
	public static WebElement Edi_Usercode;
	
	@FindBy(how=How.XPATH,using="//*[@id='btnClose']")
	public static WebElement Btn_Close;
	
	@FindBy(how=How.XPATH,using="//*[@id='resultsGrid']/thead/tr/th[1]/div")
	public static WebElement Click_PacsuserHeader;
	
	@FindBy(how=How.XPATH,using="//*[@id='resultsGrid']/tbody/tr[1]/td[1]")
	public static WebElement Click_PacsuserCode;
	
	@FindBy(how=How.XPATH,using="//*[@id='ServiceID']")
	public static WebElement Dropd_ServiceId;
	
	@FindBy(how=How.XPATH,using="//*[@id='ServiceTypeID']")
	public static WebElement Dropd_ServiceTypeId;
	
	@FindBy(how=How.XPATH,using="//*[@id='btnFilter']")
	public static WebElement btn_Filter;
	
	@FindBy(how=How.XPATH,using="//*[@id='btnSaveOne']")
	public static WebElement btn_Save;

	@FindBy(how=How.XPATH,using="//*[@id='btnClose']")
	public static WebElement btn_Close;
	
	@FindBy(how=How.XPATH,using="//*[text()= 'Yes']")
	public static WebElement btn_Yes;
	
	@FindBy(how=How.XPATH,using="//*[@id='btnLogout2']")
	public static WebElement Btn_logout;
	
	@FindBy(how=How.XPATH,using="//*[@id='TruncateEmptyTags']")
	public static WebElement Tick_truncate;
	
	@FindBy(how=How.XPATH,using="//*[@id='saveSchemaInfo']")
	public static WebElement Btn_Saveschamainfo;
	
	@FindBy(how=How.XPATH,using="//*[@id='B2BFileSchemaId']/option[last()]")
	public static WebElement Edit_Schemaid;
	
	@FindBy(how=How.XPATH,using="//*[@id='ParentSchemaId']/option[last()]")
	public static WebElement Edit_PSchema;
	
	@FindBy(how=How.XPATH,using="//*[@id='B2BFileSchemaDirectionID']")
	public static WebElement Edit_Direction;
	
	@FindBy(how=How.XPATH,using="//*[@id='tabsHeaders']/li[1]/a") 
	public static WebElement Click_AddB2bSchema;
	
	@FindBy(how=How.XPATH,using="//*[@id='treeView']/ul/li/ul/li/label[1]")  
	public static WebElement Click_CstmrPmtStsRpt;
	
	@FindBy(how=How.XPATH,using="//*[@id='treeView']/ul/li/ul/li/ul/li[1]/label[1]") 
	public static WebElement Click_GrpHdr1;
	
	@FindBy(how=How.XPATH,using="//*[@id='treeView']/ul/li/ul/li/ul/li[1]/ul/li[1]/div/select") 
	public static WebElement Edit_MsgId;
	
	@FindBy(how=How.XPATH,using="//*[@id='treeView']/ul/li/ul/li/ul/li[2]/ul/li[6]/ul/li[2]/ul/li[1]/div/input") 
	public static WebElement Edi_CDVariable;	
	
	
	
	
	public static void B2BSetup_PaymentXSD() throws Exception 
	{ 
		Thread.sleep(18000);
		
		waitForElement(Click_AddB2bSchema);
		Click_AddB2bSchema.click();
//		waitForElement(Click_b2bSetup);
//		
//		if(Click_b2bSetup.isDisplayed())
//		{
//			System.out.println("Clicking on entity search");
//			
//			Actions acc=new Actions(driver);
//			
//			acc.moveToElement(Click_b2bSetup).click(Click_b2bSetup).build().perform();
//			Click_b2bSetup.click();
//		}
//		
//		
//
//	   waitForElement(Click_b2bSetup);
//	   Click_b2bSetup.click(); 
//	   
//	   //Thread.sleep(110000);
//	   waitForElement1(Tick_truncate);

		waitForElement(Btn_ChooseFile);
		Thread.sleep(10000);
		Btn_ChooseFile.click();
		Thread.sleep(9000);
		
		
		//To repeat the same file 
		
		
		String fileName = "fileName";
		String newFileName= fileName+(int)Math.floor(Math.random()*10000);
		
		
		File oldfile=new File("C:\\Users\\srinir.SOLARSYSTEM\\Documents\\"+fileName+".xsd");

        File newfile = new File("C:\\Users\\srinir.SOLARSYSTEM\\Documents\\"+newFileName+".xsd");

        Thread.sleep(3000);
        oldfile.renameTo(newfile);
        
        System.out.println(newfile);
        
        //New Import software
Thread.sleep(3000);
        
        StringSelection ss = new StringSelection("C:\\Users\\srinir.SOLARSYSTEM\\Documents\\"+newFileName+".xsd");
        
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

        
        
        
        
        
        
        
        
//        String[]cmd={"SchemaFileP.exe","C:\\Users\\srinir.SOLARSYSTEM\\Documents\\fileName.xsd"}; 
//Thread.sleep(1000);
//		Process autoitprocess=Runtime.getRuntime().exec(cmd);
//        
//		Thread.sleep(1000);
//		
//		int i =1;
//		while (!(i==0))
//		{
//        	i=autoitprocess.waitFor();
//		}
//	      autoitprocess.destroy();	
	      
	      Thread.sleep(10000);
	      
	      newfile.renameTo(oldfile);
	      
	     
	      //Thread.sleep(3000);    
	      
	      
	      
	      waitForElement(Edit_Schemadesp);

	      String Schemadesp=getData("Schemadesp1","story1",4);

	      Edit_Schemadesp.sendKeys(Schemadesp);
	      
	    
	      waitForElement(Btn_Saveschamainfo);
	      Btn_Saveschamainfo.click();
	      
	      waitForElement1(Click_editb2bSchema);
	      Click_editb2bSchema.click();
	      
	      
	      
	      waitForElement(Edit_Schemaid);
	      Edit_Schemaid.click();
	      Thread.sleep(1000);
//	      String Schemadesp1=getData("Schemadesp1","story1",4);
//	      Edit_Schemaid.sendKeys(Schemadesp1);
	      Edit_Schemaid.click();
	      //Thread.sleep(3000);
	      
	      waitForElement(Edit_PSchema);
	      Edit_PSchema.click();
	      Thread.sleep(1000);
	      String PSchemadesp=getData("PSchemadesp1","story1",4);
//	      Edit_PSchema.sendKeys(PSchemadesp);
	      Edit_PSchema.click();
	      
	      waitForElement(Tick_truncate);
	      Tick_truncate.click();
	    
	      
	      waitForElement(Edit_Direction);
	      //String Direction=getData("Schemadesp","story1",4);
	      Edit_Direction.sendKeys("Outgoing");
	    
	      
	      
	      
	      
	      
	      
	      
	      waitForElement(Click_Doc);
	      Click_Doc.click();
	      
	      waitForElement(Click_CstmrDrctDbtInitn);
	      Click_CstmrDrctDbtInitn.click();
	      
	      waitForElement(Click_GrpHdr);
	      Click_GrpHdr.click();
	      
	      waitForElement(edit_MsgId);
	      edit_MsgId.sendKeys("B2BBatchID");
	      
	      waitForElement(edit_CreDtTm);
	      edit_CreDtTm.sendKeys("ScheduledStartTime");
	      	      
	      waitForElement(edit_NbOfTxs);
	      edit_NbOfTxs.sendKeys("TransactionCount");
	      
	      waitForElement(edit_CtrlSum);
	      edit_CtrlSum.sendKeys("TransactionAmountsTotal");
	      
	      waitForElement(Click_InitgPty);
	      Click_InitgPty.click();
	      
	      waitForElement(edit_Nm);
	      edit_Nm.sendKeys("Static");
	      
	      waitForElement(Edi_NmVariable);
	      Edi_NmVariable.sendKeys("Insure Group Managers");
	      
	      waitForElement(Click_PmtInf);
	      Click_PmtInf.click();
	      
	      waitForElement(edit_PmtInfoID);
	      edit_PmtInfoID.sendKeys("PaymentInfoID");
	      
	      waitForElement(edi_PmtMtd);
	      edi_PmtMtd.sendKeys("PaymentMethod");
	      
	      waitForElement(edi_NbOfTxs);
	      edi_NbOfTxs.sendKeys("TransactionCount");
	      
	      waitForElement(edi_CtrlSum);
	      edi_CtrlSum.sendKeys("TransactionAmountsTotal");
	      
	      waitForElement(Click_PmtTpInf);
	      Click_PmtTpInf.click();
	      
	      waitForElement(Click_SvcLvl);
	      Click_SvcLvl.click();
	      
	      waitForElement(Edi_Cd);
	      Edi_Cd.sendKeys("Static");
	    
	      waitForElement(Edi_CDVariable);
	      Edi_CDVariable.sendKeys("SDVA");
	      
	      waitForElement(edi_ReqdExctnDt);
	      edi_ReqdExctnDt.sendKeys("ActionDate");
	      
	      waitForElement(Click_Dbtr1);
	      Click_Dbtr1.click();
	      
	      waitForElement(Edi_Nm1);
	      Edi_Nm1.sendKeys("Static");
	      
	      waitForElement(Edi_NmVariable2);
	      Edi_NmVariable2.sendKeys("Insure Group Managers");
	      
	      waitForElement(Click_DbtrAcct1);
	      Click_DbtrAcct1.click();
	      
	      waitForElement(Click_Id1);
	      Click_Id1.click();
	      
	      waitForElement(Click_Othr1);
	      Click_Othr1.click();
	      
	      waitForElement(Edit_Id1);
	      Edit_Id1.sendKeys("IGTransactionalBankAccountNumber");
	      
	      waitForElement(Click_Tp1);
	      Click_Tp1.click();
	      
	      waitForElement(Edit_CD1);
	      Edit_CD1.sendKeys("Static");
	      
	      waitForElement(Edit_CD1Variable);
	      Edit_CD1Variable.sendKeys("CACC");
	            
	      waitForElement(Click_DbtrAgt1);
	      Click_DbtrAgt1.click();
	      
	      waitForElement(Click_FinInstnld1);
	      Click_FinInstnld1.click();
	      
	      waitForElement(Click_ClrSysMmbId2);
	      Click_ClrSysMmbId2.click();
	      
	      waitForElement(Edit_Mmbld1);
	      Edit_Mmbld1.sendKeys("BranchNumber");
	      
	      waitForElement(Click_Brnchld2);
	      Click_Brnchld2.click();
	      
	      waitForElement(edi_id1);
	      edi_id1.sendKeys("BranchNumber");
	      
	      waitForElement(Tick_Is_Transaction_Collection1);
	      Tick_Is_Transaction_Collection1.click();
	      
	      waitForElement(Click_CdtTrfTxinf);
	      Click_CdtTrfTxinf.click();
	      
	      waitForElement(Click_Pmtld);
	      Click_Pmtld.click();
	      
	      waitForElement(Edit_EndToEndld);
	      Edit_EndToEndld.sendKeys("UniqueIdentifier");
	      
	      waitForElement(Click_Amt);
	      Click_Amt.click();
	      
	      waitForElement(Edit_InstdAmt);
	      Edit_InstdAmt.sendKeys("Amount");
	      
	      waitForElement(Click_CDtrAgt1);
	      Click_CDtrAgt1.click();
	      
	      waitForElement(Click_FinInstnld2);
	      Click_FinInstnld2.click();
	      
	      waitForElement(Click_ClrsyMmbld);
	      Click_ClrsyMmbld.click();
	      
	      waitForElement(Edit_Mmbld2);
	      Edit_Mmbld2.sendKeys("NominatedBranchCode");
	      
	      waitForElement(Click_Brnchld3);
	      Click_Brnchld3.click();
	      
	      waitForElement(Edit_Id2);
	      Edit_Id2.sendKeys("NominatedBranchCode");
	      
	      waitForElement(Click_Cdtr1);
	      Click_Cdtr1.click();
	      
	      waitForElement(Edit_Nm1);
	      Edit_Nm1.sendKeys("HomingAccountHolder");
	      
	      waitForElement(Click_Cdtracct1);
	      Click_Cdtracct1.click();
	      
	      waitForElement(Click_Id2);
	      Click_Id2.click();
	      
	      waitForElement(Click_Oth);
	      Click_Oth.click();
	      
	      waitForElement(Edit_Id3);
	      Edit_Id3.sendKeys("NominatedAccountNumber");
	      
	      waitForElement(Click_Tp2);
	      Click_Tp2.click();
	      
	      waitForElement(Edit_Cd1);
	      Edit_Cd1.sendKeys("B2BBankAccountTypeCode");
	      
	      waitForElement(Click_Rmtinf);
	      Click_Rmtinf.click();
	      
	      waitForElement(Edit_Ustrd1);
	      Edit_Ustrd1.sendKeys("BankTransactionReference");
	      
	      waitForElement(Click_Schemainfo);
	      Click_Schemainfo.click();     
	      
//Payment Initial response File	      
Thread.sleep(10000);	      
	      
waitForElement(Click_AddB2bSchema);
Click_AddB2bSchema.click();

waitForElement(Btn_ChooseFile);
Thread.sleep(10000);
Btn_ChooseFile.click();
Thread.sleep(9000);



String fileName1 = "PaymentInitialResponseFile";
String newFileName1= fileName1+(int)Math.floor(Math.random()*10000);


File oldfile1=new File("C:\\Users\\srinir.SOLARSYSTEM\\Documents\\"+fileName1+".xsd");

File newfile1 = new File("C:\\Users\\srinir.SOLARSYSTEM\\Documents\\"+newFileName1+".xsd");

Thread.sleep(3000);
oldfile1.renameTo(newfile1);

System.out.println(newfile1);

//New Import software
Thread.sleep(3000);

StringSelection ss1 = new StringSelection("C:\\Users\\srinir.SOLARSYSTEM\\Documents\\"+newFileName1+".xsd");

System.out.println(ss1);

Thread.sleep(3000);

Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss1, null);

Thread.sleep(3000);

Robot robot1 = new Robot();



robot.keyPress(KeyEvent.VK_CONTROL);

robot.keyPress(KeyEvent.VK_V);

robot.keyRelease(KeyEvent.VK_V);

robot.keyRelease(KeyEvent.VK_CONTROL);

Thread.sleep(3000);

robot.keyPress(KeyEvent.VK_ENTER); 

	      
Thread.sleep(10000);

newfile1.renameTo(oldfile1);


//Thread.sleep(3000);    



waitForElement(Edit_Schemadesp);

//String Schemadesp1=getData("Schemadesp1","story1",4);

Edit_Schemadesp.sendKeys("PaymentInitialResponseFile");


waitForElement(Btn_Saveschamainfo);
Btn_Saveschamainfo.click();

waitForElement1(Click_editb2bSchema);
Click_editb2bSchema.click();



waitForElement(Edit_Schemaid);
Edit_Schemaid.click();
Thread.sleep(1000);
Edit_Schemaid.click();


waitForElement(Edit_PSchema);
Edit_PSchema.click();
Thread.sleep(1000);

Edit_PSchema.click();

waitForElement(Tick_truncate);
Tick_truncate.click();


waitForElement(Edit_Direction);
Edit_Direction.sendKeys("Incoming");

waitForElement(Click_Doc);
Click_Doc.click();

waitForElement(Click_CstmrPmtStsRpt);
Click_CstmrPmtStsRpt.click();
	      
waitForElement(Click_GrpHdr1);
Click_GrpHdr1.click();

waitForElement(Edit_MsgId);
Edit_MsgId.sendKeys("B2BBatchID");

waitForElement(Click_Schemainfo);
Click_Schemainfo.click(); 
	      
	      
Thread.sleep(10000);		      
//Payment Final response File	      


waitForElement(Click_AddB2bSchema);
Click_AddB2bSchema.click();

waitForElement(Btn_ChooseFile);
Thread.sleep(10000);
Btn_ChooseFile.click();
Thread.sleep(9000);



String fileName2 = "PaymentFinalResponseFile";
String newFileName2= fileName2+(int)Math.floor(Math.random()*10000);


File oldfile2=new File("C:\\Users\\srinir.SOLARSYSTEM\\Documents\\"+fileName2+".xsd");

File newfile2 = new File("C:\\Users\\srinir.SOLARSYSTEM\\Documents\\"+newFileName2+".xsd");

Thread.sleep(3000);
oldfile2.renameTo(newfile2);

System.out.println(newfile2);

//New Import software
Thread.sleep(3000);

StringSelection ss2 = new StringSelection("C:\\Users\\srinir.SOLARSYSTEM\\Documents\\"+newFileName2+".xsd");

System.out.println(ss2);

Thread.sleep(3000);

Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss2, null);

Thread.sleep(3000);

Robot robot2 = new Robot();



robot.keyPress(KeyEvent.VK_CONTROL);

robot.keyPress(KeyEvent.VK_V);

robot.keyRelease(KeyEvent.VK_V);

robot.keyRelease(KeyEvent.VK_CONTROL);

Thread.sleep(3000);

robot.keyPress(KeyEvent.VK_ENTER); 

	      
Thread.sleep(10000);

newfile2.renameTo(oldfile2);


//Thread.sleep(3000);    



waitForElement(Edit_Schemadesp);

//String Schemadesp1=getData("Schemadesp1","story1",4);

Edit_Schemadesp.sendKeys("PaymentFinalResponseFile");


waitForElement(Btn_Saveschamainfo);
Btn_Saveschamainfo.click();

waitForElement1(Click_editb2bSchema);
Click_editb2bSchema.click();



waitForElement(Edit_Schemaid);
Edit_Schemaid.click();
Thread.sleep(1000);
Edit_Schemaid.click();


waitForElement(Edit_PSchema);
Edit_PSchema.click();
Thread.sleep(1000);

Edit_PSchema.click();

waitForElement(Tick_truncate);
Tick_truncate.click();


waitForElement(Edit_Direction);
Edit_Direction.sendKeys("Incoming");

waitForElement(Click_Doc);
Click_Doc.click();

waitForElement(Click_CstmrPmtStsRpt);
Click_CstmrPmtStsRpt.click();
	      
waitForElement(Click_GrpHdr1);
Click_GrpHdr1.click();

waitForElement(Edit_MsgId);
Edit_MsgId.sendKeys("B2BBatchID");

waitForElement(Click_Schemainfo);
Click_Schemainfo.click(); 

Thread.sleep(5000);

waitForElement(Btn_logout);
Btn_logout.click();	
	      
	      
	      
	      
	      
	      
	      
	      

		
		
//		Thread.sleep(2000);
//		LogEvent("Pass","Data entered sucessfully for all the fields in PacsUser and Bank Account Creation");
//		waitForElement(Btn_logout);
//    	Btn_logout.click();	
//		driver.quit();

}


}
