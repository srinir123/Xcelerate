package com.TestScripts;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.GenericFunctions.GenericMethods;
import com.ScreenFunctions.Login;
import com.ScreenFunctions.NewUser_creation;

public class Tc_05_NewUserCcreation extends GenericMethods{

	@Test
	public static void evaluateTestcase() throws Exception
	{
		GenericMethods.LaunchBrowser("chrome");
Login lgn=PageFactory.initElements(driver, Login.class);

NewUser_creation nuc=PageFactory.initElements(driver, NewUser_creation.class);
//Home_pom hm=PageFactory.initElements(driver, Home_pom.class);

//CollPeriodBalancesPMTImport_POM cpb=PageFactory.initElements(driver, CollPeriodBalancesPMTImport_POM.class);

lgn.launch_Application();
//Thread.sleep(16000);
nuc.NewUser_creation(); 
//Thread.sleep(6000);
//cpb.CollPeriodBalance();

	}
	

}
