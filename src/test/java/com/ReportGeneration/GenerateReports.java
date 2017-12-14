package com.ReportGeneration;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class GenerateReports {
	
	
	public static ExtentReports extent;
	
	public static ExtentTest test;
	
	public  static String crntclassname;
	
	
	public static void intializeTest(String Filename)
	{
		extent=new ExtentReports(getpath()+"\\"+Filename+".html");
		
		extent.addSystemInfo("Report Type","Automation Test Report")
		.addSystemInfo("Project Name","Xcelerate");
		
		
		extent.loadConfig(new File("extent.xml"));
		
		
	}
	
	public static void startTest(String methodname)
	{
		test=extent.startTest(methodname);
		
		
	}
	
	public static void closeTest()
	{
		extent.flush();
		//extent.close();
	
		
	}
	
	public static void LogEvent(String status,String Description)
	{
		if(status.equalsIgnoreCase("pass"))
		{test.log(LogStatus.PASS, Description);
			
			
		}
		
		else
		{
			test.log(LogStatus.FAIL, Description);
		}
	}
	
	
	
	public static String getpath()
	{
		String path="";
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/YY");
		
		System.out.println();
		
		File f=new File(System.getProperty("user.dir")+"\\Results\\"+sdf.format(new Date()).replace("/", ""));
		
		
		if(!f.exists())
		{
			
			f.mkdirs();
			path= System.getProperty("user.dir")+"\\Results\\"+sdf.format(new Date()).replace("/", "");
		}
		
		return System.getProperty("user.dir")+"\\Results\\"+sdf.format(new Date()).replace("/", "");
				
	}

}
