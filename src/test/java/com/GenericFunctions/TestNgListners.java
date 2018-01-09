package com.GenericFunctions;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestMethodFinder;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;
import org.testng.xml.XmlTest;

import com.ReportGeneration.GenerateReports;

public class TestNgListners implements ITestListener,IInvokedMethodListener {
	
	public  static String crtClass;
	

	@Override
	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		System.out.println("Execution Starting");
		
		GenericMethods.openExcelAsDataBase();
		
		
	}

	
	
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}
////////////////////////////////////////////////////////////////////////////////////////
	@Override
	public void onTestFailure(ITestResult arg0) {
		// TODO Auto-generated method stub
		System.out.println("error occured");
		GenerateReports.LogEvent("fail","Error occured unable to proceed further");
		GenerateReports.closeTest();

	}

	@Override
	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestStart(ITestResult res) {
		// TODO Auto-generated method stub
		System.out.println("Test starting");
		crtClass=res.getInstanceName().substring(res.getInstanceName().lastIndexOf('.')+1);
		//System.out.println(crtClass);
		GenerateReports.intializeTest(crtClass);
		
		


	}

	@Override
	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterInvocation(IInvokedMethod arg0, ITestResult arg1) {
		// TODO Auto-generated method stub
		
		System.out.println("after invocation");
		GenerateReports.closeTest();
		
	}

	@Override
	public void beforeInvocation(IInvokedMethod arg0, ITestResult arg1) {
		// TODO Auto-generated method stub
		
		GenerateReports.startTest(crtClass);
		System.out.println(crtClass);
		System.out.println("before invocation");
		
	}
	
	public static String getClassname(String crntclass)

	{
		String crntclass_retrived=crntclass.substring(crntclass.indexOf('.')+1);
		return crntclass_retrived;
		
	}


}
