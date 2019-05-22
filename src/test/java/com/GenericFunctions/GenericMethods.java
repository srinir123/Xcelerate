package com.GenericFunctions;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ReportGeneration.GenerateReports;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class GenericMethods extends GenerateReports {
//UAT	
//public static  String UAT_url="http://172.20.92.19/Login/LogOn?ReturnUrl=%2f";
//PROD
public static  String UAT_url="http://172.20.92.18/Login/LogOn?ReturnUrl=%2f";
//DEV
//public static  String UAT_url="http://172.20.92.22:81/smi-31249/Login/LogOn?ReturnUrl=%2f";
public static  String Dev_url="http://172.20.92.18/Login/LogOn?ReturnUrl=%2f";
//public static  String Dev_url="http://172.20.92.19/Login/LogOn?ReturnUrl=%2f";
public static  String Ad_url="http://192.168.0.4/Adiuvatis/ptlogin.asp";


public static Fillo fillo;

public static Connection connection;



	
	public static WebDriver driver;
	
	public static WebDriverWait wait;
	
	public static void LaunchBrowser(String browser)
	{
		switch(browser.toLowerCase())
		{
		case "chrome":
			
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(UAT_url);
			
			
			
			break;
			
			
		}
		
		
	}
	
	public static void LaunchBrowser2(String browser)
	{
		switch(browser.toLowerCase())
		{
		case "firefox":
			
			System.setProperty("webdriver.firefox.driver", "Firefox Installer.exe");
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get(UAT_url);
			
			
			
			break;
			
			
		}
		
		
	}
	
	
	public static void LaunchBrowser1(String browser)
	{
		switch(browser.toLowerCase())
		{
		case "chrome":
			
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(Dev_url);
			
			
			
			break;
			
			
		}
		
		
	}
	
	
	
	
	public static void LaunchBrowserAd(String browser)
	{
		switch(browser.toLowerCase())
		{
		case "chrome":
			
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(Ad_url);
			
			
			
			break;
			
			
		}
		
		
	}
	
	
	
	
	
	
	public static void performDBLCLICK(WebElement ele)
	{
		Actions acc=new Actions(driver);
		
		acc.moveToElement(ele).doubleClick().build().perform();
		
		
	}
	
	public static void waitUntilPageLoaded() {
		JavascriptExecutor js = null;
		String pageStatus = null;
		long startTime;
		try {
			js = (JavascriptExecutor) driver;
			pageStatus = js.executeScript("return document.readyState").toString();
			startTime = System.currentTimeMillis();
			while((!(pageStatus.equalsIgnoreCase("complete")))&(System.currentTimeMillis() - startTime<=60*1000)){
				Thread.sleep(1000);
				pageStatus = js.executeScript("return document.readyState").toString();
			}
			if(!(pageStatus.equalsIgnoreCase("complete"))){
				
			}
		}catch(Exception exception){
			
		}
	}
		
	
	
	public static void waitForElement(WebElement ele)
	{
		wait=new WebDriverWait(driver,120);
		
		try {
			waitUntilPageLoaded();
			//wait.until(org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated(ele));

			wait.until(org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf(ele));
		} catch (Exception exception) {
			System.out.println(exception);
		}
		
		
	for(int i=0;i<=4000;i++)
	{
		try{
			Thread.sleep(1000);
			
			Actions acc=new Actions(driver);
			
			acc.moveToElement(ele).build().perform();
			
			//ele.click();
			System.out.println(ele+"found");
			waitUntilPageLoaded();
   			break;
		}
		catch(Exception e)
		{
			System.out.println(ele+"not found");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e1) {
				
				e1.printStackTrace();

	}
	
		}	
	
	}
	}


	
//////for new user creation purpose///////////////////////	
	public static void waitForElement1(WebElement ele)
	{
		wait=new WebDriverWait(driver,240);
		
		try {
			waitUntilPageLoaded();
			//wait.until(org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated(ele));

			wait.until(org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf(ele));
		} catch (Exception exception) {
			System.out.println(exception);
		}
		
		
	for(int i=0;i<=3500;i++)
	{
		try{
			Thread.sleep(1000);
			
			Actions acc=new Actions(driver);
			
			acc.moveToElement(ele).build().perform();
			
			ele.click();
			System.out.println(ele+"found");
			waitUntilPageLoaded();
   			break;
		}
		catch(Exception e)
		{
			System.out.println(ele+"not found");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e1) {
				
				e1.printStackTrace();

	}
	
		}	
	
	}
	}
	
	public static void waitForElement2(WebElement ele)
	{
		wait=new WebDriverWait(driver,120);
		
		try {
			waitUntilPageLoaded();
			//wait.until(org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated(ele));

			wait.until(org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf(ele));
		} catch (Exception exception) {
			System.out.println(exception);
		}
		
		
	for(int i=0;i<=4000;i++)
	{
		try{
			Thread.sleep(1000);
			
			Actions acc=new Actions(driver);
			
			acc.moveToElement(ele).build().perform();
			
			//ele.click();
			System.out.println(ele+"found");
			waitUntilPageLoaded();
   			break;
		}
		catch(Exception e)
		{
			System.out.println(ele+"not found");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e1) {
				
				e1.printStackTrace();

	}
	
		}	
	
	}
	}


	
	
	
	
	

public static boolean click_element(WebElement element) {
	boolean status = true;
	int flag=0;
		try{
			waitUntilPageLoaded();
			waitForElement(element);
		Actions acc=new Actions(driver);
		
		acc.moveToElement(element).click(element).build().perform();
		flag++;
	}
		catch(Exception e)
		{
			status=false;
			System.out.println("Not able to click on element"+e.getMessage());
		}
		
		
		if(flag==0)
		{
			
			try
			{
				JavascriptExecutor js=(JavascriptExecutor) driver;
				js.executeScript("arguments[0].click();", element);
				flag++;
				
			}
			
			catch(Exception e)
			{
				System.out.println("Not able to click the element"+e.getMessage());
				element.click();
				
			}
		}
		
		
		return status;  
	}

//////for new user creation purpose///////////////////////
public static boolean click_element1(WebElement element) {
	boolean status = true;
	int flag=0;
		try{
			waitUntilPageLoaded();
			waitForElement1(element);
		Actions acc=new Actions(driver);
		
		acc.moveToElement(element).click(element).build().perform();
		flag++;
	}
		catch(Exception e)
		{
			status=false;
			System.out.println("Not able to click on element"+e.getMessage());
		}
		
		
		if(flag==0)
		{
			
			try
			{
				JavascriptExecutor js=(JavascriptExecutor) driver;
				js.executeScript("arguments[0].click();", element);
				flag++;
				
			}
			
			catch(Exception e)
			{
				System.out.println("Not able to click the element"+e.getMessage());
				element.click();
				
			}
		}
		
		
		return status;  
	}












public static void openExcelAsDataBase()
{
	try {
		fillo=new Fillo();
		connection=fillo.getConnection(System.getProperty("user.dir")+"\\Test data\\TestData.xlsx");
		}
		
		catch(Exception e)
		{
			
			System.out.println("No Test data File Is Found");
		}
		
	
	
}







public static String getData(String fieldname,String methodname,int itr)
{
	
	String data="";
	Recordset recordset;
	try {
		
		String query="Select "+fieldname+" from "+ methodname+" where Tc_Name='"+TestNgListners.crtClass+"' and iteration ="+itr+"";
		
		recordset=connection.executeQuery(query);

		while(recordset.next()){
		System.out.println(recordset.getField(fieldname));
		
		data=recordset.getField(fieldname);
		recordset.close();
break;
		}
		
	}
	catch(Exception e)
	{
		System.out.println("No Record Found");
		data="";
	}
	
finally
{
		
}
	
	return data;
	
}


public static String getData(String fieldname,String methodname,int itr,int subitr)
{
	
	String data="";
	Recordset recordset;
	try {
		
		String query="Select "+fieldname+" from "+ methodname+" where Tc_Name='"+TestNgListners.crtClass+"' and iteration ="+itr+" and Sub_iteration ="+subitr+"";
		
		recordset=connection.executeQuery(query);

		while(recordset.next()){
		System.out.println(recordset.getField(fieldname));
		
		data=recordset.getField(fieldname);
		recordset.close();
break;
		}
		
	}
	catch(Exception e)
	{
		System.out.println("No Record Found");
		data="";
	}
	
finally
{
		
}
	
	return data;
	
}





public static int getmaxrownumber(String fieldname,String methodname)


{String data="";
int flag=0;
Recordset recordset;
try {
	
	String query="Select "+fieldname+" from "+ methodname+" where Tc_Name='"+TestNgListners.crtClass+"'";
	
	recordset=connection.executeQuery(query);

	while(recordset.next()){
	
		flag++;
	

	}
	
}
catch(Exception e)
{
	System.out.println("No Record Found");
	data="";
}

finally
{
	
}

return flag;

}



public static void GetDateinJava(WebElement ele)
{
	 // Create object of SimpleDateFormat class and decide the format
	 DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	 
	 //get current date time with Date()
	 Date date = new Date();
	 
	 // Now format the date
	 String ele1= dateFormat.format(date);
	 
	 // Print the Date
	 System.out.println(ele1);
	
	
}

protected static void GetDateinJava() {
	// TODO Auto-generated method stub
	 // Create object of SimpleDateFormat class and decide the format
	 DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	 
	 //get current date time with Date()
	 Date date = new Date();
	 
	 // Now format the date
	 String ele1= dateFormat.format(date);
	 
	 // Print the Date
	 System.out.println(ele1);
}




}