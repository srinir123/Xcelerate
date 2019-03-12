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
import com.GenericFunctions.DBConnection1;
import com.GenericFunctions.GenericMethods;
import com.GenericFunctions.NewDBConnection_OTP_Story1;

public class FinancialRelease extends GenericMethods{

	@FindBy(how=How.XPATH,using="//*[text()='Financial Release']")
	public static WebElement Click_FinancialR;
	
	@FindBy(how=How.XPATH,using="//*[@id='ServiceChannelID']")
	public static WebElement Edi_ServiceChannel;
	
	@FindBy(how=How.XPATH,using="//*[@id='btnSearch']")
	public static WebElement Btn_Search;
		
	@FindBy(how=How.XPATH,using="//*[@id='financialReleaseAuthorisationResultsGrid']/tbody/tr/td[1]/div/div[1]/label")
	public static WebElement Click_Authorize;
	
	@FindBy(how=How.XPATH,using="//*[@id='btnSave']")
	public static WebElement Btnt_Save;
	
	@FindBy(how=How.XPATH,using="//*[@id='financialReleaseAuthorisationResultsGrid']/tbody/tr/td[9]")
	public static WebElement Amount_Check;

	
		
	@FindBy(how=How.XPATH,using="//*[@id='EntityID']")
	public static WebElement Dropd_EnityID;
	
	@FindBy(how=How.XPATH,using="//*[text()='Transaction Search']")
	public static WebElement Click_TransSearh;
	
	@FindBy(how=How.XPATH,using="//*[@id='FromActionDate']")
	public static WebElement Set_FromActionDate;
	
	@FindBy(how=How.CSS,using="#ui-datepicker-div > table > tbody > tr:nth-child(n) > td.ui-datepicker-days-cell-over.ui-datepicker-today > a")
	public static WebElement Click_date;
	
	@FindBy(how=How.XPATH,using="//*[@id='ToActionDate']")
	public static WebElement Set_ToActionDate;
	
	@FindBy(how=How.XPATH,using="//*[@id='btnSearch']")
	public static WebElement Click_BtnSearch;
	
	@FindBy(how=How.XPATH,using="//*[@id='resultsGrid']/tbody/tr[1]/td[4]")
	public static WebElement Row1;
	
	@FindBy(how=How.XPATH,using="//*[@id='resultsGrid']/tbody/tr[5]/td[4]")
	public static WebElement Row5;
	
	@FindBy(how=How.XPATH,using="//*[@id='resultsGrid']/tbody/tr[9]/td[4]")
	public static WebElement Row9;
	
	@FindBy(how=How.XPATH,using="//*[@id='resultsGrid']/tbody/tr[10]/td[3]")
	public static WebElement Row10;
	
	@FindBy(how=How.XPATH,using="//*[@id='resultsGrid']/tbody/tr[11]/td[3]")
	public static WebElement Row11;
	
	@FindBy(how=How.XPATH,using="//*[@id='resultsGrid']/tbody/tr[12]/td[3]")
	public static WebElement Row12;
	
	@FindBy(how=How.XPATH,using="//*[@id='resultsGrid']/tbody/tr[13]/td[3]")
	public static WebElement Row13;

	@FindBy(how=How.XPATH,using="//*[@id='resultsGrid']/tbody/tr[14]/td[3]")
	public static WebElement Row14;
	
	@FindBy(how=How.XPATH,using="//*[@id='resultsGrid']/tbody/tr[15]/td[3]")
	public static WebElement Row15;
	

	
	@FindBy(how=How.XPATH,using="//*[@id='transactionDetails']/fieldset/div[4]/div[4]/label")
	public static WebElement GetData_ServiceChannel;
											
	@FindBy(how=How.XPATH,using="//*[@id='transactionDetails']/fieldset/div[4]/div[5]/label")
	public static WebElement GetData_ServiceType;
	
	@FindBy(how=How.XPATH,using="//*[@id='btnLogout2']")
	public static WebElement Btn_logout;
	
	
	
	
	public static String taskid;
	
	public static String OTP;

	
	
	public static void FinancialRelease() throws Exception   
	{


		Thread.sleep(20000);
		waitForElement(Click_TransSearh);
		Click_TransSearh.click();
		
		waitForElement(Dropd_EnityID);
        String EntityName=getData("EntityName","story1",1);
        Dropd_EnityID.sendKeys(EntityName);
        
        waitForElement(Set_FromActionDate);
        Set_FromActionDate.click();
        
        waitForElement(Click_date);
        Click_date.click();
        
        waitForElement(Set_ToActionDate);
        Set_ToActionDate.click();
		
        waitForElement(Click_date);
        Click_date.click();
        
        waitForElement(Click_BtnSearch);
        Click_BtnSearch.click();
        
        Thread.sleep(6000);
 //Row1       
        waitForElement(Row1);
        Row1.click();
        Thread.sleep(6000);
        System.out.println("Row1");
        waitForElement(GetData_ServiceChannel);
        String expectedData1 = "XHost604";
        System.out.println("Expected Results is:");
        System.out.println(expectedData1);
        String data1 = driver.findElement(By.xpath("//*[@id='transactionDetails']/fieldset/div[4]/div[4]/input")).getAttribute("value");
        System.out.println("Given Result is : " +data1);


      if(data1.equals(expectedData1)) {
      System.out.println("Test result is: Successful Match");
     } else
     {
     	 System.out.println("Test result is: Failed!");
     }
     	
     if(!data1.equals(expectedData1))
     {
 		waitForElement(Btn_logout);
			Btn_logout.click();
     }
     
     waitForElement(GetData_ServiceType);
     String expectedData11 = "Same Day";
     System.out.println("Expected Results is:");
     System.out.println(expectedData11);
     String data11 = driver.findElement(By.xpath("//*[@id='transactionDetails']/fieldset/div[4]/div[5]/input")).getAttribute("value");
     System.out.println("Given Result is : " +data11);
     
   if(data11.equals(expectedData11)) {
   System.out.println("Test result is: Successful Match");
  } else
  {
  	 System.out.println("Test result is: Failed!");
  }
  	
  if(!data11.equals(expectedData11))
  {
		waitForElement(Btn_logout);
			Btn_logout.click();
  }

  //Row5       
  waitForElement(Row5);
  Row5.click();
  Thread.sleep(6000);
  System.out.println("Row5");
  waitForElement(GetData_ServiceChannel);
  String expectedData5 = "XHost604";
  System.out.println("Expected Results is:");
  System.out.println(expectedData5);
  String data5 = driver.findElement(By.xpath("//*[@id='transactionDetails']/fieldset/div[4]/div[4]/input")).getAttribute("value");
  System.out.println("Given Result is : " +data5);

 
if(data5.equals(expectedData5)) {
System.out.println("Test result is: Successful Match");
} else
{
	 System.out.println("Test result is: Failed!");
}
	
if(!data5.equals(expectedData5))
{
	waitForElement(Btn_logout);
		Btn_logout.click();
}

waitForElement(GetData_ServiceType);
String expectedData55 = "Same Day";
System.out.println("Expected Results is:");
System.out.println(expectedData55);
String data55 = driver.findElement(By.xpath("//*[@id='transactionDetails']/fieldset/div[4]/div[5]/input")).getAttribute("value");
System.out.println("Given Result is : " +data55);

if(data55.equals(expectedData55)) {
System.out.println("Test result is: Successful Match");
} else
{
 System.out.println("Test result is: Failed!");
}

if(!data55.equals(expectedData55))
{
	waitForElement(Btn_logout);
		Btn_logout.click();
}
	

//Row9       
waitForElement(Row9);
Row9.click();
Thread.sleep(6000);
System.out.println("Row9");
waitForElement(GetData_ServiceChannel);
String expectedData9 = "XHost604";
System.out.println("Expected Results is:");
System.out.println(expectedData9);
String data9 = driver.findElement(By.xpath("//*[@id='transactionDetails']/fieldset/div[4]/div[4]/input")).getAttribute("value");
System.out.println("Given Result is : " +data9);


if(data9.equals(expectedData9)) {
System.out.println("Test result is: Successful Match");
} else
{
	 System.out.println("Test result is: Failed!");
}
	
if(!data9.equals(expectedData9))
{
	waitForElement(Btn_logout);
		Btn_logout.click();
}

waitForElement(GetData_ServiceType);
String expectedData99 = "Same Day";
System.out.println("Expected Results is:");
System.out.println(expectedData99);
String data99 = driver.findElement(By.xpath("//*[@id='transactionDetails']/fieldset/div[4]/div[5]/input")).getAttribute("value");
System.out.println("Given Result is : " +data99);

if(data99.equals(expectedData99)) {
System.out.println("Test result is: Successful Match");
} else
{
System.out.println("Test result is: Failed!");
}

if(!data99.equals(expectedData99))
{
	waitForElement(Btn_logout);
		Btn_logout.click();
}


//Row10       
waitForElement(Row10);
Row10.click();
Thread.sleep(6000);
System.out.println("Row10");
waitForElement(GetData_ServiceChannel);
String expectedData10 = "FNB Online";
System.out.println("Expected Results is:");
System.out.println(expectedData10);
String data10 = driver.findElement(By.xpath("//*[@id='transactionDetails']/fieldset/div[4]/div[4]/input")).getAttribute("value");
System.out.println("Given Result is : " +data10);


if(data10.equals(expectedData10)) {
System.out.println("Test result is: Successful Match");
} else
{
	 System.out.println("Test result is: Failed!");
}
	
if(!data10.equals(expectedData10))
{
	waitForElement(Btn_logout);
		Btn_logout.click();
}

waitForElement(GetData_ServiceType);
String expectedData1010 = "Realtime";
System.out.println("Expected Results is:");
System.out.println(expectedData1010);
String data1010 = driver.findElement(By.xpath("//*[@id='transactionDetails']/fieldset/div[4]/div[5]/input")).getAttribute("value");
System.out.println("Given Result is : " +data1010);

if(data1010.equals(expectedData1010)) {
System.out.println("Test result is: Successful Match");
} else
{
System.out.println("Test result is: Failed!");
}

if(!data1010.equals(expectedData1010))
{
	waitForElement(Btn_logout);
		Btn_logout.click();
}


//Row11       
waitForElement(Row11);
Row11.click();
Thread.sleep(6000);
System.out.println("Row11");
waitForElement(GetData_ServiceChannel);
String expectedData11n = "FNB Online";
System.out.println("Expected Results is:");
System.out.println(expectedData11n);
String data11n = driver.findElement(By.xpath("//*[@id='transactionDetails']/fieldset/div[4]/div[4]/input")).getAttribute("value");
System.out.println("Given Result is : " +data11n);


if(data11n.equals(expectedData11n)) {
System.out.println("Test result is: Successful Match");
} else
{
	 System.out.println("Test result is: Failed!");
}
	
if(!data11n.equals(expectedData11n))
{
	waitForElement(Btn_logout);
		Btn_logout.click();
}

waitForElement(GetData_ServiceType);
String expectedData1111 = "Same Day";
System.out.println("Expected Results is:");
System.out.println(expectedData1111);
String data1111 = driver.findElement(By.xpath("//*[@id='transactionDetails']/fieldset/div[4]/div[5]/input")).getAttribute("value");
System.out.println("Given Result is : " +data1111);

if(data1111.equals(expectedData1111)) {
System.out.println("Test result is: Successful Match");
} else
{
System.out.println("Test result is: Failed!");
}

if(!data1111.equals(expectedData1111))
{
	waitForElement(Btn_logout);
		Btn_logout.click();
}


//Row12       
waitForElement(Row12);
Row12.click();
Thread.sleep(6000);
System.out.println("Row12");
waitForElement(GetData_ServiceChannel);
String expectedData12 = "XHost604";
System.out.println("Expected Results is:");
System.out.println(expectedData12);
String data12 = driver.findElement(By.xpath("//*[@id='transactionDetails']/fieldset/div[4]/div[4]/input")).getAttribute("value");
System.out.println("Given Result is : " +data12);


if(data12.equals(expectedData12)) {
System.out.println("Test result is: Successful Match");
} else
{
	 System.out.println("Test result is: Failed!");
}
	
if(!data12.equals(expectedData12))
{
	waitForElement(Btn_logout);
		Btn_logout.click();
}

waitForElement(GetData_ServiceType);
String expectedData1212 = "Same Day";
System.out.println("Expected Results is:");
System.out.println(expectedData1212);
String data1212 = driver.findElement(By.xpath("//*[@id='transactionDetails']/fieldset/div[4]/div[5]/input")).getAttribute("value");
System.out.println("Given Result is : " +data1212);

if(data1212.equals(expectedData1212)) {
System.out.println("Test result is: Successful Match");
} else
{
System.out.println("Test result is: Failed!");
}

if(!data1212.equals(expectedData1212))
{
	waitForElement(Btn_logout);
		Btn_logout.click();
}


//Row13       
waitForElement(Row13);
Row13.click();
Thread.sleep(6000);
System.out.println("Row13");
waitForElement(GetData_ServiceChannel);
String expectedData13 = "FNB Online";
System.out.println("Expected Results is:");
System.out.println(expectedData13);
String data13 = driver.findElement(By.xpath("//*[@id='transactionDetails']/fieldset/div[4]/div[4]/input")).getAttribute("value");
System.out.println("Given Result is : " +data13);


if(data13.equals(expectedData13)) {
System.out.println("Test result is: Successful Match");
} else
{
	 System.out.println("Test result is: Failed!");
}
	
if(!data13.equals(expectedData13))
{
	waitForElement(Btn_logout);
		Btn_logout.click();
}

waitForElement(GetData_ServiceType);
String expectedData1313 = "Same Day";
System.out.println("Expected Results is:");
System.out.println(expectedData1313);
String data1313 = driver.findElement(By.xpath("//*[@id='transactionDetails']/fieldset/div[4]/div[5]/input")).getAttribute("value");
System.out.println("Given Result is : " +data1313);

if(data1313.equals(expectedData1313)) {
System.out.println("Test result is: Successful Match");
} else
{
System.out.println("Test result is: Failed!");
}

if(!data1313.equals(expectedData1313))
{
	waitForElement(Btn_logout);
		Btn_logout.click();
}


//Row14       
waitForElement(Row14);
Row14.click();
Thread.sleep(6000);
System.out.println("Row14");
waitForElement(GetData_ServiceChannel);
String expectedData14 = "FNB Online";
System.out.println("Expected Results is:");
System.out.println(expectedData14);
String data14 = driver.findElement(By.xpath("//*[@id='transactionDetails']/fieldset/div[4]/div[4]/input")).getAttribute("value");
System.out.println("Given Result is : " +data14);


if(data14.equals(expectedData14)) {
System.out.println("Test result is: Successful Match");
} else
{
	 System.out.println("Test result is: Failed!");
}
	
if(!data14.equals(expectedData14))
{
	waitForElement(Btn_logout);
		Btn_logout.click();
}

waitForElement(GetData_ServiceType);
String expectedData1414 = "Realtime";
System.out.println("Expected Results is:");
System.out.println(expectedData1414);
String data1414 = driver.findElement(By.xpath("//*[@id='transactionDetails']/fieldset/div[4]/div[5]/input")).getAttribute("value");
System.out.println("Given Result is : " +data1414);

if(data1414.equals(expectedData1414)) {
System.out.println("Test result is: Successful Match");
} else
{
System.out.println("Test result is: Failed!");
}

if(!data1414.equals(expectedData1414))
{
	waitForElement(Btn_logout);
		Btn_logout.click();
}


//Row15       
waitForElement(Row15);
Row15.click();
Thread.sleep(6000);
System.out.println("Row15");
waitForElement(GetData_ServiceChannel);
String expectedData15 = "XHost604";
System.out.println("Expected Results is:");
System.out.println(expectedData15);
String data15 = driver.findElement(By.xpath("//*[@id='transactionDetails']/fieldset/div[4]/div[4]/input")).getAttribute("value");
System.out.println("Given Result is : " +data15);


if(data15.equals(expectedData15)) {
System.out.println("Test result is: Successful Match");
} else
{
	 System.out.println("Test result is: Failed!");
}
	
if(!data15.equals(expectedData15))
{
	waitForElement(Btn_logout);
		Btn_logout.click();
}

waitForElement(GetData_ServiceType);
String expectedData1515 = "Same Day";
System.out.println("Expected Results is:");
System.out.println(expectedData1515);
String data1515 = driver.findElement(By.xpath("//*[@id='transactionDetails']/fieldset/div[4]/div[5]/input")).getAttribute("value");
System.out.println("Given Result is : " +data1515);

if(data1515.equals(expectedData1515)) {
System.out.println("Test result is: Successful Match");
} else
{
System.out.println("Test result is: Failed!");
}

if(!data1515.equals(expectedData1515))
{
	waitForElement(Btn_logout);
		Btn_logout.click();
}
		

		
		waitForElement(Click_FinancialR);
		//waitForElement(Edi_EntityName);

		Click_FinancialR.click();
       
		waitForElement(Edi_ServiceChannel);
        //String EntityName=getData("EntityName","story1",1);
        Edi_ServiceChannel.sendKeys("XHost604");
        
        Thread.sleep(2000);
        
        waitForElement(Btn_Search);
        Btn_Search.click();
        
Thread.sleep(4000);
        
//        waitForElement(Amount_Check);
//        String expectedData = "R 40.17";
//        System.out.println("R 40.17");
//        System.out.println(expectedData);
//        String data = driver.findElement(By.xpath("//*[@id='financialReleaseAuthorisationResultsGrid']/tbody/tr/td[9]")).getText();
//        System.out.println("Given Result is : " +data);
//
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

        waitForElement(Click_Authorize);
        Click_Authorize.click();
		
        waitForElement(Btnt_Save);
        Btnt_Save.click();
        
        Thread.sleep(3000);
        
		waitForElement(Edi_ServiceChannel);
		Edi_ServiceChannel.sendKeys("FNB Online");
		
Thread.sleep(2000);
        
        waitForElement(Btn_Search);
        Btn_Search.click();
        
Thread.sleep(4000);
        
//        waitForElement(Amount_Check);
//        String expectedData100 = "R 60.32";
//        System.out.println("R 60.32");
//        System.out.println(expectedData100);
//        String data100 = driver.findElement(By.xpath("//*[@id='financialReleaseAuthorisationResultsGrid']/tbody/tr/td[9]")).getText();
//        System.out.println("Given Result is : " +data100);
//
//        if(data100.equals(expectedData100)) {
//         System.out.println("Test result is: Successful Match");
//        } else
//        {
//        	 System.out.println("Test result is: Failed!");
//        }
//        	
//        if(!data100.equals(expectedData100))
//        {
//    		waitForElement(Btn_logout);
//			Btn_logout.click();
//        }
        
        
        waitForElement(Click_Authorize);
        Click_Authorize.click();
		
        waitForElement(Btnt_Save);
        Btnt_Save.click();
        
    	waitForElement(Btn_logout);
    	Btn_logout.click();	

       			


        
	}
}
	 
