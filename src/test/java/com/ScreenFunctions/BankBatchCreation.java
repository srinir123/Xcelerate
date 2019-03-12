package com.ScreenFunctions;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
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

public class BankBatchCreation extends GenericMethods{


	
	@FindBy(how=How.XPATH,using="//*[text()='Bank Batches']")
	public static WebElement Click_BankBatches;
	
	@FindBy(how=How.XPATH,using="//*[@id='btnAdd']")
	public static WebElement Click_AddNewBatch;
	
	@FindBy(how=How.XPATH,using="//*[@id='CollectionPayment']")
	public static WebElement Click_CollPmt;
	
	@FindBy(how=How.XPATH,using="//*[@id='BankAccountID']")
	public static WebElement Edit_BankAcc;
	
	@FindBy(how=How.XPATH,using="//*[@id='ActionDate']")
	public static WebElement Set_ActionDate;
	
	@FindBy(how=How.XPATH,using="//*[@id='SearchActionDate']")
	public static WebElement Set_SearchActionDate;
	
	@FindBy(how=How.XPATH,using="//*[@id='ui-datepicker-div']/table/tbody/tr[.]/td[.]/a")
	public static WebElement Click_ActionDate;
	
	@FindBy(how=How.XPATH,using="//*[@id='StartTime']")
	public static WebElement Edit_Starttime;
	
	@FindBy(how=How.XPATH,using="//*[@id='btnSearch']")
	public static WebElement Click_Search;
	
	@FindBy(how=How.XPATH,using="//*[@id='StartDate']")
	public static WebElement Set_StartnDate;
	
	@FindBy(how=How.XPATH,using="//*[@id='btnSaveOne']")
	public static WebElement Click_Save;
	
	@FindBy(how=How.XPATH,using="//button[contains(text(),'Yes')]")
	public static WebElement Click_Yes;
	
	@FindBy(how=How.CSS,using="#ui-datepicker-div > table > tbody > tr:nth-child(n) > td.ui-datepicker-days-cell-over.ui-datepicker-today > a")
	public static WebElement Click_date;
	
//	@FindBy(how=How.XPATH,using="//*[@id='resultsGrid']/tbody/tr[last()]/td[9]")
//	public static WebElement Record_Status;

	@FindBy(how=How.XPATH,using="//*[@id='resultsGrid']/tbody/tr[1]/td[9]")
	public static WebElement Record_Status1;
	
	@FindBy(how=How.XPATH,using="//*[@id='resultsGrid']/tbody/tr[2]/td[9]")
	public static WebElement Record_Status2;
	
	@FindBy(how=How.XPATH,using="//*[@id='btnLogout2']")
	public static WebElement Btn_logout;
			
			
					
							
									
											
	
	
	
	
	
	public static String taskid;
	
	public static String OTP;

	
	
	public static void BankBatchCreation() throws Exception   
	{


		Thread.sleep(20000);
		waitForElement(Click_BankBatches);
	    Click_BankBatches.click();
       
		waitForElement(Click_AddNewBatch);
		Click_AddNewBatch.click();
        
        Thread.sleep(2000);
        
        waitForElement(Click_CollPmt);
        Click_CollPmt.click();
        
        waitForElement(Edit_BankAcc);
        Edit_BankAcc.sendKeys("ISO QA Description");
        
        waitForElement(Set_ActionDate);
        Set_ActionDate.click();
        
        waitForElement(Click_date);
        Click_date.click();
        
        waitForElement(Edit_Starttime);
        Edit_Starttime.sendKeys("06:00");
        
        waitForElement(Set_StartnDate);
        Set_StartnDate.click();
        
        waitForElement(Click_date);
        Click_date.click();
        
        waitForElement(Click_Save);
        Click_Save.click();
        
        waitForElement(Click_Yes);
        Click_Yes.click();
        
        //Thread.sleep(5000);
        
        waitForElement(Set_SearchActionDate);
        Set_SearchActionDate.click();
        
        waitForElement(Click_date);
        Click_date.click();
        
        waitForElement(Click_Search);
        Click_Search.click();
        
        //Thread.sleep(4000);
        
        waitForElement(Record_Status1);
        String expectedData = "Pending or Creating Batch File";
        System.out.println("Expected Results is:");
        System.out.println(expectedData);
        String data = driver.findElement(By.xpath("//*[@id='resultsGrid']/tbody/tr[last()]/td[9]")).getText();
        System.out.println("Given Result is : " +data);

//        if(data.equals(expectedData)) {
//         System.out.println("Test result is: Successful Match");
//        } else
//        {
//        	 System.out.println("Test result is: Failed!");
//        }
//        	
//        if(!data.equals(expectedData))
//        {
//    		waitForElement(Btn_logout);
//			Btn_logout.click();
//        }
        
        waitForElement(Record_Status2);
        String expectedData1 = "Pending or Creating Batch File";
        System.out.println("Expected Results is:");
        System.out.println(expectedData1);
        String data1 = driver.findElement(By.xpath("//*[@id='resultsGrid']/tbody/tr[last()-1]/td[9]")).getText();
        System.out.println("Given Result is : " +data1);

//        if(data1.equals(expectedData1)) {
//         System.out.println("Test result is: Successful Match");
//        } else
//        {
//        	 System.out.println("Test result is: Failed!");
//        }
//        	
//        if(!data1.equals(expectedData1))
//        {
//    		waitForElement(Btn_logout);
//			Btn_logout.click();
//        }


Thread.sleep(90000);
        Set_SearchActionDate.clear();
        waitForElement(Set_SearchActionDate);
        Set_SearchActionDate.click();
        
        waitForElement(Click_date);
        Click_date.click();
        
        waitForElement(Click_Search);
        Click_Search.click();
        
        Thread.sleep(4000);
        
        //waitForElement(Record_Status1);
        String expectedData2 = "Batch File Created";
        System.out.println("Expected Results is:");
        System.out.println(expectedData2);
        String data2 = driver.findElement(By.xpath("//*[@id='resultsGrid']/tbody/tr[last()]/td[9]")).getText();
        System.out.println("Given Result is : " +data2);

        if(data2.equals(expectedData2)) {
         System.out.println("Test result is: Successful Match");
        } else
        {
        	 System.out.println("Test result is: Failed!");
        }
        	
        if(!data2.equals(expectedData2))
        {
    		waitForElement(Btn_logout);
			Btn_logout.click();
          
        	
        }
        
        //waitForElement(Record_Status2);
        String expectedData3 = "Batch File Created";
        System.out.println("Expected Results is:");
        System.out.println(expectedData3);
        String data3 = driver.findElement(By.xpath("//*[@id='resultsGrid']/tbody/tr[last()-1]/td[9]")).getText();
        System.out.println("Given Result is : " +data3);

        if(data3.equals(expectedData3)) {
         System.out.println("Test result is: Successful Match");
        } else
        {
        	 System.out.println("Test result is: Failed!");
        }
        	
        if(!data3.equals(expectedData3))
        {
    		waitForElement(Btn_logout);
			Btn_logout.click();
        }
driver.quit();

	}
}
	 
