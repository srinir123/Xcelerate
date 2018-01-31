package com.ScreenFunctions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.GenericFunctions.GenericMethods;

public class Dashboard extends GenericMethods{
	
	

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
	
	@FindBy(how=How.XPATH,using="//*[text()= 'Collection Period Balances']")
	public static WebElement Click_CollPeriodBalances;
	
	
	
	
	
	
		public static void EntitySearch() throws Exception
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
			waitForElement(Click_CollPeriodBalances);
			Click_CollPeriodBalances.click();
			
		}
		

	}
		