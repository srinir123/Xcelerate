package com.ScreenFunctions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.GenericFunctions.GenericMethods;

public class CollectionImport extends GenericMethods{
	@FindBy(how=How.XPATH,using="//*[@id='QuoteID']")
	public static WebElement Dropd_Agreement; 

	@FindBy(how=How.XPATH,using="//*[@id='BucketID']")
	public static WebElement Dropd_BucketID; 
	
	@FindBy(how=How.XPATH,using="//*[@id='Div3']/div/div/div/div[1]/div[1]/div/div[2]/button[2]")
	public static WebElement btn_CollImport;

	@FindBy(how=How.XPATH,using="	//*[@id='searchGrid']/tbody/tr[2]/td[6]/button")
	public static WebElement btn_CollImportFile;
	
	

	public static void CollectionImport() throws Exception 
	{   waitForElement(Dropd_Agreement);
	
	   String Agreement_Name=getData("Agreement_Name","CollectionImport",1);

	    Dropd_Agreement.sendKeys("Agreement_Name");
	
		waitForElement(Dropd_BucketID);
		
		String BucketID=getData("BucketID","CollectionImport",1);

		Dropd_BucketID.sendKeys(BucketID);
		
		waitForElement(btn_CollImport);	
		btn_CollImport.click();
		waitForElement(btn_CollImportFile);	
		btn_CollImportFile.click();
		Thread.sleep(2000);
		String[]cmd={"UploadingCOLLattachment.exe","C:\\Users\\srinir.SOLARSYSTEM\\Desktop\\Desktop\\New folder\\Xcelerate specs\\Sample Transactions\\Large file processing\\2 records file.csv"}; 
		Process autoitprocess=Runtime.getRuntime().exec(cmd);
        
		int i =1;
		while (!(i==0))
		{
        	i=autoitprocess.waitFor();
		}
	      autoitprocess.destroy();	
	    Thread.sleep(2000);
		driver.quit();
			}
		
}
	