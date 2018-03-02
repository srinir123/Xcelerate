package com.ScreenFunctions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.GenericFunctions.GenericMethods;

public class PaymentImport_Ext_MUMD extends GenericMethods{
	
	@FindBy(how=How.XPATH,using="//*[text()= 'Collection Period Balances']")
	public static WebElement Click_CollPeriodBalances;
	
	
	@FindBy(how=How.XPATH,using="//*[@id='QuoteID']")
	public static WebElement Dropd_Agreement; 

	@FindBy(how=How.XPATH,using="//*[@id='BucketID']")
	public static WebElement Dropd_BucketID; 
	
	@FindBy(how=How.XPATH,using="//*[@id='Div3']/div/div/div/div[1]/div[2]/div/div[2]/button[2]")
	public static WebElement btn_PmtImport;

	@FindBy(how=How.XPATH,using="//*[@id='searchGrid']/tbody/tr[2]/td[6]/button")
	public static WebElement btn_PmtImportFile;
	
	@FindBy(how=How.XPATH,using="//*[@id='btnLogout2']")
	public static WebElement Btn_logout;
	

	public static void PaymentImport_Ext_MUMD(int i) throws Exception 
	{  	waitForElement(Click_CollPeriodBalances);
	    Click_CollPeriodBalances.click();
	
		
		waitForElement(Dropd_Agreement);
	String Agreement_Name=getData("Agreement_Name","PaymentImport_Ext_MUMD",i);

    Dropd_Agreement.sendKeys(Agreement_Name);

	waitForElement(Dropd_BucketID);
	
	String BucketID=getData("BucketID","PaymentImport_Ext_MUMD",i);

	Dropd_BucketID.sendKeys(BucketID);
		waitForElement(btn_PmtImport);
		btn_PmtImport.click();
		waitForElement(btn_PmtImportFile);
		btn_PmtImportFile.click();
		Thread.sleep(2000);
		String[]cmd={"UploadingPMTattachment.exe","D:\\Sample Transactions\\sunday\\Payments\\1 Payment file.csv"}; 
		Process autoitprocess=Runtime.getRuntime().exec(cmd);
        
		int i1 =1;
		while (!(i1==0))
		{
        	i1=autoitprocess.waitFor();
		}
	      autoitprocess.destroy();	
	      Thread.sleep(3000);
	      System.out.println("Payment file imported successfully");
		  LogEvent("pass","Payment file imported successfully");
	      
	      //driver.quit();
			waitForElement(Btn_logout);
	    	Btn_logout.click();	
			}

}
	