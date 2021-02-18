package com.ScreenFunctions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.GenericFunctions.DBConnection;
import com.GenericFunctions.GenericMethods;

public class CollPeriodBalances_MCP_ISO_Story extends GenericMethods{
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
	
	@FindBy(how=How.XPATH,using="//*[text()= 'Collection Period Balances']")
	public static WebElement Click_CollPeriodBalances;
	
	@FindBy(how=How.XPATH,using="//*[@id='QuoteID']")
	public static WebElement Dropd_Agreement; 

	@FindBy(how=How.XPATH,using="//*[@id='BucketID']")
	public static WebElement Dropd_BucketID; 
	
	@FindBy(how=How.XPATH,using="//*[@id='Div3']/div/div/div/div[1]/div[2]/div/div[2]/button[1]")
	public static WebElement btn_CapturePmt;
	
	@FindBy(how=How.XPATH,using="//*[@id='ActionDate']")
	public static WebElement Set_ActionDate;
	
	@FindBy(how=How.XPATH,using="//*[@id='ui-datepicker-div']/table/tbody/tr[.]/td[.]/a")
	public static WebElement Click_ActionDate;
	
	@FindBy(how=How.XPATH,using="//*[@id='AccountHolder']")
	public static WebElement Edi_AccountHolder;
	
	@FindBy(how=How.XPATH,using="//*[@id='AccountNumber']")
	public static WebElement Edi_AccountNumber ;
	
	@FindBy(how=How.XPATH,using="//*[@id='BranchCode']")
	public static WebElement Edi_Branchcode;
	
	@FindBy(how=How.XPATH,using="//*[@id='BankAccountTypeID']")
	public static WebElement Dropd_BankAccType;
	
	@FindBy(how=How.XPATH,using="//*[@id='Amount']")
	public static WebElement Edi_Amount;
	
	@FindBy(how=How.XPATH,using="//*[@id='TransactionReference']")
	public static WebElement Edi_TransRef; 

	@FindBy(how=How.XPATH,using="//*[@id='InternalReference']")
	public static WebElement Edi_IntRefPmtCap; 
	
	@FindBy(how=How.XPATH,using="	//*[@id='TransactionTypeID']")
	public static WebElement Dropd_Transtype; 

	@FindBy(how=How.XPATH,using="//*[@id='TransactionSubTypeID']")
	public static WebElement Dropd_PmtSubtype; 
	
	@FindBy(how=How.XPATH,using="//*[@id='inputfile']")
	public static WebElement Attach_PmtInstr; 
	
	@FindBy(how=How.XPATH,using="(//*[@id='inputfile'])[2]")
	public static WebElement Attach_PmtInstr1; 
	
	@FindBy(how=How.XPATH,using="//*[@id='btnSaveOne']")
	public static WebElement Btn_Save; 

	@FindBy(how=How.XPATH,using="//*[text()= 'Yes']")
	public static WebElement Btn_Yes;
	
	@FindBy(how=How.XPATH,using="//*[@id='btnExceptions1']")
	public static WebElement Btn_exceptions; 

	@FindBy(how=How.XPATH,using="//*[@id='btnSaveOne']")
	public static WebElement Btn_Save1; 

	@FindBy(how=How.XPATH,using="//*[text()= 'Yes']")
	public static WebElement Btn_Yes1; 
	
	@FindBy(how=How.XPATH,using="//*[@id='btnLogout2']")
	public static WebElement Btn_logout;
	
	@FindBy(how=How.XPATH,using="//*[@id='QuoteInterestCalculationGroupID']")
	public static WebElement Edit_IntGrp;
	
	@FindBy(how=How.XPATH,using="//*[@id='QuoteSubAccountID']")
	public static WebElement Dropd_Subacc;
	
	@FindBy(how=How.XPATH,using="//*[@id='ForcedReferencing']")
	public static WebElement Tick_fr;	
	
	@FindBy(how=How.XPATH,using="//*[@id='RealTime']")
	public static WebElement Tick_rt;	
	
	@FindBy(how=How.XPATH,using="//*[@id='transactionDetails']/fieldset/div[4]/div[4]/input")
	public static WebElement Copy_ServiceChannel;
	




	
	
	public static String taskid;
	

	
	

	public static void CollPeriodBalances_MCP_ISO_Story() throws Exception 
	{   
		Thread.sleep(16000);
//		waitForElement(Click_EntitySearch);
//		
//		if(Click_EntitySearch.isDisplayed())
//		{
//			System.out.println("Clicking on entity search");
//			
//			Actions acc=new Actions(driver);
//			
//			acc.moveToElement(Click_EntitySearch).click(Click_EntitySearch).build().perform();
//			Click_EntitySearch.click();
//		}
//		
//		waitForElement(Edi_EntitySearch);
//		
//		String Entity_Name=getData("EntityName","story1",1);
//		Edi_EntitySearch.sendKeys(Entity_Name);
//		waitForElement(Btn_Search);
//		Btn_Search.click();
//		waitForElement(Click_SearchResults);
//		Click_SearchResults.click();
//		Btn_Open.click();
//		Thread.sleep(5000);
//		waitForElement(Click_CollPeriodBalances);
//		Click_CollPeriodBalances.click();
//		
//			
//			
//		waitForElement(Dropd_Agreement);
//		String Agreement_Name=getData("Agreement_Name","story1",4);
//
//	    Dropd_Agreement.sendKeys(Agreement_Name);
//	    
//	    Thread.sleep(3000);
//	    
//		waitForElement(Edit_IntGrp);
//		
//		Edit_IntGrp.click();
//		
//		String Interesst_Group=getData("Interesst_Group","story1",4);
//
//		Edit_IntGrp.sendKeys(Interesst_Group);
//	    
//	    Thread.sleep(3000);
//	    
//	    Dropd_Subacc.click();
//
//	    
//
//		waitForElement(Dropd_BucketID);
//		
//		String BucketID=getData("BucketID","story1",4);
//
//		Dropd_BucketID.sendKeys(BucketID);
//		Thread.sleep(2000);

///1-fr		
		waitForElement(btn_CapturePmt);
		btn_CapturePmt.click();
		

		
		waitForElement(Set_ActionDate);
		Set_ActionDate.click();
		Click_ActionDate.click();
		
		String AccountHolder=getData("AccountHolder1","story1",4);

		Edi_AccountHolder.sendKeys(AccountHolder);

		String AccountNumber=getData("AccountNumber2","story1",4);

		Edi_AccountNumber.sendKeys(AccountNumber);
		
		String Branchcode=getData("Branchcode2","story1",4);

		Edi_Branchcode.sendKeys(Branchcode);

		String BankAccType=getData("BankAccType2","story1",4);

		Dropd_BankAccType.sendKeys(BankAccType);
		
		String Amount=getData("Amount1","story1",4);

		Edi_Amount.sendKeys(Amount);
		
		String TransRef=getData("TransRef1","story1",4);

		Edi_TransRef.sendKeys(TransRef);
		
		String IntRefPmtCap=getData("IntRefPmtCap","story1",4);

		Edi_IntRefPmtCap.sendKeys(IntRefPmtCap);
		
		String Transtype=getData("Transtype","story1",4);

		Dropd_Transtype.sendKeys(Transtype);
		

		
		try
		{
		
			String PmtSubtype=getData("PmtSubtype","story1",4);

			Dropd_PmtSubtype.sendKeys(PmtSubtype);
		}
		catch (Exception e)
		{
			
	}
		
		Thread.sleep(2000);

		waitForElement(Tick_fr);
		Tick_fr.click();

		Thread.sleep(2000);

		
		//String PmtSubtype=getData("PmtSubtype","story1",4);

		//Dropd_PmtSubtype.sendKeys(PmtSubtype);
		
		try
		{
		
		Attach_PmtInstr1.sendKeys("C:\\Users\\srinir.SOLARSYSTEM\\Desktop\\Sample Transactions\\sunday\\Payments\\1k file for attachment purpose.xlsx");

		}
		catch (Exception e)
		{
			
	}

		Attach_PmtInstr.sendKeys("C:\\Users\\srinir.SOLARSYSTEM\\Desktop\\Sample Transactions\\sunday\\Payments\\1k file for attachment purpose.xlsx");
		//C:\\Users\\srinir.SOLARSYSTEM\\Desktop\\Sample Transactions\\sunday\\Payments\\1k file for attachment purpose.xlsx
		waitForElement(Btn_Save);
		Btn_Save.click();
		waitForElement(Btn_Yes);
		Btn_Yes.click();
		try
		{
			Thread.sleep(10000);
			//waitForElement(Btn_exceptions);
			Btn_exceptions.click();
			
			if (Btn_exceptions.isDisplayed())
			{
			waitForElement(Btn_Save1);
			Btn_Save1.click();
			waitForElement(Btn_Yes1);
			Btn_Yes1.click();
			}
		}
		catch (Exception e)
		{
			
	}
	     Thread.sleep(8000);
	     System.out.println("Data entered sucessfully for all the fields");
			LogEvent("Pass","Data entered sucessfully for all the fieldd in MCP tc");
			
			
			waitForElement(btn_CapturePmt);
			btn_CapturePmt.click();
			
			
///2-rt		
			
			waitForElement(Set_ActionDate);
			Set_ActionDate.click();
			Click_ActionDate.click();
			
			String AccountHolder1=getData("AccountHolder1","story1",4);

			Edi_AccountHolder.sendKeys(AccountHolder1);

			String AccountNumber1=getData("AccountNumber2","story1",4);

			Edi_AccountNumber.sendKeys(AccountNumber1);
			
			String Branchcode1=getData("Branchcode2","story1",4);

			Edi_Branchcode.sendKeys(Branchcode1);

			String BankAccType1=getData("BankAccType2","story1",4);

			Dropd_BankAccType.sendKeys(BankAccType1);
			
			String Amount1=getData("Amount1","story1",4);

			Edi_Amount.sendKeys(Amount1);
			
			String TransRef1=getData("TransRef1","story1",4);

			Edi_TransRef.sendKeys(TransRef1);
			
			String IntRefPmtCap1=getData("IntRefPmtCap","story1",4);

			Edi_IntRefPmtCap.sendKeys(IntRefPmtCap1);
			
			String Transtype1=getData("Transtype","story1",4);

			Dropd_Transtype.sendKeys(Transtype1);
			
			try
			{
			
				String PmtSubtype=getData("PmtSubtype","story1",4);

				Dropd_PmtSubtype.sendKeys(PmtSubtype);
			}
			catch (Exception e)
			{
				
		}
			
			Thread.sleep(2000);

			waitForElement(Tick_rt);
			Tick_rt.click();

			Thread.sleep(2000);

			
			//String PmtSubtype=getData("PmtSubtype","story1",4);

			//Dropd_PmtSubtype.sendKeys(PmtSubtype);
			
			try
			{
			
			Attach_PmtInstr1.sendKeys("C:\\Users\\srinir.SOLARSYSTEM\\Desktop\\Sample Transactions\\sunday\\Payments\\1k file for attachment purpose.xlsx");

			}
			catch (Exception e)
			{
				
		}

			Attach_PmtInstr.sendKeys("C:\\Users\\srinir.SOLARSYSTEM\\Desktop\\Sample Transactions\\sunday\\Payments\\1k file for attachment purpose.xlsx");
			//C:\\Users\\srinir.SOLARSYSTEM\\Desktop\\Sample Transactions\\sunday\\Payments\\1k file for attachment purpose.xlsx
			waitForElement(Btn_Save);
			Btn_Save.click();
			waitForElement(Btn_Yes);
			Btn_Yes.click();
			try
			{
				Thread.sleep(10000);
				//waitForElement(Btn_exceptions);
				Btn_exceptions.click();
				
				if (Btn_exceptions.isDisplayed())
				{
				waitForElement(Btn_Save1);
				Btn_Save1.click();
				waitForElement(Btn_Yes1);
				Btn_Yes1.click();
				}
			}
			catch (Exception e)
			{
				
		}
		     Thread.sleep(8000);
		     System.out.println("Data entered sucessfully for all the fields");
				LogEvent("Pass","Data entered sucessfully for all the fieldd in MCP tc");
				
				
				
///3-NO fr/rt		
				waitForElement(btn_CapturePmt);
				btn_CapturePmt.click();
				

				
				waitForElement(Set_ActionDate);
				Set_ActionDate.click();
				Click_ActionDate.click();
				
				String AccountHolder2=getData("AccountHolder1","story1",4);

				Edi_AccountHolder.sendKeys(AccountHolder2);

				String AccountNumber2=getData("AccountNumber2","story1",4);

				Edi_AccountNumber.sendKeys(AccountNumber2);
				
				String Branchcode2=getData("Branchcode2","story1",4);

				Edi_Branchcode.sendKeys(Branchcode2);

				String BankAccType2=getData("BankAccType2","story1",4);

				Dropd_BankAccType.sendKeys(BankAccType2);
				
				String Amount2=getData("Amount1","story1",4);

				Edi_Amount.sendKeys(Amount2);
				
				String TransRef2=getData("TransRef1","story1",4);

				Edi_TransRef.sendKeys(TransRef2);
				
				String IntRefPmtCap2=getData("IntRefPmtCap","story1",4);

				Edi_IntRefPmtCap.sendKeys(IntRefPmtCap2);
				
				String Transtype2=getData("Transtype","story1",4);

				Dropd_Transtype.sendKeys(Transtype2);
				
	
				
				
				
				
				try
				{
				
					String PmtSubtype=getData("PmtSubtype","story1",4);

					Dropd_PmtSubtype.sendKeys(PmtSubtype);
				}
				catch (Exception e)
				{
					
			}
				
				
				//String PmtSubtype=getData("PmtSubtype","story1",4);

				//Dropd_PmtSubtype.sendKeys(PmtSubtype);
				
				try
				{
				
				Attach_PmtInstr1.sendKeys("C:\\Users\\srinir.SOLARSYSTEM\\Desktop\\Sample Transactions\\sunday\\Payments\\1k file for attachment purpose.xlsx");

				}
				catch (Exception e)
				{
					
			}

				Attach_PmtInstr.sendKeys("C:\\Users\\srinir.SOLARSYSTEM\\Desktop\\Sample Transactions\\sunday\\Payments\\1k file for attachment purpose.xlsx");
				//C:\\Users\\srinir.SOLARSYSTEM\\Desktop\\Sample Transactions\\sunday\\Payments\\1k file for attachment purpose.xlsx
				waitForElement(Btn_Save);
				Btn_Save.click();
				waitForElement(Btn_Yes);
				Btn_Yes.click();
				try
				{
					Thread.sleep(10000);
					//waitForElement(Btn_exceptions);
					Btn_exceptions.click();
					
					if (Btn_exceptions.isDisplayed())
					{
					waitForElement(Btn_Save1);
					Btn_Save1.click();
					waitForElement(Btn_Yes1);
					Btn_Yes1.click();
					}
				}
				catch (Exception e)
				{
					
			}
			     Thread.sleep(8000);
			     System.out.println("Data entered sucessfully for all the fields");
					LogEvent("Pass","Data entered sucessfully for all the fieldd in MCP tc");
					
					
					
					
//				waitForElement(Copy_ServiceChannel);
//				Copy_ServiceChannel.getText();



	//	driver.quit();
			waitForElement(Btn_logout);
	    	Btn_logout.click();	
			Thread.sleep(3000);

			waitForElement(taskid);
			taskid= DBConnection.dbConnect();
			//Thread.sleep(2000);

			System.out.println(taskid);
			Thread.sleep(3000);

}





	private static void waitForElement(String taskid2) {
		// TODO Auto-generated method stub
		
	}
	
}
	