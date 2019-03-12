package com.TestScripts;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.GenericFunctions.GenericMethods;
import com.ScreenFunctions.Login;
import com.ScreenFunctions.QuoteCreation;

public class Tc_25_QuoteCreation extends GenericMethods {

	@Test
	public static void evaluateTestcase() throws Exception
	{
		GenericMethods.LaunchBrowser("chrome");
Login lgn=PageFactory.initElements(driver, Login.class);


QuoteCreation qc=PageFactory.initElements(driver, QuoteCreation.class);

lgn.launch_Application();
qc.QuoteCreation();

Thread.sleep(5000);

	}
	

}

