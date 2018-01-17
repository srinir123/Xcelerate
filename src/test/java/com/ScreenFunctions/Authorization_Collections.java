package com.ScreenFunctions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.GenericFunctions.GenericMethods;

public class Authorization_Collections extends GenericMethods{
	
	

	@FindBy(how=How.XPATH,using="//*[@id='mainnav']/li[2]/a")
	public static WebElement Click_EntitySearch;
	
	@FindBy(how=How.XPATH,using="//*[@id='EntityName']")
	public static WebElement Edi_EntitySearch;
	
	@FindBy(how=How.XPATH,using="//*[@id='btnSearch']")
	public static WebElement Btn_Search;
	
	@FindBy(how=How.XPATH,using="//*[@id='resultsGrid']/tbody/tr[1]/td[1]")
	public static WebElement Click_SearchResults;
	
	@FindBy(how=How.XPATH,using="//*[@id='btnOpen']")
	public static WebElement Btn_Open;
	
	@FindBy(how=How.XPATH,using="//*[text()= 'Transaction Authorisation']")
	public static WebElement Click_transauthorisation; 	
	
	@FindBy(how=How.XPATH,using="//*[@id='manualTabTab']")
	public static WebElement Btn_ManualTrans;
	
	@FindBy(how=How.XPATH,using="//*[@id='btnProcess']")
	public static WebElement Btn_Process;
	
	
	
	
	
		public static void Authorization_Collections() throws Exception
		{
			waitForElement(Click_EntitySearch);
			
			if(Click_EntitySearch.isDisplayed())
			{
				System.out.println("Clicking on entity search");
				
				Actions acc=new Actions(driver);
				
				acc.moveToElement(Click_EntitySearch).click(Click_EntitySearch).build().perform();
				Click_EntitySearch.click();
			}
			
			waitForElement(Edi_EntitySearch);
			
			String Entity_Name=getData("Entity_Name","Dashboard",2);
			Edi_EntitySearch.sendKeys(Entity_Name);
			waitForElement(Btn_Search);
			Btn_Search.click();
			waitForElement(Click_SearchResults);
			Click_SearchResults.click();
			Btn_Open.click();
			waitForElement(Click_transauthorisation);
			Click_transauthorisation.click();
			waitForElement(Btn_ManualTrans);
			Btn_ManualTrans.click();
			waitForElement(Btn_Process);
			Btn_Process.click();
		}
		

	}
		