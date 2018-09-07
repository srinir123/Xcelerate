package com.ScreenFunctions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.GenericFunctions.GenericMethods;

public class B2BSetup extends GenericMethods{
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
	
	@FindBy(how=How.XPATH,using="//*[@id='treeView']/ul/li/ul/li/ul/li[2]/ul/li[3]/div/select")
	public static WebElement edi_BtchBookg;
	
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
	public static WebElement edi_ReqdColltnDt;
	
	@FindBy(how=How.XPATH,using="//*[@id='treeView']/ul/li/ul/li/ul/li[2]/ul/li[8]/label[1]")
	public static WebElement Click_Cdtr;
	
	@FindBy(how=How.XPATH,using="//*[@id='treeView']/ul/li/ul/li/ul/li[2]/ul/li[8]/ul/li[1]/div/select")
	public static WebElement Edi_Nm;
	
	@FindBy(how=How.XPATH,using="//*[@id='treeView']/ul/li/ul/li/ul/li[2]/ul/li[8]/ul/li[1]/div/input")
	public static WebElement Edi_NmVariable2; 

	@FindBy(how=How.XPATH,using="//*[@id='treeView']/ul/li/ul/li/ul/li[2]/ul/li[8]/ul/li[3]/label[1]") 
	public static WebElement Click_Id;  

	@FindBy(how=How.XPATH,using="//*[@id='treeView']/ul/li/ul/li/ul/li[2]/ul/li[8]/ul/li[3]/ul/li[1]/label[1]")
	public static WebElement Click_OrgId; 
	
	@FindBy(how=How.XPATH,using="//*[@id='treeView']/ul/li/ul/li/ul/li[2]/ul/li[8]/ul/li[3]/ul/li[1]/ul/li[2]/label[1]")
	public static WebElement Click_Othr;
	
	@FindBy(how=How.XPATH,using="//*[@id='treeView']/ul/li/ul/li/ul/li[2]/ul/li[8]/ul/li[3]/ul/li[1]/ul/li[2]/ul/li[1]/div/select")
	public static WebElement edi_id;
	
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

	

	
	
	
	public static void B2BSetup() throws Exception 
	{ 
		waitForElement(Click_b2bSetup);
		
		if(Click_b2bSetup.isDisplayed())
		{
			System.out.println("Clicking on entity search");
			
			Actions acc=new Actions(driver);
			
			acc.moveToElement(Click_b2bSetup).click(Click_b2bSetup).build().perform();
			Click_b2bSetup.click();
		}

	   //waitForElement(Click_b2bSetup);
	   //Click_b2bSetup.click(); 
	//Thread.sleep(20000);
	//performDBLCLICK(Btn_ChooseFile);
		waitForElement(Btn_ChooseFile);
		Thread.sleep(8000);
		Btn_ChooseFile.click();
		Thread.sleep(3000);
		String[]cmd={"SchemaFile.exe","C:\\Users\\srinir.SOLARSYSTEM\\Documents\\test114.xsd"}; 

		Process autoitprocess=Runtime.getRuntime().exec(cmd);
        
		int i =1;
		while (!(i==0))
		{
        	i=autoitprocess.waitFor();
		}
	      autoitprocess.destroy();	
	      
	      waitForElement(Edit_Schemadesp);

	      String Schemadesp=getData("Schemadesp","B2BSetup",1);

	      Edit_Schemadesp.sendKeys(Schemadesp);
	      
	     // waitForElement(Btn_Saveschamainfo);
	     // Btn_Saveschamainfo.click();
	      
	      waitForElement(Click_Doc);
	      Click_Doc.click();
	      
	      waitForElement(Click_CstmrDrctDbtInitn);
	      Click_CstmrDrctDbtInitn.click();
	      
	      waitForElement(Click_GrpHdr);
	      Click_GrpHdr.click();
	      
	      waitForElement(edit_MsgId);
	      edit_MsgId.sendKeys("B2BBatchID");
	      
	      waitForElement(edit_CreDtTm);
	      edit_CreDtTm.sendKeys("ActualStartTime");
	      
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
	      
	      waitForElement(edi_BtchBookg);
	      edi_BtchBookg.sendKeys("IsItemised");
	      
	      waitForElement(edi_NbOfTxs);
	      edi_NbOfTxs.sendKeys("TransactionCount");
	      
	      waitForElement(edi_CtrlSum);
	      edi_CtrlSum.sendKeys("TransactionAmountsTotal");
	      
	      waitForElement(Click_PmtTpInf);
	      Click_PmtTpInf.click();
	      
	      waitForElement(Click_SvcLvl);
	      Click_SvcLvl.click();
	      
	      waitForElement(Edi_Cd);
	      Edi_Cd.sendKeys("ServiceLevelCode");
	      
	      waitForElement(edi_ReqdColltnDt);
	      edi_ReqdColltnDt.sendKeys("ActionDate");
	      
	      waitForElement(Click_Cdtr);
	      Click_Cdtr.click();
	      
	      waitForElement(Edi_Nm);
	      Edi_Nm.sendKeys("Static");
	      
	      waitForElement(Edi_NmVariable2);
	      Edi_NmVariable2.sendKeys("Insure Group Managers");
	      
	      waitForElement(Click_Id);
	      Click_Id.click();
	      
	      waitForElement(Click_OrgId);
	      Click_OrgId.click();
	      
	      waitForElement(Click_Othr);
	      Click_Othr.click();
	      
	      waitForElement(edi_id);
	      edi_id.sendKeys("InitiatingPartyName");
	      
	      waitForElement(Click_Schemainfo);
	      Click_Schemainfo.click();
	      
//Edit B2B Schema	      
	 
	      waitForElement(Click_editb2bSchema);
	      Click_editb2bSchema.click();
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      


//Thread.sleep(2000);
//Btn_ChooseFile.click();
		
		
//		Thread.sleep(2000);
//		LogEvent("Pass","Data entered sucessfully for all the fields in PacsUser and Bank Account Creation");
//		waitForElement(Btn_logout);
//    	Btn_logout.click();	
//		driver.quit();

}


}
